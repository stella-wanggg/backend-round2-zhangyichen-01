import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        function f=new function();
        while (true){
            System.out.println("******欢迎使用银行账户管理系统******");
            System.out.println("*   调用相应功能请输入功能前的编号  *");
            System.out.println("*           1.存点钱           *");
            System.out.println("*           2.取点钱           *");
            System.out.println("*           3.查金额           *");
            System.out.println("*            4.退出            *");
            System.out.println("*******************************");
            System.out.println("请输入编号(1-4):");
            int id =sc.nextInt();
            switch(id){
                case 1:
                    f.put();
                    break;
                case 2:
                    f.get();
                    break;
                case 3:
                    f.search();
                    break;
                case 4:
                    f.exit();
                    return;
                default:
                    System.out.println("请输入正确的编号!");
                    break;
            }
        }
    }
}
