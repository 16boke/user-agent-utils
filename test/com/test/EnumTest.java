package com.test;

public enum EnumTest {
	RED(1), YELLOW(2), GREEN(3);
	private int value;

	// ö������ֻ��Ϊ˽��
	private EnumTest(int value) {
		this.value = value;
	}

	public String toString() {
		return String.valueOf(value);
	}
	//ö���ж���ķ�������static
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
