package es.dis.ulpgc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Line_ {
    @Test
    public void could_be_initialized_with_legacy_constructor() {
        assertThat(new Line("30 10, 10 30, 40 40"));
    }

}