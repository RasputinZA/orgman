package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
        //Capitals
        String cap = "";
        String x = className;
        int z = x.length();
        for(int y = 0; y < z; y++){
            if(Character.isUpperCase(x.charAt(y))){
                char c = x.charAt(y);
                cap += c + " ";
            }
        }
        return(cap);
        //Capitals
    }
}
