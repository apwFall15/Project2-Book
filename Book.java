/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }
    
    /**
     * Returns the book's author
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Returns the book's title
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Prints the Book's author to the terminal window
     */
    public void printAuthor(){
        System.out.println("The book's author is: " + author);
    }
    
    /**
     * Prints the Book's title to the terminal window
     */
    public void printTitle(){
        System.out.println("The book's title is: " + title);
    }
}
