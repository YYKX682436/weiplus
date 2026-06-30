package com.tencent.tav.core;

/* loaded from: classes16.dex */
public abstract class AssetReaderOutput {
    protected int mediaType;
    private com.tencent.tav.core.AssetReaderOutput.StatusListener statusListener;
    protected com.tencent.tav.coremedia.CMTimeRange timeRange;
    protected boolean alwaysCopiesSampleData = false;
    protected boolean supportsRandomAccess = false;
    protected com.tencent.tav.decoder.logger.WXLogger logger = new com.tencent.tav.decoder.logger.WXLogger();

    /* loaded from: classes16.dex */
    public interface StatusListener {
        void statusChanged(com.tencent.tav.core.AssetReaderOutput assetReaderOutput, com.tencent.tav.core.AVAssetReaderStatus aVAssetReaderStatus);
    }

    public void addStatusListener(com.tencent.tav.core.AssetReaderOutput.StatusListener statusListener) {
        this.statusListener = statusListener;
    }

    public final com.tencent.tav.coremedia.CMSampleBuffer copyNextSampleBuffer(boolean z17) {
        com.tencent.tav.coremedia.CMSampleBuffer nextSampleBuffer = nextSampleBuffer(z17);
        if (nextSampleBuffer.getTime().getTimeUs() > 0) {
            return nextSampleBuffer;
        }
        if (nextSampleBuffer.getState().getStateCode() == -1) {
            com.tencent.tav.core.AssetReaderOutput.StatusListener statusListener = this.statusListener;
            if (statusListener != null) {
                statusListener.statusChanged(this, com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusCompleted);
            }
            return nextSampleBuffer;
        }
        com.tencent.tav.core.AssetReaderOutput.StatusListener statusListener2 = this.statusListener;
        if (statusListener2 != null) {
            statusListener2.statusChanged(this, com.tencent.tav.core.AVAssetReaderStatus.AssetReaderStatusFailed);
        }
        return nextSampleBuffer;
    }

    public long duration() {
        return 0L;
    }

    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return null;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public boolean isAlwaysCopiesSampleData() {
        return this.alwaysCopiesSampleData;
    }

    public boolean isSupportsRandomAccess() {
        return this.supportsRandomAccess;
    }

    public abstract void markConfigurationAsFinal();

    public abstract com.tencent.tav.coremedia.CMSampleBuffer nextSampleBuffer(boolean z17);

    public abstract void release();

    public void reset(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
    }

    public abstract void resetForReadingTimeRanges(java.util.List<com.tencent.tav.coremedia.CMTimeRange> list);

    public void setAlwaysCopiesSampleData(boolean z17) {
        this.alwaysCopiesSampleData = z17;
    }

    public void setLoggerConfig(com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig) {
        this.logger.setConfig(wXLoggerConfig);
    }

    public void setSupportsRandomAccess(boolean z17) {
        this.supportsRandomAccess = z17;
    }

    public void start(com.tencent.tav.core.IContextCreate iContextCreate, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }
}
