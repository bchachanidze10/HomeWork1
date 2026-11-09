package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // N1 ამოცანა

//        double productPrice = 99;
//
//        if (productPrice >= 100) {
//            productPrice = productPrice - (productPrice * 0.1);
//        }
//        System.out.println(productPrice);



        // N2 ამოცანა
//        String username = "user";
//        String password = "Password123";
//
//        Scanner inputValue = new Scanner(System.in);
//        System.out.println("შეიყვანეთ უზერი: ");
//        String user = inputValue.nextLine();
//        System.out.println("შეიყვანეთ პაროლი: ");
//        String pass = inputValue.nextLine();
//
//        if (username.equals(user) && password.equals(pass) ){
//            System.out.println("Login Succesful");
//        }else {
//            System.out.println("Invalid username or passwprd");
//        }

        // N3 ამოცანა
//        int[] testResult = {1,0,1,1,0};
//
//        int sucsesResult = 0;
//        int faildResult = 0;
//
//        for (int i = 0; i < testResult.length; i++) {
//            if (testResult[i] == 1) {
//                sucsesResult += 1;
//            } else {
//                faildResult += 1;
//            }
//        }
//
//        System.out.println("წარმატებული შედეგი: "+sucsesResult +" წარუმატებელი: "+faildResult);

        //N4 ამოცანა

//        String orderStatus = "DELIVERED";
//
//        switch (orderStatus){
//            case "NEW":
//                System.out.println("Order Received");
//                break;
//            case "PROCESSING":
//                System.out.println("Order is being prepared");
//                break;
//            case "SHIPED":
//                System.out.println("Order is on way");
//                break;
//            case "DELIVERED":
//                System.out.println("Order Delivered");
//                break;
//            default:
//                System.out.println("Unknown status");
//                break;
//        }

        //N5 ამოცანა

        String testString = "hello word";
        int count = 0;

        for (int i=0; i<testString.length(); i++){
            if(testString.charAt(i)=='a' || testString.charAt(i)=='e' || testString.charAt(i)=='i' || testString.charAt(i)=='o' || testString.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("ხმოვნების რაოდენობა: "+count);
        System.out.println("სტრინგის სიგრძე: "+ testString.length());

        if (testString.length() % 2 ==0){
            System.out.println("ლუწია");
        }
        else {
            System.out.println("კენტია");
        }
    }
}
