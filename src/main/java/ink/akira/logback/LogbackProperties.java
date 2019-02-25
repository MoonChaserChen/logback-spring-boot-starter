package ink.akira.logback;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by akira on 2019/2/22.
 */
@ConfigurationProperties(prefix = "logback")
public class LogbackProperties {
    private String projectName;
    private String logHome;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLogHome() {
        return logHome;
    }

    public void setLogHome(String logHome) {
        this.logHome = logHome;
    }
}
