package asdfghjkl;

	public class Method 
	{
		
		void Add(int a , int b)
		{
			System.out.println(a+b);
		}
		
		public static void Add1()
		{
			System.out.println(3+4);
		}

		public static void main(String[] args) {
			Method obj = new Method();
			obj.Add(9,10);
			Add1();
			

		}

	}
