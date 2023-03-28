package hooks;





import io.cucumber.java.Before;

import static baseurls.MedunnaBaseUrl.medunnaSetUp;
import static baseurls.MedunnaBaseUrl.medunnaSetUp;

public class Hooks {

    @Before("@TC01_Api")
    public void beforeApi(){
        medunnaSetUp();
    }

}