package staff;

import resources.Days;
import resources.Task;

import java.util.ArrayList;

public abstract class Employee {
    private boolean isWorking;
    private String name;
    private  int dayBonusCount;;
    private final ArrayList<Task> tasks;
    private int totalDays;


    public Employee(String name) {
        this.name = name;
        this.dayBonusCount =0;
        this.isWorking = false;
        this.tasks = new ArrayList<>();
        this.totalDays = 0;
    }

    public void rating(){
        if(this.getBonusCount() == 0 || this.getTotalDays() == 0 ){
            System.out.println("Employee Rating:" + 0);}
        else {
       System.out.println("Employee Rating:" + this.getBonusCount()/this.getTotalDays());}

    }

    // entering workSpace
    abstract public void cameToTheWorkplace(Days d);
    abstract public void leftTheWorkplace();


    // Tasks management
    public ArrayList<Task> getTasks() {
        return this.tasks;
    }
    public void addTask(Task t) {
        this.getTasks().add(t);
    }
    public Task getTask() {
        if(!this.getTasks().isEmpty()){
        return this.getTasks().get(0);}
        else return null;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }


    // later
    public int getBonusCount() {
        return this.dayBonusCount;
    }
    public void setBonusCount(int bonusCount) {
        this.dayBonusCount += bonusCount;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays += totalDays;
    }

    @Override
    public String toString() {
        return "Employee " +
                 name + " " ;
    }
}
