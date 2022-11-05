package com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Services;

import com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Domain.TrackInformation;

import java.util.List;

public interface TrackService {
    TrackInformation saveTrack(TrackInformation trackInformation);
    List<TrackInformation>getAllTrack();
    TrackInformation updateTrack(TrackInformation trackInformation, int trackId);
    boolean deleteTrackByTrackId(int trackId);
    List<TrackInformation>getTrackByTrackId(int trackId);
}
