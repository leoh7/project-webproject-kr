package resume;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ResumeWrtHd implements ResumeHandler {

	@Override
	@RequestMapping("/resumeWrt")
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws ResumeException {
		// TODO Auto-generated method stub
		return null;
	}

}