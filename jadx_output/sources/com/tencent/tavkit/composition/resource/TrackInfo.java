package com.tencent.tavkit.composition.resource;

/* loaded from: classes16.dex */
public class TrackInfo {
    private com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment;
    private com.tencent.tav.coremedia.CMTime scaleToDuration;
    private com.tencent.tav.coremedia.CMTimeRange selectedTimeRange;
    private com.tencent.tav.asset.AssetTrack track;

    public com.tencent.tav.asset.CompositionTrackSegment getCompositionTrackSegment(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        return new com.tencent.tav.asset.CompositionTrackSegment(this.compositionTrackSegment.getSourcePath(), this.compositionTrackSegment.getSourceTrackID(), this.compositionTrackSegment.getTimeMapping().getSource(), cMTimeRange, this.compositionTrackSegment.getSourceType());
    }

    public int getMediaType() {
        com.tencent.tav.asset.AssetTrack assetTrack = this.track;
        if (assetTrack != null) {
            return assetTrack.getMediaType();
        }
        com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment = this.compositionTrackSegment;
        if (compositionTrackSegment == null) {
            return 0;
        }
        int sourceType = compositionTrackSegment.getSourceType();
        if (sourceType == 3) {
            return 1;
        }
        return sourceType;
    }

    public com.tencent.tav.coremedia.CMTime getScaleToDuration() {
        return this.scaleToDuration;
    }

    public com.tencent.tav.coremedia.CMTimeRange getSelectedTimeRange() {
        return this.selectedTimeRange;
    }

    public com.tencent.tav.asset.AssetTrack getTrack() {
        return this.track;
    }

    public void setCompositionTrackSegment(com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment) {
        this.compositionTrackSegment = compositionTrackSegment;
    }

    public void setScaleToDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.scaleToDuration = cMTime;
    }

    public void setSelectedTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.selectedTimeRange = cMTimeRange;
    }

    public void setTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.track = assetTrack;
    }
}
