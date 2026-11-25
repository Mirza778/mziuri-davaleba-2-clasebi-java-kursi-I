import java.util.Scanner;

class Car {
    String brand;
    String model;
    int year;
    String plateNumber;

    Car() {
    }

    Car(String brandInput, String modelInput, int yearInput, String plateInput) {
        brand = brandInput;
        model = modelInput;
        year = yearInput;
        plateNumber = plateInput;
    }

    void printInfo() {
        System.out.println("Brand " + brand + " Model " + model +
                " Year " + year + " Plate " + plateNumber);
    }
}

class Task {
    int a;
    int b;
    int k;
    int n;
    int base;
    int exp;

    int rangeMultipleSum(int startVal, int endVal, int stepVal) {
        if (stepVal == 0 || startVal > endVal) {
            return 0;
        }
        int addend = 0;
        if (startVal % stepVal == 0) {
            addend = startVal;
        }
        return addend + rangeMultipleSum(startVal + 1, endVal, stepVal);
    }

    int naturalSum(int limitVal) {
        if (limitVal <= 0) {
            return 0;
        }
        return limitVal + naturalSum(limitVal - 1);
    }

    int raisePower(int baseVal, int expVal) {
        if (expVal <= 0) {
            return 1;
        }
        return baseVal * raisePower(baseVal, expVal - 1);
    }

    int countZeroDigits(int numberVal) {
        if (numberVal < 0) {
            numberVal = -numberVal;
        }
        if (numberVal < 10) {
            if (numberVal == 0) {
                return 1;
            }
            return 0;
        }
        int currentZero = 0;
        if (numberVal % 10 == 0) {
            currentZero = 1;}
        return currentZero + countZeroDigits(numberVal / 10);}

    void checkZeroParity(int numberVal) {
        int zeroCount = countZeroDigits(numberVal);
        if (zeroCount % 2 == 0) {
            System.out.println(numberVal + " -> zeros: " + zeroCount + " (even)");
        } else {
            System.out.println(numberVal + " -> zeros: " + zeroCount + " (odd)");
        }}}

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        firstCar.brand = "Toyota";
        firstCar.model = "mazda";
        firstCar.year = 2020;
        firstCar.plateNumber = "hehe";

        Car secondCar = new Car("Honda", "Civic", 2022, "CC-222-DD");

        firstCar.printInfo();
        secondCar.printInfo();

        Task task = new Task();
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a  ");
        task.a = reader.nextInt();

        System.out.print("Enter b  ");
        task.b = reader.nextInt();

        System.out.print("Enter k  ");
        task.k = reader.nextInt();

        if (task.a > task.b) {
            int tempVal = task.a;
            task.a = task.b;
            task.b = tempVal;}
        System.out.println("Sum of multiples of " + task.k + " in [" + task.a + ", " + task.b + "]: " +
                task.rangeMultipleSum(task.a, task.b, task.k));

        System.out.print("Enter n (natural sum 1..n) ");
        task.n = reader.nextInt();
        System.out.println("Natural sum " + task.naturalSum(task.n));

        System.out.print("Enter base a and power n  ");
        task.base = reader.nextInt();
        task.exp = reader.nextInt();
        System.out.println("Power result " + task.raisePower(task.base, task.exp));

        task.checkZeroParity(102030);
        task.checkZeroParity(1005);
        task.checkZeroParity(789);
        task.checkZeroParity(0);

        reader.close();
    }}