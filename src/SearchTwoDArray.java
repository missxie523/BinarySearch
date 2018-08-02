public class SearchTwoDArray {
    public int[] searchTwoDArray(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0){
            return new int[]{-1, -1};
        }
        int[] res = new int[2];
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[mid/n][mid%n] == target){
                res[0] = mid/n;
                res[1] = mid % n;
                return res;
            }else if(matrix[mid/n][mid%n] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
