package move;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class RegisterHd implements MoveHandler{
	@Override
	@RequestMapping("/register")
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws MoveException {
		
		
		
		// TODO : 회원가입 구인자/구직자 선택 핸들러
		return new ModelAndView("/Jbp/jbpReg");
	}
}
