package fangfademo;

public class SumN {
    public static void main(String[] args) {
        //计算1-n的值
        System.out.println(sum(5));

    }
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
