import java.util.Scanner;

public class CandyBdgJkt {
    public static void main(String[] args) {
        int[] JktArray = new int[25];
        int[] BdgArray = new int[25];
        int[] intersection = new int[25];
        int intersectionCount= 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input nomor kode produksi permen di gudang Jakarta:");
        for (int i = 0; i < 3; i++) {
            JktArray[i] = scanner.nextInt();
            // if(kodeProduksi != 0){
            //     JktArray[JktCount] = kodeProduksi;
            //     JktCount++;
            // } else {
            //     break;
            // }   
        }

        System.out.println("Input nomor kode produksi permen di gudang Bandung:");
        for (int i = 0; i < 3; i++) {
            BdgArray [i]= scanner.nextInt();
        //     if(kodeProduksi != 0){
        //         BdgArray[BdgCount] = kodeProduksi;
        //         BdgCount++;
        // } else {
        //     break;
        // }
        }
        
        scanner.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (JktArray[i] == BdgArray[j]) {
                    intersection[intersectionCount] = JktArray[i];
                    intersectionCount++;
                    break;
                }
            }
        }

        System.out.println("Potongan nomor kode produksi candy di kedua gudang adalah:");
        for (int i = 0; i < intersectionCount; i++) {
            System.out.println(intersection[i]+ " ");
        }

        // atau bisa juga
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         if (JktArray[i] == BdgArray[j]) {
        //             System.out.println("intersection kode produksi candy pada kedua gudang adalah :" + JktArray[i]);
        //         }   
        //     }
        // }
    }
}            