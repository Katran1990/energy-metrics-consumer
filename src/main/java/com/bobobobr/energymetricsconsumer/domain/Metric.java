package com.bobobobr.energymetricsconsumer.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@Document("metrics")
public class Metric {

    @Id
    private String id;
    @Field("voltage")
    private int voltage;
    @Field("date_time")
    private LocalDateTime dateTime;
    @Field("address")
    private String address;

}
