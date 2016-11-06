package taeller.core

/**
 * Created by dak on 02-11-2016.
 */
class Event extends AbstractEvent {

    String browserType
    String browserVersion
    String device
    String OSType
    String OSVersion
    String browserSprog
    String formURL
    String refererURL
    String status
    boolean noScript
    boolean https
    String sagsNummer

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Event event = (Event) o

        return browserType == event.browserType &&
                browserVersion == event.browserVersion &&
                device == event.device &&
                OSType == event.OSType &&
                OSVersion == event.OSVersion &&
                browserSprog == event.browserSprog &&
                formURL == event.formURL &&
                refererURL == event.refererURL &&
                status == event.status &&
                noScript == event.noScript &&
                https == event.https
    }

    int hashCode() {
        return Objects.hash(browserType, browserVersion, device, OSType, OSVersion, browserSprog, formURL, refererURL, status, noScript, https)
    }
}