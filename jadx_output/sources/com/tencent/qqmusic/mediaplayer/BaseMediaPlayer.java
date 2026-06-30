package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public abstract class BaseMediaPlayer {
    public static final int DECODER_TYPE_ANDROID_MEDIA_PLAYER = 0;
    public static final int DECODER_TYPE_MEDIA_CODEC = 2;
    public static final int DECODER_TYPE_SOFT = 1;
    private static final java.lang.String TAG = "BaseMediaPlayer";
    private long startTime = 0;
    private long duration = 0;
    private boolean isPaused = false;
    protected java.lang.String mCacheDir = null;

    public abstract void TransferStateTo(int i17);

    public abstract void addAudioListener(com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener);

    public abstract com.tencent.qqmusic.mediaplayer.seektable.SeekTable createSeekTable();

    public abstract void flush();

    public long getCurPlayTime() {
        if (this.startTime <= 0) {
            return 0L;
        }
        return this.isPaused ? this.duration : (this.duration + android.os.SystemClock.elapsedRealtime()) - this.startTime;
    }

    public abstract com.tencent.qqmusic.mediaplayer.AudioInformation getCurrentAudioInformation();

    public abstract long getCurrentPosition();

    public abstract long getCurrentPositionFromFile();

    public abstract int getDecoderType();

    public abstract int getDuration();

    public abstract int getPlayerState();

    public abstract int getSessionId();

    public abstract boolean isPlaying();

    public void notifyPauseSong() {
        this.isPaused = true;
        if (this.startTime > 0) {
            this.duration += android.os.SystemClock.elapsedRealtime() - this.startTime;
        }
    }

    public void notifyStartPlaySong() {
        this.isPaused = false;
        this.startTime = android.os.SystemClock.elapsedRealtime();
    }

    public abstract void pause();

    public abstract void pauseRealTime();

    public abstract void prepare();

    public abstract void prepareAsync();

    public abstract void release();

    public abstract void removeAudioListener(com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener);

    public abstract void reset();

    public abstract void seekTo(int i17);

    public abstract void setAudioStreamType(int i17);

    public abstract void setDataSource(android.content.Context context, android.net.Uri uri);

    public abstract void setDataSource(android.content.Context context, com.tencent.qqmusic.mediaplayer.upstream.UriLoader uriLoader);

    public abstract void setDataSource(com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo);

    public abstract void setDataSource(com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService iMediaHTTPService, android.net.Uri uri);

    public abstract void setDataSource(com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory iDataSourceFactory);

    public abstract void setDataSource(java.io.FileDescriptor fileDescriptor);

    public abstract void setDataSource(java.lang.String str);

    public void setLeastCommonMultiple(int i17) {
    }

    public void setOnlinePlayCacheDir(java.lang.String str) {
        if (new java.io.File(str).isDirectory()) {
            this.mCacheDir = str;
            return;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "setOnlinePlayCacheDir cacheDir is invalid! cacheDir = " + str);
    }

    public void setPlayLocalPath(java.lang.String str) {
    }

    public abstract void setPlayerListenerCallback(com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback);

    public abstract void setVolume(float f17, float f18);

    public abstract void setWakeMode(android.content.Context context, int i17);

    public abstract void start();

    public abstract void stop();
}
