package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
class TrackCorePlayer extends com.tencent.qqmusic.mediaplayer.CorePlayer implements com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource.TrackStateCallback {
    private static final java.lang.String TAG = "TrackCorePlayer";
    private long mStartPosition;

    public TrackCorePlayer(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, com.tencent.qqmusic.mediaplayer.PlayerCallback playerCallback, android.os.Looper looper, com.tencent.qqmusic.mediaplayer.QMThreadExecutor qMThreadExecutor) {
        super(iDataSource, null, playerCallback, looper, new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder(), qMThreadExecutor);
        this.mStartPosition = 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.CorePlayer
    public long getCurPosition() {
        return super.getCurPosition() - this.mStartPosition;
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource.TrackStateCallback
    public void onTrackPrepared(com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo) {
        this.mStartPosition = ((java.lang.Long) trackInfo.getRange().first).longValue();
        long longValue = ((java.lang.Long) trackInfo.getRange().second).longValue();
        long longValue2 = ((java.lang.Long) trackInfo.getRange().first).longValue();
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "onTrackPrepared, start byte: " + longValue2 + ", end byte: " + longValue);
        this.mInformation.setDuration(longValue - longValue2);
    }

    @Override // com.tencent.qqmusic.mediaplayer.CorePlayer
    public void seek(int i17) {
        int i18 = (int) (i17 + this.mStartPosition);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "seek, position: " + i17 + " ,realseek: " + i18);
        super.seek(i18);
    }
}
