package com.mitch.java_web_final_project.repository;

import com.mitch.java_web_final_project.repository.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository  extends JpaRepository<Song, Integer> {
    List<Song> findByGenre(Integer genre);

}