package com.chess.common;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Location {
    /**
     * ряд вертикальный
     */
    private final File file;
    /**
     * ряд горизонтальный
     */
    private final Integer rank;
}

