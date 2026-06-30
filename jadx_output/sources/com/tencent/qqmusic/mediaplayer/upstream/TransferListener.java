package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public interface TransferListener {
    void onBytesTransferError(long j17, long j18, long j19);

    void onBytesTransferred(long j17, long j18);

    void onBytesTransferring(long j17, long j18);

    void onTransferEnd();

    void onTransferStart();
}
