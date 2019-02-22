package io.openliberty.guides.hazelcast;

@SuppressWarnings("unused")
public class CommandResponse {

    private final String value;
    private final String podName;

    public CommandResponse(String value,String podName) {
        this.value  = value;
        this.podName = podName;
    }

    public String getValue() {
        return value;
    }
    public String getPodName() {
        return podName;
    }


}
