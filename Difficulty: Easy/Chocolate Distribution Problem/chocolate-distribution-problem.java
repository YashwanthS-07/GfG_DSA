// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        
        int n = arr.size();
        
        
        if (m > n) return -1;
        
    
        Collections.sort(arr);
        
        int min_diff = Integer.MAX_VALUE;
        
      
        for (int i = 0; i <= n - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            if (diff < min_diff) {
                min_diff = diff;
            }
        }
        
        return min_diff;
    }
}
