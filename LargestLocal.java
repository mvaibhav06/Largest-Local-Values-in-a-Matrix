class LargestLocal {
    public int[][] largestLocal(int[][] grid) {
        int[][] out = new int[grid.length-2][grid.length-2];
        
        
        for(int i=0; i<out.length; i++){
            for(int j=0; j<out.length; j++){
                int max = Integer.MIN_VALUE;
                for(int p=i; p<i+3; p++){
                    for(int q=j; q<j+3; q++){
                        if(max < grid[p][q]){
                            max = grid[p][q];
                        }
                    }
                }
                out[i][j] = max;
            }
        }
        return out;
    }
}
