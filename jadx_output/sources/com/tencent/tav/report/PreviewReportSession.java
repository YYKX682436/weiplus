package com.tencent.tav.report;

/* loaded from: classes16.dex */
public final class PreviewReportSession {
    private static final int FLUSH_DURATION_THRESHOLD = 10;
    private static final java.lang.String TAG = "PreviewReportSession";
    private long beginTimeMs = 0;
    private int frameCount = 0;
    private long totalReadCostUs = 0;
    private long totalRenderCount = 0;

    private void commit() {
    }

    private void reset() {
        this.beginTimeMs = 0L;
        this.totalReadCostUs = 0L;
        this.totalRenderCount = 0L;
        this.frameCount = 0;
    }

    public final void flush() {
        if (this.beginTimeMs == 0) {
            return;
        }
        if (this.frameCount >= 10) {
            commit();
        }
        reset();
    }

    public final void tickPreview(long j17, long j18) {
        if (this.beginTimeMs == 0) {
            this.beginTimeMs = java.lang.System.currentTimeMillis() - ((j17 / 1000) / 1000);
        }
        this.frameCount++;
        this.totalReadCostUs += j17 / 1000;
        this.totalRenderCount += j18 / 1000;
    }
}
