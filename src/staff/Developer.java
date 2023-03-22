package staff;

import resources.Days;
import resources.Task;

public class Developer extends Employee implements Executor {
    private final int DAY_BONUS = 3;

    public Developer(String name) {
        super(name);
    }

    @Override
    public void cameToTheWorkplace(Days d) {
        System.out.println(this.getName() + " " + this.getClass() + " " + "Came to Workplace");
        this.setWorking(true);
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
    public void executeTask() {
        this.setBonusCount(this.getTasks().size());  // not right bonus count
        System.out.println("Developer's Today's Tasks:");
        this.getTasks().forEach(Task::taskDone);
        this.getTasks().removeAll(getTasks());
        System.out.println( "tasks left "+ this.getTasks().size());


    }
}
