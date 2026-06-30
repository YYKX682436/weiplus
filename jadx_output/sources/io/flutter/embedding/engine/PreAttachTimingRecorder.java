package io.flutter.embedding.engine;

/* loaded from: classes15.dex */
public class PreAttachTimingRecorder {
    private static final java.lang.String TAG = "PreAttachTimingRecorder";
    private final java.util.Map<java.lang.String, java.lang.Long> timings = new java.util.HashMap();
    private final java.util.Map<java.lang.String, java.lang.Long> startTimes = new java.util.HashMap();
    private boolean transferred = false;

    public void clearAndMarkTransferred() {
        this.transferred = true;
        this.timings.clear();
        this.startTimes.clear();
    }

    public void endDuration(java.lang.String str) {
        java.lang.Long remove;
        if (this.transferred || (remove = this.startTimes.remove(str)) == null) {
            return;
        }
        this.timings.put(str + "_start", remove);
        this.timings.put(str + "_end", java.lang.Long.valueOf(java.lang.System.nanoTime()));
    }

    public long getDuration(java.lang.String str, java.lang.String str2) {
        java.lang.Long l17 = this.timings.get(str);
        java.lang.Long l18 = this.timings.get(str2);
        if (l17 == null || l18 == null) {
            return -1L;
        }
        return (l18.longValue() - l17.longValue()) / 1000;
    }

    public java.lang.String getSummary() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PreAttachTimingRecorder Summary:\n");
        sb6.append(java.lang.String.format("  Transferred: %b\n", java.lang.Boolean.valueOf(this.transferred)));
        sb6.append("  Timings:\n");
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : this.timings.entrySet()) {
            sb6.append(java.lang.String.format("    %s: %d ns\n", entry.getKey(), entry.getValue()));
        }
        return sb6.toString();
    }

    public java.util.Map<java.lang.String, java.lang.Long> getTimings() {
        return new java.util.HashMap(this.timings);
    }

    public boolean isTransferred() {
        return this.transferred;
    }

    public void recordTiming(java.lang.String str) {
        if (this.transferred) {
            return;
        }
        this.timings.put(str, java.lang.Long.valueOf(java.lang.System.nanoTime()));
    }

    public void recordTimingWithTimestamp(java.lang.String str, long j17) {
        if (this.transferred) {
            return;
        }
        this.timings.put(str, java.lang.Long.valueOf(j17));
    }

    public void reset() {
        this.transferred = false;
        this.timings.clear();
        this.startTimes.clear();
    }

    public void startDuration(java.lang.String str) {
        if (this.transferred) {
            return;
        }
        this.startTimes.put(str, java.lang.Long.valueOf(java.lang.System.nanoTime()));
    }
}
