package week1.day2.assignments;

public class Library {
	public String addBook(String bookTitle)
{
	System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		Library books =new Library();
		books.addBook("The Psychology of Money");
		books.issueBook();

	}

}