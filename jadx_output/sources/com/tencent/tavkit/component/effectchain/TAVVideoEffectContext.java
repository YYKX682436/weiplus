package com.tencent.tavkit.component.effectchain;

/* loaded from: classes16.dex */
public class TAVVideoEffectContext implements com.tencent.tavkit.component.effectchain.IVideoEffectContext {
    protected final com.tencent.tavkit.component.effectchain.VideoEffectProxy sourceVideoEffectProxy = new com.tencent.tavkit.component.effectchain.VideoEffectProxy();
    protected final com.tencent.tavkit.component.effectchain.VideoMixEffectProxy videoMixEffectProxy = new com.tencent.tavkit.component.effectchain.VideoMixEffectProxy();
    protected final com.tencent.tavkit.component.effectchain.VideoEffectProxy globalVideoEffectProxy = new com.tencent.tavkit.component.effectchain.VideoEffectProxy();

    public void addGlobalFilter(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffectProxy.getEffects().remove(tAVVideoEffect);
    }

    public void addSourceFilter(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffectProxy.getEffects().remove(tAVVideoEffect);
    }

    public void addVideoMixFilter(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffectProxy.getEffects().remove(tAVVideoMixEffect);
    }

    @Override // com.tencent.tavkit.component.effectchain.IVideoEffectContext
    public com.tencent.tavkit.composition.video.TAVVideoEffect getGlobalVideoEffect() {
        return this.globalVideoEffectProxy;
    }

    @Override // com.tencent.tavkit.component.effectchain.IVideoEffectContext
    public com.tencent.tavkit.composition.video.TAVVideoEffect getSourceVideoEffect() {
        return this.sourceVideoEffectProxy;
    }

    @Override // com.tencent.tavkit.component.effectchain.IVideoEffectContext
    public com.tencent.tavkit.composition.video.TAVVideoMixEffect getVideoMixEffect() {
        return this.videoMixEffectProxy;
    }

    public void removeGlobalFilter(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.globalVideoEffectProxy.getEffects().remove(tAVVideoEffect);
        this.globalVideoEffectProxy.notifyOnEffectRemove();
    }

    public void removeSourceFilter(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        this.sourceVideoEffectProxy.getEffects().remove(tAVVideoEffect);
        this.sourceVideoEffectProxy.notifyOnEffectRemove();
    }

    public void removeVideoMixFilter(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect) {
        this.videoMixEffectProxy.getEffects().remove(tAVVideoMixEffect);
        this.videoMixEffectProxy.notifyOnEffectRemove();
    }
}
