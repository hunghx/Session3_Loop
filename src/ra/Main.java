package ra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // Loop - vòng lặp - sử dụng để lặp đi lặp lại môt khối code
        // có 3 loại vòng lặp chính for , while, do while
        // for : thường sử dụng khi biết trước số lần lặp
        // cú pháp

        // bài toán tính tổng có 10 số tự nhiên đầu tien
//        int sum = 0;
//        for (int i = 0; i <10; i++) {
//            sum+= i;
//        }
        // in ra tông
//        System.out.println("Tổng của 10 số tự nhiên đầu tiên là "+ sum);

        // while : thường sử dụng khi chưa biết trước số lần lặp , xét điều kiện trước khi thực thi khối lệnh
        // bài toán : in ra 10 số chia hết cho 3 đầu tiên khác 0
//        int dem =0;
//        int N = 1;
//        while(dem<10){
//            // khối code thực thi nếu điều kiện đúng
//            if(N%3 ==0){
//                dem++;
//                System.out.println("Số thứ " + dem + " là "+N);
//            }
//            N++;
//        }
        // do while : thường sử dụng khi chưa biết trước số lần lặp , thực thi khối lệnh ít nhất 1 lần rồi mới kiểm tra điều kiện
//        bài toán : nhập 1 số và hiển thị ra màn hình đến khi nhập số 0
//        int choice;
//        do{
//            choice = sc.nextInt();
//            System.out.println("Bạn vừa nhâp số "+ choice);
//        }while (choice!=0);



        // break và continue
        // break : dùng để thoát ngay lập tức khỏi cấu trúc lặp hiện tại
//        for (int i = 0; i <100 ; i++) {
//            System.out.println(i);
//            if(i==50){
//                // đến vòng lặp thứ 50 thì break
//                break;
//            }
//        }
        // continue : bỏ qua toàn bộ khối code bên dưới nó và bước qua vòng lặp kế tiếp
//        for (int i = 0; i <100 ; i++) {
//            System.out.println(i);
//            if(i==50){
//                // đến vòng lặp thứ 50 thì break
//                continue;
//            }
//            System.out.println("Khối code bên dưới "+i);
//        }


        //  bài toán : nhập 1 số và hiển thị ra màn hình đến khi nhập số 0
        while(true){
            int choose = sc.nextInt();
            System.out.println("Bạn vừa nhập vào số  " + choose);
            if(choose==0){
                break;
            }
        }
    }



}
