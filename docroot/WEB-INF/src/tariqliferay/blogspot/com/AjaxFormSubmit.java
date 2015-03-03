/**
 * 
 */
package tariqliferay.blogspot.com;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * @author tariqliferay.blogspot.com
 *
 */
public class AjaxFormSubmit extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		// TODO Auto-generated method stub
		String cmd = ParamUtil.getString(resourceRequest, Constants.CMD);

	   	  if (cmd.equals("addStatusEntry")) {
	   		 String content = ParamUtil.getString(resourceRequest, "content");
	   		 String test = ParamUtil.getString(resourceRequest, "test");
	   		System.out.println(content+test);
		  }
	}
	
	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.render(request, response);
	}
	
	@ProcessAction(name="addStatusEntry")
	public void addStatusEntry(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		String content = ParamUtil.getString(actionRequest, "content");
		String test = ParamUtil.getString(actionRequest, "test");
	   	System.out.println(content+test);
		
		
	}

}
