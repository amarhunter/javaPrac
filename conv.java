class conv
{
	public static void main(String args[])
	{
		byte b = 1;
		int i = 257;
		double d =325.142;
		System.out.println("Conversion of int to byte");
		b = (byte)i;
		System.out.println("i and b " + i + "" + b);
		System.out.println("Conversion of double to int");
		d = (int)d;
		System.out.println("d and i " + d + "" + i);

	}
}