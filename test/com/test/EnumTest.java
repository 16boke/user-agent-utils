package com.test;

public enum EnumTest {
	RED(1), YELLOW(2), GREEN(3);
	private int value;

	// 枚举类型只能为私有
	private EnumTest(int value) {
		this.value = value;
	}

	public String toString() {
		return String.valueOf(value);
	}
	//枚举中定义的方法都是static
	public static void list(){
		EnumTest[] enums = EnumTest.values();
		for (EnumTest en : enums) {
			System.out.println("ordinal = " + en.ordinal()+",name = " + en.name()+","+en);
		}
	}

	public static void main(String[] args) {
		EnumTest.list();
	}
}
