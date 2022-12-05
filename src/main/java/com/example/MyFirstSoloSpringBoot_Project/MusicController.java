package com.example.MyFirstSoloSpringBoot_Project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicController {

    private MusicService musicService;

    public MusicController(MusicService musicService){
        this.musicService = musicService;
    }

    @GetMapping("/")
    public List<Music> getMusic(){return musicService.getMusic();}

    @PostMapping("/")
    public void addMusic(@RequestBody MusicRequest musicRequest){
        musicService.addMusic(musicRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteMusicById (@PathVariable(value = "rank") Integer rank){
        musicService.deleteById(rank);
    }

    @PutMapping("/")
    public void updateMusic(@RequestBody Music music){
        musicService.updateMusic(music);
    }





}
