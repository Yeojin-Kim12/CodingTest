import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 1; i < answer.length; i++){
            map.put(answer[i], i);
        }
        
        for(String call : callings){
            int rank = map.get(call);
            String str = answer[rank-1];
            answer[rank-1] = call;
            map.put(call,rank-1);
            answer[rank] = str;
            map.put(str,rank);
        }
        
        return answer;
    }
}
