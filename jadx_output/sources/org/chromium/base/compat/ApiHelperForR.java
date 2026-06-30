package org.chromium.base.compat;

/* loaded from: classes13.dex */
public final class ApiHelperForR {
    private ApiHelperForR() {
    }

    public static android.view.Display getDisplay(android.content.Context context) {
        return context.getDisplay();
    }

    public static android.graphics.Rect getMaximumWindowMetricsBounds(android.view.WindowManager windowManager) {
        return windowManager.getMaximumWindowMetrics().getBounds();
    }

    public static java.io.File getVolumeDir(android.os.storage.StorageManager storageManager, android.net.Uri uri) {
        return storageManager.getStorageVolume(uri).getDirectory();
    }

    public static void setProcessStateSummary(android.app.ActivityManager activityManager, byte[] bArr) {
        activityManager.setProcessStateSummary(bArr);
    }

    public static android.view.VerifiedInputEvent verifyInputEvent(android.hardware.input.InputManager inputManager, android.view.InputEvent inputEvent) {
        return inputManager.verifyInputEvent(inputEvent);
    }
}
