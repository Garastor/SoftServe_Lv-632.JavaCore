package lesson4.HW4;

import lesson4.HW4.model.Breed;
import lesson4.HW4.model.Dog;
import lesson4.HW4.model.HttpError;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AppHW4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        checkNumberOfRange();
        getNumbers();
        readHTTPError();
        gerInformationDog();
    }

    public static void checkNumberOfRange(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter float number: ");
            Float num = scanner.nextFloat();
            if (num >= -5 && num <= 5) {
                System.out.println("The number: " + num + " is in the range");
            } else {
                System.out.println("The number: " + num + " is not in the range");
            }
        }
    }

    public static void getNumbers(){
        System.out.println("Enter quality");
        gemMaxMinNumbers(scanner.nextInt());
    }

    public static void gemMaxMinNumbers(int k){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            System.out.println( "Enter of the number: " );
            list.add(scanner.nextInt());
        }
        System.out.println("Min: " + list.stream().min(Integer::compareTo));
        System.out.println("Max: " + list.stream().max(Integer::compareTo));
    }

    public static void readHTTPError() {
        System.out.println("Enter number http error: ");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 400:
                System.out.println(HttpError.BadRequst.getValue());
                break;
            case 401:
                System.out.println(HttpError.Unauthorized.getValue());
                break;
            case 402:
                System.out.println(HttpError.PaymentRequired.getValue());
                break;
            case 403:
                System.out.println(HttpError.Forbidden.getValue());
                break;
            case 404:
                System.out.println(HttpError.NotFound.getValue());
                break;
            default:
                System.out.println("Not ");
        }
    }

    public static void gerInformationDog() {
        Dog dog = new Dog("Sultan", Breed.STAFARD, 7);
        Dog dog1 = new Dog("Cezar", Breed.LABRADOR, 3);
        Dog dog2 = new Dog("Sultan", Breed.MOBS, 5);

        if (dog.getName().equals(dog1.getName()) || dog.getName().equals(dog2.getName())) {
            System.out.println("There is a name match: " + dog.getName());
        } else if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog.getName())) {
            System.out.println("There is a name match: " + dog1.getName());
        } else {
            System.out.println("No name matches!");
        }
        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.sort(Comparator.comparing(Dog::getAge).reversed());
        System.out.println(dogs.get(0));
    }
}