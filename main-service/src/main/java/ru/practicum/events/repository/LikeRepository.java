package ru.practicum.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practicum.events.model.Like;
import ru.practicum.events.model.LikeId;

@Repository
public interface LikeRepository extends JpaRepository<Like, LikeId> {
}
