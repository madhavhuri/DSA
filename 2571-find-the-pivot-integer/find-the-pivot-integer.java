class Solution {
    public int pivotInteger(int n) {
        int totalsum = 0;
        int leftsum = 0;
        for(int i=0;i<n+1;i++){
            totalsum = totalsum + i;
        }
        for(int j=0;j<n+1;leftsum+=j++){
            if(leftsum * 2 == totalsum - j ){
                return j;
            }
            
        }
        return -1;
        
    }
}