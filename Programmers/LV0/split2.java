import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.split(" ");
        
        ArrayList<String> list = new ArrayList<>();
        for(String str : answer){
            if(!str.equals("")){
                list.add(str);
            }
        }
        
        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}
