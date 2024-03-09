import java.util.Scanner;

public class CandyBdgJkt {
    public static void main(String[] args) {
  int[] JktArray = new int[25];
  int[] BdgArray = new int[25];
  int[] intersection = new int[25];
  int JktCount= 0;
  int BdgCount= 0;

       Scanner scanner = new Scanner(System.in);

       System.out.println("Input nomor kode produksi permen di gudang Jakarta:");
       for (int i = 0; i < 25; i++) {
        int kodeProduksi = scanner.nextInt();
        if(kodeProduksi != 0){
            JktArray[JktCount] = kodeProduksi;
            JktCount++;
        } else {
            break;
        }   
    }

       System.out.println("Input nomor kode produksi permen di gudang Bandung:");
       for (int i = 0; i < 25; i++) {
        int kodeProduksi = scanner.nextInt();
        if(kodeProduksi != 0){
            BdgArray[BdgCount] = kodeProduksi;
            BdgCount++;
       } else {
        break;
       }
    }
       int intersectionCount= 0;
       for (int i = 0; i < 25; i++) {
           for (int j = 0; j < 25; j++) {
               if (JktArray[i] == BdgArray[j]) {
                   intersection[intersectionCount] = JktArray[i];
                   intersectionCount++;
                   break;
               }
           }
       }

       System.out.println("Potongan nomor kode produksi candy di kedua gudang adalah:");
       for (int i= 0; i < intersectionCount; i++) {
           System.out.println(intersection[i]+ " ");
       }
       scanner.close();
   }
}