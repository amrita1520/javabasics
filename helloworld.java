import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("hello world 2");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("print "+x);
        sc.close();
        if (x>=18)
        {
            System.out.println("Person with age "+x+" is ready to vote");
        }
        else
        {
            System.out.println("Person with age "+x+" is not ready to vote");
        }
        int  a=13;
        double b=5.5;
        float c=5.8f;
        long d=12233;

        int y=15;
        double z=y;

        double p=15;
        int q=(int)p;

        char grade = 'A';
        boolean isJavaFun = true;
        String name = "Alice";
    }
    
}
