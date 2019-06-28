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

	@Test
	void _2を渡すと文字列2に変換する() {
		// 準備
		FizzBuzz fizzBuzz = new FizzBuzz();
		// 実行 & 検証
		assertEquals("2", fizzBuzz.stringfy(2));
	}

	@Test
	void _3を渡すと文字列Fizzに変換する() {
		// 準備
		FizzBuzz fizzBuzz = new FizzBuzz();
		// 実行 & 検証
		assertEquals("Fizz", fizzBuzz.stringfy(3));
	}

}
