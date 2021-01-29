package es.dis.ulpgc;

public class Polygon {
    private String [] polygon;

    public Polygon(String [] polygon) {
        this.polygon = new String [polygon];
    }

    public String[] getPolygon() {
        return polygon;
    }

    public boolean inside(Point point) {
        for (int i=0; i < polygon.length; i++) {
            if (polygon[i].equals(point)) {
                return true;
            }
        }
        return false;
    }
}