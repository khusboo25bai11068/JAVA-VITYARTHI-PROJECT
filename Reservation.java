import java.util.Comparator;

public class Reservation {
    private Member member;
    private Resource resource;
    private int urgencyLevel; // Higher value = higher priority

    public Reservation(Member member, Resource resource, int urgencyLevel) {
        this.member = member;
        this.resource = resource;
        this.urgencyLevel = urgencyLevel;
    }

    public Member getMember() { return member; }
    public Resource getResource() { return resource; }
    public int getUrgencyLevel() { return urgencyLevel; }

    // Priority Rule: Faculty prioritized ahead of Students, then ordered by urgency level
    public static Comparator<Reservation> PriorityComparator = (r1, r2) -> {
        boolean r1IsFaculty = r1.getMember().getRole().equalsIgnoreCase("Faculty");
        boolean r2IsFaculty = r2.getMember().getRole().equalsIgnoreCase("Faculty");

        if (r1IsFaculty && !r2IsFaculty) return -1;
        if (!r1IsFaculty && r2IsFaculty) return 1;
        return Integer.compare(r2.getUrgencyLevel(), r1.getUrgencyLevel());
    };
}