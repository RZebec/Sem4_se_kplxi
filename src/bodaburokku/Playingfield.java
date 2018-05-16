package bodaburokku;

public class Playingfield {
    private int[][] tiles;
    private boolean anchorPoints[][];

    public Playingfield() {
        this.tiles = new int[10][10];
        this.anchorPoints = new boolean[11][11];
    }

    public void setTile(int xPos, int yPos, int value) {
        this.tiles[xPos][yPos] = value;
    }

    public void setAnchorPoint(int xPos, int yPos, boolean value) {
        this.anchorPoints[xPos][yPos] = value;
    }
}
