package lotto;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import lotto.domain.Lotto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoTest {

  @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
  @Test
  void createLottoByOverSize() {
    assertThatThrownBy(() -> Lotto.of(List.of(1, 2, 3, 4, 5, 6, 7), 10))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
  @Test
  void createLottoByDuplicatedNumber() {
    // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
    assertThatThrownBy(() -> Lotto.of(List.of(1, 2, 3, 4, 5, 5), 10))
        .isInstanceOf(IllegalArgumentException.class);
  }

  // 아래에 추가 테스트 작성 가능
}