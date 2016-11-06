package taeller.core.helpers

import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import taeller.core.AbstractEvent
import taeller.core.Action
import taeller.core.Event
import taeller.core.EventType

/**
 * Created by cju on 21-10-2016.
 */
class JsonHelper {

    public static AbstractEvent parseJson(String json, EventType type)
    {
        if(type == EventType.EVENT){
            return parseGenericObjectFromJson(json, Event.class)
        }
        else if (type == EventType.ACTION){
            return parseGenericObjectFromJson(json, Action.class)
        }
    }

    public static def konverterTilJSON(def eventToPersist) {
        ObjectMapper mapper = new ObjectMapper()
        return mapper.writeValueAsString(eventToPersist)
    }

    private static <T> T parseGenericObjectFromJson(String json, Class<T> genericType){
        ObjectMapper objectMapper= new ObjectMapper();
        JavaType type = objectMapper.getTypeFactory().constructType(genericType)
        def obj = (T) objectMapper.readValue(json, type)
        return obj
    }
}



