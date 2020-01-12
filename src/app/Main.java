package app;

import java.time.LocalDate;

    // TODO:
    //   - all methods private 
    //   - don't read data from file
    //   - don't export data
    //   - coloured marked
    //   - matrix formatted
    //   - undo marking
    //   - automatically archive

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
    }
}