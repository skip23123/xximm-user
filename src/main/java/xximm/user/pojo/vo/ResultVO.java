package xximm.user.pojo.vo;

import lombok.Data;

/**
 * 通过返回结果视图
 *
 * @author 崔旭
 * @date 2018-04-28 16:39
 **/
@Data
public class ResultVO {

    private String msg;

    private Object data;

    private Integer code;
}
