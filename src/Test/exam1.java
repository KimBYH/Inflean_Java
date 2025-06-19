package Test;

import java.util.*;

public class exam1 {
    public static void main(String[] args){
        solution("banana");
    }

    public static int[] solution(String s) {
        int[] answer = {};
        List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            a.add(-1);
        }
        System.out.println(a);
        return answer;
    }
}
