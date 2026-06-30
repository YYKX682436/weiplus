package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class MutableAudioMixInputParameters extends com.tencent.tav.core.AudioMixInputParameters {
    public MutableAudioMixInputParameters(com.tencent.tav.asset.AssetTrack assetTrack, java.lang.String str) {
        super(assetTrack.getTrackID(), str);
    }

    public void setAudioTapProcessor(com.tencent.tav.core.AudioTapProcessor audioTapProcessor) {
        this.audioTapProcessor = audioTapProcessor;
    }

    public void setAudioTimePitchAlgorithm(java.lang.String str) {
        this.audioTimePitchAlgorithm = str;
    }

    public void setTrackID(int i17) {
        this.trackID = i17;
    }

    public void setVolumeAtTime(float f17, com.tencent.tav.coremedia.CMTime cMTime) {
    }

    public void setVolumeForTimeRange(float f17) {
        java.util.Iterator<com.tencent.tav.core.AudioMixInputParameters.VolumeRange> it = this.volumeRanges.iterator();
        while (it.hasNext()) {
            com.tencent.tav.core.AudioMixInputParameters.VolumeRange next = it.next();
            next.startVolume = f17;
            next.endVolume = f17;
        }
    }

    public void setVolumeRampForTimeRange(float f17, float f18, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.core.AudioMixInputParameters.VolumeRange volumeRange = new com.tencent.tav.core.AudioMixInputParameters.VolumeRange();
        volumeRange.timeRange = cMTimeRange;
        volumeRange.startVolume = f17;
        volumeRange.endVolume = f18;
        this.volumeRanges.add(0, volumeRange);
    }

    public MutableAudioMixInputParameters(com.tencent.tav.asset.AssetTrack assetTrack) {
        super(assetTrack.getTrackID(), "");
    }

    public void setVolumeForTimeRange(float f17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        setVolumeRampForTimeRange(f17, f17, cMTimeRange);
    }
}
