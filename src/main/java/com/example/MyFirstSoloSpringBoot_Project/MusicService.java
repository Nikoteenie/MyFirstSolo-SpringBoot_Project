package com.example.MyFirstSoloSpringBoot_Project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    private MusicRepository musicRepository;

    public MusicService(MusicRepository musicRepository){
        this.musicRepository = musicRepository;
    }

    public List<Music> getMusic() {
        return musicRepository.findAll();
    }



    public void addMusic(MusicRequest musicRequest){
        Music musicToAdd = new Music();
         musicToAdd.setArtist(musicRequest.artist());
         musicToAdd.setFavAlbum(musicRequest.favAlbum());
         musicToAdd.setNumAlbums(musicRequest.numAlbums());
         musicToAdd.setGenre(musicRequest.genre());
         musicRepository.save(musicToAdd);
    }


    public void deleteById(Integer rank) {
        musicRepository.deleteById(rank);
    }

    public void updateMusic(Music music) {
        if (musicRepository.existsById(music.getRank())) {
            musicRepository.save(music);
        }
    }
}
