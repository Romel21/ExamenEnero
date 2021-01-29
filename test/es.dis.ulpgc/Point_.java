package es.dis.ulpgc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Point_ {
    @Test
    public void could_be_initialized_with_legacy_constructor() {
        assertThat(new Point("30 10"));
    }

}