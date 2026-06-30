package com.tencent.thumbplayer.api.resourceloader;

/* loaded from: classes15.dex */
public interface ITPAssetResourceLoadingRequest {
    void finishLoading();

    com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest getContentInformation();

    com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest getLoadingDataRequest();

    boolean isCancelled();

    boolean isFinished();
}
