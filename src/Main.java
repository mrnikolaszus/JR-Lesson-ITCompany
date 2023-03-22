import resources.*;
import staff.*;

import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {

        // testing
        Manager John = new Manager("John");
        Lead Bob = new Lead("Bob");
        Developer Mark = new Developer("Mark");
        // new manualSET Day
        Days currentDay = Days.MONDAY;

        // dayStart
        John.cameToTheWorkplace(currentDay);
        Bob.cameToTheWorkplace(currentDay);
        Mark.cameToTheWorkplace(currentDay);

        // makingTasks
        John.addTask(new Task("add new frontendModule"));
        John.addTask(new Task("add new backendModule"));
        John.addTask(new Task("add new DataBase"));
        John.addTask(new Task("fix Bugs"));

        try {
            John.delegate(Bob);
        } catch (cantDelegate e) {
            System.out.println(e.getMessage());
        }
        System.out.println( "tasks left "+ John.getTasks().size());


        System.out.println("Bob starts to work");
        Bob.delegate(Mark);
        System.out.println( "tasks left "+ Bob.getTasks().size());

        System.out.println("Mark starts to work");
        Mark.executeTask();


        John.leftTheWorkplace();
        John.rating();

        Bob.leftTheWorkplace();
        Bob.rating();

        Mark.leftTheWorkplace();
        Mark.rating();
    }



}