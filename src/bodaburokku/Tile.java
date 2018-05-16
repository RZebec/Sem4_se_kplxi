package bodaburokku;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    private List<Boolean> connectionCorners;
    private List<Boolean> connections;

    private int value;

    private int xPosition;
    private int yPosition;

    public Tile(int xPosition, int yPosition, int value) {
        this.value = value;
        this.xPosition = xPosition;
        this.yPosition = yPosition;

        this.connectionCorners = new ArrayList<>();
        this.connections = new ArrayList<>();
    }

    public void setConnection(int connectionIndex, boolean value) {
        this.connections.set(connectionIndex, value);
    }

    public void setConnectionCorner(int cornerIndex) {
        this.connectionCorners.set(cornerIndex, true);
    }

    public int getValue() {
        return value;
    }

    public List<Boolean> getConnectionCorners() {
        return connectionCorners;
    }

    public List<Boolean> getConnections() {
        return connections;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }
}
