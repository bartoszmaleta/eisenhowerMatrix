package app;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        LocalDate deadline = LocalDate.now();

        System.out.println(deadline);
 
        deadline.plusDays(3);

        System.out.println(deadline.plusDays(3));

        deadline.toString().substring(5);        

        System.out.println(deadline.toString().substring(5));
    }
}