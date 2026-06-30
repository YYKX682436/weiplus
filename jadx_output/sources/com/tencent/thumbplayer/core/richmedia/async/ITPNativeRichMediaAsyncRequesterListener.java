package com.tencent.thumbplayer.core.richmedia.async;

/* loaded from: classes16.dex */
public interface ITPNativeRichMediaAsyncRequesterListener {
    void onFeatureDataRequestFailure(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i17, int i18, int i19);

    void onFeatureDataRequestSuccess(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i17, int i18, com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData);

    void onRequesterError(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i17);

    void onRequesterPrepared(com.tencent.thumbplayer.core.richmedia.async.ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester);
}
