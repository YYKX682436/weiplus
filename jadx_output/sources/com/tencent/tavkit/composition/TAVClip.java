package com.tencent.tavkit.composition;

/* loaded from: classes16.dex */
public class TAVClip implements com.tencent.tavkit.composition.model.TAVTransitionableVideo, com.tencent.tavkit.composition.model.TAVTransitionableAudio, java.lang.Cloneable {
    private final java.lang.String TAG;
    private com.tencent.tavkit.composition.model.TAVAudioConfiguration audioConfiguration;
    private java.util.HashMap<java.lang.String, java.lang.Object> extraTrackInfoMap;
    private com.tencent.tavkit.composition.resource.TAVResource resource;
    private com.tencent.tav.coremedia.CMTime startTime;
    private com.tencent.tavkit.composition.model.TAVTransition transition;
    private com.tencent.tavkit.composition.model.TAVVideoConfiguration videoConfiguration;

    public TAVClip() {
        this.TAG = "TAVClip@" + java.lang.Integer.toHexString(hashCode());
        this.extraTrackInfoMap = new java.util.HashMap<>();
        this.startTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.audioConfiguration = new com.tencent.tavkit.composition.model.TAVAudioConfiguration();
        this.videoConfiguration = new com.tencent.tavkit.composition.model.TAVVideoConfiguration();
    }

    @Override // com.tencent.tavkit.composition.model.TAVAudioCompositionTrack
    public com.tencent.tav.asset.CompositionTrack audioCompositionTrackForComposition(com.tencent.tav.asset.MutableComposition mutableComposition, int i17, boolean z17) {
        com.tencent.tavkit.composition.resource.TrackInfo trackInfoForType = this.resource.trackInfoForType(2, i17);
        if (trackInfoForType == null) {
            return null;
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = new com.tencent.tav.coremedia.CMTimeRange(this.startTime, trackInfoForType.getScaleToDuration());
        com.tencent.tav.asset.MutableCompositionTrack mutableTrackCompatibleWithTimeRange = z17 ? com.tencent.tavkit.utils.CompositionUtils.mutableTrackCompatibleWithTimeRange(mutableComposition, cMTimeRange, 2) : null;
        if (mutableTrackCompatibleWithTimeRange == null && trackInfoForType.getMediaType() != 0) {
            mutableTrackCompatibleWithTimeRange = mutableComposition.addMutableTrackWithMediaType(trackInfoForType.getMediaType(), 0);
        }
        if (mutableTrackCompatibleWithTimeRange != null) {
            com.tencent.tavkit.utils.CompositionUtils.insertTimeRangeToTrack(trackInfoForType, mutableTrackCompatibleWithTimeRange, cMTimeRange);
        }
        return mutableTrackCompatibleWithTimeRange;
    }

    public void fitToSpeed(float f17) {
        if (f17 == 0.0f) {
            return;
        }
        this.resource.setScaledDuration(this.resource.getSourceTimeRange().getDuration().multi(1.0f / f17));
    }

    @Override // com.tencent.tavkit.composition.model.TAVAudio
    public com.tencent.tavkit.composition.model.TAVAudioConfiguration getAudioConfiguration() {
        return this.audioConfiguration;
    }

    @Override // com.tencent.tavkit.composition.model.TAVTransitionableAudio
    public com.tencent.tavkit.composition.audio.TAVAudioTransition getAudioTransition() {
        com.tencent.tavkit.composition.model.TAVTransition tAVTransition = this.transition;
        if (tAVTransition != null) {
            return tAVTransition.getAudioTransition();
        }
        return null;
    }

    @Override // com.tencent.tavkit.composition.model.TAVCompositionTimeRange
    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.resource.getScaledDuration();
    }

    @Override // com.tencent.tavkit.composition.model.TAVVideoCompositionTrack
    public java.lang.Object getExtraTrackInfo(java.lang.String str) {
        return this.extraTrackInfoMap.get(str);
    }

    public com.tencent.tavkit.composition.resource.TAVResource getResource() {
        return this.resource;
    }

    @Override // com.tencent.tavkit.composition.model.TAVCompositionTimeRange
    public com.tencent.tav.coremedia.CMTime getStartTime() {
        return this.startTime;
    }

    public com.tencent.tav.coremedia.CMTimeRange getTargetTimeRange() {
        return new com.tencent.tav.coremedia.CMTimeRange(this.startTime, getDuration());
    }

