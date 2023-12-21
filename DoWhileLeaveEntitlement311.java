import java.util.Scanner;

public class DoWhileLeaveEntitlement311 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahCuti = input.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisah jatah cuti: " + jatahCuti);
                } else {
                    System.out.println(
                            "Sisah jatah cuti anda tidak mencukupi. Silakan masukkan jumlah hari sesuai dengan jatah cuti yang tersisa: ");
                }
            }
        } while (jatahCuti > 0 && konfirmasi.equalsIgnoreCase("y")); // Modified loop condition

        input.close();
    }
}
