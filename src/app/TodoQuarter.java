package app;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;;
// import java.util.*;

public class TodoQuarter {
    private List<TodoItem> todoItems;

    public TodoQuarter() {
        todoItems = new ArrayList<TodoItem>();
    }

    public void addItem(String title, LocalDate deadline) {
        // TODO
    }

    public void removeItem(int index) {
        // TODO
    }

    public void archiveItems() {
        // TODO
    }

    public TodoItem getItem(int index) {
        return todoItems.get(index);
    }

    public List<TodoItem> getItems() {
        return todoItems;
    }

    public String toString() {
        // TODO
        return "";
    }

}