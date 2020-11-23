package com.infobip.jokerquest1.configuration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SecretDecrypter {
    private static final int SPACE = 32;

    // Реализуйте функцию которая вернет новую строку полученную путем сдвига
    // каждой буквы исходной строки на 10 позиций в английском алфавите a - z,
    // пробелы должны оставаться без изменений.
    // Например: xyz -> hij | abc -> klm
    public static String decrypt(String secret) {
        return "";
    }
}
