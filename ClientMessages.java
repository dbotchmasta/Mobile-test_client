package client;

public class ClientMessages {
    
    private static final String ANSI_RESET = "\u001B[0m";
    //public static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    //public static final String ANSI_CYAN = "\u001B[36m";
    
    public static final String ANSWER = ANSI_PURPLE + "Ответ:" + ANSI_RESET;
    
    public static final String NUMBER_FORMAT_EXCEPTION_DESCRIPTION = "Ошибка в числовом поле";
    public static final String DATE_PARSE_EXCEPTION_DESCRIPTION = "Ошибка парсинга даты";
}
