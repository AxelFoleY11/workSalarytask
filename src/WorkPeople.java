
public class WorkPeople {

    int WorkPeople = 3;
    String surname = "Ivanov";
    String surname2,Svatov;
    String surname3,Petrov;


    String MaxSalary;
    String MedianSalary;
    String MinimalSalary;






    class WorkPeopleSalary {
        public void main(String[] args) {

            WorkPeople w1 = new WorkPeople();


            int a = 5000,MaxSalary;

            int b = 4000,MedianSalary;

            int c = 2000,MinimalSalary;


            int max = Math.max(Math.max(a,b), c);
            int min = Math.min(Math.min(a,b), c);
            int mid = a + b + c - (min + max);

            System.out.println("MaxSalary: " + Math.max(a,c));
            System.out.println("MinimalSalary: " + Math.min(a, c));
            System.out.println("MedianSalary: " + mid);




            WorkPeople w2 = new WorkPeople();
            String surname2,Svatov;

            int q = 4000,Maxsalary;

            int w = 3000,Mediansalary;

            int e = 2000,Minimalsalary;


            int max1 = Math.max(Math.max(q,w), e);
            int min2 = Math.min(Math.min(q,w), e);
            int mid3 = q + w + e - (min + max);

            System.out.println("MaxSalary: " + Math.max(q,e));
            System.out.println("MinimalSalary: " + Math.min(q, e));
            System.out.println("MedianSalary: " + mid);





            WorkPeople w3 = new WorkPeople();
            String surname3,Petrov;


            int z = 4000,MaXsalary;

            int x = 3000,MediAnsalary;

            int v = 2000,MinimAlsalary;



            int max4 = Math.max(Math.max(z,x), v);
            int min5 = Math.min(Math.min(z,x), v);
            int mid6 = z + x + v - (min + max);

            System.out.println("MaxSalary: " + Math.max(z,v));
            System.out.println("MinimalSalary: " + Math.min(z,v));
            System.out.println("MedianSalary: " + mid);




        }

    }
}