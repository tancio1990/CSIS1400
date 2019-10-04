


package books;

/**
 * 
 * @author Tatiana Nicoara
 *
 */
public class Book
{
	/**
	 * the private fields of the class Book which can be accessed only in the current class
	 */
	private String name;
	private String author;
	private int year;
	private int id;
	private static int bookCount = 100;
	
	/**
	 * this constructor assigns unique id for each added item in the list 
	 */
	public Book()
	{
		id = bookCount++;
	}
	
	/**
	 * this constructs a book with the following parameters
	 * @param name
	 * @param author
	 * @param year
	 */
	public Book(String name, String author, int year) 
	{
		this();
		this.name = name;
		this.author = author;
		this.year = year;
	}
	/*
	 * returns the name of the book
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * sets the name of the book
	 * @param name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * returns the name of the author 
	 * @return
	 */
	public String getAuthor() 
	{
		return author;
	}

	/**
	 * sets the name of the author 
	 * @param author
	 */
	public void setAuthor(String author) 
	{
		this.author = author;
	}

	/**
	 * returns the year when the book was written
	 * @return
	 */
	public int getYear() 
	{
		return year;
	}

	/**
	 * sets the year when the book was written
	 * @param year
	 */
	public void setYear(int year) 
	{
		this.year = year;
	}

	/**
	 * returns the unique id for the book
	 * @return
	 */
	public int getId() 
	{
		return id;
	}
	/**
	 * returns a readable result from the class
	 */
	@Override
	public String toString()
	{ 
		return  "ID: " +id+ " The book "+name+ " was written by " +author+ " in " +year;
	} 
	
}

