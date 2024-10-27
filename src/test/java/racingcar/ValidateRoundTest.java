package racingcar;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateRoundTest {

    @Test
    void 시도횟수가_숫자이면_올바른_입력이다() {
        // given
        InputValidator inputValidator = new InputValidator();

        // when
        Boolean result = inputValidator.isValidRound("58");

        // then
        Assertions.assertTrue(result);
    }

    @Test
    void 시도횟수로_문자가_올_수_없다() {
        // given
        InputValidator inputValidator = new InputValidator();

        // then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.isValidRound("57d");
        });
    }
}