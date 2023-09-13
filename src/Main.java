import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите x");
        int x= sc.nextInt();
        int sumArea=0;
        for (int i = 0; i < x; i++) {
            Rectangle r = new Rectangle();
            System.out.println(r);
            sumArea += r.area();
        }
        System.out.println("Суммарная площадь = "+sumArea);

    }
}

class Rectangle{
    int a,b;

    public Rectangle() {
        Random rand = new Random();
        a = rand.nextInt(0, 21);
        b = rand.nextInt(0, 21);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int area(){
        return a*b;
    }
}