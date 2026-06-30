package com.tencent.thumbplayer.api.richmedia;

/* loaded from: classes16.dex */
public interface ITPRichMediaAsyncRequesterListener {
    void onFeatureDataRequestFailure(com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i17, int i18, int i19);

    void onFeatureDataRequestSuccess(com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i17, int i18, com.tencent.thumbplayer.api.richmedia.TPRichMediaFeatureData tPRichMediaFeatureData);

    void onRequesterError(com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester, int i17);

    void onRequesterPrepared(com.tencent.thumbplayer.api.richmedia.ITPRichMediaAsyncRequester iTPRichMediaAsyncRequester);
}
