package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class CompositionTrackSegment extends com.tencent.tav.asset.AssetTrackSegment {
    private java.lang.String sourcePath;
    private int sourceTrackID;
    private int sourceType;
    private java.net.URL url;

    public CompositionTrackSegment(java.lang.String str, int i17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2, int i18) {
        super(cMTimeRange, cMTimeRange2);
        this.sourcePath = str;
        this.sourceType = i18;
        this.sourceTrackID = i17;
        this.empty = false;
    }

    public java.lang.String getSourcePath() {
        return this.sourcePath;
    }

    public int getSourceTrackID() {
        return this.sourceTrackID;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public java.net.URL getUrl() {
        return this.url;
    }

    public java.lang.String toString() {
        return "CompositionTrackSegment{sourcePath='" + this.sourcePath + "', sourceTrackID=" + this.sourceTrackID + ", timeMapping=" + this.timeMapping + '}';
    }

    public void updateTargetTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.scaleDuration = cMTimeRange.getDuration().m413clone();
        this.timeRange = cMTimeRange.m414clone();
        this.timeMapping.setTarget(cMTimeRange);
    }

    public CompositionTrackSegment(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        super(cMTimeRange, cMTimeRange);
        this.empty = true;
    }
}
