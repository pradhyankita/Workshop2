package com.bridgelabz;

public class CountString {
    public static void main(String[] args) {
        String s="Hello kitty";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Count of characters is " +count);

    }
}
