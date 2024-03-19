package io.cloudtype.springrabbit.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MessageDto {

    @JsonProperty
    String sender;

    @JsonProperty
    String receiver;

    @JsonProperty
    String message;

}


