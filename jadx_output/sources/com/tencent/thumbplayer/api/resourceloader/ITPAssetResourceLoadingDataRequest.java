package com.tencent.thumbplayer.api.resourceloader;

/* loaded from: classes15.dex */
public interface ITPAssetResourceLoadingDataRequest {
    long getCurrentOffset();

    int getRequestNum();

    long getRequestedLength();

    long getRequestedOffset();

    void notifyDataReady(long j17, long j18);

    void respondWithData(byte[] bArr);
}
