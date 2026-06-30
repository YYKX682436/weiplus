package org.chromium.net;

/* loaded from: classes13.dex */
public class ApiVersion {
    private static final int API_LEVEL = 26;
    private static final java.lang.String CRONET_VERSION = "119.0.6045.214";
    private static final java.lang.String LAST_CHANGE = "5f553ed109919c043d444a7ab75005271dad04c7";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static java.lang.String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static java.lang.String getCronetVersionWithLastChange() {
        return "119.0.6045.214@5f553ed1";
    }

    public static java.lang.String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 26;
    }
}
