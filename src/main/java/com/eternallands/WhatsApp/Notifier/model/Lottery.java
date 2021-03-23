package com.eternallands.WhatsApp.Notifier.model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idlottery",
        "lotterydate",
        "winner",
        "amount"
})

@ToString
public class Lottery {

    @JsonProperty("idlottery")
    private String idlottery;
    @JsonProperty("lotterydate")
    private String lotterydate;
    @JsonProperty("winner")
    private String winner;
    @JsonProperty("amount")
    private String amount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("idlottery")
    public String getIdlottery() {
        return idlottery;
    }

    @JsonProperty("idlottery")
    public void setIdlottery(String idlottery) {
        this.idlottery = idlottery;
    }

    @JsonProperty("lotterydate")
    public String getLotterydate() {
        return lotterydate;
    }

    @JsonProperty("lotterydate")
    public void setLotterydate(String lotterydate) {
        this.lotterydate = lotterydate;
    }

    @JsonProperty("winner")
    public String getWinner() {
        return winner;
    }

    @JsonProperty("winner")
    public void setWinner(String winner) {
        this.winner = winner;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
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