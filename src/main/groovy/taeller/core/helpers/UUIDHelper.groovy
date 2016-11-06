package taeller.core.helpers

import com.eaio.uuid.UUID

/**
 * Created by dak on 02-11-2016.
 */
class UUIDHelper {

    /**
     * Generer UUID v1, der er baseret på timestamp og MAC adresse, hvilket skulle være optimalt for Elastic Search
     * @return
     */
    public static String generateId() {
        def uuid = new UUID()
        return uuid.toString()
    }
}
