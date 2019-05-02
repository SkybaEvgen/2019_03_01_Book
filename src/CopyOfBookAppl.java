
public class CopyOfBookAppl {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.setAuthor("Pushkin");
		book1.setTitle("Onegin");
		book1.setIsbn(123455);
		book1.setYear(2001);
			
		System.out.println(book1.getAuthor());
		
		String str3=book1.getTitle();
		System.out.println(str3);
		System.out.println("qqwerff");
	}

}
