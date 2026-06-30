package org.chromium.base.metrics;

/* loaded from: classes16.dex */
public class UmaRecorderHolder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static boolean sNativeInitialized;
    private static org.chromium.base.metrics.CachingUmaRecorder sRecorder = new org.chromium.base.metrics.CachingUmaRecorder();
    private static boolean sSetUpNativeUmaRecorder = true;

    private UmaRecorderHolder() {
    }

    public static org.chromium.base.metrics.UmaRecorder get() {
        return sRecorder;
    }

    public static void onLibraryLoaded() {
        if (sSetUpNativeUmaRecorder) {
            sNativeInitialized = true;
            sRecorder.setDelegate(new org.chromium.base.metrics.NativeUmaRecorder());
        }
    }

    public static void resetForTesting() {
        if (sNativeInitialized) {
            return;
        }
        sRecorder = new org.chromium.base.metrics.CachingUmaRecorder();
    }

    public static void setNonNativeDelegate(org.chromium.base.metrics.UmaRecorder umaRecorder) {
        sRecorder.setDelegate(umaRecorder);
    }

    public static void setUpNativeUmaRecorder(boolean z17) {
        sSetUpNativeUmaRecorder = z17;
    }
}
