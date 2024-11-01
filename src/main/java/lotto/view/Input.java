package lotto.view;

import camp.nextstep.edu.missionutils.Console;


public class Input {
    public final static String PURCHASE_AMOUNT_PROMPT = "로또 구매 금액을 입력해주세요. (장당 1,000원)";
    public final static String WINNING_NUMBERS_PROMPT = "담청 번호를 입력해주세요.(숫자는 ,(콤마)로 구분합니다.)";
    public final static String BONUS_NUMBER_PROMPT = "보너스 번호를 입력해주세요.";

    public static String request(String message) {
        System.out.println(message);
        return Console.readLine().trim();
    }

}
