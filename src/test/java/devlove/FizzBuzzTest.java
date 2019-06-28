package devlove;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("FizzBuzz 数列を扱う FizzBuzzクラス")
class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeEach
	void 前準備() {
		fizzBuzz = new FizzBuzz();
	}

	@Nested
	class 数を文字列に変換するstringfyメソッド {
		@Nested
		class その他の数の時はその数を文字列に変換する {
			@Test
			void _1を渡すと文字列1に変換する() {
				// 実行 & 検証
				assertEquals("1", fizzBuzz.stringfy(1));
			}
		}

		@Nested
		class _3の倍数の時は数の代わりにFizzに変換する {
			@Test
			void _3を渡すと文字列Fizzに変換する() {
				// 実行 & 検証
				assertEquals("Fizz", fizzBuzz.stringfy(3));
			}
		}

		@Nested
		class _5の倍数の時は数の代わりにBuzzに変換する {
			@Test
			void _5を渡すと文字列Buzzに変換する() {
				// 実行 & 検証
				assertEquals("Buzz", fizzBuzz.stringfy(5));
			}
		}
	}

}
