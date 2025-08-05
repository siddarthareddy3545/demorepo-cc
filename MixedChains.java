import java.util.*;
public class MixedChains{
    public static Node findchain(Node Chain1, Node Chain2)
    {
        if(Chain1==null) return cloneList(Chain2);
        if(Chain2==null) return cloneList(Chain1);
        int len1=getLength(Chain1),len2=getLength(Chain2);
        Node p1=Chain1, p2=Chain2;
        if(len1>len2){
            for(int i=0;i<len1-len2;i++){
                p1=p1.next;
            }
        }else{
                for(int i=0;i<len2-len1;i++){
                    p2=p2.next;
                }
            }
            while (p1 != p2) {
                p1=p1.next;
                p2=p2.next;
            }
        
        Node merge=p1;
        int d1=getDistance(Chain1,merge),d2=getDistance(Chain2,merge);
        Node bigger, smaller;
        int smallen;
        if(d1>d2){
            bigger=Chain1;
            smaller=Chain2;
            smallen=d2;
        }
        else{
            bigger=Chain2;
            smaller=Chain1;
            smallen=d1;
        }
        Node result = cloneList(bigger);
        Node tail=getTail(result);
        tail.next=cloneFirstK(smaller,smallen);
        return result;
    }

    static int getLength(Node h){
        int l=0;
        while (h !=null) {
            l++;
            h=h.next;
        }
        return l;
    }

    static int getDistance(Node h, Node stop){
        int d=0;
        while (h != stop) {
            d++;
            h=h.next;
        }
        return d;
    }

    static Node getTail (Node h){
        if(h==null) return null;
        while(h.next != null) h=h.next;
        return h;
    }

    static Node cloneList(Node h){
        if(h==null)return null;
        Node nh= new Node(h.data),cur=nh;
        h=h.next;
        while(h != null){
            cur.next=new Node(h.data);
            cur=cur.next;
            h=h.next;
        }
        return nh;
    }

    static Node cloneFirstK(Node h, int k){
        if(h==null || k<=0)return null;
        Node nh=new Node(h.data),cur=nh;
        h=h.next;
        for(int i=1; i<k && h != null; i++){
            cur.next=new Node(h.data);
            cur=cur.next;
            h=h.next;
        }
        return nh;
    }
}
