package move;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ToCalHd implements MoveHandler {

	@Override
	@RequestMapping("/tocal")
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws MoveException {
		return new ModelAndView("schedule/calander");
	}

}