package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public final class RandomNumbersGenerator {

  private final int startInclusive;
  private final int endInclusive;

  public RandomNumbersGenerator(
      final int startInclusive,
      final int endInclusive
  ) {
    this.startInclusive = startInclusive;
    this.endInclusive = endInclusive;
  }

  public List<Integer> generate(final int count) {
    return Randoms.pickUniqueNumbersInRange(startInclusive, endInclusive, count);
  }

}
