package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class TrackDataSource implements com.tencent.qqmusic.mediaplayer.upstream.IDataSource, com.tencent.qqmusic.mediaplayer.PlayerListenerCallback {
    private static final java.lang.String TAG = "TrackDataSource";
    private com.tencent.qqmusic.mediaplayer.upstream.IDataSource mDataSource;
    private long mEndBytePosition;
    private long mStartBytePosition;
    private long mStartTimePosition;
    private com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo mTrackInfo;
    private com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource.TrackStateCallback mTrackStateCallback;

    /* loaded from: classes13.dex */
    public interface TrackStateCallback {
        void onTrackPrepared(com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo);
    }

    public TrackDataSource(com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo) {
        java.lang.String uri = trackInfo.getUri();
        if (android.text.TextUtils.isEmpty(trackInfo.getUri())) {
            throw new com.tencent.qqmusic.mediaplayer.upstream.DataSourceException(-1, "track info has no media file path!", null);
        }
        if (!new java.io.File(uri).exists()) {
            throw new com.tencent.qqmusic.mediaplayer.upstream.DataSourceException(-1, "track info's media file not exists!", null);
        }
        this.mDataSource = new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(trackInfo.getUri());
        this.mTrackInfo = trackInfo;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mDataSource.close();
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType() {
        return this.mDataSource.getAudioType();
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public long getSize() {
        return this.mDataSource.getSize();
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onBufferingUpdate(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onCompletion(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onError(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17, int i18, int i19) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onPrepared(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        com.tencent.qqmusic.mediaplayer.seektable.SeekTable seekTable;
        try {
            this.mDataSource.open();
            long size = this.mDataSource.getSize();
            try {
                seekTable = baseMediaPlayer.createSeekTable();
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "createSeekTable ex occurred!!", e17);
                seekTable = null;
            }
            if (seekTable == null) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "createSeekTable is null, return");
                return;
            }
            android.util.Pair<java.lang.Long, java.lang.Long> range = this.mTrackInfo.getRange();
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "start time: " + range.first + ", end time: " + range.second);
            if (((java.lang.Long) range.first).longValue() > ((java.lang.Long) range.second).longValue()) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "start range larger, return");
                return;
            }
            this.mStartTimePosition = ((java.lang.Long) range.first).longValue();
            long seek = seekTable.seek(((java.lang.Long) range.first).longValue());
            long seek2 = seekTable.seek(((java.lang.Long) range.second).longValue());
            if (size > 0 && seek > size) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "startBytePosition larger than size!");
                return;
            }
            if (size <= 0 || seek2 <= size) {
                size = seek2;
            }
            this.mStartBytePosition = seek;
            this.mEndBytePosition = size;
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "start byte: " + this.mStartBytePosition + ", end byte: " + this.mEndBytePosition);
            com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource.TrackStateCallback trackStateCallback = this.mTrackStateCallback;
            if (trackStateCallback != null) {
                trackStateCallback.onTrackPrepared(this.mTrackInfo);
            }
        } catch (java.io.IOException e18) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "dataSource open failed!", e18);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onSeekComplete(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStarted(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer) {
        baseMediaPlayer.seekTo(0);
    }

    @Override // com.tencent.qqmusic.mediaplayer.PlayerListenerCallback
    public void onStateChanged(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public void open() {
        this.mDataSource.open();
    }

    @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSource
    public int readAt(long j17, byte[] bArr, int i17, int i18) {
        long j18 = this.mEndBytePosition;
        if (j18 <= 0 || j17 <= j18) {
            return this.mDataSource.readAt(j17, bArr, i17, i18);
        }
        return -1;
    }

    public void setEndBytePosition(long j17) {
        this.mEndBytePosition = j17;
    }

    public void setTrackStateCallback(com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource.TrackStateCallback trackStateCallback) {
        this.mTrackStateCallback = trackStateCallback;
    }
}
