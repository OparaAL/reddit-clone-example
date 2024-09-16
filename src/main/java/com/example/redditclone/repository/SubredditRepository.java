package com.example.redditclone.repository;

import com.example.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findById(Long id);
    Optional<Subreddit> findByName(String subredditName);
}
