package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class CompositionTrack extends com.tencent.tav.asset.AssetTrack<com.tencent.tav.asset.CompositionTrackSegment> {
    protected java.util.List<com.tencent.tav.asset.CompositionTrackSegment> segments;

    public CompositionTrack() {
        this.segments = new java.util.ArrayList();
    }

    @Override // com.tencent.tav.asset.AssetTrack
    public java.util.List<com.tencent.tav.asset.CompositionTrackSegment> getSegments() {
        return this.segments;
    }

    public java.lang.String toString() {
        return "CompositionTrack{segments=" + this.segments + ", trackID=" + this.trackID + ", mediaType=" + this.mediaType + '}';
    }

    @Override // com.tencent.tav.asset.AssetTrack
    public com.tencent.tav.asset.CompositionTrackSegment segmentForTrackTime(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMTimeRange target;
        java.util.List<com.tencent.tav.asset.CompositionTrackSegment> list = this.segments;
        if (list == null) {
            return null;
        }
        for (com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment : list) {
            if (compositionTrackSegment != null && (target = compositionTrackSegment.getTimeMapping().getTarget()) != null && target.containsTime(cMTime) && (compositionTrackSegment instanceof com.tencent.tav.asset.CompositionTrackSegment)) {
                return compositionTrackSegment;
            }
        }
        return null;
    }

    public CompositionTrack(com.tencent.tav.asset.Asset asset, int i17, int i18, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        super(asset, i17, i18, cMTimeRange);
        this.segments = new java.util.ArrayList();
    }
}
