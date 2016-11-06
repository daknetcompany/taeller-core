package taeller.core.helpers

import grails.util.Holders

/**
 * Created by cju on 17-10-2016.
 */
class KonfigurationHelper {

    public static hentKonfiguration(String noegle) {
        def konfig = Holders.flatConfig.get(noegle)
        if(konfig == null) {
            throw new KonfigurationIkkeFundetException("Den angive nøgle (${noegle}) blev ikke fundet i konfiguration!")
        }
        return konfig?.toString()
    }

    /**
    * Exception der smides, hvis konfigurationen ikke blev fundet.
    */
    static class KonfigurationIkkeFundetException extends RuntimeException {
        KonfigurationIkkeFundetException(String s) {
            super(s)
        }
    }

    public static final String EVENT_FOLDER = "taeller.eventfolder"
    public static final String PERSISTED_DIA_IDS_PATH = "taeller.persistedDiaIdsPath"
    public static final String EVENT_THREADPOOL_SIZE = "taeller.eventThreadPoolSize"
    public static final String CONFIG_MILJOE = "taeller.environment"
    public static final String SCRIPT_MAPPE = "taeller.scriptMappe"
    public static final String LATEST_SCRIPT_VERSION ="taeller.latestVersion"
    public static final String ELASTIC_HOST = "taeller.loader.elasticHost"
    public static final String ELASTIC_USER = "taeller.loader.elasticUser"
    public static final String ELASTIC_PASSWORD = "taeller.loader.elasticPassword"
}
