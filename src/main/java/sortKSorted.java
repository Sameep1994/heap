import java.util.PriorityQueue;

public class sortKSorted {
    public static void main(String[] args) {

        int k=2;
        int[] a={9,8,7,19,18};
        ksort(a,a.length,k);
    }

    public static void ksort(int[]a,int n,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0;i<=k;i++)
            pq.add(a[i]);
        int index =0;
        for(int i=k+1;i<a.length;i++){
            a[index++]=pq.poll();
            pq.add(a[i]);
        }

        while (!pq.isEmpty()){
            a[index++]=pq.poll();
        }

        for(int x:a){
            System.out.println(x);
        }
    }
}
