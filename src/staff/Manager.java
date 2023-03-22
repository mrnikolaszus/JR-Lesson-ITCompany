package staff;

import resources.*;


public class Manager extends Employee implements Delegator, taskMaker{
    private final int DAY_BONUS = 1;
    private Days holiday = Days.TUESDAY;


    public Manager(String name) {
        super(name);
    }

    @Override
    public void cameToTheWorkplace(Days d) {
        if(!d.equals(Days.TUESDAY)){
        System.out.println(this.getName() + " " + this.getClass() + " " + "Came to Workplace");
        this.setWorking(true);}
    }

    @Override
    public void leftTheWorkplace() {
        if(this.isWorking()){
            setTotalDays(1);
            setBonusCount(DAY_BONUS);
            System.out.println(this.getName() + " " + this.getClass() + " " + "Left the Workplace");
            setWorking(false);}
        else { System.out.println(this.getName() + " " + this.getClass() + " " + "wasn't at the Workplace");}
    }

    @Override
    public void addTask(Task t) {
        if(isWorking()){
            this.getTasks().add(t);}
        }

    @Override
    public void delegate(Employee e) throws cantDelegate {
        if(isWorking()) {
            if(e.isWorking()){
            System.out.println(this.getName() + " " + this.getClass() + " is delegating task to " + e.getName() + " " + e.getClass());
            while (!this.getTasks().isEmpty()) {
                e.addTask(this.getTask());
                this.getTasks().remove(0);
            }

            } else { throw new cantDelegate(e.getName() + " Dont work");}
        }
    }

}
