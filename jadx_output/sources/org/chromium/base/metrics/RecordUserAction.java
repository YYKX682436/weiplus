package org.chromium.base.metrics;

/* loaded from: classes16.dex */
public class RecordUserAction {
    public static void record(java.lang.String str) {
        org.chromium.base.metrics.UmaRecorderHolder.get().recordUserAction(str, org.chromium.base.TimeUtils.elapsedRealtimeMillis());
    }
}
