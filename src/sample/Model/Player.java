package sample.Model;

public class Player {
    public double playerCash;
    public int numApples;
    public int numOranges;
    public int numBananas;
    public int numGrapes;



    public Player(double cash, int numApples, int numOranges, int numBananas, int numGrapes) {
        this.playerCash = cash;
        this.numApples = numApples;
        this.numOranges = numOranges;
        this.numBananas = numBananas;
        this.numGrapes = numGrapes;
    }

    public double getCash() {
        return playerCash;
    }

    public void setCash(double cash) {
        this.playerCash = cash;
    }

    public int getNumApples() {
        return numApples;
    }

    public void setNumApples(int numApples) {
        this.numApples = numApples;
    }

    public int getNumOranges() {
        return numOranges;
    }

    public void setNumOranges(int numOranges) {
        this.numOranges = numOranges;
    }

    public int getNumBananas() {
        return numBananas;
    }

    public void setNumBananas(int numBananas) {
        this.numBananas = numBananas;
    }

    public int getNumGrapes() {
        return numGrapes;
    }

    public void setNumGrapes(int numGrapes) {
        this.numGrapes = numGrapes;
    }
}
