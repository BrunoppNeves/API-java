package com.bruno.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        @JsonAlias("Title") String Title,
        @JsonAlias("totalSeasons") Integer TotalSeasons,
        @JsonAlias("imdbRating") String Rated) {
}
