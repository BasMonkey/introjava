package nl.bioinf.baskasemirintrojava.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        horse horse1 = new horse();
        horse1.gallop(66.8);
        System.out.println("horse1.color = " + horse1.color);
        System.out.println("horse1.weightInKilograms = " + horse1.weightInKilograms);

        horse1.color = "brown";
        horse1.weightInKilograms = 612;

        System.out.println("horse1.color = " + horse1.color);
        System.out.println("horse1.weightInKilograms = " + horse1.weightInKilograms);

        System.out.println("Bye!");
    }
}


