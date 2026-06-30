package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes16.dex */
class StaticDecodeDataComponent extends com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent {
    private static final java.lang.String TAG = "StaticDecodeDataComponent";
    private int mAllBufferSize;
    private java.util.List<com.tencent.qqmusic.mediaplayer.BufferInfo> mAllPcmBufferList;
    private boolean mHasTerminal;
    private boolean mIsfirstStarted;

    public StaticDecodeDataComponent(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer, com.tencent.qqmusic.mediaplayer.PlayerStateRunner playerStateRunner, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, com.tencent.qqmusic.mediaplayer.PlayerCallback playerCallback, com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback handleDecodeDataCallback, android.os.Handler handler, int i17, com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener, com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener2) {
        super(corePlayer, playerStateRunner, audioInformation, playerCallback, handleDecodeDataCallback, handler, i17, iAudioListener, iAudioListener2);
        this.mHasTerminal = false;
        this.mBuffSize = 8192;
    }

    private boolean createAudioTrack() {
        int i17;
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("createAudioTrack"));
        if (this.mInformation == null) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("不留痕迹的退出 时机：获取Information时 step = 3"));
            this.mStateRunner.transfer(9);
            callExceptionCallback(91, 63);
            return false;
        }
        if (!this.mStateRunner.isEqual(3)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("mState is not preparing"));
            callExceptionCallback(91, 54);
            return false;
        }
        if (this.mInformation.getSampleRate() <= 0) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("mInformation.getSampleRate() failed"));
            callExceptionCallback(91, 64);
            return false;
        }
        int channels = this.mInformation.getChannels();
        if (channels == 1) {
            i17 = 4;
        } else {
            int i18 = 12;
            if (channels != 2) {
                if (channels == 6) {
                    i18 = 252;
                } else if (channels == 8) {
                    i18 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
                }
            }
            i17 = i18;
        }
        this.mTargetPlaySample = this.mInformation.getSampleRate();
        int bitDepth = this.mInformation.getBitDepth();
        while (this.mTargetPlaySample > getMaxSupportSampleRate()) {
            this.mTargetPlaySample /= 2;
        }
        if (isSupportHighBitDepth() && bitDepth >= 3) {
            this.mTargetBitDepth = bitDepth;
            this.isUseFloatForHighDepth = true;
            if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use float resampled pcm for Hi-Res, bitDept: " + bitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use float pcm for Hi-Res, bitDept: " + bitDepth + ", sample rate: " + this.mTargetPlaySample));
            }
        } else if (isSupportHighBitDepth() || bitDepth < 3) {
            this.mTargetBitDepth = bitDepth;
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use byte pcm resampled, bitDept: " + bitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
        } else {
            this.mTargetBitDepth = 2;
            if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use byte pcm resampled and bitDept converted, origin bitDept: " + bitDepth + ", target bitDept: " + this.mTargetBitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use byte pcm with bitDept converted, origin bitDept: " + bitDepth + ", target bitDept: " + this.mTargetBitDepth));
            }
        }
        int i19 = bitDepth == 1 ? 3 : (bitDepth != 2 && this.isUseFloatForHighDepth) ? 4 : 2;
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary(java.lang.String.format("mTargetPlaySample: %d, playChannel: %d", java.lang.Long.valueOf(this.mTargetPlaySample), java.lang.Integer.valueOf(channels))));
        try {
            setAudioTrack(com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.instantiateAudioTrackCompat(this.mAudioStreamType, (int) this.mTargetPlaySample, i17, i19, this.mAllBufferSize, 0));
            if (this.mSpeedToSet != null) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("setSpeed:" + this.mSpeedToSet));
                android.media.PlaybackParams playbackParams = this.mAudioTrack.getPlaybackParams();
                playbackParams.setSpeed(this.mSpeedToSet.floatValue());
                this.mSpeedToSet = null;
                this.mAudioTrack.setPlaybackParams(playbackParams);
            }
            if (this.mAudioTrack.getState() == 2) {
                com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("new AudioTrack succeed"));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
        }
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null && audioTrack.getState() == 2) {
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("create audioTrack success"));
            return true;
        }
        this.mCreateAudioTrackFail = true;
        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("create audioTrack fail mCreateAudioTrackFail = true"));
        setAudioTrack(null);
        this.mStateRunner.transfer(9);
        callExceptionCallback(91, 66);
        return false;
    }

    private boolean decodeAllData() {
        this.mAllPcmBufferList = new java.util.ArrayList();
        while (true) {
            if (this.mCorePlayer.mIsExit) {
                break;
            }
            com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo = new com.tencent.qqmusic.mediaplayer.BufferInfo();
            bufferInfo.setByteBufferCapacity(this.mBuffSize);
            try {
                int pullDecodeData = this.mHandleDecodeDataCallback.pullDecodeData(this.mBuffSize, bufferInfo.byteBuffer);
                this.mHasDecode = true;
                if (pullDecodeData > 0) {
                    bufferInfo.bufferSize = pullDecodeData;
                    this.mAllPcmBufferList.add(bufferInfo);
                    if (!this.mHasDecodeSuccess) {
                        this.mHasDecodeSuccess = true;
                    }
                } else {
                    if (pullDecodeData != 0) {
                        this.mHandleDecodeDataCallback.onPullDecodeDataEndOrFailed(pullDecodeData, 91);
                        return false;
                    }
                    bufferInfo.bufferSize = this.mBuffSize;
                    this.mAllPcmBufferList.add(bufferInfo);
                    com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "static decode end");
                }
            } catch (com.tencent.qqmusic.mediaplayer.SoNotFindException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
                this.mStateRunner.transfer(9);
                callExceptionCallback(91, 62);
                return false;
            } catch (java.lang.Throwable th6) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
                this.mStateRunner.transfer(9);
                callExceptionCallback(91, 67);
                return false;
            }
        }
        if (!this.mAllPcmBufferList.isEmpty()) {
            java.util.Iterator<com.tencent.qqmusic.mediaplayer.BufferInfo> it = this.mAllPcmBufferList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i17 += it.next().bufferSize;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "static totalBufferSize = " + i17);
            this.mDecodeBufferInfo.setByteBufferCapacity(i17);
            int i18 = 0;
            for (com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2 : this.mAllPcmBufferList) {
                java.lang.System.arraycopy(bufferInfo2.byteBuffer, 0, this.mDecodeBufferInfo.byteBuffer, i18, bufferInfo2.bufferSize);
                int i19 = bufferInfo2.bufferSize;
                i18 += i19;
                this.mDecodeBufferInfo.bufferSize += i19;
                this.mAllBufferSize += bufferInfo2.bufferSize;
            }
        }
        return true;
    }

    private void playAudioTrack() {
        this.mAudioTrack.reloadStaticData();
        while (!this.mCorePlayer.mIsExit) {
            if (isPaused()) {
                if (this.mAudioTrack.getPlayState() != 2) {
                    this.mAudioTrack.pause();
                }
                postRunnable(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent staticDecodeDataComponent = com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.this;
                        staticDecodeDataComponent.mCallback.playerPaused(staticDecodeDataComponent.mCorePlayer);
                    }
                }, 20);
                doWaitForPaused();
            } else {
                if (isIdle()) {
                    return;
                }
                if (isError()) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "static play error");
                    return;
                }
                if (isStopped()) {
                    if (this.mAudioTrack.getPlayState() != 1) {
                        this.mAudioTrack.stop();
                    }
                    postRunnable(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.4
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent staticDecodeDataComponent = com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.this;
                            staticDecodeDataComponent.mCallback.playerStopped(staticDecodeDataComponent.mCorePlayer);
                        }
                    }, 20);
                    return;
                } else {
                    if (isCompleted()) {
                        this.mCorePlayer.mIsExit = true;
                        return;
                    }
                    if (isPlaying()) {
                        if (this.mAudioTrack.getPlayState() == 2) {
                            this.mAudioTrack.play();
                        } else if (this.mAudioTrack.getPlayState() == 1) {
                            if (!this.mIsfirstStarted) {
                                this.mIsfirstStarted = true;
                                this.mAudioTrack.play();
                                this.mCallback.playerStarted(this.mCorePlayer);
                            }
                        } else if (com.tencent.qqmusic.mediaplayer.utils.AudioUtil.getPlaybackHeadPositionSafely(this.mAudioTrack) * this.mInformation.getChannels() * this.mTargetBitDepth >= this.mAllBufferSize) {
                            this.mStateRunner.transfer(7);
                            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "static play completed");
                            postRunnable(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.5
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent staticDecodeDataComponent = com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.this;
                                    staticDecodeDataComponent.mCallback.playerEnded(staticDecodeDataComponent.mCorePlayer);
                                }
                            }, 20);
                        }
                    }
                }
            }
        }
    }

    private boolean writeAudioTrack() {
        com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo = new com.tencent.qqmusic.mediaplayer.BufferInfo();
        if (this.mDecodeBufferInfo.byteBuffer != null && this.mAudioTrack != null) {
            if (this.mTargetBitDepth != this.mInformation.getBitDepth()) {
                handleHighBitDepth(this.mDecodeBufferInfo, bufferInfo);
                this.mDecodeBufferInfo.fillInto(bufferInfo);
            }
            if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                handleHighSample(this.mDecodeBufferInfo, bufferInfo);
                this.mDecodeBufferInfo.fillInto(bufferInfo);
            }
            if (this.isUseFloatForHighDepth) {
                convertBytePcmToFloatPcm(this.mDecodeBufferInfo, this.mFloatBufferInfo);
                com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener = this.mAudioEffectListener;
                com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo = this.mFloatBufferInfo;
                iAudioListener.onPcm(floatBufferInfo, floatBufferInfo, this.mCorePlayer.getCurPositionByDecoder());
            } else {
                this.mAudioEffectListener.onPcm(this.mDecodeBufferInfo, bufferInfo, this.mCorePlayer.getCurPositionByDecoder());
                this.mDecodeBufferInfo.fillInto(bufferInfo);
            }
            this.mHasTerminal = false;
            if (this.mTerminalAudioEffectListener.isEnabled()) {
                if (this.isUseFloatForHighDepth) {
                    com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener2 = this.mTerminalAudioEffectListener;
                    com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo2 = this.mFloatBufferInfo;
                    iAudioListener2.onPcm(floatBufferInfo2, floatBufferInfo2, this.mCorePlayer.getCurPositionByDecoder());
                } else {
                    com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener3 = this.mTerminalAudioEffectListener;
                    com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2 = this.mDecodeBufferInfo;
                    iAudioListener3.onPcm(bufferInfo2, bufferInfo2, this.mCorePlayer.getCurPositionByDecoder());
                }
                this.mHasTerminal = true;
            }
            if (!this.mHasTerminal) {
                if (this.isUseFloatForHighDepth) {
                    android.media.AudioTrack audioTrack = this.mAudioTrack;
                    com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo3 = this.mFloatBufferInfo;
                    int write = audioTrack.write(floatBufferInfo3.floatBuffer, 0, floatBufferInfo3.bufferSize, 0);
                    if (write < 0) {
                        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("mAudioTrack write float failed: " + write + ", expect: " + this.mFloatBufferInfo.bufferSize));
                        this.mStateRunner.transfer(9);
                        callExceptionCallback(91, 102);
                        return false;
                    }
                    if (write != this.mFloatBufferInfo.bufferSize) {
                        com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, axiliary("mAudioTrack write float not equal: " + write + ", expect: " + this.mFloatBufferInfo.bufferSize));
                    }
                    int i17 = this.mFloatBufferInfo.bufferSize;
                } else {
                    android.media.AudioTrack audioTrack2 = this.mAudioTrack;
                    com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo3 = this.mDecodeBufferInfo;
                    int write2 = audioTrack2.write(bufferInfo3.byteBuffer, 0, bufferInfo3.bufferSize);
                    if (write2 < 0) {
                        com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("mAudioTrack write bytes failed: " + write2 + ", expect: " + this.mDecodeBufferInfo.bufferSize));
                        this.mStateRunner.transfer(9);
                        callExceptionCallback(91, 102);
                        return false;
                    }
                    if (write2 != this.mDecodeBufferInfo.bufferSize) {
                        com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, axiliary("mAudioTrack write bytes not equal: " + write2 + ", expect: " + this.mDecodeBufferInfo.bufferSize));
                    }
                    int i18 = this.mDecodeBufferInfo.bufferSize;
                }
                return true;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "mTerminalAudioEffectList has blocked");
        }
        return false;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public int getAudioStreamType() {
        return 3;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public long getCurPosition() {
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null || audioTrack.getState() == 0) {
            return this.mCurPosition;
        }
        long audioTrackPosition = com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.getAudioTrackPosition(0L, audioTrack);
        this.mCurPosition = audioTrackPosition;
        return audioTrackPosition;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void handleDecodeData() {
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = this.mInformation;
        if (audioInformation == null) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("不留痕迹的退出 时机：获取Information时 step = 3"));
            this.mStateRunner.transfer(9);
            callExceptionCallback(91, 63);
            return;
        }
        try {
        } catch (com.tencent.qqmusic.mediaplayer.SoNotFindException e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
        if (0 >= audioInformation.getSampleRate()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "failed to getSampleRate");
            this.mStateRunner.transfer(9);
            callExceptionCallback(91, 63);
            return;
        }
        if (this.mInformation.getChannels() <= 0) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "failed to getChannels");
            this.mStateRunner.transfer(9);
            callExceptionCallback(91, 63);
            return;
        }
        this.mHasInit = true;
        if (!decodeAllData()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "failed to decodeAllData");
            this.mStateRunner.transfer(9);
            return;
        }
        if (!createAudioTrack()) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "failed to createAudioTrack");
            this.mStateRunner.transfer(9);
            return;
        }
        initAudioListeners(this.mTargetBitDepth, this.mInformation, getCurPosition());
        if (!writeAudioTrack() && !this.mHasTerminal) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "failed to writeAudioTrack");
            this.mStateRunner.transfer(9);
            return;
        }
        if (this.mHasTerminal) {
            this.mStateRunner.transfer(7);
            return;
        }
        if (!this.mStateRunner.transfer(2, 3)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "failed to transfer to PREPARED because cur State is NOT PREPARING!!");
            return;
        }
        this.mIsfirstStarted = false;
        postRunnable(new java.lang.Runnable() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.this.getPlayerState() == 8) {
                    com.tencent.qqmusic.mediaplayer.util.Logger.w(com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.TAG, "[run] state changed to END during postRunnable!");
                } else {
                    com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent staticDecodeDataComponent = com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.this;
                    staticDecodeDataComponent.mCallback.playerPrepared(staticDecodeDataComponent.mCorePlayer);
                }
            }
        }, 0);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("prepared. waiting..."));
        this.mSignalControl.doWait(20L, 100, new com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener() { // from class: com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.2
            @Override // com.tencent.qqmusic.mediaplayer.util.WaitNotify.WaitListener
            public boolean keepWaiting() {
                return com.tencent.qqmusic.mediaplayer.StaticDecodeDataComponent.this.getPlayerState() == 2;
            }
        });
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("woke after preparing"));
        playAudioTrack();
    }
}
