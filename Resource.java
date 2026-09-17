public abstract class Resource {
    private String resourceId;
    private String title;

    public Resource(String resourceId, String title) {
        this.resourceId = resourceId;
        this.title = title;
    }

    public String getResourceId() { return resourceId; }
    public String getTitle() { return title; }

    public abstract void displayDetails();
}