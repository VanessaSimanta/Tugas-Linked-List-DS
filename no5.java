class Node {
    int info;
    Node next;

    //constructor
    Node(int data) {
        this.info = data;
        this.next = null;
    }
}

class no5 {
    public static Node Merge (Node first, Node second) {
    //deklarasi head dan tail
    Node tail = null;
    Node head = null;
        
        //pakai or supaya saat linked list memiliki jumlah data yang berbeda tidak error
        while(first != null || second != null) {
            int information;
            if (first == null) {
                information = second.info;
                second = second.next;
            } 
            else if (second == null) {
                information = first.info;
                first = first.next;
            } 
            else {
                information = first.info;
                first = first.next;
            }
            
            //menampung hasil linked list yang baru
            if(tail == null) {
                head = new Node(information);
                tail = head;
            } 
            else {
                tail.next = new Node(information);
                tail = tail.next;
            }
        }
        return head;
    }
  
    public static void main(String[] args) {
    //memasukan data ke first dan second linked list
    Node first = new Node(1);
        first.next = new Node(2);
  
    Node second = new Node(4);
        second.next = new Node(5);
        second.next.next = new Node(5);
        second.next.next.next = new Node(5);
    
    //memanggil function merge
    Node third = Merge(first, second);
        
        //print out hasil dari linked list yang baru
        System.out.println("[ ");
        while(third != null) {
            System.out.print(third.info + " ");
            third = third.next;
        }
        System.out.println(" ]");
    }
  }