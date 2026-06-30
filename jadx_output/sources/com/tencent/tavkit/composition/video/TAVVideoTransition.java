package com.tencent.tavkit.composition.video;

/* loaded from: classes16.dex */
public interface TAVVideoTransition {

    /* loaded from: classes16.dex */
    public interface Filter {
        @com.tencent.tavkit.composition.video.RenderThread
        com.tencent.tavkit.ciimage.CIImage apply(com.tencent.tavkit.composition.video.TAVVideoTransition tAVVideoTransition, com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.ciimage.CIImage cIImage2, float f17, com.tencent.tavkit.composition.video.RenderInfo renderInfo);

        @com.tencent.tavkit.composition.video.RenderThread
        void release();
    }

    @com.tencent.tavkit.composition.video.RenderThread
    com.tencent.tavkit.composition.video.TAVVideoTransition.Filter createFilter();

    java.lang.String effectId();

    com.tencent.tav.coremedia.CMTime getDuration();
}
