package org.chromium.base;

/* loaded from: classes13.dex */
public final class CommandLineInitUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String COMMAND_LINE_FILE_PATH = "/data/local";
    private static final java.lang.String COMMAND_LINE_FILE_PATH_DEBUG_APP = "/data/local/tmp";
    private static java.lang.String sFilenameOverrideForTesting;

    private CommandLineInitUtil() {
    }

    private static java.lang.String getDebugApp(android.content.Context context) {
        if (android.provider.Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            return android.provider.Settings.Global.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    public static void initCommandLine(java.lang.String str) {
        initCommandLine(str, null);
    }

    public static void setFilenameOverrideForTesting(java.lang.String str) {
        sFilenameOverrideForTesting = str;
    }

    private static boolean shouldUseDebugCommandLine(org.chromium.base.supplier.Supplier<java.lang.Boolean> supplier) {
        if (supplier != null && supplier.get().booleanValue()) {
            return true;
        }
        android.content.Context applicationContext = org.chromium.base.ContextUtils.getApplicationContext();
        return applicationContext.getPackageName().equals(getDebugApp(applicationContext)) || org.chromium.base.BuildInfo.isDebugAndroid();
    }

    public static void initCommandLine(java.lang.String str, org.chromium.base.supplier.Supplier<java.lang.Boolean> supplier) {
        java.lang.String str2 = sFilenameOverrideForTesting;
        if (str2 != null) {
            str = str2;
        }
        java.io.File file = new java.io.File(COMMAND_LINE_FILE_PATH_DEBUG_APP, str);
        if (!file.exists() || !shouldUseDebugCommandLine(supplier)) {
            file = new java.io.File(COMMAND_LINE_FILE_PATH, str);
        }
        org.chromium.base.CommandLine.initFromFile(file.getPath());
    }
}
