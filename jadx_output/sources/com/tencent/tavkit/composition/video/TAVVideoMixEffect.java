package com.tencent.tavkit.composition.video;

/* loaded from: classes16.dex */
public interface TAVVideoMixEffect {

    /* loaded from: classes16.dex */
    public interface Filter {
        @com.tencent.tavkit.composition.video.RenderThread
        com.tencent.tavkit.ciimage.CIImage apply(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect, com.tencent.tavkit.composition.video.ImageCollection imageCollection, com.tencent.tavkit.composition.video.RenderInfo renderInfo);

        @com.tencent.tavkit.composition.video.RenderThread
        void release();
    }

    @com.tencent.tavkit.composition.video.RenderThread
    com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter createFilter();

    java.lang.String effectId();
}
