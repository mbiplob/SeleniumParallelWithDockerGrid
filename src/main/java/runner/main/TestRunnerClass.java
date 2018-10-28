package runner.main;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class TestRunnerClass {

    public static void main(String[] args) {
        run("Parallel.xml");
    }


    public static void run(String xmlFile){
        TestNG testng = new TestNG();
        List<String> suites = new ArrayList();
        suites.add(xmlFile);
        testng.setTestSuites(suites);
        testng.run();
    }
}
