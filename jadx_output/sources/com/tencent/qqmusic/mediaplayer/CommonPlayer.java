package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class CommonPlayer extends com.tencent.qqmusic.mediaplayer.BaseMediaPlayer {
    private static final int INIT_STATE_CHECK_TIME = 5000;
    private static final java.lang.String TAG = "CommonPlayer";
    private int currentState;
    private android.os.Looper eventLooper;
    private boolean isMatchHuawei;
    private com.tencent.qqmusic.mediaplayer.CorePlayer mAudioPlayer;
    private int mBufferPercentage;
    private final com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback mCallback;
    private long mDuration;
    private final com.tencent.qqmusic.mediaplayer.QMThreadExecutor mExecutor;
    private java.lang.String mLocalPlayPath;
    private boolean mPreferMediaCodecDecode;
    private java.lang.Float mSpeedToSet;
    private com.tencent.qqmusic.mediaplayer.CommonPlayer.OpenedResources openedResources;

    /* loaded from: classes13.dex */
    public class BufferListener implements com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener {
        private BufferListener() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onBufferEnded() {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, com.tencent.qqmusic.mediaplayer.CommonPlayer.this.auxiliary("buffer ended."));
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onBufferStarted(long j17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, com.tencent.qqmusic.mediaplayer.CommonPlayer.this.auxiliary("buffer started."));
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onBytesTransferError(long j17, long j18, long j19) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onBytesTransferred(long j17, long j18) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onBytesTransferring(long j17, long j18) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public long onStreamingError(java.io.IOException iOException) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, com.tencent.qqmusic.mediaplayer.CommonPlayer.this.auxiliary("streaming error!"), iOException);
            return -1L;
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onStreamingFinished() {
            com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mBufferPercentage = 100;
            com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, com.tencent.qqmusic.mediaplayer.CommonPlayer.this.auxiliary("streaming finished"));
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onTransferEnd() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.TransferListener
        public void onTransferStart() {
        }

        @Override // com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Listener
        public void onUpStreamTransfer(long j17, long j18) {
            int round;
            if ((com.tencent.qqmusic.mediaplayer.CommonPlayer.this.getPlayerState() == 2 || com.tencent.qqmusic.mediaplayer.CommonPlayer.this.getPlayerState() == 4) && (round = (int) java.lang.Math.round((j17 / j18) * 100.0d)) != com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mBufferPercentage) {
                com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mBufferPercentage = round;
                com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback listPlayerListenerCallback = com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mCallback;
                com.tencent.qqmusic.mediaplayer.CommonPlayer commonPlayer = com.tencent.qqmusic.mediaplayer.CommonPlayer.this;
                listPlayerListenerCallback.onBufferingUpdate(commonPlayer, commonPlayer.mBufferPercentage);
            }
        }
    }

    /* loaded from: classes13.dex */
    public class CorePlayerCallback implements com.tencent.qqmusic.mediaplayer.PlayerCallback {
        private final com.tencent.qqmusic.mediaplayer.upstream.IDataSource mDataSource;
        private final com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory mFactory;

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playThreadStart(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerEnded(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer != corePlayer) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "different playerEnded");
                return;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "playerEnded() callback ended");
            com.tencent.qqmusic.mediaplayer.CommonPlayer.this.TransferStateTo(7);
            com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mCallback.onCompletion(com.tencent.qqmusic.mediaplayer.CommonPlayer.this);
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerException(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer, int i17, int i18, int i19) {
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer != corePlayer) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "different playerException");
                return;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "playerException() callback exception what = " + i17 + ",extra = " + i18 + " mAudioPlayer:" + com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer);
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer != null) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "handleMessage state = " + com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer.getPlayerState());
                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "handleMessage isInit = " + com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer.isInit() + ",isStartDecode = " + com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer.hasDecodeData() + ",decodeSuccess = " + com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer.hasDecodeDataSuccess());
            }
            if (!com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mPreferMediaCodecDecode || i17 != 91) {
                com.tencent.qqmusic.mediaplayer.CommonPlayer.this.onError(i17, i18, i19);
                return;
            }
            com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mPreferMediaCodecDecode = false;
            com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory iDataSourceFactory = this.mFactory;
            if (iDataSourceFactory != null) {
                try {
                    com.tencent.qqmusic.mediaplayer.CommonPlayer.this.setDataSource(iDataSourceFactory);
                    com.tencent.qqmusic.mediaplayer.CommonPlayer.this.prepare();
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "retry nativeDecoder", e17);
                    com.tencent.qqmusic.mediaplayer.CommonPlayer.this.onError(i17, i18, i19);
                    return;
                }
            }
            com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource = this.mDataSource;
            if (iDataSource == null) {
                com.tencent.qqmusic.mediaplayer.CommonPlayer.this.onError(i17, i18, i19);
            } else {
                com.tencent.qqmusic.mediaplayer.CommonPlayer.this.setDataSourceInternal(iDataSource);
                com.tencent.qqmusic.mediaplayer.CommonPlayer.this.prepare();
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerPaused(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer == corePlayer) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "playerPaused() callback paused");
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "different playerPaused");
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerPrepared(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer != corePlayer) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "different playerPrepared");
                return;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "playerPrepared() callback prepared");
            com.tencent.qqmusic.mediaplayer.CommonPlayer.this.TransferStateTo(2);
            com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mCallback.onPrepared(com.tencent.qqmusic.mediaplayer.CommonPlayer.this);
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerSeekCompletion(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer, int i17) {
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer != corePlayer) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "different playerSeekCompletion");
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "playerSeekCompletion() callback seek completion");
                com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mCallback.onSeekComplete(com.tencent.qqmusic.mediaplayer.CommonPlayer.this, i17);
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerStarted(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer != corePlayer) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "different playerStarted");
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "playerStarted() callback started");
                com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mCallback.onStarted(com.tencent.qqmusic.mediaplayer.CommonPlayer.this);
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.PlayerCallback
        public void playerStopped(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
            if (com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mAudioPlayer == corePlayer) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "playerStopped() callback stopped");
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "different playerStopped");
            }
        }

        private CorePlayerCallback(com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory iDataSourceFactory, com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
            this.mFactory = iDataSourceFactory;
            this.mDataSource = iDataSource;
        }
    }

    /* loaded from: classes13.dex */
    public static class OpenedResources {
        private java.io.File bufferFile;
        private com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource dataSource;

        private OpenedResources() {
        }

        public void release() {
            java.io.File file = this.bufferFile;
            if (file != null && !file.delete()) {
                com.tencent.qqmusic.mediaplayer.util.Logger.w(com.tencent.qqmusic.mediaplayer.CommonPlayer.TAG, "[release] failed to delete buffer file: " + this.bufferFile);
            }
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource cacheDataSource = this.dataSource;
            if (cacheDataSource != null) {
                cacheDataSource.setListener(null);
                this.dataSource.releaseLock();
            }
        }
    }

    public CommonPlayer() {
        this(null, null, false, new com.tencent.qqmusic.mediaplayer.QMThreadExecutor() { // from class: com.tencent.qqmusic.mediaplayer.CommonPlayer.1
            @Override // com.tencent.qqmusic.mediaplayer.QMThreadExecutor
            public void execute(java.lang.Runnable runnable, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
                java.lang.Thread thread = new java.lang.Thread(runnable, "decoder");
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                thread.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String auxiliary(java.lang.String str) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        java.lang.String str2 = this.mPreferMediaCodecDecode ? "[MediaCodec]" : "";
        if (corePlayer == null) {
            return "null";
        }
        return "[" + corePlayer + "]" + str2 + str;
    }

    private void checkToRelease() {
        if (this.currentState == 8) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[checkToRelease]"));
            resetInternal();
            this.mCallback.clear();
        }
    }

    private android.os.Looper insureEventLooper() {
        if (this.eventLooper == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("CommonPlayer_EventHandler_" + hashCode());
            handlerThread.start();
            this.eventLooper = handlerThread.getLooper();
        }
        return this.eventLooper;
    }

    private void onError(int i17, int i18) {
        onError(i17, i18, 0);
    }

    private synchronized void resetInternal() {
        com.tencent.qqmusic.mediaplayer.CommonPlayer.OpenedResources openedResources = this.openedResources;
        if (openedResources != null) {
            openedResources.release();
            this.openedResources = null;
        }
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.release();
            this.mAudioPlayer = null;
        }
        android.os.Looper looper = this.eventLooper;
        if (looper != null && looper != android.os.Looper.getMainLooper()) {
            this.eventLooper.quitSafely();
            this.eventLooper = null;
        }
        this.mDuration = 0L;
        this.mBufferPercentage = 0;
        this.mSpeedToSet = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setDataSourceInternal(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        TransferStateTo(1);
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = new com.tencent.qqmusic.mediaplayer.CorePlayer(new com.tencent.qqmusic.mediaplayer.upstream.TracerDataSource(iDataSource), null, new com.tencent.qqmusic.mediaplayer.CommonPlayer.CorePlayerCallback(null, iDataSource), insureEventLooper(), this.mPreferMediaCodecDecode ? new com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder() : new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder(), this.mExecutor);
        this.mAudioPlayer = corePlayer;
        corePlayer.setThreadName(iDataSource.toString());
        setSpeedToCorePlayerIfNeeded(this.mAudioPlayer);
    }

    private void setSpeedToCorePlayerIfNeeded(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer) {
        java.lang.Float f17 = this.mSpeedToSet;
        if (f17 != null) {
            corePlayer.setSpeed(f17.floatValue());
            this.mSpeedToSet = null;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void TransferStateTo(int i17) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i("CommonPlayer StateRunner", this.currentState + " -> " + i17);
        this.currentState = i17;
        com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback listPlayerListenerCallback = this.mCallback;
        if (listPlayerListenerCallback != null) {
            listPlayerListenerCallback.onStateChanged(this, i17);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void addAudioListener(com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.addAudioListener(iAudioListener);
        }
    }

    public void addPlayerListenerCallback(com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback) {
        this.mCallback.add(playerListenerCallback);
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public com.tencent.qqmusic.mediaplayer.seektable.SeekTable createSeekTable() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer == null) {
            return null;
        }
        return corePlayer.createSeekTable();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void flush() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer == null) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[getCurrentFrame] mAudioPlayer is null!");
        } else {
            corePlayer.flush();
        }
    }

    public int getBufferedPercentage() {
        return this.mBufferPercentage;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public com.tencent.qqmusic.mediaplayer.AudioInformation getCurrentAudioInformation() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getCurrentAudioInformation();
        }
        return null;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public long getCurrentPosition() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getCurPosition();
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getCurrentPosition() mAudioPlayer is null!");
        return 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public long getCurrentPositionFromFile() {
        return 0L;
    }

    public long getDecodePosition() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getCurPositionByDecoder();
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getDecodePosition() ERROR : mAudioPlayer is null!");
        return 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getDecoderType() {
        return this.mPreferMediaCodecDecode ? 2 : 1;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getDuration() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            long duration = corePlayer.getDuration();
            this.mDuration = duration;
            return (int) duration;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getDuration() mAudioPlayer is null!");
        long j17 = this.mDuration;
        if (j17 <= 0) {
            j17 = 0;
        }
        return (int) j17;
    }

    public int getPlayerMode() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getPlayerMode();
        }
        return 0;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getPlayerState() {
        return this.currentState;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public int getSessionId() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getSessionId();
        }
        return 0;
    }

    public float getSpeed() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getSpeed();
        }
        java.lang.Float f17 = this.mSpeedToSet;
        if (f17 != null) {
            return f17.floatValue();
        }
        return 1.0f;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public boolean isPlaying() {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            return corePlayer.getPlayerState() == 4;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "isPlaying() mAudioPlayer is null!");
        return false;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void pause() {
        TransferStateTo(5);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[pause]"));
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.pause(false);
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "pause() mAudioPlayer is null!");
        }
        notifyPauseSong();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void pauseRealTime() {
        TransferStateTo(5);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[pauseRealTime]"));
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.pause(true);
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "pauseRealTime() mAudioPlayer is null!");
        }
        notifyPauseSong();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void prepare() {
        if (this.currentState == 8) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "prepare already released!");
            return;
        }
        TransferStateTo(3);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[prepare]"));
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.prepare();
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "prepare() null mAudioPlayer!");
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void prepareAsync() {
        throw new com.tencent.qqmusic.mediaplayer.UnSupportMethodException("Soft decode player cannot support prepareAsync");
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void release() {
        TransferStateTo(8);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[release]"));
        resetInternal();
        this.mCallback.clear();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void removeAudioListener(com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.removeAudioListener(iAudioListener);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void reset() {
        TransferStateTo(0);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[reset]"));
        resetInternal();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void seekTo(int i17) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.seek(i17);
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "seekTo() mAudioPlayer is null!");
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setAudioStreamType(int i17) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setAudioStreamType(i17);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(java.lang.String str) {
        if (str != null) {
            TransferStateTo(1);
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "setDataSource, path: " + str);
            this.mBufferPercentage = 100;
            setDataSourceInternal(new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(str));
            checkToRelease();
            return;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "setDataSource() ERROR:the path is null!");
        throw new java.lang.IllegalArgumentException("the path is null!");
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setLeastCommonMultiple(int i17) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setLeastCommonMultiple(i17);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setPlayLocalPath(java.lang.String str) {
        this.mLocalPlayPath = str;
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setPlayPath(str);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setPlayerListenerCallback(com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback) {
        this.mCallback.clear();
        this.mCallback.add(playerListenerCallback);
    }

    public void setPlayerMode(int i17) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setPlayerMode(i17);
        }
    }

    public void setSpeed(float f17) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setSpeed(f17);
        } else {
            this.mSpeedToSet = java.lang.Float.valueOf(f17);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setVolume(float f17, float f18) {
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.setVolume(f17, f18);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setWakeMode(android.content.Context context, int i17) {
        throw new com.tencent.qqmusic.mediaplayer.UnSupportMethodException("Soft decode player cannot support setWakeMode");
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void start() {
        TransferStateTo(4);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[start]"));
        com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
        if (corePlayer != null) {
            corePlayer.play();
        } else {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "start() mAudioPlayer is null!");
        }
        notifyStartPlaySong();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void stop() {
        try {
            TransferStateTo(6);
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, auxiliary("[stop]"));
            com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer = this.mAudioPlayer;
            if (corePlayer != null) {
                corePlayer.stop();
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "stop() mAudioPlayer is null!");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    public CommonPlayer(com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback) {
        this(playerListenerCallback, null, false, new com.tencent.qqmusic.mediaplayer.QMThreadExecutor() { // from class: com.tencent.qqmusic.mediaplayer.CommonPlayer.2
            @Override // com.tencent.qqmusic.mediaplayer.QMThreadExecutor
            public void execute(java.lang.Runnable runnable, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
                java.lang.Thread thread = new java.lang.Thread(runnable, "decoder");
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                thread.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(int i17, int i18, int i19) {
        TransferStateTo(9);
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "onError prefer MediaCodec " + this.mPreferMediaCodecDecode);
        this.mCallback.onError(this, i17, i18, i19);
    }

    public CommonPlayer(com.tencent.qqmusic.mediaplayer.PlayerListenerCallback playerListenerCallback, android.os.Looper looper, boolean z17, com.tencent.qqmusic.mediaplayer.QMThreadExecutor qMThreadExecutor) {
        com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback listPlayerListenerCallback = new com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback();
        this.mCallback = listPlayerListenerCallback;
        this.mAudioPlayer = null;
        boolean z18 = false;
        this.currentState = 0;
        this.mSpeedToSet = null;
        this.mPreferMediaCodecDecode = false;
        this.mLocalPlayPath = null;
        this.isMatchHuawei = false;
        if (playerListenerCallback != null) {
            listPlayerListenerCallback.add(playerListenerCallback);
        }
        this.eventLooper = looper;
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.mPreferMediaCodecDecode = z17;
        this.mExecutor = qMThreadExecutor;
        if ((android.os.Build.MANUFACTURER + android.os.Build.BRAND + android.os.Build.MODEL).toLowerCase().contains("huawei") && i17 >= 26) {
            z18 = true;
        }
        this.isMatchHuawei = z18;
        reset();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(java.io.FileDescriptor fileDescriptor) {
        throw new com.tencent.qqmusic.mediaplayer.UnSupportMethodException("Soft decode player cannot support setDataSource by FileDescriptor");
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(android.content.Context context, android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        if (android.text.TextUtils.isEmpty(scheme)) {
            setDataSource(uri.toString());
            return;
        }
        if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) {
            if (scheme.equalsIgnoreCase("content")) {
                return;
            }
            scheme.equalsIgnoreCase("file");
            return;
        }
        setDataSource(new com.tencent.qqmusic.mediaplayer.network.DefaultMediaHTTPService(), uri);
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService iMediaHTTPService, android.net.Uri uri) {
        java.io.File createTempFile;
        try {
            java.lang.String str = this.mCacheDir;
            if (str != null && !str.isEmpty()) {
                createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp", new java.io.File(this.mCacheDir));
            } else {
                createTempFile = java.io.File.createTempFile("mediaHttpCommonPlayer", "tmp");
            }
            createTempFile.delete();
            if (!createTempFile.createNewFile()) {
                onError(90, 103, 0);
                return;
            }
            java.lang.String absolutePath = createTempFile.getAbsolutePath();
            com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource cacheDataSource = new com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource(new com.tencent.qqmusic.mediaplayer.upstream.HttpDataSource(uri, null, iMediaHTTPService), new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource(absolutePath), new com.tencent.qqmusic.mediaplayer.downstream.FileDataSink(absolutePath), insureEventLooper());
            com.tencent.qqmusic.mediaplayer.CommonPlayer.OpenedResources openedResources = new com.tencent.qqmusic.mediaplayer.CommonPlayer.OpenedResources();
            this.openedResources = openedResources;
            openedResources.bufferFile = createTempFile;
            this.openedResources.dataSource = cacheDataSource;
            cacheDataSource.setListener(new com.tencent.qqmusic.mediaplayer.CommonPlayer.BufferListener());
            setDataSourceInternal(cacheDataSource);
            checkToRelease();
        } catch (java.io.IOException unused) {
            onError(90, 103, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory iDataSourceFactory) {
        if (iDataSourceFactory != null) {
            TransferStateTo(1);
            com.tencent.qqmusic.mediaplayer.CommonPlayer.CorePlayerCallback corePlayerCallback = new com.tencent.qqmusic.mediaplayer.CommonPlayer.CorePlayerCallback(iDataSourceFactory, null);
            if (this.mPreferMediaCodecDecode) {
                this.mAudioPlayer = new com.tencent.qqmusic.mediaplayer.CorePlayer(iDataSourceFactory.createDataSource(), null, corePlayerCallback, insureEventLooper(), new com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder(), this.mExecutor);
            } else {
                com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource createNativeDataSource = iDataSourceFactory.createNativeDataSource();
                if (createNativeDataSource != null) {
                    this.mAudioPlayer = new com.tencent.qqmusic.mediaplayer.CorePlayer(null, createNativeDataSource, corePlayerCallback, insureEventLooper(), new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder(), this.mExecutor);
                } else {
                    this.mAudioPlayer = new com.tencent.qqmusic.mediaplayer.CorePlayer(iDataSourceFactory.createDataSource(), null, corePlayerCallback, insureEventLooper(), new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder(), this.mExecutor);
                }
            }
            this.mAudioPlayer.setThreadName(iDataSourceFactory.toString());
            setSpeedToCorePlayerIfNeeded(this.mAudioPlayer);
            java.lang.String str = this.mLocalPlayPath;
            if (str != null) {
                this.mAudioPlayer.setPlayPath(str);
            }
            checkToRelease();
            return;
        }
        throw new java.lang.IllegalArgumentException("dataSourceFactory is null!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo) {
        TransferStateTo(1);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "setDataSource, trackInfo.getUri: " + trackInfo.getUri());
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "setDataSource, trackInfo.range: " + trackInfo.getRange().toString());
        this.mBufferPercentage = 100;
        com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource trackDataSource = new com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource(trackInfo);
        java.util.List<com.tencent.qqmusic.mediaplayer.PlayerListenerCallback> collection = this.mCallback.toCollection();
        this.mCallback.clear();
        this.mCallback.add(trackDataSource);
        this.mCallback.addAll(collection);
        TransferStateTo(1);
        com.tencent.qqmusic.mediaplayer.upstream.TracerDataSource tracerDataSource = new com.tencent.qqmusic.mediaplayer.upstream.TracerDataSource(trackDataSource);
        com.tencent.qqmusic.mediaplayer.TrackCorePlayer trackCorePlayer = new com.tencent.qqmusic.mediaplayer.TrackCorePlayer(tracerDataSource, new com.tencent.qqmusic.mediaplayer.CommonPlayer.CorePlayerCallback(null, tracerDataSource), insureEventLooper(), this.mExecutor);
        this.mAudioPlayer = trackCorePlayer;
        trackDataSource.setTrackStateCallback(trackCorePlayer);
        this.mAudioPlayer.setThreadName(trackDataSource.toString());
        setSpeedToCorePlayerIfNeeded(this.mAudioPlayer);
        checkToRelease();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseMediaPlayer
    public void setDataSource(android.content.Context context, final com.tencent.qqmusic.mediaplayer.upstream.UriLoader uriLoader) {
        setDataSource(new com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory() { // from class: com.tencent.qqmusic.mediaplayer.CommonPlayer.3
            @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
            public com.tencent.qqmusic.mediaplayer.upstream.IDataSource createDataSource() {
                return com.tencent.qqmusic.mediaplayer.upstream.CacheDataSource.Factory.createFromUriLoader(uriLoader, com.tencent.qqmusic.mediaplayer.CommonPlayer.this.mCacheDir);
            }

            @Override // com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory
            public com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource createNativeDataSource() {
                return null;
            }
        });
    }
}
