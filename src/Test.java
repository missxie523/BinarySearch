import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int target = 10;
        int target1 = 4;
        int target2 = 2;
        int target3 = 9;
        int target4 = 8;
        int[] array = new int[]{1, 2, 2, 4, 4, 5, 7, 8, 8, 9};

        BinarySearch sol = new BinarySearch();
        System.out.println(sol.binarySearch(array, target));
        System.out.println(sol.binarySearch(array, target1));

        FirstOccurrence sol1 = new FirstOccurrence();
        System.out.println(sol1.firstOccurrence(array, target2));
        System.out.println(sol1.firstOccurrence(array, target3));
        System.out.println(sol1.firstOccurrence(array, target));

        LastOccurrence sol2 = new LastOccurrence();
        System.out.println(sol2.lastOccurrence(array, target4));
        System.out.println(sol2.lastOccurrence(array, target1));
        System.out.println(sol2.lastOccurrence(array, target));

        Closest sol3 = new Closest();
        System.out.println(sol3.closet(array, target));
        System.out.println(sol3.closet(array, target1));
        System.out.println(sol3.closet(array, target4));

        SearchTwoDArray sol4 = new SearchTwoDArray();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 7},
                {8, 9, 11}
        };
        System.out.println(Arrays.toString(sol4.searchTwoDArray(matrix,target)));
        System.out.println(Arrays.toString(sol4.searchTwoDArray(matrix,target1)));
        System.out.println(Arrays.toString(sol4.searchTwoDArray(matrix,target2)));
        System.out.println(Arrays.toString(sol4.searchTwoDArray(matrix,target3)));
        System.out.println(Arrays.toString(sol4.searchTwoDArray(matrix,target4)));
    }
}
