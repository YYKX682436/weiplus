package com.tencent.tavkit.composition;

/* loaded from: classes16.dex */
public class TAVComposition {
    private java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio>> audioChannels;
    private java.util.List<? extends com.tencent.tavkit.composition.model.TAVAudio> audios;
    private int backgroundColor;
    private com.tencent.tav.coremedia.CMTime frameDuration;
    private com.tencent.tavkit.composition.video.TAVVideoEffect globalVideoEffect;
    private java.util.List<? extends com.tencent.tavkit.composition.model.TAVVideo> overlays;
    private com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode renderLayoutMode;
    private com.tencent.tav.coremedia.CGSize renderSize;
    private com.tencent.tavkit.composition.video.TAVVideoEffect sourceVideoEffect;
    private java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo>> videoChannels;
    private com.tencent.tavkit.composition.video.TAVVideoMixEffect videoMixEffect;

    public TAVComposition(com.tencent.tavkit.composition.TAVClip... tAVClipArr) {
        this((java.util.List<com.tencent.tavkit.composition.TAVClip>) com.tencent.tavkit.utils.ListUtils.listWithObjects(tAVClipArr));
    }

    public void addAudioChannel(java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio> list) {
        if (this.audioChannels == null) {
            this.audioChannels = new java.util.ArrayList();
        }
        this.audioChannels.add(new java.util.ArrayList(list));
    }

    public void addVideoChannel(java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo> list) {
        if (this.videoChannels == null) {
            this.videoChannels = new java.util.ArrayList();
        }
        this.videoChannels.add(new java.util.ArrayList(list));
    }

    public void attachVideoEffectChain(com.tencent.tavkit.component.effectchain.IVideoEffectContext iVideoEffectContext) {
        this.sourceVideoEffect = iVideoEffectContext.getSourceVideoEffect();
        this.videoMixEffect = iVideoEffectContext.getVideoMixEffect();
        this.globalVideoEffect = iVideoEffectContext.getGlobalVideoEffect();
    }

    public java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio>> getAudioChannels() {
        return this.audioChannels;
    }

    public java.util.List<? extends com.tencent.tavkit.composition.model.TAVAudio> getAudios() {
        return this.audios;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public com.tencent.tav.coremedia.CMTime getDuration() {
        java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo>> list = this.videoChannels;
        if (list == null) {
            return com.tencent.tav.coremedia.CMTime.CMTimeZero;
        }
        int size = list.size();
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        com.tencent.tav.coremedia.CMTime cMTime2 = cMTime;
        for (int i17 = 0; i17 < size; i17++) {
            java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo> list2 = this.videoChannels.get(i17);
            if (list2 != null) {
                for (com.tencent.tavkit.composition.model.TAVTransitionableVideo tAVTransitionableVideo : list2) {
                    if (tAVTransitionableVideo != null) {
                        cMTime2 = cMTime2.add(tAVTransitionableVideo.getDuration());
                    }
                }
                if (cMTime2.bigThan(cMTime)) {
                    cMTime = cMTime2;
                }
                cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
            }
        }
        return cMTime;
    }

    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.frameDuration;
    }

    public com.tencent.tavkit.composition.video.TAVVideoEffect getGlobalVideoEffect() {
        return this.globalVideoEffect;
    }

    public java.util.List<? extends com.tencent.tavkit.composition.model.TAVVideo> getOverlays() {
        return this.overlays;
    }

    public com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode getRenderLayoutMode() {
        return this.renderLayoutMode;
    }

    public com.tencent.tav.coremedia.CGSize getRenderSize() {
        return this.renderSize;
    }

    public com.tencent.tavkit.composition.video.TAVVideoEffect getSourceVideoEffect() {
        return this.sourceVideoEffect;
    }

    public java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo>> getVideoChannels() {
        return this.videoChannels;
    }

    public com.tencent.tavkit.composition.video.TAVVideoMixEffect getVideoMixEffect() {
        return this.videoMixEffect;
    }

    public void setAudioChannels(java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio>> list) {
        this.audioChannels = list;
    }

    public void setAudios(java.util.List<? extends com.tencent.tavkit.composition.model.TAVAudio> list) {
        this.audios = list;
    }

    public void setBackgroundColor(int i17) {
        this.backgroundColor = i17;
    }

    public void setFrameDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    public void setGlobalVideoEffect(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffect = tAVVideoEffect;
    }

    public void setOverlays(java.util.List<? extends com.tencent.tavkit.composition.model.TAVVideo> list) {
        this.overlays = list;
    }

    public void setRenderLayoutMode(com.tencent.tav.core.composition.VideoComposition.RenderLayoutMode renderLayoutMode) {
        this.renderLayoutMode = renderLayoutMode;
    }

    public void setRenderSize(com.tencent.tav.coremedia.CGSize cGSize) {
        this.renderSize = cGSize;
    }

    public void setSourceVideoEffect(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffect = tAVVideoEffect;
    }

    public void setVideoChannels(java.util.List<java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo>> list) {
        this.videoChannels = list;
    }

    public void setVideoMixEffect(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffect = tAVVideoMixEffect;
    }

    public java.lang.String toString() {
        return "TAVComposition{\nrenderSize=" + this.renderSize + ", renderLayoutMode=" + this.renderLayoutMode + ", backgroundColor=" + this.backgroundColor + ", frameDuration=" + this.frameDuration + "\nvideoChannels=" + this.videoChannels + "\naudioChannels=" + this.audioChannels + "\noverlays=" + this.overlays + "\naudios=" + this.audios + '}';
    }

    public TAVComposition(java.util.List<com.tencent.tavkit.composition.TAVClip> list) {
        this(list, list);
    }

    public TAVComposition(java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo> list, java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio> list2) {
        this();
        addVideoChannel(list);
        addAudioChannel(list2);
    }

    public TAVComposition() {
        this.videoChannels = new java.util.ArrayList();
        this.audioChannels = new java.util.ArrayList();
        this.backgroundColor = -16777216;
    }
}
