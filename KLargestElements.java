
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestElements{
    public static List<Integer> findKLargest(int[] arr, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int num:arr){
            if(minheap.size()<k){
                minheap.offer(num);
            }
            else if(num>minheap.poll()){
                minheap.poll();
                minheap.offer(num);
            }
            
        }
        List<Integer> result= new ArrayList<>(minheap);
        result.sort(Collections.reverseOrder());
        return result;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        List<Integer> topk=findKLargest(arr,k);
        System.out.println("top"+k+"elements are: "+topk);

    }
}