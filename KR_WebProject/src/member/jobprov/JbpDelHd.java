package member.jobprov;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class JbpDelHd implements JobProvHandler {

	@Override
	@RequestMapping("/jbpDel")
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws JbpException {
		// TODO Auto-generated method stub
		return null;
	}

}
