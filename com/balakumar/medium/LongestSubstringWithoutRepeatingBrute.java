package com.balakumar.medium;

public class LongestSubstringWithoutRepeatingBrute {

    public static int longestSubString(String str){
        int n = str.length();

        return 1;
    }

    public static void main(String[] args) {

        boolean[] visited = new boolean[26];

        for(int i = 0 ; i < visited.length ; i++) {
//            System.out.println(visited[i]);

        }

        String str = "geeksforgeeks";

        int k = 0;
        System.out.println(visited[str.charAt(k) - 'a']);



    }
}
