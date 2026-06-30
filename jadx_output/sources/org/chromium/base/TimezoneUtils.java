package org.chromium.base;

@org.chromium.base.annotations.JNINamespace("base::android")
@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
class TimezoneUtils {
    private TimezoneUtils() {
    }

    private static java.lang.String getDefaultTimeZoneId() {
        android.os.StrictMode.ThreadPolicy allowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        java.lang.String id6 = java.util.TimeZone.getDefault().getID();
        android.os.StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id6;
    }
}
