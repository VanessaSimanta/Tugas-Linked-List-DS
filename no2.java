class Node {
    int info;
    Node next;

    //constructor
    Node(int data) {
        this.info = data;
        this.next = null;
    }
}

public class no2 {
    Node tail;
    Node head;

    public void Input (int N, int Data){
        Node current = head;
        int counter = 1;
        System.out.println("hellow");
        if (N == 1){
            current.info = Data;
            return;
        }

        while (current != null && counter <= N){
            current = current.next;
            counter ++;
        }
        
        current.info = Data;
        return;
    }

    public void printList() {
		Node curr = head;

		if(curr == null) System.out.println("List kosong!");
		else {
            System.out.print("[ ");
			while(curr != null) {
				System.out.print(curr.info + " ");
            
				curr = curr.next;
			}
		}
        System.out.println("]");
	}
    public static void main(String[] args) {
        int N;
        int Data;

        no2 List = new no2();
        List.head = new Node(10);
        List.head.next = new Node(20);
        List.head.next.next = new Node(30);

        System.out.println("linked list sebelum : ");
        List.printList();

        N = 2;
        Data = 100;
        
        List.Input(N, Data);

        System.out.println("setelah :");
        List.printList();

    }
}
