package U4ProgrammingA2;

import java.util.Iterator;

public class Team extends Player implements Actions {

    Player player = new Player();

    public void teamPlayer(String firstName, String lastName, String teamName) { // The variables contained within can be used by other classes 
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
    }

    @Override
    public void setFirstName() { // It would override the current data stored for setFirstName, and would update it with the information from the team class.
        player.setFirstName();
    }

    @Override
    public void setLastName() { // It would override the current data stored for setLastName, and would update it with the information from the team class.
        player.setLastName();
    }

    @Override
    public void setTeam() { // It would override the current data stored for team name from the user input by using a scanner
        System.out.println("Enter team name");
        this.teamName = InputFactory.SC.next();
    }

    @Override
    public void add() {
        while (ShortStore.listTeam.size() <= 20) {
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList();
        }
        Menu menu = new Menu();
    }

    @Override
    public void addToArrayList() {
        String deats = (player.firstName + "\t" + player.lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void view() { // It would display the stored teams
        if (ShortStore.listTeam.isEmpty()) {
            System.out.println("You have no teams");
        }
        for (Iterator<String> iterator = ShortStore.listPlayer.iterator(); iterator.hasNext(); ) {
            String team = iterator.next();
            System.out.println(team);
        }
    }

    @Override
    public void remove() { // It would remove a stored player.
        ShortStore.listPlayer.clear();
    }
}
