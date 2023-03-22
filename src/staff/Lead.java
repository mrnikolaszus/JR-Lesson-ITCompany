package staff;

import resources.Days;

public class Lead extends Employee implements Delegator{
    private final int DAY_BONUS = 2;

    private Days holiday = Days.MONDAY;

    public Lead(String name) {
        super(name);
    }

    @Override
    public void cameToTheWorkplace(Days d) {
        if(!d.equals(Days.MONDAY)){
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
    public void delegate(Employee e) {
        if(isWorking()) {
            System.out.println(this.getName() + " " + this.getClass() + " is delegating task to " + e.getName() + " " + e.getClass());
            while (!this.getTasks().isEmpty()) {
                e.addTask(this.getTask());
                this.getTasks().remove(0);
            }
        }
    }
}