    @Override // com.tencent.tavkit.composition.model.TAVCompositionTimeRange
    public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
        return getTargetTimeRange();
    }

    public com.tencent.tavkit.composition.model.TAVTransition getTransition() {
        return this.transition;
    }

    @Override // com.tencent.tavkit.composition.model.TAVVideo
    public com.tencent.tavkit.composition.model.TAVVideoConfiguration getVideoConfiguration() {
        return this.videoConfiguration;
    }

    @Override // com.tencent.tavkit.composition.model.TAVTransitionableVideo
    public com.tencent.tavkit.composition.video.TAVVideoTransition getVideoTransition() {
        com.tencent.tavkit.composition.model.TAVTransition tAVTransition = this.transition;
        if (tAVTransition != null) {
            return tAVTransition.getVideoTransition();
        }
        return null;
    }

    @Override // com.tencent.tavkit.composition.model.TAVAudioCompositionTrack
    public int numberOfAudioTracks() {
        return this.resource.tracksForType(2).size();
    }

    @Override // com.tencent.tavkit.composition.model.TAVVideoCompositionTrack
    public int numberOfVideoTracks() {
        return this.resource.tracksForType(1).size();
    }

    @Override // com.tencent.tavkit.composition.model.TAVVideoCompositionTrack
    public void putExtraTrackInfo(java.lang.String str, java.lang.Object obj) {
        this.extraTrackInfoMap.put(str, obj);
    }

    public void setAudioConfiguration(com.tencent.tavkit.composition.model.TAVAudioConfiguration tAVAudioConfiguration) {
        this.audioConfiguration = tAVAudioConfiguration;
    }

    @Override // com.tencent.tavkit.composition.model.TAVCompositionTimeRange
    public void setDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.resource.setScaledDuration(cMTime);
    }

    public void setResource(com.tencent.tavkit.composition.resource.TAVResource tAVResource) {
        this.resource = tAVResource;
    }

    @Override // com.tencent.tavkit.composition.model.TAVCompositionTimeRange
    public void setStartTime(com.tencent.tav.coremedia.CMTime cMTime) {
        this.startTime = cMTime;
        com.tencent.tavkit.composition.model.TAVVideoConfiguration tAVVideoConfiguration = this.videoConfiguration;
        if (tAVVideoConfiguration != null) {
            tAVVideoConfiguration.updateTimeRange(getTimeRange());
        }
    }

    public void setTransition(com.tencent.tavkit.composition.model.TAVTransition tAVTransition) {
        this.transition = tAVTransition;
    }

    public void setVideoConfiguration(com.tencent.tavkit.composition.model.TAVVideoConfiguration tAVVideoConfiguration) {
        this.videoConfiguration = tAVVideoConfiguration;
    }

    @Override // com.tencent.tavkit.composition.model.TAVVideoCompositionTrack
    public com.tencent.tavkit.ciimage.CIImage sourceImageAtTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CGSize cGSize) {
        return this.resource.imageAtTime(cMTime, cGSize);
    }

    public java.lang.String toString() {
        return "TAVClip{resource=" + this.resource + ", videoConfiguration=" + this.videoConfiguration + ", startTime=" + this.startTime + ", transition=" + this.transition + ", extraTrackInfoMap=" + this.extraTrackInfoMap + '}';
    }

    @Override // com.tencent.tavkit.composition.model.TAVVideoCompositionTrack
    public com.tencent.tav.asset.CompositionTrack videoCompositionTrackForComposition(com.tencent.tav.asset.MutableComposition mutableComposition, int i17, boolean z17) {
        com.tencent.tavkit.composition.resource.TrackInfo trackInfoForType = this.resource.trackInfoForType(1, i17);
        if (trackInfoForType == null) {
            return null;
        }
        com.tencent.tav.coremedia.CMTimeRange cMTimeRange = new com.tencent.tav.coremedia.CMTimeRange(this.startTime, trackInfoForType.getScaleToDuration());
        com.tencent.tav.asset.MutableCompositionTrack mutableTrackCompatibleWithTimeRange = z17 ? com.tencent.tavkit.utils.CompositionUtils.mutableTrackCompatibleWithTimeRange(mutableComposition, cMTimeRange, 1) : null;
        if (mutableTrackCompatibleWithTimeRange == null && trackInfoForType.getMediaType() != 0) {
            mutableTrackCompatibleWithTimeRange = mutableComposition.addMutableTrackWithMediaType(trackInfoForType.getMediaType(), -1);
        }
        if (mutableTrackCompatibleWithTimeRange != null) {
            com.tencent.tavkit.utils.CompositionUtils.insertTimeRangeToTrack(trackInfoForType, mutableTrackCompatibleWithTimeRange, cMTimeRange);
        }
        return mutableTrackCompatibleWithTimeRange;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tavkit.composition.TAVClip m420clone() {
        com.tencent.tavkit.composition.TAVClip tAVClip = new com.tencent.tavkit.composition.TAVClip();
        tAVClip.resource = this.resource.mo423clone();
        tAVClip.videoConfiguration = this.videoConfiguration.m422clone();
        tAVClip.audioConfiguration = this.audioConfiguration.m421clone();
        com.tencent.tavkit.composition.model.TAVTransition tAVTransition = this.transition;
        if (tAVTransition != null) {
            tAVClip.transition = tAVTransition;
        }
        tAVClip.extraTrackInfoMap = new java.util.HashMap<>(this.extraTrackInfoMap);
        return tAVClip;
    }

    public TAVClip(com.tencent.tavkit.composition.resource.TAVResource tAVResource) {
        this();
        this.resource = tAVResource;
    }

    public TAVClip(com.tencent.tav.asset.Asset asset) {
        this(new com.tencent.tavkit.composition.resource.TAVAssetTrackResource(asset));
    }

    public TAVClip(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tav.coremedia.CMTime cMTime) {
        this(new com.tencent.tavkit.composition.resource.TAVImageResource(cIImage, cMTime));
    }

    public TAVClip(com.tencent.tav.coremedia.CMTime cMTime) {
        this(cMTime, false);
    }

    public TAVClip(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        this(new com.tencent.tavkit.composition.resource.TAVEmptyResource(cMTime, z17));
    }
}
