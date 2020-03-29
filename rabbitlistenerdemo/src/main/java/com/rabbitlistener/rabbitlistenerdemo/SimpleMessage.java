package com.rabbitlistener.rabbitlistenerdemo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@Builder
@ToString
public class SimpleMessage implements Serializable {

    private String name;
    private String description;

}
