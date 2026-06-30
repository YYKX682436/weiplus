package com.tencent.tavkit.composition.resource;

/* loaded from: classes16.dex */
public class TAVImageResource extends com.tencent.tavkit.composition.resource.TAVResource {
    private java.util.HashMap<java.lang.Thread, com.tencent.tavkit.ciimage.CIImage> ciImageHashMap;
    private boolean emptyAudioTrack;
    private com.tencent.tavkit.ciimage.CIImage image;

    public TAVImageResource(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tav.coremedia.CMTime cMTime) {
        this(cIImage, cMTime, false);
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    public com.tencent.tavkit.ciimage.CIImage imageAtTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CGSize cGSize) {
        com.tencent.tav.coremedia.CMTime cMTime2 = this.scaledDuration;
        com.tencent.tav.coremedia.CMTime cMTime3 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        if (cMTime2.bigThan(cMTime3)) {
            if (cMTime.smallThan(cMTime3) || cMTime.bigThan(this.scaledDuration)) {
                return null;
            }
        } else if (!this.sourceTimeRange.containsTime(cMTime)) {
            return null;
        }
        if (this.image == null) {
            return null;
        }
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        com.tencent.tavkit.ciimage.CIImage cIImage = this.ciImageHashMap.get(currentThread);
        if (cIImage == null) {
            cIImage = this.image.simpleClone();
            this.ciImageHashMap.put(currentThread, cIImage);
        }
        cIImage.reset();
        return cIImage;
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    public com.tencent.tavkit.composition.resource.TrackInfo trackInfoForType(int i17, int i18) {
        if (i17 == 1) {
            return newEmptyTrackInfo(i17, i18);
        }
        if (this.emptyAudioTrack && i17 == 2) {
            return newEmptyTrackInfo(i17, i18);
        }
        return null;
    }

    public TAVImageResource(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        this.ciImageHashMap = new java.util.HashMap<>();
        this.image = cIImage;
        this.duration = cMTime;
        this.sourceTimeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTime);
        this.emptyAudioTrack = z17;
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    /* renamed from: clone */
    public com.tencent.tavkit.composition.resource.TAVResource mo423clone() {
        com.tencent.tavkit.composition.resource.TAVImageResource tAVImageResource = new com.tencent.tavkit.composition.resource.TAVImageResource(this.image, this.duration.m413clone(), this.emptyAudioTrack);
        tAVImageResource.sourceTimeRange = this.sourceTimeRange.m414clone();
        tAVImageResource.scaledDuration = this.scaledDuration.m413clone();
        tAVImageResource.ciImageHashMap = this.ciImageHashMap;
        return tAVImageResource;
    }
}
