import java.util.Random;

public class PasswordGenerator {
    
    public static String generatePassword(int length) {
        // Все возможные символы для пароля
        String characters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        
        // Генерируем пароль заданной длины
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        
        return password.toString();
    }
    
    public static void main(String[] args) {
        // Генерируем пароль из 11 символов (как в примере)
        int passwordLength = 11;
        String password = generatePassword(passwordLength);
        System.out.println(password);
    }
}