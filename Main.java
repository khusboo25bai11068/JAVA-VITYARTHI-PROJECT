import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library System Test Execution ===");

        // 1. Members
        Member student = new Member("M101", "Alice", "Student");
        Member faculty = new Member("M102", "Dr. Smith", "Faculty");

        // 2. Priority Queue Waitlist Test
        Book book = new Book("B101", "Java Programming Core", "Author X");
        PriorityQueue<Reservation> waitlist = new PriorityQueue<>(Reservation.PriorityComparator);

        waitlist.add(new Reservation(student, book, 5));
        waitlist.add(new Reservation(faculty, book, 2));

        System.out.println("\n--- Priority Queue Order ---");
        while (!waitlist.isEmpty()) {
            Reservation r = waitlist.poll();
            System.out.println("Reserved for: " + r.getMember().getName() + " (" + r.getMember().getRole() + ")");
        }

        // 3. Digital Licensing Test
        System.out.println("\n--- Concurrent Digital Licensing Test ---");
        DigitalResource ebook = new DigitalResource("D201", "Advanced AI Concepts", 1);
        System.out.println("Session 1 checkout: " + ebook.checkoutLicense());
        System.out.println("Session 2 checkout (should fail): " + ebook.checkoutLicense());
        ebook.returnLicense();
        System.out.println("Session 3 checkout (after release): " + ebook.checkoutLicense());

        System.out.println("\n=== Execution Completed Successfully ===");
    }
}
