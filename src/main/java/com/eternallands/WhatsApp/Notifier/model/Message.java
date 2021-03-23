package com.eternallands.WhatsApp.Notifier.model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "GameDay",
        "GameMonth",
        "GameYear",
        "GameHour",
        "GameMinute",
        "GameSecond",
        "GameDayName",
        "GameDayDescription",
        "Gametimestamp",
        "GameDayRolePlay",
        "GIWS_Monsters",
        "GIWS_Text",
        "GIWS_date_diff",
        "Timestamp",
        "lottery",
        "invance",
        "pear",
        "treasurefound",
        "treasureset"
})
@ToString
public class Message {

    @JsonProperty("GameDay")
    private String gameDay;
    @JsonProperty("GameMonth")
    private String gameMonth;
    @JsonProperty("GameYear")
    private String gameYear;
    @JsonProperty("GameHour")
    private String gameHour;
    @JsonProperty("GameMinute")
    private String gameMinute;
    @JsonProperty("GameSecond")
    private String gameSecond;
    @JsonProperty("GameDayName")
    private String gameDayName;
    @JsonProperty("GameDayDescription")
    private String gameDayDescription;
    @JsonProperty("Gametimestamp")
    private String gametimestamp;
    @JsonProperty("GameDayRolePlay")
    private String gameDayRolePlay;
    @JsonProperty("GIWS_Monsters")
    private String gIWSMonsters;
    @JsonProperty("GIWS_Text")
    private String gIWSText;
    @JsonProperty("GIWS_date_diff")
    private String gIWSDateDiff;
    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("lottery")
    private List<Lottery> lottery = null;
    @JsonProperty("invance")
    private List<Invance> invance = null;
    @JsonProperty("pear")
    private List<Pear> pear = null;
    @JsonProperty("treasurefound")
    private List<Treasurefound> treasurefound = null;
    @JsonProperty("treasureset")
    private List<Treasureset> treasureset = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GameDay")
    public String getGameDay() {
        return gameDay;
    }

    @JsonProperty("GameDay")
    public void setGameDay(String gameDay) {
        this.gameDay = gameDay;
    }

    @JsonProperty("GameMonth")
    public String getGameMonth() {
        return gameMonth;
    }

    @JsonProperty("GameMonth")
    public void setGameMonth(String gameMonth) {
        this.gameMonth = gameMonth;
    }

    @JsonProperty("GameYear")
    public String getGameYear() {
        return gameYear;
    }

    @JsonProperty("GameYear")
    public void setGameYear(String gameYear) {
        this.gameYear = gameYear;
    }

    @JsonProperty("GameHour")
    public String getGameHour() {
        return gameHour;
    }

    @JsonProperty("GameHour")
    public void setGameHour(String gameHour) {
        this.gameHour = gameHour;
    }

    @JsonProperty("GameMinute")
    public String getGameMinute() {
        return gameMinute;
    }

    @JsonProperty("GameMinute")
    public void setGameMinute(String gameMinute) {
        this.gameMinute = gameMinute;
    }

    @JsonProperty("GameSecond")
    public String getGameSecond() {
        return gameSecond;
    }

    @JsonProperty("GameSecond")
    public void setGameSecond(String gameSecond) {
        this.gameSecond = gameSecond;
    }

    @JsonProperty("GameDayName")
    public String getGameDayName() {
        return gameDayName;
    }

    @JsonProperty("GameDayName")
    public void setGameDayName(String gameDayName) {
        this.gameDayName = gameDayName;
    }

    @JsonProperty("GameDayDescription")
    public String getGameDayDescription() {
        return gameDayDescription;
    }

    @JsonProperty("GameDayDescription")
    public void setGameDayDescription(String gameDayDescription) {
        this.gameDayDescription = gameDayDescription;
    }

    @JsonProperty("Gametimestamp")
    public String getGametimestamp() {
        return gametimestamp;
    }

    @JsonProperty("Gametimestamp")
    public void setGametimestamp(String gametimestamp) {
        this.gametimestamp = gametimestamp;
    }

    @JsonProperty("GameDayRolePlay")
    public String getGameDayRolePlay() {
        return gameDayRolePlay;
    }

    @JsonProperty("GameDayRolePlay")
    public void setGameDayRolePlay(String gameDayRolePlay) {
        this.gameDayRolePlay = gameDayRolePlay;
    }

    @JsonProperty("GIWS_Monsters")
    public String getGIWSMonsters() {
        return gIWSMonsters;
    }

    @JsonProperty("GIWS_Monsters")
    public void setGIWSMonsters(String gIWSMonsters) {
        this.gIWSMonsters = gIWSMonsters;
    }

    @JsonProperty("GIWS_Text")
    public String getGIWSText() {
        return gIWSText;
    }

    @JsonProperty("GIWS_Text")
    public void setGIWSText(String gIWSText) {
        this.gIWSText = gIWSText;
    }

    @JsonProperty("GIWS_date_diff")
    public String getGIWSDateDiff() {
        return gIWSDateDiff;
    }

    @JsonProperty("GIWS_date_diff")
    public void setGIWSDateDiff(String gIWSDateDiff) {
        this.gIWSDateDiff = gIWSDateDiff;
    }

    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("Timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("lottery")
    public List<Lottery> getLottery() {
        return lottery;
    }

    @JsonProperty("lottery")
    public void setLottery(List<Lottery> lottery) {
        this.lottery = lottery;
    }

    @JsonProperty("invance")
    public List<Invance> getInvance() {
        return invance;
    }

    @JsonProperty("invance")
    public void setInvance(List<Invance> invance) {
        this.invance = invance;
    }

    @JsonProperty("pear")
    public List<Pear> getPear() {
        return pear;
    }

    @JsonProperty("pear")
    public void setPear(List<Pear> pear) {
        this.pear = pear;
    }

    @JsonProperty("treasurefound")
    public List<Treasurefound> getTreasurefound() {
        return treasurefound;
    }

    @JsonProperty("treasurefound")
    public void setTreasurefound(List<Treasurefound> treasurefound) {
        this.treasurefound = treasurefound;
    }

    @JsonProperty("treasureset")
    public List<Treasureset> getTreasureset() {
        return treasureset;
    }

    @JsonProperty("treasureset")
    public void setTreasureset(List<Treasureset> treasureset) {
        this.treasureset = treasureset;
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