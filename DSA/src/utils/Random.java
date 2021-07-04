package utils;
public class Random {
    private final static int DEFAULT_INT_LIMIT = 100;
    private final static int DEFAULT_STRING_LIMIT = 10;
    private final static String ALL_CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static int ALL_CHARS_LENGTH = ALL_CHARS.length();
    public static int getIntValue(int from, int till){
        return (int) (Math.random() * (till - from)) +from; //cast is after calculation bcoz if before it will approx to 0
    }
    public static int getIntValue(int till){
        return (int)(Math.random() *till); //cast is after calculation bcoz if before it will approx to 0
//        return getIntValue(0,till);
    }
    public static int getIntValue(){
        return (int)(Math.random() *DEFAULT_INT_LIMIT); //cast is after calculation bcoz if before it will approx to 0
//        return getIntValue(DEFAULT_INT_LIMIT);
    }
    public static String getStringValue(int length){
        StringBuilder str = new StringBuilder();
        for(int i=0;i<length;i++){
            str.append(ALL_CHARS.charAt(getIntValue(ALL_CHARS_LENGTH)));
        }
        return str.toString();
    }
    public static String getStringValue(){
        return getStringValue(DEFAULT_STRING_LIMIT);
    }
}

//multiple function overloading
//11,20
//from=11
//till20
//10,20
//double: 0,1