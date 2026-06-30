package org.chromium.base.metrics;

@org.chromium.base.annotations.JNINamespace("base::android")
/* loaded from: classes16.dex */
public final class StatisticsRecorderAndroid {

    /* loaded from: classes16.dex */
    public interface Natives {
        java.lang.String toJson(int i17);
    }

    private StatisticsRecorderAndroid() {
    }

    public static java.lang.String toJson(int i17) {
        return org.chromium.base.metrics.StatisticsRecorderAndroidJni.get().toJson(i17);
    }
}
