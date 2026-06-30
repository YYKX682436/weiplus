package org.chromium.net.impl;

/* loaded from: classes13.dex */
public class ImplVersion {
    private static final int API_LEVEL = 26;
    private static final java.lang.String CRONET_VERSION = "119.0.6045.214";
    private static final java.lang.String LAST_CHANGE = "5f553ed109919c043d444a7ab75005271dad04c7";

    private ImplVersion() {
    }

    public static int getApiLevel() {
        return 26;
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
}
