package com.tencent.tavkit.composition.builder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class AudioParamsBuilder {
    private java.util.HashMap<java.lang.Integer, com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters> audioMixInputParametersHashMap = new java.util.HashMap<>();
    private final com.tencent.tavkit.composition.builder.BuilderModel builderModel;

    public AudioParamsBuilder(com.tencent.tavkit.composition.builder.BuilderModel builderModel) {
        this.builderModel = builderModel;
    }

    private void buildAudioParametersByTrackInfo(com.tencent.tavkit.composition.builder.AudioParamsInfo audioParamsInfo) {
        for (com.tencent.tavkit.composition.builder.AudioInfo audioInfo : audioParamsInfo.audioInfos) {
            int trackID = audioInfo.compositionTrack.getTrackID();
            com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters tAVAudioMixInputParameters = this.audioMixInputParametersHashMap.get(java.lang.Integer.valueOf(trackID));
            if (tAVAudioMixInputParameters == null) {
                tAVAudioMixInputParameters = new com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters(audioInfo.compositionTrack);
                this.audioMixInputParametersHashMap.put(java.lang.Integer.valueOf(trackID), tAVAudioMixInputParameters);
            }
            tAVAudioMixInputParameters.addAudioConfiguration(new com.tencent.tav.coremedia.CMTimeRange(audioInfo.audio.getStartTime(), audioInfo.audio.getDuration()), audioInfo.audio.getAudioConfiguration());
            tAVAudioMixInputParameters.setAudioTapProcessor(new com.tencent.tavkit.composition.audio.TAVAudioTapProcessor(tAVAudioMixInputParameters.getAudioConfigurationSegmentList()));
        }
    }

    private void buildBgAudioInputParameters() {
        for (com.tencent.tavkit.composition.builder.AudioMixInfo audioMixInfo : this.builderModel.getAudioTrackInfo()) {
            int trackID = audioMixInfo.track.getTrackID();
            com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters tAVAudioMixInputParameters = this.audioMixInputParametersHashMap.get(java.lang.Integer.valueOf(trackID));
            if (tAVAudioMixInputParameters == null) {
                tAVAudioMixInputParameters = new com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters(audioMixInfo.track);
                this.audioMixInputParametersHashMap.put(java.lang.Integer.valueOf(trackID), tAVAudioMixInputParameters);
            }
            tAVAudioMixInputParameters.addAudioConfiguration(new com.tencent.tav.coremedia.CMTimeRange(audioMixInfo.audio.getStartTime(), audioMixInfo.audio.getDuration()), audioMixInfo.audio.getAudioConfiguration());
            tAVAudioMixInputParameters.setAudioTapProcessor(new com.tencent.tavkit.composition.audio.TAVAudioTapProcessor(tAVAudioMixInputParameters.getAudioConfigurationSegmentList()));
        }
    }

    private void buildMainAudioInputParameters() {
        java.util.List<com.tencent.tavkit.composition.builder.AudioParamsInfo> mainAudioTrackInfo = this.builderModel.getMainAudioTrackInfo();
        for (int i17 = 0; i17 < mainAudioTrackInfo.size(); i17++) {
            buildAudioParametersByTrackInfo(mainAudioTrackInfo.get(i17));
        }
    }

    public java.util.List<com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters> build() {
        buildMainAudioInputParameters();
        buildBgAudioInputParameters();
        return new java.util.ArrayList(this.audioMixInputParametersHashMap.values());
    }
}
