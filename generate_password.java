import java.util.Random;

public class PasswordGenerator {
    
    public static String generatePassword(int length) {String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        
        return password.toString();
    }
    
    public static void main(String[] args) {
        int passwordLength = 11;
        String password = generatePassword(passwordLength);
        System.out.println("Сгенерированный пароль: " + password);
    }
}
