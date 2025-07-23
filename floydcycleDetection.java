public class floydcycleDetection {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static boolean containsCycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(1);
        head.next.next.next=new Node(1);
        
        //cycle 
        head.next.next.next=head.next.next;

        if(containsCycle(head)){
            System.out.println("cycle detected");
        }
        else{
            System.out.println("no cycle detected");
        }

    }
}

