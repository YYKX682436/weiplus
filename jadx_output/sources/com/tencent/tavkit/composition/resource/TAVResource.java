package com.tencent.tavkit.composition.resource;

/* loaded from: classes16.dex */
public abstract class TAVResource implements java.lang.Cloneable {
    protected com.tencent.tav.coremedia.CMTime duration;
    protected com.tencent.tav.coremedia.CMTime scaledDuration;
    protected com.tencent.tav.coremedia.CMTimeRange sourceTimeRange;

    public TAVResource() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.duration = cMTime;
        this.sourceTimeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTime);
        this.scaledDuration = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public abstract com.tencent.tavkit.composition.resource.TAVResource mo423clone();

    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.duration;
    }

    public com.tencent.tav.coremedia.CMTime getScaledDuration() {
        return this.scaledDuration.equals(com.tencent.tav.coremedia.CMTime.CMTimeInvalid) ? this.sourceTimeRange.getDuration() : this.scaledDuration;
    }

    public com.tencent.tav.coremedia.CMTimeRange getSourceTimeRange() {
        return this.sourceTimeRange;
    }

    public com.tencent.tavkit.ciimage.CIImage imageAtTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CGSize cGSize) {
        return null;
    }

    public com.tencent.tavkit.composition.resource.TrackInfo newEmptyTrackInfo(int i17, int i18) {
        com.tencent.tav.asset.AssetTrack assetTrack = tracksForType(i17).get(i18);
        com.tencent.tavkit.composition.resource.TrackInfo trackInfo = new com.tencent.tavkit.composition.resource.TrackInfo();
        trackInfo.setTrack(assetTrack);
        trackInfo.setSelectedTimeRange(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, new com.tencent.tav.coremedia.CMTime(1L, 30)));
        trackInfo.setScaleToDuration(getScaledDuration());
        return trackInfo;
    }

    public void setDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.duration = cMTime;
    }

    public void setScaledDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.scaledDuration = cMTime;
    }

    public void setSourceTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.sourceTimeRange = cMTimeRange.m414clone();
    }

    public java.lang.String toString() {
        return "TAVResource{durationUs=" + this.duration.getTimeUs() + ", sourceTimeRange=" + this.sourceTimeRange.toSimpleString() + ", scaledDurationUs=" + this.scaledDuration.getTimeUs() + '}';
    }

    public com.tencent.tavkit.composition.resource.TrackInfo trackInfoForType(int i17, int i18) {
        return newEmptyTrackInfo(i17, i18);
    }

    public java.util.List<com.tencent.tav.asset.AssetTrack> tracksForType(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.tav.asset.MutableCompositionTrack addMutableTrackWithMediaType = new com.tencent.tav.asset.MutableComposition().addMutableTrackWithMediaType(i17, 0);
        addMutableTrackWithMediaType.insertEmptyTimeRange(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, this.duration));
        arrayList.add(addMutableTrackWithMediaType);
        return arrayList;
    }
}
