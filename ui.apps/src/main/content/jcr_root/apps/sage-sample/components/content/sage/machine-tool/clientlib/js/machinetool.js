function machineStatus() {	
	$.ajax({
        type: 'GET',    
        url:'/bin/machinestatus.json',

        success: function(msg){	        
	        $.each(msg.factory, function(k, v){
	        	switch(v.machine){
		        	case 'Machine 1':
		        		if(v.efficiency < 33){
		        			$("#machine1img").attr("src", $('#m1i1').data('server-property'));
		        		};
		        			
		        		if((v.efficiency > 33) && (v.efficiency < 67)){
			        		$("#machine1img").attr("src", $('#m1i2').data('server-property'));
			        	};
			        	
			        	if(v.efficiency > 67){
			        		$("#machine1img").attr("src", $('#m1i3').data('server-property'));
			        	};
		        		break;
		        		
		        	case 'Machine 2':
		        		if(v.efficiency < 33){
		        			$("#machine2img").attr("src", $('#m2i1').data('server-property'));
		        		};
		        			
		        		if((v.efficiency > 33) && (v.efficiency < 67)){
			        		$("#machine2img").attr("src", $('#m2i2').data('server-property'));
			        	};
			        	
			        	if(v.efficiency > 67){
			        		$("#machine2img").attr("src", $('#m2i3').data('server-property'));
			        	};
		        		break;
		        		
		        	case 'Machine 3':
		        		if(v.efficiency < 33){
		        			$("#machine3img").attr("src", $('#m3i1').data('server-property'));
		        		};
		        			
		        		if((v.efficiency > 33) && (v.efficiency < 67)){
			        		$("#machine3img").attr("src", $('#m3i2').data('server-property'));
			        	};
			        	
			        	if(v.efficiency > 67){
			        		$("#machine3img").attr("src", $('#m3i3').data('server-property'));
			        	};
		        		break;
		        		
		        	default:
		        		alert( "Machine not supported yet");
		        		break;
	        	}
        	});

        }
    });
}

