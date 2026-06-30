package com.tencent.tavkit.composition.audio;

/* loaded from: classes16.dex */
public class TAVAudioMixInputParameters extends com.tencent.tav.core.MutableAudioMixInputParameters {
    private static final java.lang.String TAG = "TAVAudioMixInputParameters";
    private java.util.List<com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment> audioConfigurationSegmentList;

    public TAVAudioMixInputParameters(com.tencent.tav.asset.AssetTrack assetTrack) {
        super(assetTrack);
        this.audioConfigurationSegmentList = new java.util.ArrayList();
    }

    public void addAudioConfiguration(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tavkit.composition.model.TAVAudioConfiguration tAVAudioConfiguration) {
        this.audioConfigurationSegmentList.add(new com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment(cMTimeRange, tAVAudioConfiguration));
    }

    public java.util.List<com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment> getAudioConfigurationSegmentList() {
        return this.audioConfigurationSegmentList;
    }

    @Override // com.tencent.tav.core.AudioMixInputParameters
    public float getVolumeAtTime(com.tencent.tav.coremedia.CMTime cMTime) {
        for (com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment tAVAudioConfigurationSegment : this.audioConfigurationSegmentList) {
            if (tAVAudioConfigurationSegment != null && tAVAudioConfigurationSegment.compositionTimeRange.containsTime(cMTime)) {
                return (tAVAudioConfigurationSegment.audioConfiguration.getStartVolumeEdge() == null || !tAVAudioConfigurationSegment.compositionTimeRange.getStart().add(tAVAudioConfigurationSegment.audioConfiguration.getStartVolumeEdge().getDuration()).bigThan(cMTime)) ? (tAVAudioConfigurationSegment.audioConfiguration.getEndVolumeEdge() == null || !tAVAudioConfigurationSegment.compositionTimeRange.getEnd().sub(tAVAudioConfigurationSegment.audioConfiguration.getEndVolumeEdge().getDuration()).smallThan(cMTime)) ? tAVAudioConfigurationSegment.audioConfiguration.getVolume(cMTime) : tAVAudioConfigurationSegment.audioConfiguration.getEndVolumeEdge().getVolume(cMTime.sub(tAVAudioConfigurationSegment.compositionTimeRange.getEnd().sub(tAVAudioConfigurationSegment.audioConfiguration.getEndVolumeEdge().getDuration()))) : tAVAudioConfigurationSegment.audioConfiguration.getStartVolumeEdge().getVolume(cMTime.sub(tAVAudioConfigurationSegment.compositionTimeRange.getStart()));
            }
        }
        com.tencent.tav.decoder.logger.Logger.e(TAG, "没有设置正确audioConfiguration，走到了非预想的分支");
        return super.getVolumeAtTime(cMTime);
    }

    public void setAudioConfigurationSegments(java.util.List<com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment> list) {
        this.audioConfigurationSegmentList.clear();
        this.audioConfigurationSegmentList.addAll(list);
    }
}
