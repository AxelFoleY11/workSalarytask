import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> salary = new ArrayList<>();
        salary.add(1000);
        salary.add(2000);
        salary.add(3000);

        workPeopleSalary(salary);





    }

    public static void workPeopleSalary(ArrayList<Integer> salary) {

        int min = salary.get(0);
        int max = salary.get(0);
        int sum = 0;

        for (Integer i: salary) {
            sum = sum + i;
            if(i < min)
                min = i;
            if(i > max)
                max = i;

        }

        int med = sum - (max + min);
        System.out.println("минимальное число: " + min);
        System.out.println("максимальное число: " + max);
        System.out.println("медиальное  число: " + med);


    }
}

