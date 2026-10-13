package asdfghjkl;

public class Delete {
	    public static void main(String[] args) {
	        StringBuilder sb = new StringBuilder("Java Programming");
	        sb.delete(4, 15);
	        System.out.println(sb); 

	        StringBuilder sb2 = new StringBuilder("Java");
	        sb2.deleteCharAt(2);
	        System.out.println(sb2); 
	    }
	}

