public class equilibriumIndexx {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1; // No equilibrium index found
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 2};
        int idx = findEquilibriumIndex(arr);
        if (idx != -1)
            System.out.println("Equilibrium index: " + idx);
        else
            System.out.println("No equilibrium index found");
    }
}
