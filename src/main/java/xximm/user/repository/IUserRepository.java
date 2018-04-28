package xximm.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xximm.user.pojo.bean.User;

/**
 * 用户仓库
 *
 * @author 崔旭
 * @date 2018-04-28 15:47
 **/
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}
