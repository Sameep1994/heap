import java.util.PriorityQueue;

public class kLargestElement {
    public static void main(String[] args) {

        int[] a={5,15,10,20,8,25,18};
        int k=3;
        kLarge(a,k);
    }

    public static void kLarge(int[]a,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            //since we want the top k elements, if the curr element
            //less than peek dont do anything
            if(a[i]<pq.peek()){
                continue;
            }else {
                pq.poll();
                pq.add(a[i]);
            }
        }

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
