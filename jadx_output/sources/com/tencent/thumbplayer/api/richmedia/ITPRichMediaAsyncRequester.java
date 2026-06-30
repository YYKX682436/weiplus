package com.tencent.thumbplayer.api.richmedia;

/* loaded from: classes16.dex */
public interface ITPRichMediaAsyncRequester {
    void cancelRequest(int i17);

    com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    int requestFeatureDataAsyncAtTimeMs(int i17, long j17);

    int requestFeatureDataAsyncAtTimeMsArray(int i17, long[] jArr);

    int requestFeatureDataAsyncAtTimeRange(int i17, com.tencent.thumbplayer.api.TPTimeRange tPTimeRange);

    int requestFeatureDataAsyncAtTimeRanges(int i17, com.tencent.thumbplayer.api.TPTimeRange[] tPTimeRangeArr);

    void setRequesterListener(com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener);

    void setRichMediaSource(java.lang.String str);
}
