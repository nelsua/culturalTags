package com.company;

import java.util.Scanner;

public  abstract class WordsMeaning {
        public String ww2(){
            String a = "war world 2";
            return a;
        }
        public String mma(){
            String b = "mixed martial arts";
            return b;
        }
        public String lalaland(){
            String c = "la la land";
            return c;
        }
        public String rt(){
            String d = "radio tv";
            return d;
        }
        public String wth(){
            String f = "what the hell";
            return f;
        }
        public String ftp(){
            return "file transfer protocol";
        }
        public String nasa(){
            String h = "National Aeronautics and Space Administration";
            return h;
        }
        public String asap() {
            String i = "ass soon as possible";
            return i;
        }
        public String dob() {
            String j = "date of birth";
            return j;
        }
        public String idk() {
            String k = "i dont know";
            return k;
        }
        public String bff(){
            String l = "best friends forever";
            return l;
        }
        public String mia(){
            String m = "missing in action";
            return m;
        }
        public String myGuess(String word){
        return word;
    }
        public String myScanner(){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        return word;
    }
}
