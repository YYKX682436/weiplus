package com.tencent.tavkit.composition.builder;

/* loaded from: classes16.dex */
public class TAVCompositionBuilder {
    private static final java.lang.String TAG = "TAVCompositionBuilder";
    private final com.tencent.tavkit.composition.builder.BuilderModel builderModel;
    private boolean isVideoTracksMerge = true;
    private boolean isAudioTracksMerge = true;
    private boolean isReloadChannels = true;

    public TAVCompositionBuilder(com.tencent.tavkit.composition.TAVComposition tAVComposition) {
        this.builderModel = new com.tencent.tavkit.composition.builder.BuilderModel(tAVComposition);
    }

    private com.tencent.tav.core.AudioMix<? extends com.tencent.tav.core.AudioMixInputParameters> buildAudioMix() {
        java.util.List<com.tencent.tavkit.composition.audio.TAVAudioMixInputParameters> build = new com.tencent.tavkit.composition.builder.AudioParamsBuilder(this.builderModel).build();
        if (build.size() == 0) {
            return null;
        }
        return new com.tencent.tav.core.MutableAudioMix(build);
    }

    private com.tencent.tav.asset.Asset buildComposition() {
        if (this.isReloadChannels) {
            reloadChannels();
        }
        return new com.tencent.tavkit.composition.builder.CompositionBuilder(this.builderModel, this.isVideoTracksMerge, this.isAudioTracksMerge).build();
    }

    private com.tencent.tav.core.composition.VideoComposition buildVideoComposition() {
        com.tencent.tav.core.composition.MutableVideoComposition mutableVideoComposition = new com.tencent.tav.core.composition.MutableVideoComposition();
        mutableVideoComposition.setFrameDuration(new com.tencent.tav.coremedia.CMTime(1L, 30));
        mutableVideoComposition.setRenderSize(this.builderModel.getRenderSize());
        mutableVideoComposition.setRenderLayoutMode(this.builderModel.getRenderLayoutMode());
        mutableVideoComposition.setCustomVideoCompositorClass(com.tencent.tavkit.composition.video.TAVVideoCompositing.class);
        mutableVideoComposition.setInstructions(new com.tencent.tavkit.composition.builder.VideoInstructionsBuilder(this.builderModel).build());
        return mutableVideoComposition;
    }

    private void reloadChannels() {
        java.util.Iterator<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo>> it = this.builderModel.getVideoChannels().iterator();
        while (it.hasNext()) {
            com.tencent.tavkit.utils.CompositionUtils.reloadVideoStartTimeWithTransitionableVideo(it.next());
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "buildComposition: reloadVideoChannels = " + this.builderModel.getVideoChannels());
        java.util.Iterator<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio>> it6 = this.builderModel.getAudioChannels().iterator();
        while (it6.hasNext()) {
            com.tencent.tavkit.utils.CompositionUtils.reloadAudioStartTimeWithTransitionableAudio(it6.next());
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "buildComposition: reloadAudioChannels = " + this.builderModel.getAudioChannels());
    }

    public com.tencent.tavkit.composition.TAVSource buildSource() {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "buildSource: begin, tavComposition = " + this.builderModel.getTavComposition());
        com.tencent.tavkit.composition.TAVSource tAVSource = new com.tencent.tavkit.composition.TAVSource();
        tAVSource.setAsset(buildComposition());
        tAVSource.setVideoComposition(buildVideoComposition());
        tAVSource.setAudioMix(buildAudioMix());
        com.tencent.tav.decoder.logger.Logger.i(TAG, "buildSource: end, return source = " + tAVSource);
        return tAVSource;
    }

    public void setAudioTracksMerge(boolean z17) {
        this.isAudioTracksMerge = z17;
    }

    public void setReloadChannels(boolean z17) {
        this.isReloadChannels = z17;
    }

    public void setVideoTracksMerge(boolean z17) {
        this.isVideoTracksMerge = z17;
    }
}
