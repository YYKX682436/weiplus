package com.tencent.tav.report;

/* loaded from: classes16.dex */
public final class ExportReportSession {
    private static final int FLUSH_DURATION_THRESHOLD = 10;
    private static final java.lang.String TAG = "ExportReportSession";
    private long beginTimeMs = 0;
    private int successCount = 0;
    private long totalCostUs = 0;
    private long totalDecodeUs = 0;
    private long totalRealDecodeUs = 0;
    private long totalEncodeUs = 0;
    private long totalRenderUs = 0;
    private long compositeTimeUs = 0;
    private boolean success = false;
    private long fileDurationUs = 0;
    private long framePerSecond = 0;
    private long exportStartTimeNs = 0;

    private void commit() {
        if (this.beginTimeMs != 0 && this.exportStartTimeNs != 0) {
            if (this.successCount >= 10) {
                doCommit();
            }
        } else {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "commit: 数据错误，beginTimeMs = " + this.beginTimeMs + "， exportStartTimeNs = " + this.exportStartTimeNs);
        }
    }

    private void doCommit() {
        double d17 = this.totalCostUs;
        int i17 = this.successCount;
        double d18 = this.totalDecodeUs / i17;
        com.tencent.tav.decoder.logger.Logger.i(TAG, "report export performance, compositeTimeUs:" + this.compositeTimeUs + ", totalCostUs:" + this.totalCostUs + ", totalDecodeUs:" + this.totalDecodeUs + ", successCount:" + this.successCount + ", avg_decode_time:" + d18 + ", avg_render_time:" + (d17 / i17));
    }

    public long getAverageDecodeUs() {
        if (this.successCount != 0) {
            return getTotalDecodeUs() / this.successCount;
        }
        return 0L;
    }

    public long getAverageEncodeUs() {
        int i17 = this.successCount;
        if (i17 != 0) {
            return this.totalEncodeUs / i17;
        }
        return 0L;
    }

    public long getAverageRenderUs() {
        int i17 = this.successCount;
        if (i17 != 0) {
            return this.totalRenderUs / i17;
        }
        return 0L;
    }

    public long getCompositeTimeUs() {
        return this.compositeTimeUs;
    }

    public int getSuccessCount() {
        return this.successCount;
    }

    public long getTotalCostUs() {
        return this.totalCostUs;
    }

    public long getTotalDecodeUs() {
        return this.totalRealDecodeUs;
    }

    public long getTotalEncodeUs() {
        return this.totalEncodeUs;
    }

    public long getTotalRenderUs() {
        return this.totalRenderUs;
    }

    public void onExportError() {
        this.success = false;
        commit();
    }

    public void onExportStart(long j17) {
        this.exportStartTimeNs = j17;
        this.beginTimeMs = java.lang.System.currentTimeMillis();
    }

    public void onExportSuccess() {
        if (this.exportStartTimeNs <= 0) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "onExportSuccess: 数据错误，exportStartTimeNs = " + this.exportStartTimeNs);
        } else {
            this.success = true;
            this.compositeTimeUs = (java.lang.System.nanoTime() - this.exportStartTimeNs) / 1000;
            commit();
        }
    }

    public void reset() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "reset() called");
        this.compositeTimeUs = 0L;
        this.success = false;
        this.totalCostUs = 0L;
        this.successCount = 0;
        this.fileDurationUs = 0L;
        this.framePerSecond = 0L;
    }

    public void setFileDurationUs(long j17) {
        this.fileDurationUs = j17;
    }

    public void setFramePerSecond(int i17) {
        this.framePerSecond = i17;
    }

    public void setTotalEncodeUs(long j17) {
        this.totalEncodeUs = j17;
    }

    public void setTotalRealDecodeUs(long j17) {
        this.totalRealDecodeUs = j17;
    }

    public void setTotalRenderUs(long j17) {
        this.totalRenderUs = j17;
    }

    public final void tickDecode(long j17) {
        this.totalDecodeUs += j17 / 1000;
    }

    public final void tickExport(long j17) {
        this.successCount++;
        this.totalCostUs += j17 / 1000;
    }

    public java.lang.String toString() {
        return "ExportReportSession{success=" + this.success + ", successCount=" + this.successCount + ", compositeTimeUs=" + this.compositeTimeUs + ", totalCostUs=" + getTotalCostUs() + ", totalDecodeUs=" + getTotalDecodeUs() + ", totalEncodeUs=" + getTotalEncodeUs() + ", totalRenderUs=" + getTotalRenderUs() + ", averageDecodeUs=" + getAverageDecodeUs() + ", averageEncodeUs=" + getAverageEncodeUs() + ", averageRenderUs=" + getAverageRenderUs() + '}';
    }
}
