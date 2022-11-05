package com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Services;

import com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Domain.TrackInformation;
import com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService{
   private final TrackRepository trackRepository;
@Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public TrackInformation saveTrack(TrackInformation trackInformation) {
        return trackRepository.save(trackInformation);
    }

    @Override
    public List<TrackInformation> getAllTrack() {
        return trackRepository.findAll();
    }

    @Override
    public TrackInformation updateTrack(TrackInformation trackInformation, int trackId) {
        Optional<TrackInformation>optionalTrackInformation =trackRepository.findById(trackId);
        if (optionalTrackInformation.isEmpty()){
            return null;
        }
        TrackInformation existInput = optionalTrackInformation.get();
        if (trackInformation.getTrackId()!=0){
            existInput.setTrackId(trackInformation.getTrackId());
        }
        return trackRepository.save(existInput);
    }

    @Override
    public boolean deleteTrackByTrackId(int trackId) {
    trackRepository.deleteById(trackId);
        return true;
    }

    @Override
    public List<TrackInformation> getTrackByTrackId(int trackId) {
        return trackRepository.findByTrackId(trackId);
    }
}
