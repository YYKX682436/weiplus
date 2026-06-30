package org.chromium.base.memory;

/* loaded from: classes7.dex */
public class MemoryPressureUma implements android.content.ComponentCallbacks2 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static org.chromium.base.memory.MemoryPressureUma sInstance;
    private final java.lang.String mHistogramName;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Notification {
        public static final int NUM_ENTRIES = 9;
        public static final int ON_LOW_MEMORY = 8;
        public static final int TRIM_MEMORY_BACKGROUND = 3;
        public static final int TRIM_MEMORY_COMPLETE = 1;
        public static final int TRIM_MEMORY_MODERATE = 2;
        public static final int TRIM_MEMORY_RUNNING_CRITICAL = 5;
        public static final int TRIM_MEMORY_RUNNING_LOW = 6;
        public static final int TRIM_MEMORY_RUNNING_MODERATE = 7;
        public static final int TRIM_MEMORY_UI_HIDDEN = 4;
        public static final int UNKNOWN_TRIM_LEVEL = 0;
    }

    private MemoryPressureUma(java.lang.String str) {
        this.mHistogramName = "Android.MemoryPressureNotification." + str;
    }

    public static void initializeForBrowser() {
        initializeInstance("Browser");
    }

    public static void initializeForChildService() {
        initializeInstance("ChildService");
    }

    private static void initializeInstance(java.lang.String str) {
        org.chromium.base.ThreadUtils.assertOnUiThread();
        sInstance = new org.chromium.base.memory.MemoryPressureUma(str);
        org.chromium.base.ContextUtils.getApplicationContext().registerComponentCallbacks(sInstance);
    }

    private void record(int i17) {
        org.chromium.base.metrics.RecordHistogram.recordEnumeratedHistogram(this.mHistogramName, i17, 9);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        record(8);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (i17 == 5) {
            record(7);
            return;
        }
        if (i17 == 10) {
            record(6);
            return;
        }
        if (i17 == 15) {
            record(5);
            return;
        }
        if (i17 == 20) {
            record(4);
            return;
        }
        if (i17 == 40) {
            record(3);
            return;
        }
        if (i17 == 60) {
            record(2);
        } else if (i17 != 80) {
            record(0);
        } else {
            record(1);
        }
    }
}
