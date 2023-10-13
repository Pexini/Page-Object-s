package data;

import lombok.Value;
import org.junit.jupiter.params.provider.ValueSource;

public class DataHelper {
    private DataHelper() {}

        @Value
        public static class AuthInfo {
            private String login;
            private String password;
        }
        public static AuthInfo getAuthInfo () {
            return new AuthInfo("vasya", "qwerty123");
        }

        public static AuthInfo getOtherAuthInfo () {
        return new AuthInfo("victor", "qwerty123");
        }

        @Value
        public static class VerificationCode {
            private String code;
        }
        public static VerificationCode getVerificatioCodeFor () {
        return new VerificationCode("12345");
        }

    }
