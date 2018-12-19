package cn.learning;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @author liaorui
 */
public class CTime {
    private static ITime INSTANCE;

    static {
        INSTANCE = Native.load("ctime", ITime.class);
    }

    public interface ITime extends Library {
        String get_time();
    }

    public String getTime() {
        return INSTANCE.get_time();
    }

    public static void main(String[] args) {
        CTime time = new CTime();
        System.out.println(time.getTime());
    }
}
