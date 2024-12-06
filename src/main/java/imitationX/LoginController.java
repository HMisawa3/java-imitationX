package imitationX;
//プロジェクトを作成するときに「com.example.demo」がデフォルトで入るけど、
//そのまま作ると、「com.example.demo」の下にコントローラー（サーブレット）
//を配置させられる。

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/Login")
    public String login(){
    	
        return "login";
    }
}
