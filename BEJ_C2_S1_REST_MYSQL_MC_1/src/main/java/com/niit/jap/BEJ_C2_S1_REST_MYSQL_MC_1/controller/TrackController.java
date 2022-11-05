package com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.controller;

import com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Domain.TrackInformation;
import com.niit.jap.BEJ_C2_S1_REST_MYSQL_MC_1.Services.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trackDetails/app/")
public class TrackController {
    private  final TrackService trackService;
@Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
    @PostMapping("/track")
    public ResponseEntity<?>insertTrack(@RequestBody TrackInformation trackInformation){
    return new ResponseEntity<>(trackService.saveTrack(trackInformation), HttpStatus.CREATED);
    }
    @GetMapping("/tracks")
    public ResponseEntity<?>getTrackDetails(){
    return new ResponseEntity<>(trackService.getAllTrack(),HttpStatus.FOUND);
    }
    @DeleteMapping("/track/{trackId}")
    public ResponseEntity<?>deleteTrack(@PathVariable int trackId){
    return new ResponseEntity<>(trackService.deleteTrackByTrackId(trackId),HttpStatus.OK);
    }
    @GetMapping("/track/{trackId}")
    public ResponseEntity<?>fetchByTrackId(@PathVariable int trackId){
    return new ResponseEntity<>(trackService.getTrackByTrackId(trackId),HttpStatus.FOUND);

    }
    @PutMapping("/track/{trackId}")
    public ResponseEntity<?>updateTrack(@RequestBody TrackInformation trackInformation,@PathVariable int trackId){
    return new ResponseEntity<>(trackService.updateTrack(trackInformation,trackId),HttpStatus.OK);
    }
}
