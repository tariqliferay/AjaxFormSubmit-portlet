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
		System.out.println(content);
		
	}

}
