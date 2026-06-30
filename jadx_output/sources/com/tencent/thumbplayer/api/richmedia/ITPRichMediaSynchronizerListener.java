package com.tencent.thumbplayer.api.richmedia;

/* loaded from: classes16.dex */
public interface ITPRichMediaSynchronizerListener {
    void onDeselectFeatureSuccess(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i17);

    void onRichMediaError(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i17);

    void onRichMediaFeatureData(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i17, com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData tPRichMediaFeatureData);

    void onRichMediaFeatureFailure(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i17, int i18);

    void onRichMediaInfo(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i17, long j17, long j18, long j19, java.lang.Object obj);

    void onRichMediaPrepared(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer);

    void onSelectFeatureSuccess(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer, int i17);
}
