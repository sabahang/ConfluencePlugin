package com.sabahang.webitemz;

import com.atlassian.confluence.core.ConfluenceActionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessChecker extends ConfluenceActionSupport {
  private static final Logger
      LOG = LoggerFactory.getLogger(AccessChecker.class);

 String myText = "show me";

    public String getMyText() {
        return myText;
    }

    @Override

  public String execute() throws Exception {
      return SUCCESS;
  }

}

