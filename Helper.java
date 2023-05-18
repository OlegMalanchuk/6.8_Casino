package Helpers;

public class Helper {
    public static void Out(String word){
        int lengWord = word.length();
        if (lengWord % 2 == 0){
        lengWord+=2;
        StringBuilder line  = new StringBuilder("_");
        for (int i = 0; i < (50-lengWord)/2; i++ ){
            String.valueOf(line.append("_"));
        }
        System.out.println(line+word+line);}
        if (lengWord%2!=0){
            lengWord+=3;
            StringBuilder line  = new StringBuilder("_");
            for (int i = 0; i < (50-lengWord)/2; i++ ){
                String.valueOf(line.append("_"));
            }
            System.out.println(line+word+line+"_");
        }

    }
    public static void Out1(){
        for (int i = 0; i < 25; i++ ) {
            System.out.print("__");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void Out2(){
        for (int i = 0; i < 25; i++ ) {
            System.out.print("__");
        }
        System.out.println(" ");
    }
    public static void lose(){

    }
















}
