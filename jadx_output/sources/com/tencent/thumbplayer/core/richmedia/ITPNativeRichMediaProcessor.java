package com.tencent.thumbplayer.core.richmedia;

/* loaded from: classes16.dex */
public interface ITPNativeRichMediaProcessor {
    void deselectFeatureAsync(int i17);

    com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData getCurrentPositionMsFeatureData(long j17, int[] iArr);

    com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    void reset();

    void seek(long j17);

    void selectFeatureAsync(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaRequestExtraInfo tPNativeRichMediaRequestExtraInfo);

    void setInnerProcessorCallback(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaInnerProcessorCallback iTPNativeRichMediaInnerProcessorCallback);

    void setPlaybackRate(float f17);

    void setProcessorCallback(com.tencent.thumbplayer.core.richmedia.ITPNativeRichMediaProcessorCallback iTPNativeRichMediaProcessorCallback);

    void setRichMediaSource(java.lang.String str);
}
