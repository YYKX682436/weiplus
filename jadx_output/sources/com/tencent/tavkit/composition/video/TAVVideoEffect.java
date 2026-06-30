package com.tencent.tavkit.composition.video;

/* loaded from: classes16.dex */
public interface TAVVideoEffect {

    /* loaded from: classes16.dex */
    public interface Filter {
        @com.tencent.tavkit.composition.video.RenderThread
        com.tencent.tavkit.ciimage.CIImage apply(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect, com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.composition.video.RenderInfo renderInfo);

        @com.tencent.tavkit.composition.video.RenderThread
        void release();
    }

    @com.tencent.tavkit.composition.video.RenderThread
    com.tencent.tavkit.composition.video.TAVVideoEffect.Filter createFilter();

    java.lang.String effectId();
}
