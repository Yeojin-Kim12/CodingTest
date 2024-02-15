import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                answer += s.charAt(i);
            }
        }
        
        char[] array = answer.toCharArray();
        Arrays.sort(array);
        answer = new String(array);
        
        return answer;
    }
}
