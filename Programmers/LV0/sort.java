import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++){
            map.put(rank[i],i);
        }
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i])
            {
                list.add(rank[i]);
            }
        }
        
        Collections.sort(list);
        answer = 10000 * map.get(list.get(0)) + 100 * map.get(list.get(1)) + map.get(list.get(2));
        
        return answer;
    }
}
