import java.util.LongSummaryStatistics;
import java.util.Scanner;

public class function {
    Scanner sc =new Scanner(System.in);
    private long money=0L;

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
    public void put(){
        System.out.println("请输入你要输入的金额:");
        long add=sc.nextLong();
        if(add<0){
            System.out.println("你输入的金额要是正数啊");
        }else {
            money += add;
            System.out.println("存进去啦~你的金额目前是:" + money);
        }
    }
    public void get(){
        System.out.println("请输入你要取的金额:");
        long minus=sc.nextLong();
        if(minus<0){
            System.out.println("你输入的金额要是正数啊");
        }else {
            if (minus > money) {
                System.out.println("你的余额不足...");
            } else {
                money -= minus;
                System.out.println("已成功取出~你的金额目前是:" + money);
            }
        }
    }
    public void search(){
        System.out.println("你的存款是:"+money);
    }
    public void exit(){
        System.out.println("感谢使用!拜拜啦~");
    }
}
