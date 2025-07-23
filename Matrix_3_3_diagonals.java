public class Matrix_3_3_diagonals {
   public static void diagonalsOf(int[][] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i][i]+" ");
        }
    System.out.println();

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i][2-i]+" ");
    }
    
   }
   public static void main(String[] args) {
    int[][] arr1={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    diagonalsOf(arr1);
    
   }
}
