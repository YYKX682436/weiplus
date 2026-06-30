package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes16.dex */
abstract class BaseDecodeDataComponent {
    static final int CALL_PREPARED_DELAY_TIME = 20;
    private static final java.lang.String TAG = "BaseDecodeDataComponent";
    static final int WRITE_ZERO_THRESHOLD = 5;
    private static volatile int sSessionId = -1;
    volatile float leftVolume;
    final com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener mAudioEffectListener;
    android.media.AudioTrack mAudioTrack;
    int mBuffSize;
    final com.tencent.qqmusic.mediaplayer.PlayerCallback mCallback;
    final com.tencent.qqmusic.mediaplayer.CorePlayer mCorePlayer;
    private final android.os.Handler mEventHandler;
    final com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback mHandleDecodeDataCallback;
    final com.tencent.qqmusic.mediaplayer.AudioInformation mInformation;
    private final int mPlayerID;
    final com.tencent.qqmusic.mediaplayer.PlayerStateRunner mStateRunner;
    long mTargetPlaySample;
    final com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener mTerminalAudioEffectListener;
    volatile float rightVolume;
    long mCurPosition = 0;
    boolean mHasDecodeSuccess = false;
    boolean mHasDecode = false;
    boolean mHasInit = false;
    boolean mCreateAudioTrackFail = false;
    volatile boolean needSetVolume = false;
    int mTargetBitDepth = 2;
    final com.tencent.qqmusic.mediaplayer.BufferInfo mDecodeBufferInfo = new com.tencent.qqmusic.mediaplayer.BufferInfo();
    final com.tencent.qqmusic.mediaplayer.FloatBufferInfo mFloatBufferInfo = new com.tencent.qqmusic.mediaplayer.FloatBufferInfo();
    int mAudioStreamType = getAudioStreamType();
    final com.tencent.qqmusic.mediaplayer.util.WaitNotify mSignalControl = new com.tencent.qqmusic.mediaplayer.util.WaitNotify();
    com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer performanceTracer = null;
    volatile boolean mNeedChangePlayThreadPriority = false;
    boolean isUseFloatForHighDepth = false;
    int mLeastCommonMultiple = 1;
    java.lang.Float mSpeedToSet = null;

    /* loaded from: classes16.dex */
    public interface HandleDecodeDataCallback {
        long getCurPositionByDecoder();

        long getMinPcmBufferSize();

        void onAudioTrackChanged(android.media.AudioTrack audioTrack);

        void onPullDecodeDataEndOrFailed(int i17, int i18);

        int pullDecodeData(int i17, byte[] bArr);

        int seekTo(int i17);
    }

    public BaseDecodeDataComponent(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer, com.tencent.qqmusic.mediaplayer.PlayerStateRunner playerStateRunner, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, com.tencent.qqmusic.mediaplayer.PlayerCallback playerCallback, com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback handleDecodeDataCallback, android.os.Handler handler, int i17, com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener, com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener2) {
        this.mCorePlayer = corePlayer;
        this.mStateRunner = playerStateRunner;
        this.mInformation = audioInformation;
        this.mCallback = playerCallback;
        this.mHandleDecodeDataCallback = handleDecodeDataCallback;
        this.mEventHandler = handler;
        this.mPlayerID = i17;
        this.mAudioEffectListener = iAudioListener;
        this.mTerminalAudioEffectListener = iAudioListener2;
    }

    private void destroyAudioListeners() {
        this.mAudioEffectListener.onPlayerStopped();
        this.mTerminalAudioEffectListener.onPlayerStopped();
    }

    public static int getAudioTrackPosition(long j17, android.media.AudioTrack audioTrack) {
        long round;
        if (audioTrack != null) {
            try {
                round = java.lang.Math.round(((j17 + audioTrack.getPlaybackHeadPosition()) / audioTrack.getSampleRate()) * 1000.0d);
            } catch (java.lang.Exception e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getAudioTrackPosition", e17);
            }
            return (int) round;
        }
        round = 0;
        return (int) round;
    }

