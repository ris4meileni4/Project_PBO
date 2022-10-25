import javax.xml.namespace.QName;

public class mainApp {
    public static void main(String[] args) {
        Karyawan Karyawan = new Karyawan("Risa meielenia a.p", "Kerembong", "31-12-2000");
        Karyawan.printkaryawan(Karyawan.name);

        Penggajian Penggajian = new Penggajian(2000000, 8000000, 1000000);
        Penggajian.printpenggajian(Penggajian.gaji_pokok);


        Status_pendidikan Status_pendidikan = new Status_pendidikan("ekonomi", "bisnis");
        Status_pendidikan.printstatus_pendidikan(Status_pendidikan.S1);

        Jabatan Jabatan = new Jabatan("manager pemasaran",  "karyawan lapangan");
        Jabatan.printjabatan(Jabatan.mananger);
    }
}
