package org.chromium.base;

/* loaded from: classes13.dex */
public class PackageManagerUtils {
    public static final android.content.Intent BROWSER_INTENT = new android.content.Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(android.net.Uri.fromParts("http", "", null));
    private static final java.lang.String TAG = "PackageManagerUtils";

    public static boolean canResolveActivity(android.content.Intent intent, int i17) {
        return !queryIntentActivities(intent, i17).isEmpty();
    }

    public static android.content.Intent getQueryInstalledHomeLaunchersIntent() {
        return new android.content.Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
    }

    private static void handleExpectedExceptionsOrRethrow(java.lang.RuntimeException runtimeException, android.content.Intent intent) {
        if (!(runtimeException instanceof java.lang.NullPointerException) && !(runtimeException.getCause() instanceof android.os.TransactionTooLargeException)) {
            throw runtimeException;
        }
        org.chromium.base.Log.e(TAG, "Could not resolve Activity for intent " + intent.toString(), (java.lang.Throwable) runtimeException);
    }

    public static java.util.List<android.content.pm.ResolveInfo> queryAllLaunchersInfo() {
        return queryIntentActivities(getQueryInstalledHomeLaunchersIntent(), 131072);
    }

    public static java.util.List<android.content.pm.ResolveInfo> queryAllWebBrowsersInfo() {
        return queryIntentActivities(BROWSER_INTENT, 983040);
    }

    public static java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, int i17) {
        try {
            org.chromium.base.StrictModeContext allowDiskReads = org.chromium.base.StrictModeContext.allowDiskReads();
            try {
                java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = org.chromium.base.ContextUtils.getApplicationContext().getPackageManager().queryIntentActivities(intent, i17);
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
                return queryIntentActivities;
            } finally {
            }
        } catch (java.lang.RuntimeException e17) {
            handleExpectedExceptionsOrRethrow(e17, intent);
            return java.util.Collections.emptyList();
        }
    }

    public static android.content.pm.ResolveInfo resolveActivity(android.content.Intent intent, int i17) {
        try {
            org.chromium.base.StrictModeContext allowDiskWrites = org.chromium.base.StrictModeContext.allowDiskWrites();
            try {
                android.content.pm.ResolveInfo resolveActivity = org.chromium.base.ContextUtils.getApplicationContext().getPackageManager().resolveActivity(intent, i17);
                if (allowDiskWrites != null) {
                    allowDiskWrites.close();
                }
                return resolveActivity;
            } finally {
            }
        } catch (java.lang.RuntimeException e17) {
            handleExpectedExceptionsOrRethrow(e17, intent);
            return null;
        }
    }

    public static android.content.pm.ResolveInfo resolveDefaultWebBrowserActivity() {
        return resolveActivity(BROWSER_INTENT, 65536);
    }

    public static boolean canResolveActivity(android.content.Intent intent) {
        return canResolveActivity(intent, 0);
    }
}
