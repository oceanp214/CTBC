/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


class Onlinelibrary{
    String[] books;
    int noOfBooks ;
    double finePerDay ;
    
    Onlinelibrary(){
        this.books = new String[100];
        this.noOfBooks = 0;
        this.finePerDay = 5;
    }
    public String[] getBooks() {
    return books;
}
public void setBooks(String[] books) {
    this.books = books;
}
public int getNoOfBooks() {
    return noOfBooks;
}
public void setNoOfBooks(int noOfBooks) {
    this.noOfBooks = noOfBooks;
}
    void addBook(String book){
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println(book+" has been added!");
    }
    void showAvailableBook(){
        System.out.println("Available books are: ");
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* " + book);
        } 
    }
    
    void issueBook(String book,int days){
        for(int i = 0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
            System.out.println("the"+ book+" has been issued!");
            this.books[i] = null;
            return;
            }
        
    }
    System.out.println("This book does not exists");
}
void returnBook(String book, int inDays){
    System.out.println("The"+ book+" has been returnd:");
    addBook(book);
}
  public double getFinePerDay() {
        return finePerDay;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

  
    public double calculateFine(int days) {
        if (days <= 0) {
            return 0.0;
        }
        return finePerDay * days;
}
}
public class OnlineLibrary
{
	public static void main(String[] args) {
		Onlinelibrary myLibrary = new Onlinelibrary();
		myLibrary.addBook("Data Structures");
		myLibrary.addBook("Algorithms");
		myLibrary.addBook("C Programming");
		myLibrary.addBook("Java Programming");
		myLibrary.addBook("C++ Programming");
		myLibrary.showAvailableBook();
		myLibrary.issueBook("Java Programming",10);
		myLibrary.showAvailableBook();
		myLibrary.returnBook("Java Programming",15);
		myLibrary.showAvailableBook();
		int overdueDays = 10; // Change this value to the actual overdue days
        double fine = myLibrary.calculateFine(overdueDays);
        System.out.println("Fine for " + overdueDays + " days overdue is : $" + fine);

	}
}
