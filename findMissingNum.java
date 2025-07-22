class findMIssingNum{
    public static int MissingNum(int[] arr){
        int sum=0;
        int n=arr.length+1;
        int expectedaSum=(n*(n+1))/2;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return expectedaSum-sum;
    }
    public static void main(String[] args) {
        int[] arr1= {1,2,4,5,6};
        
        System.out.println(MissingNum(arr1));
    }
}