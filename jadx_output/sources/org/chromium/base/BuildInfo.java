package org.chromium.base;

/* loaded from: classes13.dex */
public class BuildInfo {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_FINGERPRINT_LENGTH = 128;
    private static final java.lang.String TAG = "BuildInfo";
    private static android.content.pm.ApplicationInfo sBrowserApplicationInfo;
    private static android.content.pm.PackageInfo sBrowserPackageInfo;
    private static boolean sInitialized;
    public final java.lang.String abiString;
    public final java.lang.String androidBuildFingerprint;
    public final java.lang.String customThemes;
    public final java.lang.String gmsVersionCode;
    public final java.lang.String hostPackageLabel;
    public final java.lang.String hostPackageName;
    public final long hostVersionCode;
    public final java.lang.String installerPackageName;
    public final boolean isAutomotive;
    public final boolean isTV;
    public final java.lang.String packageName;
    public final java.lang.String resourcesVersion;
    public final long versionCode;
    public final java.lang.String versionName;
    public final int vulkanDeqpLevel;

    /* loaded from: classes13.dex */
    public static class Holder {
        private static final org.chromium.base.BuildInfo INSTANCE = new org.chromium.base.BuildInfo();

        private Holder() {
        }
    }

    private static java.lang.String[] getAll() {
        return getInstance().getAllProperties();
    }

    private java.lang.String[] getAllProperties() {
        java.lang.String[] strArr = new java.lang.String[31];
        strArr[0] = android.os.Build.BRAND;
        strArr[1] = android.os.Build.DEVICE;
        strArr[2] = android.os.Build.ID;
        strArr[3] = android.os.Build.MANUFACTURER;
        strArr[4] = android.os.Build.MODEL;
        int i17 = android.os.Build.VERSION.SDK_INT;
        strArr[5] = java.lang.String.valueOf(i17);
        strArr[6] = android.os.Build.TYPE;
        strArr[7] = android.os.Build.BOARD;
        strArr[8] = this.hostPackageName;
        strArr[9] = java.lang.String.valueOf(this.hostVersionCode);
        strArr[10] = this.hostPackageLabel;
        strArr[11] = this.packageName;
        strArr[12] = java.lang.String.valueOf(this.versionCode);
        strArr[13] = this.versionName;
        strArr[14] = this.androidBuildFingerprint;
        strArr[15] = this.gmsVersionCode;
        strArr[16] = this.installerPackageName;
        strArr[17] = this.abiString;
        strArr[18] = this.customThemes;
        strArr[19] = this.resourcesVersion;
        strArr[20] = java.lang.String.valueOf(org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion);
        strArr[21] = isDebugAndroid() ? "1" : "0";
        strArr[22] = this.isTV ? "1" : "0";
        strArr[23] = android.os.Build.VERSION.INCREMENTAL;
        strArr[24] = android.os.Build.HARDWARE;
        strArr[25] = isAtLeastT() ? "1" : "0";
        strArr[26] = this.isAutomotive ? "1" : "0";
        strArr[27] = i17 >= 34 ? "1" : "0";
        strArr[28] = targetsAtLeastU() ? "1" : "0";
        strArr[29] = android.os.Build.VERSION.CODENAME;
        strArr[30] = java.lang.String.valueOf(this.vulkanDeqpLevel);
        return strArr;
    }

    public static org.chromium.base.BuildInfo getInstance() {
        return org.chromium.build.BuildConfig.IS_FOR_TEST ? new org.chromium.base.BuildInfo() : org.chromium.base.BuildInfo.Holder.INSTANCE;
    }

    @java.lang.Deprecated
    public static boolean isAtLeastT() {
        int i17 = j3.b.f297332a;
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 33) {
            if (i18 >= 32) {
                java.lang.String CODENAME = android.os.Build.VERSION.CODENAME;
                kotlin.jvm.internal.o.f(CODENAME, "CODENAME");
                if (j3.b.a("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isDebugAndroid() {
        java.lang.String str = android.os.Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }

    public static boolean isDebugAndroidOrApp() {
        return isDebugAndroid() || isDebugApp();
    }

    public static boolean isDebugApp() {
        return (org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo().flags & 2) != 0;
    }

    private static java.lang.String nullToEmpty(java.lang.CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static long packageVersionCode(android.content.pm.PackageInfo packageInfo) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? org.chromium.base.compat.ApiHelperForP.getLongVersionCode(packageInfo) : packageInfo.versionCode;
    }

    public static void setBrowserPackageInfo(android.content.pm.PackageInfo packageInfo) {
        sBrowserPackageInfo = packageInfo;
    }

    @java.lang.Deprecated
    public static boolean targetsAtLeastT() {
        return org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion >= 33;
    }

    public static boolean targetsAtLeastU() {
        return org.chromium.base.ContextUtils.getApplicationContext().getApplicationInfo().targetSdkVersion >= 34;
    }

    public android.content.pm.ApplicationInfo getBrowserApplicationInfo() {
        return sBrowserApplicationInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private BuildInfo() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BuildInfo.<init>():void");
    }
}
