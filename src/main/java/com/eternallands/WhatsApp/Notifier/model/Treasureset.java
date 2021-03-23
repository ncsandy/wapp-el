package com.eternallands.WhatsApp.Notifier.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idmodmessages",
        "modmessages",
        "Time",
        "gametime"
})
public class Treasureset {

    @JsonProperty("idmodmessages")
    private String idmodmessages;
    @JsonProperty("modmessages")
    private String modmessages;
    @JsonProperty("Time")
    private String time;
    @JsonProperty("gametime")
    private String gametime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idmodmessages")
    public String getIdmodmessages() {
        return idmodmessages;
    }

    @JsonProperty("idmodmessages")
    public void setIdmodmessages(String idmodmessages) {
        this.idmodmessages = idmodmessages;
    }

    @JsonProperty("modmessages")
    public String getModmessages() {
        return modmessages;
    }

    @JsonProperty("modmessages")
    public void setModmessages(String modmessages) {
        this.modmessages = modmessages;
    }

    @JsonProperty("Time")
    public String getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("gametime")
    public String getGametime() {
        return gametime;
    }

    @JsonProperty("gametime")
    public void setGametime(String gametime) {
        this.gametime = gametime;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}