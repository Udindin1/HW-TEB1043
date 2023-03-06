package com.tuitioncenter;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Name headmasterName = new Name("Zuhal","Abdullah","Bakri");
        Address headmasterAddress = new Address("10", "Jalan Kampung Baru", "30405", "Bota", "Perak");

        Name tutorName = new Name("Ali", "Bakar", "Hakim");
        Address tutorAddress = new Address("2", "Jalan Cili", "40300","Bota", "Perak");

        Headmaster headmaster = new Headmaster(headmasterName, headmasterAddress);
        Tutor tutor = new Tutor(tutorName, tutorAddress, "031240104387", "Degree", 7, 2);

        System.out.println("Headmaster Name: "+ headmaster.getName().toString());
        System.out.println("Headmaster Address: "+ headmaster.getAddress().toString());
        System.out.println("");
        System.out.println("Tutor Information: " + tutor.toString());
        System.out.println("");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of marks that is to be calculated:");
        int size = input.nextInt();
        float[] studentMarks = new float[size];
        System.out.println("Enter each respective mark of the students:");

        for(int i = 0; i < size; i++){
            studentMarks[i] = input.nextFloat();
        }

        Student marks = new Student();

        System.out.println("Tuition center report:");
        System.out.println("Average marks: " + marks.calcAvg(studentMarks));
        System.out.println("Minimum marks: " + marks.calcMin(studentMarks));
        System.out.println("Maximum marks: " + marks.calcMax(studentMarks));
        System.out.println("");

    }

}
