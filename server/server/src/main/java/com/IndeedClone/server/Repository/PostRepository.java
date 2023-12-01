package com.IndeedClone.server.Repository;

import com.IndeedClone.server.Model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Posts,Integer> {

}
