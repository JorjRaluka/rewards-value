import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue=100.0;
        RewardValue rewardValue=new RewardValue(cashValue);
        int expectedValue= (int) (cashValue/0.0035);
        assertEquals(expectedValue,rewardValue.getMilesValue());

    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue=1000;
        RewardValue rewardValue=new RewardValue(milesValue);
        double expectedValue= milesValue*0.0035;
        assertEquals(expectedValue,rewardValue.getCashValue());
    }
}
