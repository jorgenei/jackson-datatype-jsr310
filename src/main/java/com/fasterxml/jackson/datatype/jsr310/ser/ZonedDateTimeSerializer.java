package com.fasterxml.jackson.datatype.jsr310.ser;

import java.time.ZonedDateTime;

public class ZonedDateTimeSerializer extends InstantSerializerBase<ZonedDateTime>
{
    private static final long serialVersionUID = 1L;

    public static final ZonedDateTimeSerializer INSTANCE = new ZonedDateTimeSerializer();

    protected ZonedDateTimeSerializer() {
        super(ZonedDateTime.class, dt -> dt.toInstant().toEpochMilli(),
                ZonedDateTime::toEpochSecond, ZonedDateTime::getNano);
    }
}
