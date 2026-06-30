package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class AssetTrackSegment {
    protected boolean empty;
    protected com.tencent.tav.coremedia.CMTime scaleDuration;
    protected com.tencent.tav.coremedia.CMTimeMapping timeMapping;
    protected com.tencent.tav.coremedia.CMTimeRange timeRange;

    public AssetTrackSegment() {
        this.scaleDuration = com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }

    public com.tencent.tav.coremedia.CMTime getScaleDuration() {
        return this.scaleDuration;
    }

    public com.tencent.tav.coremedia.CMTimeMapping getTimeMapping() {
        return this.timeMapping;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public AssetTrackSegment(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2) {
        this.scaleDuration = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.timeMapping = new com.tencent.tav.coremedia.CMTimeMapping(cMTimeRange, cMTimeRange2);
        this.scaleDuration = cMTimeRange2.getDuration().m413clone();
        this.timeRange = cMTimeRange2.m414clone();
    }
}
