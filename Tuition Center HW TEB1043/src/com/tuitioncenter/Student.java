package com.tuitioncenter;

public class Student{

    public float calcAvg(float [] marks) {
        int totalMarks = 0;
        int counter = 0;
        for(int i = 0; i < marks.length; i ++){
            totalMarks += marks[i];
            counter += 1;
        }
        float avgMarks = totalMarks / counter;
        return avgMarks;
    }

    public float calcMin(float [] marks) {
        float minMarks = Integer.MAX_VALUE;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] < minMarks){
                minMarks = marks[i];
            }
        }
        return minMarks;
    }

    public float calcMax(float [] marks){
        float maxMarks = Integer.MIN_VALUE;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] > maxMarks){
                maxMarks = marks[i];
            }
        }
        return maxMarks;
    }

}
