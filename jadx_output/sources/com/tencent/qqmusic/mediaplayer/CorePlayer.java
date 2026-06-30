package com.tencent.qqmusic.mediaplayer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class CorePlayer implements java.lang.Runnable, com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback {
    private static final java.util.concurrent.atomic.AtomicInteger PLAYER_ID_CREATOR = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final java.lang.String TAG = "CorePlayer";
    final java.util.List<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> mAudioEffectList;
    private final com.tencent.qqmusic.mediaplayer.PlayerCallback mCallback;
    private com.tencent.qqmusic.mediaplayer.upstream.IDataSource mDataSource;
    private final com.tencent.qqmusic.mediaplayer.codec.BaseDecoder mDecoder;
    private final android.os.Handler mEventHandler;
    private final com.tencent.qqmusic.mediaplayer.QMThreadExecutor mExecutor;
    protected com.tencent.qqmusic.mediaplayer.AudioInformation mInformation;
    volatile boolean mIsExit;
    private com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource mNativeDataSource;
    private com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent mPcmCompnent;
    private java.lang.String mPlayPath;
    private int mPlayerID;
    private int mPlayerMode;
    private java.lang.Float mSpeedToSet;
    private final com.tencent.qqmusic.mediaplayer.PlayerStateRunner mStateRunner;
    final java.util.List<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> mTerminalAudioEffectList;
    private java.lang.String mThreadName;
    private com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer performanceTracer;
    private int mTargetBitDepth = 2;
    private boolean mIsAudioEffectParamPrepared = false;

    public CorePlayer(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource iNativeDataSource, com.tencent.qqmusic.mediaplayer.PlayerCallback playerCallback, android.os.Looper looper, com.tencent.qqmusic.mediaplayer.codec.BaseDecoder baseDecoder, com.tencent.qqmusic.mediaplayer.QMThreadExecutor qMThreadExecutor) {
        com.tencent.qqmusic.mediaplayer.PlayerStateRunner playerStateRunner = new com.tencent.qqmusic.mediaplayer.PlayerStateRunner(0);
        this.mStateRunner = playerStateRunner;
        this.mPlayerID = PLAYER_ID_CREATOR.addAndGet(1);
        this.mAudioEffectList = new java.util.concurrent.CopyOnWriteArrayList();
        this.mTerminalAudioEffectList = new java.util.concurrent.CopyOnWriteArrayList();
        this.mSpeedToSet = null;
        this.mThreadName = "Unnamed";
        this.mPlayerMode = 0;
        this.mIsExit = false;
        this.performanceTracer = null;
        this.mPlayPath = null;
        if (iDataSource != null && iNativeDataSource != null) {
            throw new java.lang.IllegalArgumentException("you can't set IDataSource and INativeDataSource at the same time!");
        }
        if (iDataSource == null && iNativeDataSource == null) {
            throw new java.lang.IllegalArgumentException("at least on data source is required!");
        }
        this.mEventHandler = new android.os.Handler(looper);
        this.mDecoder = baseDecoder;
        this.mDataSource = iDataSource;
        this.mNativeDataSource = iNativeDataSource;
        this.mCallback = playerCallback;
        playerStateRunner.transfer(1);
        this.mExecutor = qMThreadExecutor;
    }

    private java.lang.String axiliary(java.lang.String str) {
        return "ID: " + this.mPlayerID + ". " + str;
    }

    private void callExceptionCallback(int i17, int i18) {
        callExceptionCallback(i17, i18, 0);
    }

    private void decodeEndOrFailed(int i17, int i18) {
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("decodeEndOrFailed"));
        try {
            if (this.mPcmCompnent == null) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("mPcmCompnent null! Exiting"));
                return;
            }
            if (this.mInformation != null) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary(java.lang.String.format("current: %d, duration: %d, isExit: %b, decodeSucc: %b", java.lang.Long.valueOf(this.mDecoder.getCurrentTime()), java.lang.Long.valueOf(this.mInformation.getDuration()), java.lang.Boolean.valueOf(this.mIsExit), java.lang.Boolean.valueOf(this.mPcmCompnent.hasDecodeDataSuccess()))));
                i17 &= this.mDecoder.getErrorCodeMask();
            }
            int i19 = 68;
            if (!this.mIsExit && this.mPcmCompnent.hasDecodeDataSuccess()) {
                if (getCurPositionByDecoder() >= getDuration() - 5000) {
                    if (i18 == 92) {
                        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("Decode ended! Exiting."));
                        this.mStateRunner.transfer(7);
                        return;
                    }
                    return;
                }
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("Decode failed! Exiting."));
                if (android.text.TextUtils.isEmpty(this.mPlayPath) || !isPathExternalStorage(this.mPlayPath)) {
                    i19 = 67;
                }
                callExceptionCallback(i18, i19, i17);
                this.mStateRunner.transfer(6);
                return;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("不留痕迹的退出 时机：解码时退出  step = 4"));
            exitNotCallback();
            this.mStateRunner.transfer(9);
            if (android.text.TextUtils.isEmpty(this.mPlayPath) || !isPathExternalStorage(this.mPlayPath)) {
                i19 = 67;
            }
            callExceptionCallback(i18, i19, i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
        }
    }

    private void exitNotCallback() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("exitNotCallback"));
        this.mIsExit = true;
    }

    private boolean isPathExternalStorage(java.lang.String str) {
        return (str.contains("emulated/0") || str.contains("sdcard0")) ? false : true;
    }

    public void addAudioListener(com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener) {
        long j17;
        if (iAudioListener.isTerminal()) {
            if (!this.mTerminalAudioEffectList.contains(iAudioListener)) {
                this.mTerminalAudioEffectList.add(iAudioListener);
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[addAudioListener] terminal audio added: " + iAudioListener);
            }
        } else if (!this.mAudioEffectList.contains(iAudioListener)) {
            this.mAudioEffectList.add(iAudioListener);
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[addAudioListener] audio added: " + iAudioListener);
        }
        if (!this.mIsAudioEffectParamPrepared) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[addAudioListener] audio information not ready. init will be delayed.");
            return;
        }
        try {
            j17 = iAudioListener.onPlayerReady(this.mTargetBitDepth, this.mInformation, getCurPosition());
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[addAudioListener] failed to init audio: " + iAudioListener, th6);
            j17 = 0L;
        }
        if (j17 != 0) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "[addAudioListener] failed to init audio %s, ret: %d", iAudioListener, java.lang.Long.valueOf(j17));
        }
    }

    public void changePlayThreadPriorityImmediately() {
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("changePlayThreadPriorityImmediately"));
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return;
        }
        baseDecodeDataComponent.changePlayThreadPriorityImmediately();
    }

    public com.tencent.qqmusic.mediaplayer.seektable.SeekTable createSeekTable() {
        com.tencent.qqmusic.mediaplayer.codec.BaseDecoder baseDecoder = this.mDecoder;
        if (baseDecoder != null) {
            return new com.tencent.qqmusic.mediaplayer.seektable.NativeSeekTable(baseDecoder);
        }
        throw new java.lang.IllegalStateException("please setDataSource before creating seek table!");
    }

    public void flush() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.flush();
        }
    }

    public long getCurPosition() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return 0L;
        }
        return baseDecodeDataComponent.getCurPosition();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public long getCurPositionByDecoder() {
        try {
            return this.mDecoder.getCurrentTime();
        } catch (com.tencent.qqmusic.mediaplayer.SoNotFindException e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "Strange Exception!", th6);
            return 0L;
        }
    }

    public com.tencent.qqmusic.mediaplayer.AudioInformation getCurrentAudioInformation() {
        return this.mInformation;
    }

    public long getDuration() {
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = this.mInformation;
        if (audioInformation == null) {
            return 0L;
        }
        try {
            return audioInformation.getDuration();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
            return 0L;
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public long getMinPcmBufferSize() {
        return this.mDecoder.getMinBufferSize();
    }

    public int getPlayerMode() {
        return this.mPlayerMode;
    }

    public int getPlayerState() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return 0;
        }
        return baseDecodeDataComponent.getPlayerState();
    }

    public int getSessionId() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            return baseDecodeDataComponent.getSessionId();
        }
        return 0;
    }

    public float getSpeed() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            return baseDecodeDataComponent.getSpeed();
        }
        java.lang.Float f17 = this.mSpeedToSet;
        if (f17 != null) {
            return f17.floatValue();
        }
        return 1.0f;
    }

    public synchronized boolean hasDecodeData() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return false;
        }
        return baseDecodeDataComponent.hasDecodeData();
    }

    public synchronized boolean hasDecodeDataSuccess() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return false;
        }
        return baseDecodeDataComponent.hasDecodeDataSuccess();
    }

    public boolean isInit() {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return false;
        }
        return baseDecodeDataComponent.isInit();
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public void onAudioTrackChanged(android.media.AudioTrack audioTrack) {
        this.mDecoder.setAudioTrack(audioTrack);
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public void onPullDecodeDataEndOrFailed(int i17, int i18) {
        decodeEndOrFailed(i17, i18);
    }

    public void pause(boolean z17) {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("pause"));
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return;
        }
        baseDecodeDataComponent.pause(z17);
    }

    public void play() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary(com.tencent.tav.core.AssetExtension.SCENE_PLAY));
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            return;
        }
        baseDecodeDataComponent.play();
    }

    public void prepare() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("prepare"));
        this.mStateRunner.transfer(3);
        this.mExecutor.execute(this, null);
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public int pullDecodeData(int i17, byte[] bArr) {
        return this.mDecoder.decodeData(i17, bArr);
    }

    public void release() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("release"));
        this.mEventHandler.removeCallbacksAndMessages(null);
        exitNotCallback();
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.releaseNotify();
        }
        this.mStateRunner.transfer(8);
    }

    public void removeAudioListener(com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener) {
        if (this.mAudioEffectList.remove(iAudioListener)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[removeAudioListener] audio removed: " + iAudioListener);
        }
        if (this.mTerminalAudioEffectList.remove(iAudioListener)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "[removeAudioListener] terminal audio removed: " + iAudioListener);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:2|3|(1:5)(2:163|(1:165)(1:166))|6|(2:8|(1:128)(1:12))(1:(14:130|(2:132|(1:160)(1:136))(1:161)|137|138|(1:140)(1:159)|141|142|143|144|(2:151|152)|146|(1:148)|149|150)(1:162))|(3:13|14|15)|(3:46|47|(21:51|(22:56|57|58|59|60|61|62|(1:64)|18|(1:20)|22|(1:24)(1:45)|25|26|27|28|(2:37|38)|30|(1:32)|33|34|35)|118|(1:120)|121|62|(0)|18|(0)|22|(0)(0)|25|26|27|28|(0)|30|(0)|33|34|35))|17|18|(0)|22|(0)(0)|25|26|27|28|(0)|30|(0)|33|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0260, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0261, code lost:
    
        com.tencent.qqmusic.mediaplayer.util.Logger.e(r1, axiliary("release throw a exception = " + r0.getMessage()), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x022d A[Catch: all -> 0x02ab, TRY_LEAVE, TryCatch #4 {all -> 0x02ab, blocks: (B:61:0x01cc, B:62:0x0207, B:64:0x020b, B:18:0x0229, B:20:0x022d, B:118:0x01da, B:120:0x01e5, B:121:0x01e7), top: B:15:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020b A[Catch: all -> 0x02ab, TryCatch #4 {all -> 0x02ab, blocks: (B:61:0x01cc, B:62:0x0207, B:64:0x020b, B:18:0x0229, B:20:0x022d, B:118:0x01da, B:120:0x01e5, B:121:0x01e7), top: B:15:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038e  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.CorePlayer.run():void");
    }

    public void seek(int i17) {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.seek(i17);
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback
    public int seekTo(int i17) {
        return this.mDecoder.seekTo(i17);
    }

    public void setAudioStreamType(int i17) {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setAudioStreamType(i17);
        }
    }

    public void setLeastCommonMultiple(int i17) {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setLeastCommonMultiple(i17);
        }
    }

    public void setPlayPath(java.lang.String str) {
        this.mPlayPath = str;
    }

    public void setPlayerMode(int i17) {
        this.mPlayerMode = i17;
    }

    public void setSpeed(float f17) {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            this.mSpeedToSet = java.lang.Float.valueOf(f17);
        } else {
            baseDecodeDataComponent.setSpeed(f17);
        }
    }

    public void setThreadName(java.lang.String str) {
        this.mThreadName = str;
    }

    public void setVolume(float f17, float f18) {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setVolume(f17, f18);
        }
    }

    public void setVolumeForHuawei(float f17, float f18) {
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent != null) {
            baseDecodeDataComponent.setVolumeForHuawei(f17, f18);
        }
    }

    public void stop() {
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("stop"));
        com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent baseDecodeDataComponent = this.mPcmCompnent;
        if (baseDecodeDataComponent == null) {
            exitNotCallback();
        } else {
            baseDecodeDataComponent.stop();
        }
    }

    private void callExceptionCallback(int i17, int i18, int i19) {
        this.mCallback.playerException(this, i17, i18, i19);
    }

    /* loaded from: classes13.dex */
    public class AudioListenerDelegate implements com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener {
        private final boolean mIsTerminal;

        public AudioListenerDelegate(boolean z17) {
            this.mIsTerminal = z17;
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public long getActualTime(long j17) {
            java.util.Iterator<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> it = getAudioListeners().iterator();
            while (it.hasNext()) {
                j17 = it.next().getActualTime(j17);
            }
            return j17;
        }

        public java.util.List<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> getAudioListeners() {
            return this.mIsTerminal ? com.tencent.qqmusic.mediaplayer.CorePlayer.this.mTerminalAudioEffectList : com.tencent.qqmusic.mediaplayer.CorePlayer.this.mAudioEffectList;
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean isEnabled() {
            java.util.Iterator<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> it = getAudioListeners().iterator();
            while (it.hasNext()) {
                if (it.next().isEnabled()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean isTerminal() {
            return this.mIsTerminal;
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean onPcm(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, long j17) {
            com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo3;
            boolean z17;
            boolean z18 = false;
            if (!this.mIsTerminal) {
                java.util.List<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> list = com.tencent.qqmusic.mediaplayer.CorePlayer.this.mAudioEffectList;
                if (list.size() == 0) {
                    bufferInfo.fillInto(bufferInfo2);
                } else {
                    com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo4 = bufferInfo;
                    com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo5 = bufferInfo2;
                    for (com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener : list) {
                        if (iAudioListener.isEnabled()) {
                            try {
                                bufferInfo5.setByteBufferCapacity(bufferInfo4.bufferSize);
                                z17 = iAudioListener.onPcm(bufferInfo4, bufferInfo5, j17);
                            } catch (java.lang.Throwable th6) {
                                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CorePlayer.TAG, "[onPcm] failed. audio: " + iAudioListener + " e: " + th6);
                                z17 = false;
                            }
                            if (z17) {
                                com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo6 = bufferInfo5;
                                bufferInfo5 = bufferInfo4;
                                bufferInfo4 = bufferInfo6;
                            } else {
                                bufferInfo4.fillInto(bufferInfo5);
                            }
                        } else {
                            bufferInfo4.fillInto(bufferInfo5);
                        }
                        int i17 = bufferInfo5.bufferSize;
                    }
                    if (bufferInfo4 == bufferInfo) {
                        bufferInfo.fillInto(bufferInfo2);
                    }
                }
            } else {
                java.util.List<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> list2 = com.tencent.qqmusic.mediaplayer.CorePlayer.this.mTerminalAudioEffectList;
                if (list2.size() == 0) {
                    bufferInfo.fillInto(bufferInfo2);
                } else {
                    int size = list2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener2 = list2.get(size);
                        if (iAudioListener2.isEnabled()) {
                            try {
                                bufferInfo2.setByteBufferCapacity(bufferInfo.bufferSize);
                                z18 = iAudioListener2.onPcm(bufferInfo, bufferInfo2, j17);
                            } catch (java.lang.Throwable th7) {
                                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CorePlayer.TAG, "[onPcm] failed. audio: " + iAudioListener2 + " e: " + th7);
                            }
                            if (z18) {
                                bufferInfo3 = bufferInfo2;
                            } else {
                                bufferInfo.fillInto(bufferInfo2);
                            }
                        } else {
                            bufferInfo.fillInto(bufferInfo2);
                            size--;
                        }
                    }
                    bufferInfo3 = bufferInfo;
                    if (bufferInfo3 == bufferInfo) {
                        bufferInfo.fillInto(bufferInfo2);
                    }
                }
            }
            return true;
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public long onPlayerReady(int i17, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, long j17) {
            com.tencent.qqmusic.mediaplayer.CorePlayer.this.mTargetBitDepth = i17;
            com.tencent.qqmusic.mediaplayer.CorePlayer.this.mIsAudioEffectParamPrepared = true;
            java.util.Iterator<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> it = getAudioListeners().iterator();
            while (it.hasNext()) {
                it.next().onPlayerReady(i17, audioInformation, j17);
            }
            return 0L;
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public void onPlayerSeekComplete(long j17) {
            java.util.Iterator<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> it = getAudioListeners().iterator();
            while (it.hasNext()) {
                it.next().onPlayerSeekComplete(j17);
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public void onPlayerStopped() {
            java.util.Iterator<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> it = getAudioListeners().iterator();
            while (it.hasNext()) {
                it.next().onPlayerStopped();
            }
        }

        @Override // com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener
        public boolean onPcm(com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo, com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo2, long j17) {
            com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo3;
            boolean z17;
            boolean z18 = false;
            if (!this.mIsTerminal) {
                java.util.List<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> list = com.tencent.qqmusic.mediaplayer.CorePlayer.this.mAudioEffectList;
                if (list.size() == 0) {
                    floatBufferInfo.copy(floatBufferInfo2);
                } else {
                    com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo4 = floatBufferInfo;
                    com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo5 = floatBufferInfo2;
                    for (com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener : list) {
                        if (iAudioListener.isEnabled()) {
                            try {
                                floatBufferInfo5.setFloatBufferCapacity(floatBufferInfo4.bufferSize);
                                z17 = iAudioListener.onPcm(floatBufferInfo4, floatBufferInfo5, j17);
                            } catch (java.lang.Throwable th6) {
                                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CorePlayer.TAG, "[onPcm] failed. audio: " + iAudioListener + " e: " + th6);
                                z17 = false;
                            }
                            if (z17) {
                                com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo6 = floatBufferInfo5;
                                floatBufferInfo5 = floatBufferInfo4;
                                floatBufferInfo4 = floatBufferInfo6;
                            } else {
                                floatBufferInfo4.copy(floatBufferInfo5);
                            }
                        } else {
                            floatBufferInfo4.copy(floatBufferInfo5);
                        }
                        int i17 = floatBufferInfo5.bufferSize;
                    }
                    if (floatBufferInfo4 == floatBufferInfo) {
                        floatBufferInfo.copy(floatBufferInfo2);
                    }
                }
            } else {
                java.util.List<com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener> list2 = com.tencent.qqmusic.mediaplayer.CorePlayer.this.mTerminalAudioEffectList;
                if (list2.size() == 0) {
                    floatBufferInfo.copy(floatBufferInfo2);
                } else {
                    int size = list2.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener2 = list2.get(size);
                        if (iAudioListener2.isEnabled()) {
                            try {
                                floatBufferInfo2.setFloatBufferCapacity(floatBufferInfo.bufferSize);
                                z18 = iAudioListener2.onPcm(floatBufferInfo, floatBufferInfo2, j17);
                            } catch (java.lang.Throwable th7) {
                                com.tencent.qqmusic.mediaplayer.util.Logger.e(com.tencent.qqmusic.mediaplayer.CorePlayer.TAG, "[onPcm] failed. audio: " + iAudioListener2 + " e: " + th7);
                            }
                            if (z18) {
                                floatBufferInfo3 = floatBufferInfo2;
                            } else {
                                floatBufferInfo.copy(floatBufferInfo2);
                            }
                        } else {
                            floatBufferInfo.copy(floatBufferInfo2);
                            size--;
                        }
                    }
                    floatBufferInfo3 = floatBufferInfo;
                    if (floatBufferInfo3 == floatBufferInfo) {
                        floatBufferInfo.copy(floatBufferInfo2);
                    }
                }
            }
            return true;
        }
    }
}
