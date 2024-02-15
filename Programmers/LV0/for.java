class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int row = 0; //행
        int endrow = n - 1;
        int col = 0; //열
        int endcol = n - 1;
        
        while(num <= n*n){
            for(int i = col; i <= endcol; i++){
                answer[row][i] = num;
                num++;
            }
            row += 1;
            for(int i = row; i <= endrow; i++){
                answer[i][endcol] = num;
                num++;
            }
            endcol -= 1;
            for(int i = endcol; i >= col; i--){
                answer[endrow][i] = num;
                num++;
            }
            endrow -= 1;
            for(int i = endrow; i >= row; i--){
                answer[i][col] = num;
                num++;
            }
            col += 1;
        }
    
        return answer;
    }
}
