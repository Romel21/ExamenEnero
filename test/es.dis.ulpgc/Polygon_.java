package es.dis.ulpgc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Polygon_ {
    @Test
    public void could_be_initialized_with_legacy_constructor() {
        assertThat(new Polygon(("30 10", "40 40", "20 40", "10 20", "30 10")));
    }

    @Test
    public void should_be_inside_of_polygon() {
        assertThat(Polygon.inside("5 5").isEqualTo(true));
    }

    @Test
    public void should_be_outside_of_polygon() {
        assertThat(Polygon.inside("5 6").isEqualTo(false));
    }
}