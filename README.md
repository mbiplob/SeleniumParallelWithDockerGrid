# SeleniumParallelWithDockerGrid

SeleniumParallelWithDockerGrid is a simple project to run selenium tests in a Dockerized grid environment using TestNG, Selenium, Docker.

## Installation

### Requirements
* Java (8 recommended)
* Maven
* Docker (Community Edition would be enough)
* Have selenium/hub, selenium/node-firefox and selenium/node-chrome images pulled by running docker pull commands
* Latest ChromeDriver for your specific Operating System. 
### Steps To obtain and Run the Project
`$ git clone https://github.com/mbiplob/SeleniumParallelWithDockerGrid.git`

**Open the TestBase Class and add the chromedriver Directory in the System.Setproperty() line**

`$ cd SeleniumParallelWithDockerGrid`

`./SetUpAndRun.sh`

### Things to remember
If you want to try out the code without Grid, please change the driver declaration to normal ChromeDriver instead of RemoteWebDriver. All you need to do is comment out the active line and uncomment the normal driver declaration.
And off course Run the tests from the TestRunnerClass Class. 

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.

