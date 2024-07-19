package com.rkaaya.jsbs.contract.first.domain.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
@JsonDeserialize(builder = Quest.QuestBuilder.class)
@Setter
public class Quest {

    @NonNull Long id;
    @NonNull String name;
    String description;

    @JsonPOJOBuilder(withPrefix = "")
    public static final class QuestBuilder {

    }
}
