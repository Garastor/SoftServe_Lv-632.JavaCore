package lesson13.HW13.task2.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EncriptDecript {

    private static final String DICT = "][\\/\"�����9uytrewqasdfghjklmnbvcxz QWERTYUIOPLKJHGFDSAZXCVBNM" +
            "�����������娸����������������������������������������������������" +
            "1234567890+_)(*&^%$#@!`|?}{-.,;";

    public String encrypt(String text, int key) {
        System.out.println("Encryption start ! " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy - HH:mm:ss")));
        int dictLength = DICT.length();
        int textLength = text.length();
        String result = "";

        for (int i = 0; i < textLength; i++) {
            char c = text.charAt(i);
            for (int k = 0; k < dictLength; k++) {
                char c1 = DICT.charAt(k);
                if (c == c1) {
                    result += String.valueOf(DICT.charAt((k + key + dictLength) % dictLength));
                    break;
                }
            }
        }
        System.out.println(result);
        System.out.println("Encryption complete! " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy - HH:mm:ss")));
        return result;
    }

    public String decrypt(String text, int key) {
        System.out.println("Decription start ! " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy - HH:mm:ss")));
        int dictLength = DICT.length();
        int textLength = text.length();
        String result = "";

        for (int i = 0; i < textLength; i++) {
            char c = text.charAt(i);
            for (int k = 0; k < dictLength; k++) {
                char c1 = DICT.charAt(k);
                if (c == c1) {
                    result += String.valueOf(DICT.charAt((k - key + dictLength) % dictLength));
                    break;
                }
            }
        }
        System.out.println(result);
        System.out.println("Decription complete! " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd:MM:yyyy - HH:mm:ss")));
        return result;
    }
}