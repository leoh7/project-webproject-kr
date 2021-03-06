package iptcareer;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class IptCrrWrtHd implements InputCareerHandler {
	@Resource
	private IptCrrDBBean iptDao;
	
	@Override
	@RequestMapping("/iptCrrWrt")
	public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws IptCrrException {
		// TODO : 입력경력사항 writer
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		IptCrrDataBean iptCrrDto = new IptCrrDataBean();
		String jbskId = (String) request.getSession().getAttribute("memid");
		
		if(request.getParameter("iptId") == null || request.getParameter("iptId").equals("")){
			iptCrrDto.setIptId(0);
		} else {
			iptCrrDto.setIptId(Integer.parseInt(request.getParameter("iptId")));
		}
		iptCrrDto.setIptCompany(request.getParameter("iptCompany"));
		iptCrrDto.setIptWh(request.getParameter("iptWh"));
		
		String pattern = "MM/dd/yyyy";
		String startStr = request.getParameter("iptStart");
		String endStr = request.getParameter("iptEnd");
		SimpleDateFormat startSdf = new SimpleDateFormat(pattern);
		SimpleDateFormat endSdf = new SimpleDateFormat(pattern);
		
		Date startParse;
		Date endParse;
		try {
			startParse = startSdf.parse(startStr);
			endParse = endSdf.parse(endStr);
			Timestamp startDate = new Timestamp(startParse.getTime());
			Timestamp endDate = new Timestamp(endParse.getTime());
			iptCrrDto.setIptStart(startDate);
			iptCrrDto.setIptEnd(endDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		iptCrrDto.setPosId(Integer.parseInt(request.getParameter("posId")));
		iptCrrDto.setJbskId(jbskId);
		iptCrrDto.setIptPeriod(Integer.parseInt(request.getParameter("iptPeriod")));
		
		int result = iptDao.iptWrt(iptCrrDto);
		request.setAttribute("result", result);
		request.setAttribute("iptCrrDto", iptCrrDto);
		
		
		return new ModelAndView("iptCrr/iptCrr");
	}

}
