public class cau9bai3 {
    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,6,7,8,9,10};
        duyetmangvoivonglapfor(numbers);
        duyetmangvoivonglapforeach(numbers);

    }
    public static void duyetmangvoivonglapfor ( int numbers []){
        System.out.println("Duyệt mảng với vòng lặp for");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);

        }
    }


    public static void duyetmangvoivonglapforeach (int numbers []){
        System.out.println( "Duyệt mảng với vòng lặp for-each ");
        for (int a : numbers
        ) {
            System.out.println(a);
        }
    }
}
