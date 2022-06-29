package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {5,2,3,1};
        //比较的轮数 = 数组长度-1 用循环进行控制
        for (int i = 0; i < arr.length-1; i++) {
            //i == 1 比较3次 j = 0 1 2
            //i == 2 比较2次 j = 0 1
            //i == 3 比较1次 j = 0
            //控制每轮比较次数 占位
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //遍历输出数组值
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}






















