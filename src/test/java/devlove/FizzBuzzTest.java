package devlove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void _1を渡すと文字列1に変換する() {
		// 準備
		FizzBuzz fizzBuzz = new FizzBuzz();
		// 実行 & 検証
		assertEquals("1", fizzBuzz.stringfy(1));
	}

}
