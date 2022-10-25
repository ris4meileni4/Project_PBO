public class Penggajian {
    int gaji_pokok;
    int gaji_tunjangan_jabatan;
    int gaji_lembur;

    Penggajian( int gaji_tunjangan_jabatan, int gaji_pokok, int gaji_lembur){

        this.gaji_pokok=gaji_pokok;
        this.gaji_tunjangan_jabatan=gaji_tunjangan_jabatan;
        this.gaji_lembur=gaji_lembur;

    }
    void printpenggajian( int gaji_lembur){

        System.out.println("\n gaji_pokok="+ gaji_pokok + "\n gaji_tunjangan_jabatan=" +gaji_tunjangan_jabatan+
                "\n gaji_lembur=" +gaji_lembur);
    }
}
