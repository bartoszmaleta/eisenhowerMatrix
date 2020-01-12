package app;

import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;

public class TodoMatrix {

    private Map<String, TodoQuarter> todoQuarters;

    public TodoMatrix() {
        todoQuarters = new HashMap<>();
        todoQuarters.put("IU", new TodoQuarter());
        todoQuarters.put("IN", new TodoQuarter());
        todoQuarters.put("NU", new TodoQuarter());
        todoQuarters.put("NN", new TodoQuarter());
    }

    public Map getQuarters() {
        return todoQuarters;
    }

    public TodoQuarter getQuarter(String status) {
        return todoQuarters.get(status);
    }

    public void addItem(String title, LocalDate deadline, boolean isImportant) {
        LocalDate dateNow = LocalDate.now();

        if (isImportant) {
            if (deadline.isBefore(dateNow.plusDays(3))) {
                todoQuarters.get("IU").addItem(title, deadline);
            } else {
                todoQuarters.get("IN").addItem(title, deadline);
            }
        } else {
            if (deadline.isBefore(dateNow.plusDays(3))) {
                todoQuarters.get("NU").addItem(title, deadline);
            } else {
                todoQuarters.get("NN").addItem(title, deadline);
            }
        }
    }

    public void addItemsFromFile(String fileName) {
        // TODO
    }

    public void archiveItems() {
        todoQuarters.get("IU").archiveItems();
        todoQuarters.get("IN").archiveItems();
        todoQuarters.get("NU").archiveItems();
        todoQuarters.get("NN").archiveItems();
    }

    public String toString() {
        String todoQuartersListAsString = "";

        todoQuartersListAsString = todoQuartersListAsString + "important & urgent \n";
        int sizeOfQuarter = todoQuarters.size();
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("IU").toString() + "\n";
        // todoQuartersListAsString = todoQuartersListAsString + todoQuarters.toString() + "\n";
        todoQuartersListAsString = todoQuartersListAsString + "important & not urgent \n";
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("IN").toString() + "\n";
        todoQuartersListAsString = todoQuartersListAsString + "not important & urget \n";
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("NU").toString() + "\n";
        todoQuartersListAsString = todoQuartersListAsString + "not important & not urgent \n";
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("NN").toString() + "\n";

        return todoQuartersListAsString;
    }

}