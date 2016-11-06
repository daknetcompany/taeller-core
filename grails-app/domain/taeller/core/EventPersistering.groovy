package taeller.core

class EventPersistering implements Serializable {

    EventType eventType
    String eventId
    String diaId
    String sessionId
    boolean behandlet
    String oprettet

    String jsonData

    static mapping = {
        jsonData type: "text"
    }

    static constraints = {
    }
}
