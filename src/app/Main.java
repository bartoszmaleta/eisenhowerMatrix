package app;

import java.time.LocalDate;
import java.util.Scanner;

// TODO:
//   - all fields private                   DONE!
//   - don't read data from file            
//   - don't export data                    
//   - coloured marked                      
//   - matrix formatted                     
//   - undo marking                         
//   - automatically archive                DONE!
//   - inputing info about item

public class Main {
    public static void main(String[] args) {
        LocalDate deadline = LocalDate.now();

        // System.out.println(deadline);
 
        // deadline.plusDays(3);

        // System.out.println(deadline.plusDays(3));

        // deadline.toString().substring(5);        

        // System.out.println(deadline.toString().substring(5));

        System.out.println("----------------");

        TodoMatrix eisenhowerMatrix = new TodoMatrix();
        eisenhowerMatrix.addItem("Call my bank", deadline.plusDays(8), false);

        eisenhowerMatrix.addItem("testing item1",deadline.plusDays(10),false);
        eisenhowerMatrix.addItem("testing item2",deadline.plusDays(5), true);
        eisenhowerMatrix.addItem("testing item3",deadline.plusDays(13), false);
        eisenhowerMatrix.addItem("testing item4",deadline.plusDays(1), false);
        eisenhowerMatrix.addItem("testing item5",deadline.plusDays(10),false);
        eisenhowerMatrix.addItem("testing item6",deadline.plusDays(4), true);
        eisenhowerMatrix.addItem("testing item7",deadline.plusDays(2), true);
        System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        eisenhowerMatrix.getQuarter("NN").getItem(2).mark();
        System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        eisenhowerMatrix.getQuarter("IN").removeItem(1);
        System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        eisenhowerMatrix.getQuarter("NN").removeItem(2);
        eisenhowerMatrix.getQuarter("NN").getItem(0).mark();
        System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        eisenhowerMatrix.archiveItems();            // DELETE MARKED!
        System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu");
            System.out.println("Choose option");
            
            System.out.println("1. Add todo item");
            System.out.println("2. Show todo list");
            System.out.println("3. Exit program");

            String choosedOption = scanner.nextLine();

            switch (choosedOption) {
                case "1":
                System.out.println("Enter todo note: ");
                // boolean hasNextString = scanner....
        
                String todoInputted = scanner.nextLine();
                // scanner.nextLine();
        
                System.out.println("Enter number of days this todo should be done: ");
                String deadlineInputted = scanner.nextLine();
                int deadlineInputtedInt = Integer.parseInt(deadlineInputted);
                // scanner.nextLine();
        
                System.out.println("Enter true or false if the todo is important: (true/false)");
                String isImportantInputted = scanner.nextLine();
                boolean isImportantInputtedBoolean = Boolean.valueOf(isImportantInputted);
                // scanner.nextLine();
        
                System.out.println(todoInputted);
                System.out.println(deadlineInputted);
                System.out.println(isImportantInputted);
        
                eisenhowerMatrix.addItem(todoInputted, deadline.plusDays(deadlineInputtedInt), isImportantInputtedBoolean);
                
                System.out.println(eisenhowerMatrix.toString());
                break;

                case "2":
                System.out.println(eisenhowerMatrix.toString());
                break;

                case "3":
                System.exit(0); 
                break;
            }
        }
    }
}