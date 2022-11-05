package com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrackInformation {
    @Id
    private int trackId;
    private String trackName;
    private String trackComment;
    private int trackRating;
    private String trackArtist;

    public TrackInformation(int trackId, String trackName, String trackComment, int trackRating, String trackArtist) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.trackComment = trackComment;
        this.trackRating = trackRating;
        this.trackArtist = trackArtist;
    }

    public TrackInformation() {
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComment() {
        return trackComment;
    }

    public void setTrackComment(String trackComment) {
        this.trackComment = trackComment;
    }

    public int getTrackRating() {
        return trackRating;
    }

    public void setTrackRating(int trackRating) {
        this.trackRating = trackRating;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    @Override
    public String toString() {
        return "TrackInformation{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackComment='" + trackComment + '\'' +
                ", trackRating=" + trackRating +
                ", trackArtist='" + trackArtist + '\'' +
                '}';
    }
}
