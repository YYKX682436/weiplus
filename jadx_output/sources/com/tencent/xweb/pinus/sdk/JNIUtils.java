package com.tencent.xweb.pinus.sdk;

/* loaded from: classes.dex */
public class JNIUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static java.lang.ClassLoader sJniClassLoader;
    private static java.lang.Boolean sSelectiveJniRegistrationEnabled;

    public static void enableSelectiveJniRegistration() {
        sSelectiveJniRegistrationEnabled = java.lang.Boolean.TRUE;
    }

    public static java.lang.Object getClassLoader() {
        java.lang.ClassLoader classLoader = sJniClassLoader;
        return classLoader == null ? com.tencent.xweb.pinus.sdk.JNIUtils.class.getClassLoader() : classLoader;
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (sSelectiveJniRegistrationEnabled == null) {
            sSelectiveJniRegistrationEnabled = java.lang.Boolean.FALSE;
        }
        return sSelectiveJniRegistrationEnabled.booleanValue();
    }

    public static void setClassLoader(java.lang.ClassLoader classLoader) {
        sJniClassLoader = classLoader;
    }
}