    public static android.media.AudioTrack instantiateAudioTrackCompat(int i17, int i18, int i19, int i27, int i28, int i29) {
        android.media.AudioTrack create;
        if (sSessionId == -1) {
            sSessionId = 0;
        }
        com.tencent.qqmusic.mediaplayer.IAudioTrackCreator audioTrackCreator = com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.getAudioTrackCreator();
        if (audioTrackCreator != null && (create = audioTrackCreator.create(i17, i18, i19, i27, i28, i29, sSessionId)) != null) {
            return create;
        }
        android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
        builder.setLegacyStreamType(i17);
        android.media.AudioFormat.Builder builder2 = new android.media.AudioFormat.Builder();
        builder2.setSampleRate(i18);
        builder2.setEncoding(i27);
        builder2.setChannelMask(i19);
        return new android.media.AudioTrack.Builder().setAudioAttributes(builder.build()).setAudioFormat(builder2.build()).setBufferSizeInBytes(i28).setTransferMode(i29).setSessionId(sSessionId).build();
    }

    public java.lang.String axiliary(java.lang.String str) {
        return "ID: " + this.mPlayerID + ". " + str;
    }

    public long calculatePcmPlayTime(byte[] bArr, int i17, int i18, long j17) {
        if (i17 == 0 || i18 == 0 || j17 == 0) {
            return 0L;
        }
        return (((bArr.length * 1000.0f) / i17) / i18) / ((float) j17);
    }

    public void callExceptionCallback(int i17, int i18) {
        callExceptionCallback(i17, i18, 0);
    }

