import java.util.ArrayList;
import java.util.Scanner;

public class Strings {
    static void printString(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) +" ");
        }
    }
    static String removeChar(String s, char c){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != c){
                ans += s.charAt(i);
            }
        }
        return ans;
    }
    static String removeChar2(String s, int idx, char ch){
        if(idx == s.length()) return "";
        String smallAns = removeChar2(s, idx+1, ch);
        char currCH = s.charAt(idx);
        if(currCH != ch) return currCH + smallAns;
        else return smallAns;
    }
    static String removeChar3(String s, char ch){
        if(s.isEmpty()) return "";
        String smallAns = removeChar3(s.substring(1), ch);
        char currCH = s.charAt(0);
        if(currCH != ch) return  currCH + smallAns;
        else return smallAns;
    }
    static void printReverse(String s){
        if(s.isEmpty()) return;
        printReverse(s.substring(1));
        System.out.print(s.charAt(0));
    }
    static String reverse(String s, int i){
        if(i == s.length()) return "";
        String smallAns = reverse(s, i+1);
        return smallAns + s.charAt(i);
    }
    static String reverse2(String s){
        if(s.isEmpty()) return "";
        String smallAns = reverse2(s.substring(1));
        return smallAns + s.charAt(0);
    }
    static Boolean checkPalindrome(String s){
        String rev = reverse2(s);
        return rev.equals(s);
    }
    static Boolean checkPalindrome2(String s, int l, int r){
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && checkPalindrome2(s, l+1, r-1));
    }
    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.isEmpty()) {
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for(String ss: smallAns) {
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans;
    }
    static void printAllSSQ(String s, String currAns){ // string and ""
        if(s.isEmpty()) {
            System.out.print(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printAllSSQ(remString, currAns + curr);
        printAllSSQ(remString, currAns);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        System.out.println(s);
//        char ch = s.charAt(1);
//        System.out.print(s.substring(2,4));
//        System.out.print(s.substring(2));
//        System.out.println(checkPalindrome(s));
        printAllSSQ(s,"");


    }
}
