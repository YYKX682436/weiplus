package com.tencent.thumbplayer.core.richmedia.async;

/* loaded from: classes16.dex */
public interface ITPNativeRichMediaAsyncRequester {
    void cancelRequest(int i17);

    com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    int requestFeatureDataAsyncAtTimeMs(int i17, long j17);

    int requestFeatureDataAsyncAtTimeMsArray(int i17, long[] jArr);

    int requestFeatureDataAsyncAtTimeRange(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange tPNativeTimeRange);

    int requestFeatureDataAsyncAtTimeRanges(int i17, com.tencent.thumbplayer.core.richmedia.TPNativeTimeRange[] tPNativeTimeRangeArr);

    void setRequesterListener(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener iTPNativeRichMediaAsyncRequesterListener);

    void setRichMediaSource(java.lang.String str);
}
