package com.tencent.tavkit.composition.resource;

/* loaded from: classes16.dex */
public class TAVEmptyResource extends com.tencent.tavkit.composition.resource.TAVResource {
    private boolean insertTimeRange;

    public TAVEmptyResource(com.tencent.tav.coremedia.CMTime cMTime) {
        this(cMTime, true);
    }

    public void setInsertTimeRange(boolean z17) {
        this.insertTimeRange = z17;
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    public com.tencent.tavkit.composition.resource.TrackInfo trackInfoForType(int i17, int i18) {
        if (this.insertTimeRange) {
            return super.trackInfoForType(i17, i18);
        }
        return null;
    }

    public TAVEmptyResource(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        this.insertTimeRange = z17;
        this.duration = cMTime;
        this.sourceTimeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTime);
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    /* renamed from: clone */
    public com.tencent.tavkit.composition.resource.TAVResource mo423clone() {
        com.tencent.tavkit.composition.resource.TAVEmptyResource tAVEmptyResource = new com.tencent.tavkit.composition.resource.TAVEmptyResource(this.duration.m413clone());
        tAVEmptyResource.sourceTimeRange = this.sourceTimeRange.m414clone();
        tAVEmptyResource.scaledDuration = this.scaledDuration.m413clone();
        return tAVEmptyResource;
    }
}
