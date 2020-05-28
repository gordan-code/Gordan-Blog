package com.wip;

import java.util.Scanner;

public class TestSum {
	public static void main(String[] args) {
		System.out.print("input num: ");
		int num=new Scanner(System.in).nextInt();
		int[] array=new int[1000];
		array[0]=num;
		System.out.println("和式分解的全部结果为:");
		partition(array,num,1);
	}
	
	/**
	 * 回溯法
	 * 当数组中只一个数且值为num时开始
	 * 指针再向右移一位同时把前一位的值赋给当前指针位，紧接着再进行校验。
	 * 每减一次进行一次和校验；当校验结果小于num时，保留原数组，
	 * 当和大于等于num时，抛弃当前指针位，指针回到前一位并将数值进行自减
	 */
	/**
	 * 
	 * @param array 存放分解的和式中的数字
	 * @param num 需要分解的数
	 * @param i 要分解的第i个数,作为指针位
	 */
	private static void partition(int[] array, int num, int i) {
		for(int j=num;j>=1;j--) {
			if(j<=array[i-1]) {
				array[i]=j;
				if(j==num) {//得到一组解
					//不输出它自身
					if(i>=2) {
						System.out.print("("+array[1]);
						for(int k=2;k<=i;k++) {
							System.out.print("+"+array[k]);
						}
						System.out.print(")");
						System.out.println();	
					}	
				}
				else
					partition(array,num-j,i+1);
			}
		}
	}
}
