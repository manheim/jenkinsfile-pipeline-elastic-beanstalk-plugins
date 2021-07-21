import static org.hamcrest.Matchers.equalTo
import static org.hamcrest.MatcherAssert.assertThat

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(ResetStaticStateExtension.class)
class FooTest {
    @Nested
    public class Anything {
        @Test
        void doesNotFail() {
            assertThat(true, equalTo(true))
        }
    }
}
