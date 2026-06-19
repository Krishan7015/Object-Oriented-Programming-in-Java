class book {

    static int totalBooks;

    String title,author,isbn;

    boolean isBorrowed;

    static {
        totalBooks=0;
    }

    {
        totalBooks++;
    }

    book(String isbn, String title, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalBooks;
    }

    void borrowBook() {
        if(isBorrowed) {
            System.out.println("Book is already borrowed.");
        }
        else{
            this.isBorrowed = true;
            System.out.println("Enjoy reading the book.");
        }
    }

    void returnBook() {
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed book. Leave a review.");
        }
        else{
            System.out.println("Book is already in library");
        }
    }
    public static void main(String[] args) {
        book designofThings = new book("1","Design", "Jack");
        book myBook = new book("2");
        designofThings.borrowBook();
        myBook.borrowBook();
        designofThings.borrowBook();
        designofThings.returnBook();
        designofThings.returnBook();
        System.out.println(getTotalNoOfBooks());
    }
}