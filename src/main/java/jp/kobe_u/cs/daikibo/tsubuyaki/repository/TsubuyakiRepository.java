package jp.kobe_u.cs.daikibo.tsubuyaki.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import jp.kobe_u.cs.daikibo.tsubuyaki.entity.Tsubuyaki;

public interface TsubuyakiRepository extends CrudRepository<Tsubuyaki, Long> {
    List<Tsubuyaki> findByCommentLike(String key);
}
