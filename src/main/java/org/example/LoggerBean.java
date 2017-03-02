package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Elliot Metsger (emetsger@jhu.edu)
 */
@Component
public class LoggerBean {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    public LoggerBean() {
        log.debug("Debug output");
        log.info("Info output");
        log.warn("Warn output");
        log.error("Error output");
        System.exit(0);
    }
}
