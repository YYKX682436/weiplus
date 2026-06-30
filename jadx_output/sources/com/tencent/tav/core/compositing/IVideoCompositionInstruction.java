package com.tencent.tav.core.compositing;

/* loaded from: classes16.dex */
public interface IVideoCompositionInstruction {
    int getBackgroundColor();

    java.util.List<? extends com.tencent.tav.core.composition.VideoCompositionLayerInstruction> getLayerInstructions();

    int getPassthroughTrackID();

    java.util.List<java.lang.Integer> getRequiredSourceTrackIDs();

    com.tencent.tav.coremedia.CMTimeRange getTimeRange();

    boolean isEnablePostProcessing();
}
