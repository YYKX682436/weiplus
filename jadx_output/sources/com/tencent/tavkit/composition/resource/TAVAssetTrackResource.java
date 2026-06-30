package com.tencent.tavkit.composition.resource;

/* loaded from: classes16.dex */
public class TAVAssetTrackResource extends com.tencent.tavkit.composition.resource.TAVResource {
    private com.tencent.tav.asset.Asset asset;

    public TAVAssetTrackResource(java.lang.String str) {
        this(new com.tencent.tav.asset.URLAsset(str));
    }

    public com.tencent.tav.asset.Asset getAsset() {
        return this.asset;
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    public com.tencent.tavkit.composition.resource.TrackInfo trackInfoForType(int i17, int i18) {
        com.tencent.tav.asset.AssetTrack assetTrack = tracksForType(i17).get(i18);
        com.tencent.tavkit.composition.resource.TrackInfo trackInfo = new com.tencent.tavkit.composition.resource.TrackInfo();
        trackInfo.setTrack(assetTrack);
        trackInfo.setSelectedTimeRange(getSourceTimeRange());
        trackInfo.setScaleToDuration(getScaledDuration());
        return trackInfo;
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    public java.util.List<com.tencent.tav.asset.AssetTrack> tracksForType(int i17) {
        com.tencent.tav.asset.Asset asset = this.asset;
        return asset != null ? asset.tracksWithMediaType(i17) : new java.util.ArrayList();
    }

    public TAVAssetTrackResource(com.tencent.tav.asset.Asset asset) {
        this.asset = asset;
        this.duration = asset.getDuration();
        this.sourceTimeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, asset.getDuration());
    }

    @Override // com.tencent.tavkit.composition.resource.TAVResource
    /* renamed from: clone */
    public com.tencent.tavkit.composition.resource.TAVResource mo423clone() {
        com.tencent.tavkit.composition.resource.TAVAssetTrackResource tAVAssetTrackResource = new com.tencent.tavkit.composition.resource.TAVAssetTrackResource(this.asset);
        tAVAssetTrackResource.sourceTimeRange = this.sourceTimeRange.m414clone();
        tAVAssetTrackResource.scaledDuration = this.scaledDuration.m413clone();
        tAVAssetTrackResource.duration = this.duration.m413clone();
        return tAVAssetTrackResource;
    }
}
