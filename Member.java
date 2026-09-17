public class Member {
    private String memberId;
    private String name;
    private String role; // "Faculty" or "Student"
    private int rewardPoints;

    public Member(String memberId, String name, String role) {
        this.memberId = memberId;
        this.name = name;
        this.role = role;
        this.rewardPoints = 0;
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public int getRewardPoints() { return rewardPoints; }

    public void addRewardPoints(int points) {
        this.rewardPoints += points;
    }
}