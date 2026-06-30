package com.tencent.tav.core.parallel.info;

/* loaded from: classes15.dex */
public class PipelineIndicatorInfo {
    public com.tencent.tav.core.ExportErrorStatus errorStatus;
    private long exportEndTimeMs;
    private long exportStartTimeMs;
    private int index;
    public com.tencent.tav.coremedia.CMTimeRange timeRange;
    public int type;
    private int retryCount = 0;
    private com.tencent.tav.core.AssetParallelSegmentStatus segmentStatus = com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusUnknown;
    public com.tencent.tav.core.AVAssetReaderStatus readerStatus = com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusUnknown;
    public com.tencent.tav.core.AssetWriterStatus writerStatus = com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusUnknown;
    private float progress = 0.0f;

    public PipelineIndicatorInfo(int i17, int i18, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.type = i17;
        this.index = i18;
        this.timeRange = cMTimeRange;
    }

    public static com.tencent.tav.core.parallel.info.PipelineIndicatorInfo getAudioPipelineIndicatorInfo(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        return new com.tencent.tav.core.parallel.info.PipelineIndicatorInfo(2, 0, cMTimeRange);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tav.core.parallel.info.PipelineIndicatorInfo)) {
            return false;
        }
        com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo = (com.tencent.tav.core.parallel.info.PipelineIndicatorInfo) obj;
        return this.type == pipelineIndicatorInfo.type && this.index == pipelineIndicatorInfo.index;
    }

    public boolean finished() {
        return this.segmentStatus == com.tencent.tav.core.AssetParallelSegmentStatus.AssetReaderStatusWriteFinish;
    }

    public long getExportCostTimeMs() {
        return this.exportEndTimeMs - this.exportStartTimeMs;
    }

    public int getIndex() {
        return this.index;
    }

    public float getProgress() {
        return this.progress;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public com.tencent.tav.core.AssetParallelSegmentStatus getSegmentStatus() {
        return this.segmentStatus;
    }

    public void retry() {
        this.retryCount++;
        this.segmentStatus = com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusUnknown;
    }

    public void setCurrentTime(long j17) {
        this.progress = (((float) j17) * 1.0f) / ((float) this.timeRange.getDurationUs());
    }

    public void setProgress(float f17) {
        this.progress = f17;
    }

    public void setSegmentStatus(com.tencent.tav.core.AssetParallelSegmentStatus assetParallelSegmentStatus) {
        this.segmentStatus = assetParallelSegmentStatus;
        if (assetParallelSegmentStatus == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusStarted) {
            this.exportStartTimeMs = java.lang.System.currentTimeMillis();
        } else if (assetParallelSegmentStatus == com.tencent.tav.core.AssetParallelSegmentStatus.AssetReaderStatusWriteFinish || assetParallelSegmentStatus == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusFailed || assetParallelSegmentStatus == com.tencent.tav.core.AssetParallelSegmentStatus.AssetExportStatusCompleted || assetParallelSegmentStatus == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusCancelled) {
            this.exportEndTimeMs = java.lang.System.currentTimeMillis();
        }
    }

    public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "index:%d type:%d status:%s timeRange:%s", java.lang.Integer.valueOf(this.index), java.lang.Integer.valueOf(this.type), this.segmentStatus, this.timeRange);
    }

    public boolean unKnown() {
        return this.segmentStatus == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusUnknown;
    }
}
