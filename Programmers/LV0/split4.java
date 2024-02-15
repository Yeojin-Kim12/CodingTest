class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++){
            String[] quiz_split = quiz[i].split(" ");
            int temp = 0;
            
            if(quiz_split[1].equals("+")){
                temp = Integer.parseInt(quiz_split[0]) + Integer.parseInt(quiz_split[2]);
            }
            else if(quiz_split[1].equals("-")){
                temp = Integer.parseInt(quiz_split[0]) - Integer.parseInt(quiz_split[2]);
            }
            
            if(Integer.parseInt(quiz_split[4]) == temp){
                answer[i] = "O";
            }else{
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}
