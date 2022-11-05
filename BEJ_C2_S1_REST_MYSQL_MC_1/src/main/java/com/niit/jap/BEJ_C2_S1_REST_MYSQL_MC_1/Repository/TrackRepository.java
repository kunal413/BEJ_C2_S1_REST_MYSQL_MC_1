package com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Repository;

import com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Domain.TrackInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<TrackInformation,Integer> {
    List<TrackInformation>findByTrackId(int trackId);

}
