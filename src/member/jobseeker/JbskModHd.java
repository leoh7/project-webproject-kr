package member.jobseeker;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class JbskModHd implements JobSeekerHandler {

	@Override
	@RequestMapping("/jbskMod")
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws JobSeekerException {
		// TODO : 구인자 수정 핸들러
		return new ModelAndView("/Jbp/jbpMod");
	}

}
