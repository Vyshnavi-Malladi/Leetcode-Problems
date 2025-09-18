class Solution {
    public int earliestTime(int[][] tasks) {
        int early=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++)
        {
            int x=tasks[i][0];
            int y=tasks[i][1];
            int res=x+y;
            early=Math.min(res,early);
        }
        return early;
    }
}