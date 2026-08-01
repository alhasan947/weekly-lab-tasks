class MyBook extends Book {
    private String author;
    private int price;
  
    MyBook(String title, String author, int price) {
        this.title = title;   // title inherited from Book
        this.author = author;
        this.price = price;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
