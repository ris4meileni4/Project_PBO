public class Karyawan {
    String name, address;

    String birth;



   Karyawan(String name,String address,String birth) {
        this.name = name;
        this.address = address;
        this.birth= birth;
}

    void printkaryawan(String name){

        System.out.println( "\n Name = " +name+ " \n Address = " +address+ " \n Birth = " +birth);
    }
}

