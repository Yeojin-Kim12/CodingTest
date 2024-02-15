import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                map.replace(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }
        
        for(Integer key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }else if(map.get(key) == max){
                answer = -1;
            }
        }
        
        return answer;
    }
}
