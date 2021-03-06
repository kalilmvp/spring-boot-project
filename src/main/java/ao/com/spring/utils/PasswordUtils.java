package ao.com.spring.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public final class PasswordUtils {
	
	private static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public static String generatePassword(String rawPassword) {
		return encoder.encode(rawPassword);
	}
	
	public static boolean checkPassword(String raw, String encoded) {
		return encoder.matches(raw, encoded);
	}
}
