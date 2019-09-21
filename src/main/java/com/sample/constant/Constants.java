package com.sample.constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final String DELIVERED_STATUS = "Delivered";
    public static final String INSTALL_COMPLETED_STATUS = "Completed ";
    public static final String NO_PENDING_CALL_CLOSED_REASON = "No Pending call closed";
    public static final String H_CAF_PENDING_PARTNER_NOT_SUBMITTED_REASON = "Partner not submitted";
    public static final String H_CAF_NO_PENDING_REASON = "No Pending";
    public static final String H_CAF_NOT_SIGNED_REASON = "CAF not signed";

    public static final List<String> PRODUCTS = new ArrayList<>(Arrays.asList("Vostro Desktop 3670", "Vostro Notebook 3480","VOSTRO 3670",
            "VOSTRO 3480","OPTIPLEX 3060"));
    public static final List<String> HARD_CAP_MANDATORY = new ArrayList<>(Arrays.asList(
            "CHENNAI","TRIVENDRUM","BHOPAL"
    ));

}
