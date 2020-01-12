package app;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;;

public class TodoQuarter {
    private List<TodoItem> todoItems;
    LocalDate dateNow = LocalDate.now();

    public TodoQuarter() {
        todoItems = new ArrayList<TodoItem>();
    }

    public void addItem(String title, LocalDate deadline) {
        for (int i = 0; i < todoItems.size(); i++) {
            if (todoItems.get(i).getDeadline().isBefore(deadline)) {
                todoItems.add(i, new TodoItem(title, deadline));
                return;
            }
        }
        todoItems.add(new TodoItem(title, deadline));
    }

    public void removeItem(int index) {
        todoItems.remove(index);
    }

    public void archiveItems() {
        for (int i = 0; i < todoItems.size(); i++) {
            if (todoItems.get(i).getIsDone()) {
                todoItems.remove(i);
            }
        }
    }

    public TodoItem getItem(int index) {
        return todoItems.get(index);
    }

    public List<TodoItem> getItems() {
        return todoItems;
    }

    // public String toString(int sizeOfQuarter) {
        public String toString() {
        String todoItemsListAsString = ""; // "";
        int counter = 1;
        for (int i = 0; i < todoItems.size(); i++) {
            if (todoItems.get(i).getIsDone()) {
                todoItemsListAsString = todoItemsListAsString + counter + ". ";
                todoItemsListAsString = todoItemsListAsString + "[x] " + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle() + "\n";
            } else {
                if (todoItems.get(i).getDeadline().isAfter(dateNow.plusDays(3))) {
                    // System.out.println("\033[0;32;49m qwqwe");
                    todoItemsListAsString = "\033[0;32;49m" + todoItemsListAsString + counter + ". ";
                    todoItemsListAsString = todoItemsListAsString + "[ ] " + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle() + "\n" + "\033[0;37;49m";
                    // System.out.print("\033[0;37;49m");
    
                } else if (todoItems.get(i).getDeadline().equals(dateNow)) {
                    // System.out.println("\033[0;33;49m qwqwe");
                    todoItemsListAsString = "\033[0;31;49m" + todoItemsListAsString + counter + ". ";
                    todoItemsListAsString = todoItemsListAsString + "[ ] " + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle() + "\n" + "\033[0;37;49m";
                    // System.out.print("\033[0;37;49m");

                } else if (todoItems.get(i).getDeadline().isAfter(dateNow) && todoItems.get(i).getDeadline().isBefore(dateNow.plusDays(3))) {
                    // System.out.println("\033[0;31;49m qwqwe");
                    todoItemsListAsString = "\033[0;33;49m" + todoItemsListAsString + counter + ". ";
                    todoItemsListAsString = todoItemsListAsString + "[ ] " + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle() + "\n" + "\033[0;37;49m";
                    // System.out.print("\033[0;37;49m");

                }
                // todoItemsListAsString = todoItemsListAsString + counter + ". ";
                // todoItemsListAsString = todoItemsListAsString + "[ ] " + todoItems.get(i).getDeadline().toString().substring(5) + " " + todoItems.get(i).getTitle() + "\n";
            }
            counter++;
        }
        return todoItemsListAsString;
    }
}