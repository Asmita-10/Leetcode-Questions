class MyLinkedList {
    Node head;
    int length;
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public MyLinkedList() {
        this.head=null;
        this.length=0;
    }
    
    public int get(int index) {
        if(index>=length){
            return -1;
        }
        int count=0;
        Node temp=head;
        while(count<index){
            count++;
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        length++;
    }
    
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
        }
        else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node ele=new Node(val);
        temp.next=ele;
        length++;}
    }
    
    public void addAtIndex(int index, int val) {
        if(index>length){return;}
        else if(index==0){addAtHead(val);}
        else{
            int count=0;
            Node temp=head;
            while(count<index-1){
                count++;
                temp=temp.next;
            }
            Node ele=new Node(val);
            Node next_node=temp.next;
            temp.next=ele;
            ele.next=next_node;
            length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=length){return;}
        else if(index==0){head=head.next; length--;}
        else{
            int count=0;
            Node temp=head;
            while(count<index-1){
                count++;
                temp=temp.next;
            }
            temp.next=temp.next.next;
            length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */