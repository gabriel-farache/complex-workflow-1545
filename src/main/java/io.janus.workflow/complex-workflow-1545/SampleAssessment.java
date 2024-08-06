package io.janus.workflow.complex-workflow-1545;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class SampleAssessment {
    public WorkflowOptions execute(String sampleText) {
        WorkflowOptions workflowOptions = new WorkflowOptions();
        if (null != sampleText && !sampleText.isEmpty()) { // basic check on the user's input "sampleText" to mimic an assessment
            workflowOptions.setCurrentVersion(new WorkflowOption("complex-workflow-1545", "complex-workflow-1545"));
            return workflowOptions;
        }
        return workflowOptions;
    }
}
