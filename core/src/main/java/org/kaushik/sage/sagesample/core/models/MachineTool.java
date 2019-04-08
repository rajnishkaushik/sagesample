package org.kaushik.sage.sagesample.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables=Resource.class)
public class MachineTool {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Inject @Optional
    public String machine1image1;
    
    @Inject @Optional
    public String machine1image2;
    
    @Inject @Optional
    public String machine1image3;
    
    @Inject @Optional
    public String machine2image1;
    
    @Inject @Optional
    public String machine2image2;
    
    @Inject @Optional
    public String machine2image3;
    
    @Inject @Optional
    public String machine3image1;
    
    @Inject @Optional
    public String machine3image2;
    
    @Inject @Optional
    public String machine3image3;
    
    private String machine1_image1;
    private String machine1_image2;
    private String machine1_image3;
    private String machine2_image1;
    private String machine2_image2;
    private String machine2_image3;
    private String machine3_image1;
    private String machine3_image2;
    private String machine3_image3;
  
    @PostConstruct
    protected void init() {
    	
    	setMachine1Image1(machine1image1);
    	setMachine1Image2(machine1image2);
    	setMachine1Image3(machine1image3);
    	setMachine2Image1(machine2image1);
    	setMachine2Image2(machine2image2);
    	setMachine2Image3(machine2image3);
    	setMachine3Image1(machine3image1);
    	setMachine3Image2(machine3image2);
    	setMachine3Image3(machine3image3);
    }
  
    public String getMachine1Image1() {
		return machine1_image1;
	}

	public void setMachine1Image1(String machine1Image1) {
		if(machine1Image1 != null) {
			this.machine1_image1 = machine1Image1;
			LOG.info("machine1Image1 = "+ machine1Image1);
		}
	}

	public String getMachine1Image2() {
		return machine1_image2;
	}

	public void setMachine1Image2(String machine1Image2) {
		if(machine1Image2 != null) {
			this.machine1_image2 = machine1Image2;
			LOG.info("machine1Image2 = "+ machine1Image2);
		}
	}

	public String getMachine1Image3() {
		return machine1_image3;
	}

	public void setMachine1Image3(String machine1Image3) {
		if(machine1Image3 != null) {
			this.machine1_image3 = machine1Image3;
			LOG.info("machine1Image3 = "+ machine1Image3);
		}
	}

	public String getMachine2Image1() {
		return machine2_image1;
	}

	public void setMachine2Image1(String machine2Image1) {
		if(machine2Image1 != null) {
			this.machine2_image1 = machine2Image1;
			LOG.info("machine2Image1 = "+ machine2Image1);
		}
	}

	public String getMachine2Image2() {
		return machine2_image2;
	}

	public void setMachine2Image2(String machine2Image2) {
		if(machine2Image2 != null) {
			this.machine2_image2 = machine2Image2;
			LOG.info("machine2Image2 = "+ machine2Image2);
		}
	}

	public String getMachine2Image3() {
		return machine2_image3;
	}

	public void setMachine2Image3(String machine2Image3) {
		if(machine2Image3 != null) {
			this.machine2_image3 = machine2Image3;
			LOG.info("machine2Image3 = "+ machine2Image3);
		}
	}

	public String getMachine3Image1() {
		return machine3_image1;
	}

	public void setMachine3Image1(String machine3Image1) {
		if(machine3Image1 != null) {
			this.machine3_image1 = machine3Image1;
			LOG.info("machine2Image1 = "+ machine3Image1);
		}
	}

	public String getMachine3Image2() {
		return machine3_image2;
	}

	public void setMachine3Image2(String machine3Image2) {
		if(machine3Image2 != null) {
			this.machine3_image2 = machine3Image2;
			LOG.info("machine3Image2 = "+ machine3Image2);
		}
	}

	public String getMachine3Image3() {
		return machine3_image3;
	}

	public void setMachine3Image3(String machine3Image3) {
		if(machine3Image3 != null) {
			this.machine3_image3 = machine3Image3;
			LOG.info("machine3Image3 = "+ machine3Image3);
		}
	}
}
