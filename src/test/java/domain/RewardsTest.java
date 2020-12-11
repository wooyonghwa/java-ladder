package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RewardsTest {
    private Rewards rewards;

    @Test
    @DisplayName("of() test")
    void ofTest() {
        assertThat(Rewards.of("1,2,3,4,5").size()).isEqualTo(5);
    }
}