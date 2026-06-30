package com.tencent.thumbplayer.richmedia;

/* loaded from: classes16.dex */
public interface ITPInnerRichMediaSynchronizer extends com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer {

    /* loaded from: classes16.dex */
    public interface ITPRichMediaInnerSynchronizerListener {
        long onGetCurrentPositionMs(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer);
    }

    com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData getCurrentPositionMsFeatureData(long j17, int[] iArr);

    void seek(long j17);

    void setInnerListener(com.tencent.thumbplayer.richmedia.ITPInnerRichMediaSynchronizer.ITPRichMediaInnerSynchronizerListener iTPRichMediaInnerSynchronizerListener);

    void setPlaybackRate(float f17);
}
