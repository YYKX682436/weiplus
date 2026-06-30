package com.tencent.tavkit.composition.resource;

/* loaded from: classes16.dex */
public class TAVImageTrackResource extends com.tencent.tavkit.composition.resource.TAVResource {
    private boolean emptyAudioTrack;
    private java.lang.String path;

    public TAVImageTrackResource(java.lang.String str, com.tencent.tav.coremedia.CMTime cMTime) {
        this(str, cMTime, true);
    }

    public java.lang.String getPath() {
        return this.path;
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    public com.tencent.tavkit.ciimage.CIImage imageAtTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CGSize cGSize) {
        return null;
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    public com.tencent.tavkit.composition.resource.TrackInfo trackInfoForType(int i17, int i18) {
        if (i17 != 1 && !this.emptyAudioTrack) {
            return null;
        }
        if (i17 == 1) {
            i17 = 3;
        }
        java.lang.String str = this.path;
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.sourceTimeRange;
        com.tencent.tav.asset.CompositionTrackSegment compositionTrackSegment = new com.tencent.tav.asset.CompositionTrackSegment(str, 0, cMTimeRange, cMTimeRange, i17);
        com.tencent.tavkit.composition.resource.TrackInfo trackInfo = new com.tencent.tavkit.composition.resource.TrackInfo();
        trackInfo.setCompositionTrackSegment(compositionTrackSegment);
        trackInfo.setSelectedTimeRange(getSourceTimeRange());
        trackInfo.setScaleToDuration(getScaledDuration());
        return trackInfo;
    }

    public TAVImageTrackResource(java.lang.String str, com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        this.path = str;
        this.emptyAudioTrack = z17;
        this.duration = cMTime;
        this.sourceTimeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTime);
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    /* renamed from: clone */
    public com.tencent.tavkit.composition.resource.TAVImageTrackResource mo423clone() {
        com.tencent.tavkit.composition.resource.TAVImageTrackResource tAVImageTrackResource = new com.tencent.tavkit.composition.resource.TAVImageTrackResource(this.path, this.duration.m413clone());
        tAVImageTrackResource.sourceTimeRange = this.sourceTimeRange.m414clone();
        tAVImageTrackResource.scaledDuration = this.scaledDuration.m413clone();
        return tAVImageTrackResource;
    }
}
