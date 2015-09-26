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
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
    }
    
    /**
     * Returns the book's author
     */
    public String getAuthor(){
        return author;
    }

    /**
     * Sets the book's reference number
     */
    public String getRefNumber(){
        return refNumber;
    }
    
    /**
     * Returns the book's title
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Returns the number of pages in the Book
     */
    public int getPages(){
        return pages;
    }
    
    /**
     * Sets the book's reference number
     */
    public void setRefNumber(String ref){
        refNumber = ref;
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
    
    /** 
     * Prints all of the book's information to the terminal window
     */
    public void printDetails(){
        System.out.println("*** Book Details ***");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Length: " + pages + " pages");
        if(refNumber.length()<1){
            System.out.println("RefNumber: ZZZ");
        }else{
            System.out.println("RefNumber: " + refNumber);
        }
        System.out.println("********************");
    }
}
