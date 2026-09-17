public class DigitalResource extends Resource {
    private int totalLicenses;
    private int activeLicenses;

    public DigitalResource(String resourceId, String title, int totalLicenses) {
        super(resourceId, title);
        this.totalLicenses = totalLicenses;
        this.activeLicenses = 0;
    }

    public synchronized boolean checkoutLicense() {
        if (activeLicenses < totalLicenses) {
            activeLicenses++;
            return true;
        }
        return false;
    }

    public synchronized void returnLicense() {
        if (activeLicenses > 0) {
            activeLicenses--;
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Digital Resource [ID: " + getResourceId() + ", Title: " + getTitle() + ", Active Sessions: " + activeLicenses + "/" + totalLicenses + "]");
    }
}