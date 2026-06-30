package org.chromium.base;

@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public class MemoryPressureListener {
    private static final java.lang.String ACTION_LOW_MEMORY = "org.chromium.base.ACTION_LOW_MEMORY";
    private static final java.lang.String ACTION_TRIM_MEMORY = "org.chromium.base.ACTION_TRIM_MEMORY";
    private static final java.lang.String ACTION_TRIM_MEMORY_MODERATE = "org.chromium.base.ACTION_TRIM_MEMORY_MODERATE";
    private static final java.lang.String ACTION_TRIM_MEMORY_RUNNING_CRITICAL = "org.chromium.base.ACTION_TRIM_MEMORY_RUNNING_CRITICAL";
    private static org.chromium.base.ObserverList<org.chromium.base.memory.MemoryPressureCallback> sCallbacks;

    /* loaded from: classes13.dex */
    public interface Natives {
        void onMemoryPressure(int i17);
    }

    public static void addCallback(org.chromium.base.memory.MemoryPressureCallback memoryPressureCallback) {
        org.chromium.base.ThreadUtils.assertOnUiThread();
        if (sCallbacks == null) {
            sCallbacks = new org.chromium.base.ObserverList<>();
        }
        sCallbacks.addObserver(memoryPressureCallback);
    }

    private static void addNativeCallback() {
        org.chromium.base.ThreadUtils.assertOnUiThread();
        addCallback(new org.chromium.base.MemoryPressureListener$$a());
    }

    public static boolean handleDebugIntent(android.app.Activity activity, java.lang.String str) {
        org.chromium.base.ThreadUtils.assertOnUiThread();
        if (ACTION_LOW_MEMORY.equals(str)) {
            simulateLowMemoryPressureSignal(activity);
            return true;
        }
        if (ACTION_TRIM_MEMORY.equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 80);
            return true;
        }
        if (ACTION_TRIM_MEMORY_RUNNING_CRITICAL.equals(str)) {
            simulateTrimMemoryPressureSignal(activity, 15);
            return true;
        }
        if (!ACTION_TRIM_MEMORY_MODERATE.equals(str)) {
            return false;
        }
        simulateTrimMemoryPressureSignal(activity, 60);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addNativeCallback$0(int i17) {
        org.chromium.base.MemoryPressureListenerJni.get().onMemoryPressure(i17);
    }

    public static void notifyMemoryPressure(int i17) {
        org.chromium.base.ThreadUtils.assertOnUiThread();
        org.chromium.base.ObserverList<org.chromium.base.memory.MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        java.util.Iterator<org.chromium.base.memory.MemoryPressureCallback> it = observerList.iterator();
        while (it.hasNext()) {
            it.next().onPressure(i17);
        }
    }

    public static void removeCallback(org.chromium.base.memory.MemoryPressureCallback memoryPressureCallback) {
        org.chromium.base.ThreadUtils.assertOnUiThread();
        org.chromium.base.ObserverList<org.chromium.base.memory.MemoryPressureCallback> observerList = sCallbacks;
        if (observerList == null) {
            return;
        }
        observerList.removeObserver(memoryPressureCallback);
    }

    private static void simulateLowMemoryPressureSignal(android.app.Activity activity) {
        activity.getApplication().onLowMemory();
        activity.onLowMemory();
    }

    private static void simulateTrimMemoryPressureSignal(android.app.Activity activity, int i17) {
        activity.getApplication().onTrimMemory(i17);
        activity.onTrimMemory(i17);
    }
}
