package com.tencent.tavkit.component.effectchain;

/* loaded from: classes16.dex */
public interface IVideoEffectContext {
    com.tencent.tavkit.composition.video.TAVVideoEffect getGlobalVideoEffect();

    com.tencent.tavkit.composition.video.TAVVideoEffect getSourceVideoEffect();

    com.tencent.tavkit.composition.video.TAVVideoMixEffect getVideoMixEffect();
}
