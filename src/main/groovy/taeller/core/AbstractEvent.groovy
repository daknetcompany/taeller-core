package taeller.core

/**
 * Created by dak on 02-11-2016.
 */
abstract class AbstractEvent {

    String diaId
    String sessionId
    String scriptVersion
    String clientTimeStamp
    String eventId
    String serverTimeStamp
    String kladdeReference
    String indberetningsForloebsId
    EventType eventType
    String cvrIndberet
    String cvr
    String PID
    String RID
    String virkStartForloebsId
}
