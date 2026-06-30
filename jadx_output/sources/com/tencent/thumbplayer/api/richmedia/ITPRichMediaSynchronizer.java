package com.tencent.thumbplayer.api.richmedia;

/* loaded from: classes16.dex */
public interface ITPRichMediaSynchronizer {
    void deselectFeatureAsync(int i17);

    com.tencent.thumbplayer.api.richmedia.TPRichMediaFeature[] getFeatures();

    void prepareAsync();

    void release();

    void reset();

    void selectFeatureAsync(int i17, com.tencent.thumbplayer.api.richmedia.TPRichMediaRequestExtraInfo tPRichMediaRequestExtraInfo);

    void setListener(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizerListener iTPRichMediaSynchronizerListener);

    void setRichMediaSource(java.lang.String str);
}