    public void changePlayThreadPriorityImmediately() {
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("changePlayThreadPriorityImmediately"));
        this.mNeedChangePlayThreadPriority = true;
    }

    public void convertBytePcmToFloatPcm(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo) {
        try {
            com.tencent.qqmusic.mediaplayer.util.PcmConvertionUtil.convertByteBufferToFloatBuffer(bufferInfo, floatBufferInfo, this.mInformation.getBitDepth());
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
        }
    }

    public void doWaitForPaused() {
        this.mSignalControl.doWait(2000L, 5, new com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener() { // from class: com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.1
            @Override // com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener
            public boolean keepWaiting() {
                return com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.this.isPaused();
            }
        });
    }

    public void flush() {
    }

    public abstract int getAudioStreamType();

    public abstract long getCurPosition();

    public int getMaxSupportSampleRate() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("can't reflect max sample rate, use default sample rate"));
        return 192000;
    }

    public int getMinBufferSize(long j17, int i17, int i18, int i19, int i27) {
        int minBufferSize = android.media.AudioTrack.getMinBufferSize((int) j17, i17, i18);
        if (minBufferSize >= 0) {
            return minBufferSize;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("minBufferSize = " + minBufferSize + " mTargetPlaySample = " + j17 + "  channelConfiguration = " + i17 + "   pcmEncoding = " + i18));
        return i19 * 3536 * i27;
    }

    public int getPlayerState() {
        return this.mStateRunner.get().intValue();
    }

    public int getSessionId() {
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.getAudioSessionId();
        }
        return 0;
    }

    public float getSpeed() {
        java.lang.Float f17 = this.mSpeedToSet;
        if (f17 != null) {
            return f17.floatValue();
        }
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            return audioTrack.getPlaybackParams().getSpeed();
        }
        return 1.0f;
    }

    public abstract void handleDecodeData();

    public void handleHighBitDepth(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2) {
        if (this.isUseFloatForHighDepth) {
            bufferInfo.fillInto(bufferInfo2);
            return;
        }
        try {
            com.tencent.qqmusic.mediaplayer.util.PcmConvertionUtil.convertBitDepthTo16(bufferInfo, bufferInfo2, this.mInformation.getBitDepth());
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
        }
    }

    public void handleHighSample(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2) {
        try {
            com.tencent.qqmusic.mediaplayer.util.PcmConvertionUtil.reSample(bufferInfo, bufferInfo2, this.mInformation.getSampleRate(), this.mTargetPlaySample, this.mTargetBitDepth);
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
        }
    }

    public synchronized boolean hasDecodeData() {
        return this.mHasDecode;
    }

    public synchronized boolean hasDecodeDataSuccess() {
        return this.mHasDecodeSuccess;
    }

    public void initAudioListeners(int i17, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, long j17) {
        this.mAudioEffectListener.onPlayerReady(i17, audioInformation, j17);
        this.mTerminalAudioEffectListener.onPlayerReady(i17, audioInformation, j17);
    }

    public synchronized boolean isCompleted() {
        return this.mStateRunner.isEqual(7);
    }

    public synchronized boolean isError() {
        return this.mStateRunner.isEqual(9);
    }

    public synchronized boolean isIdle() {
        return this.mStateRunner.isEqual(0);
    }

    public boolean isInit() {
        return this.mHasInit;
    }

    public synchronized boolean isPaused() {
        return this.mStateRunner.isEqual(5);
    }

    public synchronized boolean isPlaying() {
        return this.mStateRunner.isEqual(4);
    }

    public synchronized boolean isStopped() {
        return this.mStateRunner.isEqual(6);
    }

    public boolean isSupportHighBitDepth() {
        return true;
    }

    public void notifySeekCompleteForAudioListeners(long j17) {
        this.mAudioEffectListener.onPlayerSeekComplete(j17);
        this.mTerminalAudioEffectListener.onPlayerSeekComplete(j17);
    }

    public void pause(boolean z17) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("pause"));
        this.mStateRunner.transfer(5, 4, 2);
    }

    public void play() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary(com.tencent.tav.core.AssetExtension.SCENE_PLAY));
        this.mStateRunner.transfer(4, 5, 2, 6, 4);
        if (this.mSignalControl.isWaiting()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("lock is Waiting, event: play, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    public void postRunnable(java.lang.Runnable runnable, int i17) {
        this.mEventHandler.postDelayed(runnable, i17);
    }

    public void refreshTimeAndNotify(int i17) {
        if (this.mSignalControl.isWaiting() && isPlaying()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("lock is Waiting, event: seek, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    public void release() {
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
            } catch (java.lang.Throwable th6) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
            }
            try {
                this.mAudioTrack.flush();
            } catch (java.lang.Throwable th7) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th7);
            }
            try {
                this.mAudioTrack.release();
            } catch (java.lang.Throwable th8) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th8);
            }
            try {
                destroyAudioListeners();
            } catch (java.lang.Throwable th9) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[run] failed to destroyAudioListeners!", th9);
            }
            setAudioTrack(null);
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("finally release audioTrack"));
        }
        if (this.mCorePlayer.mIsExit) {
            return;
        }
        if (this.mStateRunner.isEqual(7)) {
            this.mCallback.playerEnded(this.mCorePlayer);
        } else {
            this.mCallback.playerStopped(this.mCorePlayer);
        }
    }

    public void releaseNotify() {
        if (this.mSignalControl.isWaiting()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("lock is Waiting, event: release, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    public void seek(int i17) {
    }

    public void setAudioStreamType(int i17) {
        if (i17 == this.mAudioStreamType) {
            return;
        }
        this.mAudioStreamType = i17;
    }

    public void setAudioTrack(android.media.AudioTrack audioTrack) {
        this.mAudioTrack = audioTrack;
        this.mHandleDecodeDataCallback.onAudioTrackChanged(audioTrack);
    }

    public void setLeastCommonMultiple(int i17) {
        if (i17 >= 1) {
            this.mLeastCommonMultiple = i17;
            return;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "wrong least common multiple: " + i17);
    }

    public void setPerformanceTracer(com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer performanceTracer) {
        this.performanceTracer = performanceTracer;
    }

    public void setSpeed(float f17) {
        this.mSpeedToSet = java.lang.Float.valueOf(f17);
    }

    public void setVolume(float f17, float f18) {
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.setStereoVolume(f17, f18);
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, be1.x0.NAME, e17);
            }
        }
    }

    public void setVolumeForHuawei(float f17, float f18) {
        this.leftVolume = f17;
        this.rightVolume = f18;
        this.needSetVolume = true;
    }

    public void stop() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("stop"));
        if (this.mStateRunner.transfer(6, 4, 5, 2) && this.mSignalControl.isWaiting()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("lock is Waiting, event: stop, doNotify"));
            this.mSignalControl.doNotify();
        }
    }

    private void callExceptionCallback(int i17, int i18, int i19) {
        this.mCallback.playerException(this.mCorePlayer, i17, i18, i19);
    }

    public long calculatePcmPlayTime(float[] fArr, int i17, long j17) {
        if (i17 == 0 || j17 == 0) {
            return 0L;
        }
        return ((fArr.length * 1000.0f) / i17) / ((float) j17);
    }
}
