package org.chromium.base.compat;

/* loaded from: classes13.dex */
public final class ApiHelperForN {
    private ApiHelperForN() {
    }

    public static int getRestrictBackgroundStatus(android.net.ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus();
    }

    public static long getStartUptimeMillis() {
        return android.os.Process.getStartUptimeMillis();
    }

    public static boolean isCleartextTrafficPermitted(java.lang.String str) {
        return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public static android.view.PointerIcon onResolvePointerIcon(android.view.View view, android.view.MotionEvent motionEvent, int i17) {
        return view.onResolvePointerIcon(motionEvent, i17);
    }

    public static void setCryptoInfoPattern(android.media.MediaCodec.CryptoInfo cryptoInfo, int i17, int i18) {
        cryptoInfo.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(i17, i18));
    }

    public static void setVrModeEnabled(android.app.Activity activity, boolean z17, android.content.ComponentName componentName) {
        activity.setVrModeEnabled(z17, componentName);
    }

    public static boolean startDragAndDrop(android.view.View view, android.content.ClipData clipData, android.view.View.DragShadowBuilder dragShadowBuilder, java.lang.Object obj, int i17) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i17);
    }
}
