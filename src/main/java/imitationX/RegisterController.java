package imitationX;
//プロジェクトを作成するときに「com.example.demo」がデフォルトで入るけど、
//そのまま作ると、「com.example.demo」の下にコントローラー（サーブレット）
//を配置させられる。

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    @GetMapping("/Register")
    public String Register(){
        return "register";
    }
    
    @RequestMapping(value="/newRegister")
    public ModelAndView respons(@RequestParam("firstName") String first,
        @RequestParam("lastName") String last) { 
    	ModelAndView mod = new ModelAndView();
	    mod.setViewName("register");
	    mod.addObject("urName", "フルネーム" + first + "　" + last + "さん");
	   
	    return mod;
   }
}
