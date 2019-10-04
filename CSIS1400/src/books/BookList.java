




package books;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class will test the Book class which has to display a list of books using an ArrayList
 * @author Tatiana Nicoara
 *
 */
public class BookList 
{
	/**
	 * the Scanner allows the user to input values
	 * the ArrayList will store all the items entered by the user including the existing ones 
	 */
	public static final Scanner input = new Scanner(System.in);
	private static ArrayList<Book> books = new ArrayList<Book>();
	
	public static void main(String[] args) 
	{
		books = new ArrayList<Book>();
		  
		Book b = new Book("Anna Karenina", "Leo Tolstoy", 1877);
		books.add(b);
		b = new Book("Life of Pi", "Yann Martel", 2001);
		books.add(b);
		b = new Book("Catching Fire", "Suzanne Collins", 2009);
		books.add(b);
		b = new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866);
		books.add(b);
		
		
		int choice;
		do {
			displayMenu();
			choice = input.nextInt();
			getInput(choice);
			} while (choice != 6);
		
		System.out.println();
	}
	
	
	/**
	 * This method is used to display all the options in the user menu
	 */
	public static void displayMenu()
	{
		System.out.println("                @@@===========================@@@");
		System.out.println("1. Display all the books");
		System.out.println("2. Add a book");
		System.out.println("3. Find a book");
		System.out.println("4. Delete a book");
		System.out.println("5. Number of books in list ");
		System.out.println("6. Exit ");
		System.out.print("---Enter your selection:--- ");
		
	}
	
	/**
	 * displays all the books in the list 
	 */
	public static void displayAll()
	{
		for (Book b : books) 
		{
			System.out.println(b);
		}
		System.out.println();
	
	}
	/**
	 * This method allows the user to insert their own items of the type Book
	 */
	public static void addBook()
	{
	   System.out.print("Name of the book: ");
	   String name = input.nextLine();
	   System.out.print("Author: ");
	   String author = input.nextLine();
	   System.out.print("The year when was written: ");
	   int year = input.nextInt();
	   Book newBook = new Book (name,author, year);
	   books.add(newBook);
	   System.out.printf("The book %s has been added.", name);
	   System.out.println();
	   System.out.println();
	
	}
	
	/**
	 * This method allows the user to find a specific Book by entering the item's unique id
	 * @param Book
	 * @param id
	 * @return
	 */
	private static Book findBook(ArrayList<Book> Book, int id) 
	{
		for (Book b : books) 
		{
			if (b.getId() == id) 
			{
	        return b;
			}
			
		}
		return null;
		
	}
	/**
	 * this method displays the amount of books in the list
	 */
	private static void displayNumberOfBooks() 
	{
		   int size = books.size();
		   System.out.printf("There are %d books in the list\n\n", size);
		 
	}
	
	/**
	 * this method stores the user's inputs also putting conditions and printing what information needs 
	 * to be entered in order to return the right result
	 * @param choice
	 */
	private static void getInput(int choice) 
	{
		input.nextLine();
		System.out.println();
		switch (choice)
		{
			case 1:
				displayAll();
				break;
			case 2:
				addBook();
				break;
			case 3:
				System.out.print("Find the book with Id number: ");
				int id1 = input.nextInt();
				Book b = findBook(books, id1);
				if (b == null) 
				{
					System.out.println("The book can't be found.\nEnter an existing ID #");
				}
				else 
				{
					System.out.println(b);
				}
				System.out.println();
				break;
			case 4:
				System.out.print("Delete book with Id number:  ");
				int id2 = input.nextInt();
				Book b1 = findBook(books, id2);
				if (b1 == null) 
				{
					System.out.printf("Id: %d does not exist in list.\n\n", id2);
					return;
				}
				books.remove(b1);
				System.out.printf("ID: %d The book %s has been deleted\n\n", id2,
				b1.getName());
				break;
			case 5:
				displayNumberOfBooks();
				break;
			case 6:
				System.out.println("Good bye!");
				break;
			default:
				System.out.println("Wrong input!\nPlease enter a number from 1 to 6\n");
				System.out.println();
			}
		}
}
