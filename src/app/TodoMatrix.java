package app;

import java.util.Map;
import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;
// import java.lang.String;
// import java.util.*;


public class TodoMatrix {

    private Map<String, TodoQuarter> todoQuarters;

    public TodoMatrix() {
        // TODO
    }

    public Map getQuarters() {
        return todoQuarters;
    }

    public TodoQuarter getQuarter(String status) {
        return todoQuarters.get(status);
    }

    public void addItem(String title, LocalDate deadline, boolean isImportant) {
        // TODO
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
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("IU").toString() + "\n";
        todoQuartersListAsString = todoQuartersListAsString + "important & not urgent \n";
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("IN").toString() + "\n";
        todoQuartersListAsString = todoQuartersListAsString + "not important & urget \n";
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("NU").toString() + "\n";
        todoQuartersListAsString = todoQuartersListAsString + "not important & not urgent \n";
        todoQuartersListAsString = todoQuartersListAsString + todoQuarters.get("NN").toString() + "\n";

        return todoQuartersListAsString;
    }

}