package orange_hrm.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl( "https://opensource-demo.orangehrmlive.com/index.php/leave/addLeaveEntitlement")
public class HRMLeavePageObjects extends PageObject {
    public static Target ADD_ENTITLEMENTS = Target.the("add entitlements")
            .locatedBy("#menu_leave_addLeaveEntitlement");
    public static Target EMPLOYEE_FIELD = Target.the("employee name field")
            .locatedBy("#entitlements_employee_empName");
    public static Target LEAVE_TYPE_FIELD = Target.the("leave type field")
            .locatedBy("#entitlements_leave_type");
    public static Target LEAVE_PERIOD_FIELD = Target.the("leave period")
            .locatedBy("#period");
    public static Target ENTITLEMENT = Target.the("entitlement field")
            .locatedBy("#entitlements_entitlement");
    public static Target SAVE_BUTTON = Target.the("save button")
            .locatedBy("#btnSave");

    public static Target LEAVE_LIST = Target.the("leave list")
            .locatedBy("menu_leave_viewLeaveList");
    public static Target FROM_FIELD = Target.the("from field")
            .locatedBy("#calFromDate");
    public static Target TO_FIELD = Target.the("to field")
            .locatedBy("#calToDate");
    public static Target EMPLOYEE_FIELD = Target.the("employee field")
            .locatedBy("#leaveList_txtEmployee_empName");
    public static Target SUB_UNIT_FIELD = Target.the("sub unit field")
            .locatedBy("#leaveList_cmbSubunit");
    }
}
