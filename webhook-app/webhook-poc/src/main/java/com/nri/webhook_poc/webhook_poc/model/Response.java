package com.nri.webhook_poc.webhook_poc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Response implements Serializable {

    @JsonProperty("countryId")
    private Long countryId;

    @JsonProperty("code2")
    private String code2;

    @JsonProperty("code")
    private String code;


}
