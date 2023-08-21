package de.example;

import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;
import org.locationtech.jts.triangulate.polygon.ConstrainedDelaunayTriangulator;

public class Main {

    public static void main(String[] args) {
        WKTReader reader = new WKTReader();

        Geometry polygon;

        try {
            polygon = reader.read("Polygon ((461527.55000000004656613 5638016.75, 461530.36926462681731209 5638011.81626623962074518, 461527.70430372917326167 5638009.52959428261965513, 461526.03410192765295506 5638015.73833885975182056, 461527.55000000004656613 5638016.75),(461529.30000000004656613 5638011.14999999944120646, 461528.95000000001164153 5638013.29999999981373549, 461527.55000000004656613 5638012.29999999981373549, 461529.30000000004656613 5638011.14999999944120646),(461527.70000000001164153 5638013, 461527.55000000004656613 5638012.75, 461528 5638012.94999999925494194, 461527.70000000001164153 5638013))");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        try {
            ConstrainedDelaunayTriangulator.triangulate(polygon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
