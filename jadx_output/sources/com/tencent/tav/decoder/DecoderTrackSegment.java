package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class DecoderTrackSegment {
    private com.tencent.tav.coremedia.CMTime decoderStartTime;
    private com.tencent.tav.coremedia.CMTime scaledDuration;
    private com.tencent.tav.coremedia.CMTimeRange timeRange;
    private com.tencent.tav.decoder.DecoderAssetTrack videoAsset;

    public DecoderTrackSegment(long j17) {
        this(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, new com.tencent.tav.coremedia.CMTime(((float) j17) / 1000.0f)), (com.tencent.tav.decoder.DecoderAssetTrack) null);
    }

    public com.tencent.tav.coremedia.CMTime getDecoderStartTime() {
        return this.decoderStartTime;
    }

    public com.tencent.tav.coremedia.CMTime getScaledDuration() {
        return this.scaledDuration;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return this.timeRange;
    }

    public com.tencent.tav.decoder.DecoderAssetTrack getVideoAsset() {
        return this.videoAsset;
    }

    public void setScaledDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.scaledDuration = cMTime;
    }

    public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }

    public DecoderTrackSegment(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack) {
        this.videoAsset = decoderAssetTrack;
        this.timeRange = cMTimeRange;
        this.scaledDuration = cMTimeRange.getDuration();
        this.decoderStartTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
    }

    public DecoderTrackSegment(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.asset.AssetTrackSegment assetTrackSegment) {
        this(assetTrackSegment.getTimeMapping().getSource().m414clone(), com.tencent.tav.decoder.DecoderAssetTrack.create(assetTrack, assetTrackSegment));
        setScaledDuration(assetTrackSegment.getScaleDuration());
    }
}
