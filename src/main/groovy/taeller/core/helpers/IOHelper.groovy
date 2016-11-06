package taeller.core.helpers

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Created by cju on 18-10-2016.
 */
public class IOHelper {

    static String readFile(String path)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded);
    }

    static String createFolder (){
        def path = KonfigurationHelper.hentKonfiguration(KonfigurationHelper.EVENT_FOLDER)

        Files.createDirectories(Paths.get(path))

        return path
    }
}
