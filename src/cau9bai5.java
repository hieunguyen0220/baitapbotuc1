public class cau9bai5 {
    public static void main(String[] args) {
        String chuoi [] = {"AH","BH","CH","DH","EH"};
        Duyetmangfor(chuoi);
        Duyetmangforeachh(chuoi);
    }
    public static void Duyetmangfor (String chuoi []){
        System.out.println("Duyệt mảng với vòng lặp for");
        for (int i = 0; i <chuoi.length ; i++) {
            System.out.println(chuoi[i]);
        }
    }

    public static void Duyetmangforeachh ( String chuoi []){
        System.out.println("Duyệt mảng với vòng lặp for-each ");
        for (String a: chuoi
        ) {
            System.out.println(a);
        }
    }
}

