package org.chromium.base.compat;

/* loaded from: classes13.dex */
public final class ApiHelperForM {
    private byte _hellAccFlag_;

    private ApiHelperForM() {
    }

    public static android.graphics.drawable.Icon createIconWithBitmap(android.graphics.Bitmap bitmap) {
        return android.graphics.drawable.Icon.createWithBitmap(bitmap);
    }

    public static int getActionButton(android.view.MotionEvent motionEvent) {
        return motionEvent.getActionButton();
    }

    public static int getActionModeType(android.view.ActionMode actionMode) {
        return actionMode.getType();
    }

    public static android.net.Network getActiveNetwork(android.net.ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    public static android.net.Network getBoundNetworkForProcess(android.net.ConnectivityManager connectivityManager) {
        return connectivityManager.getBoundNetworkForProcess();
    }

    public static long getDefaultActionModeHideDuration() {
        return android.view.ViewConfiguration.getDefaultActionModeHideDuration();
    }

    public static int getModePhysicalHeight(android.view.Display.Mode mode) {
        return mode.getPhysicalHeight();
    }

    public static int getModePhysicalWidth(android.view.Display.Mode mode) {
        return mode.getPhysicalWidth();
    }

    public static long getNetworkHandle(android.net.Network network) {
        return network.getNetworkHandle();
    }

    public static android.net.NetworkInfo getNetworkInfo(android.net.ConnectivityManager connectivityManager, android.net.Network network) {
        return connectivityManager.getNetworkInfo(network);
    }

    public static int getPendingIntentImmutableFlag() {
        return 67108864;
    }

    public static <T> T getSystemService(android.content.Context context, java.lang.Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static void hideActionMode(android.view.ActionMode actionMode, long j17) {
        actionMode.hide(j17);
    }

    public static void invalidateContentRectOnActionMode(android.view.ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public static boolean isCleartextTrafficPermitted() {
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public static boolean isDeviceIdleMode(android.os.PowerManager powerManager) {
        return powerManager.isDeviceIdleMode();
    }

    public static boolean isPermissionRevokedByPolicy(android.app.Activity activity, java.lang.String str) {
        return activity.getPackageManager().isPermissionRevokedByPolicy(str, activity.getPackageName());
    }

    public static boolean isProcess64Bit() {
        return android.os.Process.is64Bit();
    }

    public static boolean isSystemUser(android.os.UserManager userManager) {
        return userManager.isSystemUser();
    }

    public static void onPageCommitVisible(android.webkit.WebViewClient webViewClient, android.webkit.WebView webView, java.lang.String str) {
        webViewClient.onPageCommitVisible(webView, str);
    }

    public static void onWindowFocusChangedOnActionMode(android.view.ActionMode actionMode, boolean z17) {
        actionMode.onWindowFocusChanged(z17);
    }

    public static void reportNetworkConnectivity(android.net.ConnectivityManager connectivityManager, android.net.Network network, boolean z17) {
        connectivityManager.reportNetworkConnectivity(network, z17);
    }

    public static void requestActivityPermissions(android.app.Activity activity, java.lang.String[] strArr, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(strArr);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "org/chromium/base/compat/ApiHelperForM", "requestActivityPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        activity.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(activity, "org/chromium/base/compat/ApiHelperForM", "requestActivityPermissions", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    public static boolean shouldShowRequestPermissionRationale(android.app.Activity activity, java.lang.String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
