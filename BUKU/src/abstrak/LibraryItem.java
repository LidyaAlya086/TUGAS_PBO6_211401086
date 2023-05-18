package abstrak;

public abstract class LibraryItem {
    private String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract void display();

    public String getTitle() {
        return title;
    }
}
