package com.eternallands.WhatsApp.Notifier.model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idinvance",
        "level",
        "invancedate",
        "gamedate"
})

@ToString
public class Invance {

    @JsonProperty("idinvance")
    private String idinvance;
    @JsonProperty("level")
    private String level;
    @JsonProperty("invancedate")
    private String invancedate;
    @JsonProperty("gamedate")
    private String gamedate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idinvance")
    public String getIdinvance() {
        return idinvance;
    }

    @JsonProperty("idinvance")
    public void setIdinvance(String idinvance) {
        this.idinvance = idinvance;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("invancedate")
    public String getInvancedate() {
        return invancedate;
    }

    @JsonProperty("invancedate")
    public void setInvancedate(String invancedate) {
        this.invancedate = invancedate;
    }

    @JsonProperty("gamedate")
    public String getGamedate() {
        return gamedate;
    }

    @JsonProperty("gamedate")
    public void setGamedate(String gamedate) {
        this.gamedate = gamedate;
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