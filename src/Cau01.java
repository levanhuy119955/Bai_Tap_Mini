public class Cau01 {
    public static void main(String[] args) {
//        Viết phương thức thực hiện in ra các hình sau:
//
//        In ra màn hình hình tam giác *

        int hight = 4;
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
//        In ra màn hình hình vuông *
        int height = 4;
        int width = 4;
        int i;
        for (i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }

    }

    }