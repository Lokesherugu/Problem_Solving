import java.util.HashMap;

public class AreArraysEqual {
    public static boolean areEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : arr1){
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }

        for(int num : arr2){
            if(!hmap.containsKey(num)) return false;

            hmap.put(num, hmap.get(num) - 1);

            if(hmap.get(num) == 0)
                hmap.remove(num);
        }

        return hmap.isEmpty(); 
    }

    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 5};
        int[] arr2 = {4, 5, 5, 3, 2, 1};

        if(areEqual(arr1, arr2)){
            System.out.println("equal");
        }
    else{
        System.out.println("not equal");
    }    }
}
