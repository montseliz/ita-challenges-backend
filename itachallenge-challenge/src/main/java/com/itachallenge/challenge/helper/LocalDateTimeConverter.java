package com.itachallenge.challenge.helper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeConverter {

    public String getFormattedCreationDateTime(LocalDateTime creationDateDocument) {
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(creationDateDocument, zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        return zonedDateTime.format(formatter);
    }

    public LocalDateTime getFormattedStringToCreationDate(String date) {
        return LocalDateTime.parse(date);
    }


    //TODO - externalizar a application.yml
    /*final String FORMAT = "yyyy-MM-dd'T'HH:mm:ssXXX";
    final String ZONE = "Europe/Paris";
    //
    final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(FORMAT);

    public String getFormattedCreationDateTime(LocalDateTime creationDateDocument) {
        return ZonedDateTime.of(creationDateDocument, ZoneId.of(ZONE)).format(FORMATTER);
    }

    public LocalDateTime getFormattedStringToCreationDate(String date) {
        return LocalDateTime.parse(date);
    }*/
}
