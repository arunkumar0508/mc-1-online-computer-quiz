package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        if(nameOfSchool==null || scores==null) {
            return null;
        }

        int highestScore=0;
        String schoolName=null;
        try {
            for (int i = 0; i < scores.length; i++) {

                int score = Integer.parseInt(scores[i]);

                if (score > highestScore) {
                    highestScore = score;
                    schoolName = nameOfSchool[i];
                }
            }
        }catch (NumberFormatException obj){
            return obj.toString();
        }
        return schoolName;

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[5];
        try {
            for (int i = 0; i < name.length; i++) {
                String names = name[i].toUpperCase();
                upperCase[i]=names;
            }
        }catch (NullPointerException obj1){
            String[] arr = new String[0];
            arr[0]=obj1.toString();
             return arr;
        }

        return upperCase;
    }
}






