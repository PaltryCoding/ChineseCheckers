import javax.swing.*;

public class BoardField {

    int cordX;
    int cordZ;
    int team;

    BoardField(int team, int cordX, int cordZ) {
        this.setTeam(team);
        this.setCordX(cordX);
        this.setCordZ(cordZ);
    }

    public int getTeam() { return team; }

    public int getCordX() { return cordX; }

    public int getCordZ() { return cordZ; }

    public void setTeam(int team) { this.team = team; }

    public void setCordX(int cordX) { this.cordX = cordX; }

    public void setCordZ(int cordZ) { this.cordZ = cordZ; }

}
