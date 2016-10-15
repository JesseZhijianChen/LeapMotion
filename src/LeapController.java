import java.io.IOException;
import java.util.ResourceBundle.Control;

import com.leapmotion.leap.*;
import com.leapmotion.leap.Gesture.State;


public class LeapController {
	
	public static void main(String[] args) {	
		LeapListener listener = new LeapListener(new I2MapAdapter() {
			
			@Override
			public void zome(String scale) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drag(String direction) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Controller controller = new Controller();
		controller.addListener(listener);	
		System.out.println("Press enter to quit");
		
		try{
			System.in.read();
		}catch (IOException e) {
			e.printStackTrace();
		}
		controller.removeListener(listener);
	}

}
