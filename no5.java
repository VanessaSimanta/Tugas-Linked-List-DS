import java.util.Scanner;

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
    Node tail = null;
    Node head = null;

    //function untuk insert data ke linked list
    public void insert(int data) {
        //buat node baru
		Node newNode = new Node(data);
        //jika list kosong, head dan tail sama-sama menunjuk ke node pertama
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
        //jika tidak kosong, tail diupdate untuk menunjuk ke node baru
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}

    //function untuk menggabungkan kedua linked list
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
        //input
        Scanner scanner = new Scanner(System.in);

        no5 first = new no5();

        System.out.println("Masukkan data untuk first linked list (Ketik -1 untuk berhenti menginput):");

        //memasukkan data ke linked list
        int data;
        while ((data = scanner.nextInt()) != -1) {
            first.insert(data);
        }

        no5 second = new no5();

        System.out.println("Masukkan data untuk second linked list (Ketik -1 untuk berhenti):");

        int data1;
        while ((data1 = scanner.nextInt()) != -1) {
            second.insert(data1);
        }
        scanner.close();
        
    //memanggil function merge
    Node third = Merge(first.head, second.head);
        
        //print out hasil dari linked list yang baru
        System.out.println("[");
        while(third != null) {
            System.out.print(third.info + " ");
            third = third.next;
        }
        System.out.println("]");
    }
  }