class Sports {
    String getName() {
        return "Generic Sports";
    }
    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}
class Soccer extends Sports {
    String getName() {
        return "Soccer Class";
    }
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
public class Solution {
    public static void main(String[] args) {
        Sports s = new Sports();
        System.out.println(s.getName());
        s.getNumberOfTeamMembers();

        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
