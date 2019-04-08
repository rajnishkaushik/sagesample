package org.kaushik.sage.sagesample.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


@Component(
	    immediate = true,
	    service = Servlet.class,
	    property = {
	        "sling.servlet.extensions=json",
	        "sling.servlet.paths=/bin/machinestatus",
	        "sling.servlet.methods=get"
	    },
	    configurationPid = "org.kaushik.sage.sagesample.core.servlets.MachineServlet"
	)
	
@Designate(ocd=MachineServlet.Configuration.class)

public class MachineServlet extends SlingSafeMethodsServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(final SlingHttpServletRequest req, final SlingHttpServletResponse resp) throws ServletException, IOException {

        final JsonObject  json;
        final JsonArray machineArray;
        
        JsonObject machine;
        
        resp.setContentType("application/json");
        
        json = new JsonObject();
        machineArray = new JsonArray();
        
        machine = new JsonObject();
        machine.addProperty("machine", "Machine 1");
        machine.addProperty("efficiency", 26);
        machineArray.add(machine);
        
        machine = new JsonObject();
        machine.addProperty("machine", "Machine 2");
        machine.addProperty("efficiency", 56);
        machineArray.add(machine);
        
        machine = new JsonObject();
        machine.addProperty("machine", "Machine 3");
        machine.addProperty("efficiency", 79);
        machineArray.add(machine);
        
        json.add("factory", machineArray);
        
        resp.getWriter().write(json.toString());
    }
    
    @Activate
    @Modified
    protected void Activate(Configuration config) {
        config.enabled();
    }
    
    @ObjectClassDefinition(name = "Machine Servlet - OSGi")
    public @interface Configuration {
        @AttributeDefinition(
            name = "Enable",
            description = "Enable description"
        )
        boolean enabled() default false;
    }
}
