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
//   - inputing info about item             DONE!

public class Main {
    public static void main(String[] args) {
        LocalDate deadline = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        AddingTodo addingOption = new AddingTodo();
        TodoMatrix eisenhowerMatrix = new TodoMatrix();

        System.out.println("----------------");

        eisenhowerMatrix.addItem("Call my bank", deadline.plusDays(8), false);

        eisenhowerMatrix.addItem("testing item1", deadline.plusDays(10), false);
        eisenhowerMatrix.addItem("testing item2", deadline.plusDays(5), true);
        eisenhowerMatrix.addItem("testing item3", deadline.plusDays(0), false);
        eisenhowerMatrix.addItem("testing item4", deadline.plusDays(1), true);
        eisenhowerMatrix.addItem("testing item5", deadline.plusDays(10), false);
        eisenhowerMatrix.addItem("testing item6", deadline.plusDays(4), true);
        eisenhowerMatrix.addItem("testing item7", deadline.plusDays(2), true);
        eisenhowerMatrix.addItem("testing item8", deadline.plusDays(0), false);
        System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        // eisenhowerMatrix.getQuarter("NN").getItem(2).mark();
        // System.out.println(eisenhowerMatrix.toString());

        // System.out.println("----------------");
        // eisenhowerMatrix.getQuarter("IN").removeItem(1);
        // System.out.println(eisenhowerMatrix.toString());

        // System.out.println("----------------");
        // eisenhowerMatrix.getQuarter("NN").removeItem(2);
        // eisenhowerMatrix.getQuarter("NN").getItem(0).mark();
        // System.out.println(eisenhowerMatrix.toString());

        // System.out.println("----------------");
        // eisenhowerMatrix.archiveItems(); // DELETE MARKED!
        // System.out.println(eisenhowerMatrix.toString());

        System.out.println("----------------");
        // 32 = green > 3
        // 33 = orange > 0 && <= 3
        // 31 = red = 0
        // 
        // System.out.print("\033[31mERROR  \033[0m");
        // System.out.println("\033[0;31;49m qwqwe");
        // System.out.print("\033[0;37;49m");
        System.out.println(LocalDate.now());
        while (isRunning) {
            System.out.println("Menu");
            System.out.println("Choose option");

            System.out.println("1. Add todo item");
            System.out.println("2. Show todo list");
            System.out.println("3. Exit program");

            String choosedOption = scanner.nextLine();

            switch (choosedOption) {
            case "1":
                // addingOption.addingOptionInMenu();
                // System.out.println(eisenhowerMatrix.toString());

                System.out.println("Enter todo note: ");

                String todoInputted = scanner.nextLine();

                System.out.println("Enter number of days this todo should be done: ");
                String deadlineInputted = scanner.nextLine();
                int deadlineInputtedInt = Integer.parseInt(deadlineInputted);

                System.out.println("Enter true or false if the todo is important: (true/false)");
                String isImportantInputted = scanner.nextLine();
                boolean isImportantInputtedBoolean = Boolean.valueOf(isImportantInputted);

                eisenhowerMatrix.addItem(todoInputted, deadline.plusDays(deadlineInputtedInt),
                        isImportantInputtedBoolean);

                System.out.println(eisenhowerMatrix.toString());
                break;

            case "2":
                System.out.println(eisenhowerMatrix.toString());
                break;

            case "3":
                eisenhowerMatrix.archiveItems();
                break;

            case "6":
                eisenhowerMatrix.archiveItems();
                System.exit(0);
                break;
            }
        }
    }
}