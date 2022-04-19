package pl.edu.pwsztar.domain.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResponseData {

    private final List<String> fieldsErrorsNames;
    private int errorCode;

    public ResponseData() {
        this.fieldsErrorsNames = new ArrayList<>();
        this.errorCode = 200;
    }

    public void addErrorFieldName(final String name) {
        fieldsErrorsNames.add(name);
        this.errorCode = 400;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getFieldsErrorsNames() {
        return String.join(",", this.fieldsErrorsNames);
    }
}
