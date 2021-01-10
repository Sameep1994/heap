import java.util.Comparator;
import java.util.PriorityQueue;

public class kClosest {
    public static void main(String[] args) {
        int[] a={30,40,32,33,36,37};
        int x=38,k=3;
        printKClosest(a,a.length,k,x);

    }
//it becomes a k smallest element problem where we stors diff and index in heap
    public static void printKClosest(int arr[], int n, int k, int x)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                new Comparator<Pair>()
                {
                    public int compare(Pair p1, Pair p2)
                    {
                        return p2.getValue().compareTo(
                                p1.getValue());
                    }
                });

        for(int i = 0; i < k; i++)
        {
            pq.offer(new Pair(arr[i],
                    Math.abs(arr[i] - x)));
        }

        for(int i = k; i < n; i++)
        {
            int diff = Math.abs(arr[i] - x);

            if(pq.peek().getValue()>diff) {
                pq.poll();
                pq.offer(new Pair(arr[i], diff));
            }
        }

        while(!pq.isEmpty())
        {
            System.out.print(pq.poll().getKey() + " ");
        }
    }
}
class Pair{
    Integer key;
    Integer value;

    public Pair(Integer key, Integer value)
    {
        this.key = key;
        this.value = value;
    }
    public Integer getKey()
    {
        return key;
    }
    public void setKey(Integer key)
    {
        this.key = key;
    }
    public Integer getValue()
    {
        return value;
    }
    public void setValue(Integer value)
    {
        this.value = value;
    }
}
