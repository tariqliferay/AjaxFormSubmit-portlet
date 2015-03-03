/**
 * 
 */
package tariqliferay.blogspot.com;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.ConfigurationAction;

/**
 * @author tariq
 *
 */
public class SandboxPortletConfig implements ConfigurationAction{

	@Override
	public void processAction(PortletConfig arg0, ActionRequest arg1,
			ActionResponse arg2) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String render(PortletConfig arg0, RenderRequest arg1,
			RenderResponse arg2) throws Exception {
		// TODO Auto-generated method stub
		return "/html/sandboxPortlet/config.jsp";
	}

}
