package com.tencent.qqmusic.mediaplayer.seektable.mp3;

/* loaded from: classes13.dex */
class TrackPositionDataSource {
    private final com.tencent.qqmusic.mediaplayer.upstream.IDataSource mDataSource;
    private long mPosition = 0;

    public TrackPositionDataSource(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        this.mDataSource = iDataSource;
    }

    public long getCurPosition() {
        return this.mPosition;
    }

    public long getSize() {
        return this.mDataSource.getSize();
    }

    public int read(byte[] bArr, int i17) {
        int readAt = this.mDataSource.readAt(this.mPosition, bArr, 0, i17);
        this.mPosition += readAt;
        return readAt;
    }

    public long seek(long j17) {
        if (j17 >= this.mDataSource.getSize()) {
            return -1L;
        }
        this.mPosition = j17;
        return j17;
    }
}
