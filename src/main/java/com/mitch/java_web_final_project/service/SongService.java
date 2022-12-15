package com.mitch.java_web_final_project.service;

import com.mitch.java_web_final_project.repository.SongRepository;
import com.mitch.java_web_final_project.repository.entity.Song;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {
    private static SongRepository songRepository;
    public SongService (SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public void delete(Integer id) {
        songRepository.deleteById(id);
    }

    public List<Song> all() {
        return songRepository.findAll();}

    public void add(Song song) {
        songRepository.save(song);
    }

    public static Song save(Song song)
    {
        return songRepository.save(song);
    }

    public static Optional<Song> findById(Integer id){
        return songRepository.findById(id);
    }

    public List<Song> findSongsByGenre(Integer genre) {
        // call the findByGenre method and return the result
        return songRepository.findByGenre(genre);
    }
}