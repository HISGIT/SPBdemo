package hw0b.tests;

import hw0b.src.HW0A;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static com.google.common.truth.Truth.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HW0ATest {
    @Test
    @Order(0)
    @DisplayName("Test quadrant correctness")
    public void testQuadrant() {
        assertThat(HW0A.quadrant(12.4, 17.8)).isEqualTo(1);
        assertThat(HW0A.quadrant(-2.3, 3.5)).isEqualTo(2);
        assertThat(HW0A.quadrant(-15.2, -3.1)).isEqualTo(3);
        assertThat(HW0A.quadrant(4.5, -42.0)).isEqualTo(4);
        assertThat(HW0A.quadrant(0.0, 3.14)).isEqualTo(0);
    }
}
