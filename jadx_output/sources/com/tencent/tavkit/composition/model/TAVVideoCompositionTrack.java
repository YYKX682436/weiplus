package com.tencent.tavkit.composition.model;

/* loaded from: classes16.dex */
public interface TAVVideoCompositionTrack {
    java.lang.Object getExtraTrackInfo(java.lang.String str);

    int numberOfVideoTracks();

    void putExtraTrackInfo(java.lang.String str, java.lang.Object obj);

    com.tencent.tavkit.ciimage.CIImage sourceImageAtTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CGSize cGSize);

    com.tencent.tav.asset.CompositionTrack videoCompositionTrackForComposition(com.tencent.tav.asset.MutableComposition mutableComposition, int i17, boolean z17);
}
