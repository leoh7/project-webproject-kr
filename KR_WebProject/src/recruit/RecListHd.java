package recruit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RecListHd implements RecruitHandler {

	@Override
	@RequestMapping("/recList")
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws RecruitException {
		// TODO Auto-generated method stub
		return null;
	}

}
