package resources;

public class Task {
    private final String taskName;
// 123
    public Task(String taskName) {
        this.taskName = taskName;
        System.out.println("New Task = " + taskName);
    }
    public void taskDone(){
        System.out.println("Task = " + taskName +" done!");
    }

    @Override
    public String toString() {
        return "Task = " + taskName ;
    }
}
