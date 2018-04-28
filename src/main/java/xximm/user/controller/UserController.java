package xximm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xximm.user.pojo.bean.User;
import xximm.user.pojo.dto.UserDTO;
import xximm.user.pojo.vo.ResultVO;
import xximm.user.repository.IUserRepository;

/**
 * 用户controller
 *
 * @author 崔旭
 * @date 2018-04-28 16:00
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/getById")
    public UserDTO getById(@RequestParam Integer id) {
//        User user = userRepository.getOne(id);
//        ResultVO resultVO = new ResultVO();
//        resultVO.setMsg("");
//        resultVO.setCode(200);
//        resultVO.setData(user);
//        return resultVO;

        UserDTO userDTO = new UserDTO();
        userDTO.setId(1);
        userDTO.setName("cx");
        return userDTO;
    }
}
