package com.tencent.tavkit.composition.builder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class BuilderModel {
    private final com.tencent.tavkit.composition.TAVComposition tavComposition;
    private final java.util.List<java.util.List<com.tencent.tavkit.composition.builder.VideoInfo>> mainVideoTrackInfo = new java.util.ArrayList();
    private final java.util.List<com.tencent.tavkit.composition.builder.AudioParamsInfo> mainAudioTrackInfo = new java.util.ArrayList();
    private final java.util.List<com.tencent.tavkit.composition.builder.VideoOverlayInfo> overlayTrackInfo = new java.util.ArrayList();
    private final java.util.List<com.tencent.tavkit.composition.builder.AudioMixInfo> audioTrackInfo = new java.util.ArrayList();

    public BuilderModel(com.tencent.tavkit.composition.TAVComposition tAVComposition) {
        this.tavComposition = tAVComposition;
    }

    public void addAudioTrackInfo(com.tencent.tavkit.composition.builder.AudioMixInfo audioMixInfo) {
        this.audioTrackInfo.add(audioMixInfo);
    }

    public void addMainAudioTrackInfo(com.tencent.tavkit.composition.builder.AudioParamsInfo audioParamsInfo) {
        this.mainAudioTrackInfo.add(audioParamsInfo);
    }

    public void addMainVideoTrackInfo(java.util.List<com.tencent.tavkit.composition.builder.VideoInfo> list) {
        this.mainVideoTrackInfo.add(list);
    }

    public void addOverlayTrackInfo(com.tencent.tavkit.composition.builder.VideoOverlayInfo videoOverlayInfo) {
        this.overlayTrackInfo.add(videoOverlayInfo);
    }

    public java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio>> getAudioChannels() {
        return this.tavComposition.getAudioChannels();
    }

    public java.util.List<com.tencent.tavkit.composition.builder.AudioMixInfo> getAudioTrackInfo() {
        return this.audioTrackInfo;
    }

    public int getBackgroundColor() {
        return this.tavComposition.getBackgroundColor();
    }

    public com.tencent.tavkit.composition.video.TAVVideoEffect getGlobalVideoEffect() {
        return this.tavComposition.getGlobalVideoEffect();
    }

    public java.util.List<com.tencent.tavkit.composition.builder.AudioParamsInfo> getMainAudioTrackInfo() {
        return this.mainAudioTrackInfo;
    }

    public java.util.List<java.util.List<com.tencent.tavkit.composition.builder.VideoInfo>> getMainVideoTrackInfo() {
        return this.mainVideoTrackInfo;
    }

    public java.util.List<? extends com.tencent.tavkit.composition.model.TAVAudio> getMixAudios() {
        return this.tavComposition.getAudios();
    }

    public java.util.List<com.tencent.tavkit.composition.builder.VideoOverlayInfo> getOverlayTrackInfo() {
        return this.overlayTrackInfo;
    }

    public java.util.List<? extends com.tencent.tavkit.composition.model.TAVVideo> getOverlays() {
        return this.tavComposition.getOverlays();
    }

    public com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode getRenderLayoutMode() {
        return this.tavComposition.getRenderLayoutMode();
    }

    public com.tencent.tav.coremedia.CGSize getRenderSize() {
        return this.tavComposition.getRenderSize();
    }

    public com.tencent.tavkit.composition.TAVComposition getTavComposition() {
        return this.tavComposition;
    }

    public java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo>> getVideoChannels() {
        return this.tavComposition.getVideoChannels();
    }

    public com.tencent.tavkit.composition.video.TAVVideoMixEffect getVideoMixEffect() {
        return this.tavComposition.getVideoMixEffect();
    }
}
