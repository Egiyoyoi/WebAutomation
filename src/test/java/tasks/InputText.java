package tasks;

import fb.pageobjects.LoginPageObjects;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import orange_hrm.pageobjects.HRMLeavePageObjects;
import orange_hrm.pageobjects.HRMLoginPageObjects;
import orange_hrm.pageobjects.HRMPIMPageObjects;

public class InputText {
    public static Performable onField(String fieldType, String value) throws Exception {
        Target field;

        switch (fieldType) {
            case "FB Email":
                field = LoginPageObjects.EMAIL_FIELD;
                break;
            case "FB Password":
                field = LoginPageObjects.PASSWORD_FIELD;
                break;
            case "HRM username":
                field = HRMLoginPageObjects.USERNAME_FIELD;
                break;
            case "HRM password":
                field = HRMLoginPageObjects.PASSWORD_FIELD;
                break;
            case "firstName":
                field = HRMPIMPageObjects.FIRST_NAME_FIELD;
                break;
            case "lastName":
                field = HRMPIMPageObjects.LAST_NAME_FIELD;
                break;
            case "editMiddleName":
                field = HRMPIMPageObjects.EDIT_MIDDLE_NAME_FIELD;
                break;
            case "employeeName":
                field = HRMPIMPageObjects.EMPLOYEE_NAME;
                break;
            case "Employee":
                field = HRMLeavePageObjects.EMPLOYEE_FIELD;
                break;
            case "leaveType":
                field = HRMLeavePageObjects.LEAVE_TYPE_FIELD;
                break;
            case "leavePeriod":
                field = HRMLeavePageObjects.LEAVE_PERIOD_FIELD;
                break;
            case "Entitlement":
                field = HRMLeavePageObjects.ENTITLEMENT;
                break;
            case "leaveList":
                field = HRMLeavePageObjects.LEAVE_LIST;
                break;
            case "fromField":
                field = HRMLeavePageObjects.FROM_FIELD;
                break;
            default:
              throw new Exception("There is no field type: " + fieldType);
        }

        return Task.where("{0} input: '" + value + "'",
                Enter.theValue(value)
                        .into(field)
        );
    }
}
