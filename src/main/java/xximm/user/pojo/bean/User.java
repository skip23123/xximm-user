package xximm.user.pojo.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户bean
 *
 * @author 崔旭
 * @date 2018-04-28 15:50
 **/
@Data
@Entity
public class User {

    @Id
    private Integer id;

    private String phone;

    private String openId;

    private String password;

    private String userName;

    private String loginName;
}
