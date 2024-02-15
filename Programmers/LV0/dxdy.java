class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {0, -1, 0, 1, 0, -1, 1, -1, 1};
        int[] dy = {0, 0, 1, 0, -1, -1, -1, 1, 1};
        int[][] bomb = new int[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                for(int k = 0; k < 9; k++){
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if(x >= 0 && x < board.length && y >= 0 && y < board.length && board[i][j] == 1){
                        bomb[x][y] = 1;
                    }
                }
            }
        }
        
        for(int i = 0; i < bomb.length; i++){
            for(int j = 0; j < bomb.length; j++){
                if(bomb[i][j] != 1){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
