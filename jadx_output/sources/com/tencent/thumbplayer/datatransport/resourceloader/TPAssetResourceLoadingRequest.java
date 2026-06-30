package com.tencent.thumbplayer.datatransport.resourceloader;

/* loaded from: classes15.dex */
public class TPAssetResourceLoadingRequest implements com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest {
    private com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest mContentInformation;
    private boolean mIsCancelled = false;
    private boolean mIsFinished = false;
    private com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest mLoadingDataRequest;
    private int mRequestNum;

    public TPAssetResourceLoadingRequest(long j17, long j18, int i17, boolean z17) {
        this.mRequestNum = i17;
        com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest tPAssetResourceLoadingDataRequest = new com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest(j17, j18, z17);
        this.mLoadingDataRequest = tPAssetResourceLoadingDataRequest;
        tPAssetResourceLoadingDataRequest.setRequestNum(i17);
    }

    public synchronized void cancelRequest() {
        this.mIsCancelled = true;
        this.mLoadingDataRequest.release();
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized void finishLoading() {
        this.mIsFinished = true;
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest
    public com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest getContentInformation() {
        return this.mContentInformation;
    }

    public int getDataReadyLength(long j17) {
        return this.mLoadingDataRequest.getDataReadyLength(j17);
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized boolean isCancelled() {
        return this.mIsCancelled;
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest
    public synchronized boolean isFinished() {
        return this.mIsFinished;
    }

    public void setContentInformation(com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest) {
        this.mContentInformation = tPAssetResourceLoadingContentInformationRequest;
    }

    public void setDataWritePath(java.lang.String str) {
        this.mLoadingDataRequest.setDataWritePath(str);
    }

    public void setDataWriteThreadLooper(android.os.Looper looper) {
        this.mLoadingDataRequest.setDataWriteThreadLooper(looper);
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest
    public com.tencent.thumbplayer.datatransport.resourceloader.TPAssetResourceLoadingDataRequest getLoadingDataRequest() {
        return this.mLoadingDataRequest;
    }
}
