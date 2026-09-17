public class Book extends Resource {
    private String author;
    private boolean isAvailable;

    public Book(String resourceId, String title, String author) {
        super(resourceId, title);
        this.author = author;
        this.isAvailable = true;
    }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public void displayDetails() {
        System.out.println("Book [ID: " + getResourceId() + ", Title: " + getTitle() + ", Author: " + author + ", Available: " + isAvailable + "]");
    }
}