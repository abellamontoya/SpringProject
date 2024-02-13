package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    private Long page;
    private String next;
    private Long entries;
    private List<Result> results;

    public Root(Long page, String next, Long entries, List<Result> results) {
        this.page = page;
        this.next = next;
        this.entries = entries;
        this.results = results;
    }

    public Long getPage() {
        return this.page;
    }

    public String getNext() {
        return this.next;
    }

    public Long getEntries() {
        return this.entries;
    }

    public List<Result> getResults() {
        return this.results;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setEntries(Long entries) {
        this.entries = entries;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}

class Result {
    @JsonProperty("_id")
    private String id;
    @JsonProperty("id")
    private String id2;
    private PrimaryImage primaryImage;
    private TitleType titleType;
    private TitleText titleText;
    private OriginalTitleText originalTitleText;
    private ReleaseYear releaseYear;
    private ReleaseDate releaseDate;

    public Result(String id, String id2, PrimaryImage primaryImage, TitleType titleType, TitleText titleText, OriginalTitleText originalTitleText, ReleaseYear releaseYear, ReleaseDate releaseDate) {
        this.id = id;
        this.id2 = id2;
        this.primaryImage = primaryImage;
        this.titleType = titleType;
        this.titleText = titleText;
        this.originalTitleText = originalTitleText;
        this.releaseYear = releaseYear;
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return this.id;
    }

    public String getId2() {
        return this.id2;
    }

    public PrimaryImage getPrimaryImage() {
        return this.primaryImage;
    }

    public TitleType getTitleType() {
        return this.titleType;
    }

    public TitleText getTitleText() {
        return this.titleText;
    }

    public OriginalTitleText getOriginalTitleText() {
        return this.originalTitleText;
    }

    public ReleaseYear getReleaseYear() {
        return this.releaseYear;
    }

    public ReleaseDate getReleaseDate() {
        return this.releaseDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public void setPrimaryImage(PrimaryImage primaryImage) {
        this.primaryImage = primaryImage;
    }

    public void setTitleType(TitleType titleType) {
        this.titleType = titleType;
    }

    public void setTitleText(TitleText titleText) {
        this.titleText = titleText;
    }

    public void setOriginalTitleText(OriginalTitleText originalTitleText) {
        this.originalTitleText = originalTitleText;
    }

    public void setReleaseYear(ReleaseYear releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setReleaseDate(ReleaseDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}

class PrimaryImage {
    private String id;
    private Long width;
    private Long height;
    private String url;
    private Caption caption;
    @JsonProperty("__typename")
    private String typename;

    public PrimaryImage(String id, Long width, Long height, String url, Caption caption, String typename) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.url = url;
        this.caption = caption;
        this.typename = typename;
    }

    public String getId() {
        return this.id;
    }

    public Long getWidth() {
        return this.width;
    }

    public Long getHeight() {
        return this.height;
    }

    public String getUrl() {
        return this.url;
    }

    public Caption getCaption() {
        return this.caption;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}

 class Caption {
    private String plainText;
    @JsonProperty("__typename")
    private String typename;

    public Caption(String plainText, String typename) {
        this.plainText = plainText;
        this.typename = typename;
    }

    public String getPlainText() {
        return this.plainText;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}

 class TitleType {
    private String text;
    private String id;
    private Boolean isSeries;
    private Boolean isEpisode;
    @JsonProperty("__typename")
    private String typename;

    public TitleType(String text, String id, Boolean isSeries, Boolean isEpisode, String typename) {
        this.text = text;
        this.id = id;
        this.isSeries = isSeries;
        this.isEpisode = isEpisode;
        this.typename = typename;
    }

    public String getText() {
        return this.text;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsSeries() {
        return this.isSeries;
    }

    public Boolean getIsEpisode() {
        return this.isEpisode;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIsSeries(Boolean isSeries) {
        this.isSeries = isSeries;
    }

    public void setIsEpisode(Boolean isEpisode) {
        this.isEpisode = isEpisode;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}

 class TitleText {
    private String text;
    @JsonProperty("__typename")
    private String typename;

    public TitleText(String text, String typename) {
        this.text = text;
        this.typename = typename;
    }

    public String getText() {
        return this.text;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}

 class OriginalTitleText {
    private String text;
    @JsonProperty("__typename")
    private String typename;

    public OriginalTitleText(String text, String typename) {
        this.text = text;
        this.typename = typename;
    }

    public String getText() {
        return this.text;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}

 class ReleaseYear {
    private Long year;
    private Integer endYear;
    @JsonProperty("__typename")
    private String typename;

    public ReleaseYear(Long year, Integer endYear, String typename) {
        this.year = year;
        this.endYear = endYear;
        this.typename = typename;
    }

    public Long getYear() {
        return this.year;
    }

    public Integer getEndYear() {
        return this.endYear;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}

 class ReleaseDate {
    private Integer day;
    private Long month;
    private Long year;
    @JsonProperty("__typename")
    private String typename;

    public ReleaseDate(Integer day, Long month, Long year, String typename) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.typename = typename;
    }

    public Integer getDay() {
        return this.day;
    }

    public Long getMonth() {
        return this.month;
    }

    public Long getYear() {
        return this.year;
    }

    public String getTypename() {
        return this.typename;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setMonth(Long month) {
        this.month = month;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}


