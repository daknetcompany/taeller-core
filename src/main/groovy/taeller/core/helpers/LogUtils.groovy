package taeller.core.helpers

import org.slf4j.LoggerFactory

/**
 * Created by cju on 19-10-2016.
 */
class LogUtils {
    public static void WriteError(String message, Exception e){
        LoggerFactory.getLogger("error").error(
                "[Custom error message]: " + message
                    +"[Exception message]: "
                    + e.message + " [Exception stackTrace]: " + e.stackTrace
        );
        ConsoleLog(message + "Exception: "+ e.toString())
    }
    public static void WriteError(String message){
        LoggerFactory.getLogger("error").error(
                "[Custom error message]: "+ message
        );
        ConsoleLog(message)
    }

    public static void WriteInfo(String message){
        LoggerFactory.getLogger("info").info(message)
        ConsoleLog(message)
    }

    public static void WriteWarning(String message){
        LoggerFactory.getLogger("info").warn(message)
        ConsoleLog(message)
    }

    public static void ConsoleLog(String message){
        if(KonfigurationHelper.hentKonfiguration(KonfigurationHelper.CONFIG_MILJOE)=="LOCAL")
        {
            println(message)
        }
    }
}
