package com.tencent.thumbplayer.api.resourceloader;

/* loaded from: classes15.dex */
public interface ITPAssetResourceLoaderListener {
    void didCancelLoadingRequest(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest);

    void fillInContentInformation(com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest);

    boolean shouldWaitForLoadingOfRequestedResource(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest);
}
