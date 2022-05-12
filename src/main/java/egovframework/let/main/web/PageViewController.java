package egovframework.let.main.web;


import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.EgovFileMngService;
import egovframework.com.cmm.service.EgovFileMngUtil;
import egovframework.let.cop.bbs.service.EgovBBSAttributeManageService;
import egovframework.let.cop.bbs.service.EgovBBSManageService;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmodules.validation.commons.DefaultBeanValidator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PageViewController {

    @Resource(name = "EgovBBSManageService")
    private EgovBBSManageService bbsMngService;

    @Resource(name = "EgovBBSAttributeManageService")
    private EgovBBSAttributeManageService bbsAttrbService;

    @Resource(name = "EgovFileMngService")
    private EgovFileMngService fileMngService;

    @Resource(name = "EgovFileMngUtil")
    private EgovFileMngUtil fileUtil;

    @Resource(name = "propertiesService")
    protected EgovPropertyService propertyService;

    @Resource(name="egovMessageSource")
    EgovMessageSource egovMessageSource;

    @Autowired
    private DefaultBeanValidator beanValidator;

    @RequestMapping("/cop/bbs/smartFactory.do")
    public String getSmartFactory(HttpServletRequest request) throws Exception
    {
        return "/main/SmartFactory";
    }

    @RequestMapping("/cop/bbs/government.do")
    public String getGovernment(HttpServletRequest request) throws Exception
    {
        return "/main/GovernmentBiz";
    }


    @RequestMapping("/cop/bbs/mes.do")
    public String getMES(HttpServletRequest request) throws Exception
    {
        return "/main/MES";
    }

    @RequestMapping("/cop/bbs/smartFarm.do")
    public String getSmartFarm(HttpServletRequest request) throws Exception
    {
        return "/main/SmartFarm";
    }

    @RequestMapping("/cop/bbs/googleMaps.do")
    public String getMap(HttpServletRequest request) throws Exception
    {
        return "/main/Map";
    }

    @RequestMapping("/cop/bbs/organization.do")
    public String getOrganization(HttpServletRequest request) throws Exception
    {
        return "/main/OrganizationChart";
    }

    @RequestMapping("/cop/bbs/system.do")
    public String getSystem(HttpServletRequest request) throws Exception
    {
        return "/main/SystemGovBiz";
    }

    @RequestMapping("/cop/bbs/introduce.do")
    public String getIntroduce(HttpServletRequest request) throws Exception
    {
        return "/main/Introduce";
    }


}
