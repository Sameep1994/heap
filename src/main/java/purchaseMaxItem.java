import java.util.PriorityQueue;

public class purchaseMaxItem {
    public static void main(String[] args) {
        int[] cost={1,12,5,111,200};
        int sum=10;
        System.out.println(maxItem(cost,sum));
    }

    public static int maxItem(int[]a,int sum){
        int n=a.length;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();

        int res=0;
        for(int i=0;i<n;i++)
            pq.add(a[i]);

        for(int i=0;i<n;i++){
            if(pq.peek()<=sum){
                sum-=pq.poll();
                res++;
            }else{
                break;
            }
        }
        return res;
    }
}
