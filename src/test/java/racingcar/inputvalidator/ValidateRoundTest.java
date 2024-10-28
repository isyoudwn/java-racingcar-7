package racingcar.inputvalidator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.InputValidator;

class ValidateRoundTest {

    @Test
    void 시도횟수가_숫자이면_올바른_입력입니다() {
        // given
        InputValidator inputValidator = new InputValidator();

        // when
        Integer result = inputValidator.isValidRound("58");

        // then
        org.assertj.core.api.Assertions.assertThat(result).isEqualTo(58);
    }

    @Test
    void 시도횟수로_문자가_올_수_없습니다() {
        // given
        InputValidator inputValidator = new InputValidator();

        // then
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.isValidRound("57d");
        });
    }
}