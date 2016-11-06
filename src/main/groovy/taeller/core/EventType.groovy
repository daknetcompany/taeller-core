package taeller.core

import com.fasterxml.jackson.annotation.JsonCreator

/**
 * Created by dak on 02-11-2016.
 */
enum EventType {

    ACTION('action'),
    EVENT('event')

    String navn

    EventType(String navn) {
        this.navn = navn
    }

    @JsonCreator
    public static EventType parseEventTypeFromMap(def eventTypeValues) {
        if(eventTypeValues != null && eventTypeValues instanceof Map) {
            return eventTypeValues.get("name") as EventType
        }
        return null;
    }
}
