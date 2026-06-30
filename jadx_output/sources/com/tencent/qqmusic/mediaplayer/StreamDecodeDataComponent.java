package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes16.dex */
class StreamDecodeDataComponent extends com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent {
    private static final int MAX_AUDIO_TRACK_BUFFER_TIME = 1;
    private static final int MIN_AUDIO_TRACK_BUFFER_TIMES = 1;
    private static final java.lang.String TAG = "StreamDecodeDataComponent";
    private static final int USE_AUDIO_TRACK_TIME_THRESHOLD = 5000;
    private long mCurrentFrameCount;
    private boolean mNeedFlush;
    private final java.util.Stack<java.lang.Integer> mSeekRecord;
    private int mTrackBufferSizeInByte;

    public StreamDecodeDataComponent(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer, com.tencent.qqmusic.mediaplayer.PlayerStateRunner playerStateRunner, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, com.tencent.qqmusic.mediaplayer.PlayerCallback playerCallback, com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.HandleDecodeDataCallback handleDecodeDataCallback, android.os.Handler handler, int i17, com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener, com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener iAudioListener2) {
        super(corePlayer, playerStateRunner, audioInformation, playerCallback, handleDecodeDataCallback, handler, i17, iAudioListener, iAudioListener2);
        this.mSeekRecord = new java.util.Stack<>();
        this.mCurrentFrameCount = 0L;
        this.mNeedFlush = false;
    }

    private void addSeekRecord(int i17) {
        synchronized (this.mSeekRecord) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "add seek: " + i17);
            this.mSeekRecord.push(java.lang.Integer.valueOf(i17));
        }
    }

    private boolean createAudioTrack() {
        int i17;
        int i18;
        int i19;
        int state;
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("createAudioTrack"));
        if (!this.mStateRunner.isEqual(3)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "mState is not preparing");
            callExceptionCallback(91, 54);
            return false;
        }
        if (this.mInformation.getSampleRate() <= 0) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "mInformation.getSampleRate() failed");
            callExceptionCallback(91, 64);
            return false;
        }
        int channels = this.mInformation.getChannels();
        if (channels == 1) {
            i17 = 4;
        } else {
            int i27 = 12;
            if (channels != 2) {
                if (channels == 6) {
                    i27 = 252;
                } else if (channels == 8) {
                    i27 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
                }
            }
            i17 = i27;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary(this.mInformation.toString()));
        this.mTargetPlaySample = this.mInformation.getSampleRate();
        while (this.mTargetPlaySample > getMaxSupportSampleRate()) {
            this.mTargetPlaySample /= 2;
        }
        int bitDepth = this.mInformation.getBitDepth();
        int i28 = bitDepth == 0 ? 2 : bitDepth;
        if (isSupportHighBitDepth() && this.mInformation.getBitDepth() >= 3) {
            this.mTargetBitDepth = i28;
            this.isUseFloatForHighDepth = true;
            if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use float resampled pcm for Hi-Res, bitDept: " + this.mInformation.getBitDepth() + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use float pcm for Hi-Res, bitDept: " + this.mInformation.getBitDepth() + ", sample rate: " + this.mTargetPlaySample));
            }
        } else if (isSupportHighBitDepth() || this.mInformation.getBitDepth() < 3) {
            this.mTargetBitDepth = i28;
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use byte pcm resampled, bitDept: " + this.mInformation.getBitDepth() + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
        } else {
            this.mTargetBitDepth = 2;
            if (this.mTargetPlaySample != this.mInformation.getSampleRate()) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use byte pcm resampled and bitDept converted, origin bitDept: " + this.mInformation.getBitDepth() + ", target bitDept: " + this.mTargetBitDepth + ", origin sample rate: " + this.mInformation.getSampleRate() + ", target sample rate: " + this.mTargetPlaySample));
            } else {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("will use byte pcm with bitDept converted, origin bitDept: " + this.mInformation.getBitDepth() + ", target bitDept: " + this.mTargetBitDepth));
            }
        }
        int i29 = i28 == 1 ? 3 : (i28 != 2 && this.isUseFloatForHighDepth) ? 4 : 2;
        int minPcmBufferSize = (int) this.mHandleDecodeDataCallback.getMinPcmBufferSize();
        int minBufferSize = getMinBufferSize(this.mTargetPlaySample, i17, i29, channels, i28);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("[createAudioTrack] playback_bufsize:" + minBufferSize + " decoderBufsizeInByte:" + minPcmBufferSize));
        int i37 = this.mLeastCommonMultiple;
        if (i37 > 1) {
            minBufferSize = getLcm(i37, minBufferSize);
        }
        if (minBufferSize > minPcmBufferSize) {
            minPcmBufferSize = minBufferSize;
        }
        this.mBuffSize = minPcmBufferSize;
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary(java.lang.String.format("playback_bufsize: %d, mBuffSize: %d, mTargetPlaySample: %d, playChannel: %d, pcmEncoding: %d", java.lang.Integer.valueOf(minBufferSize), java.lang.Integer.valueOf(this.mBuffSize), java.lang.Long.valueOf(this.mTargetPlaySample), java.lang.Integer.valueOf(channels), java.lang.Integer.valueOf(i29))));
        int max = java.lang.Math.max((int) (java.lang.Math.floor((((this.mTargetPlaySample * 1) * channels) * 2) / minBufferSize) + 1.0d), 1);
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("times: " + max + ", MIN_AUDIO_TRACK_BUFFER_TIMES: 1"));
        int i38 = max;
        while (i38 >= 1) {
            int i39 = minBufferSize * i38;
            try {
                this.mTrackBufferSizeInByte = i39;
                i18 = i28;
                i19 = i17;
                try {
                    setAudioTrack(com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.instantiateAudioTrackCompat(this.mAudioStreamType, (int) this.mTargetPlaySample, i17, i29, i39, 1));
                    com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("[createAudioTrack] new AudioTrack, sampleRate: " + this.mTargetPlaySample + ", channels: " + i19 + ", bitDepth: " + i18 + ", buffer: " + this.mTrackBufferSizeInByte));
                    state = this.mAudioTrack.getState();
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th);
                    i38 -= 2;
                    i28 = i18;
                    i17 = i19;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                i18 = i28;
                i19 = i17;
            }
            if (state == 1) {
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("new AudioTrack succeed"));
                break;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("audioTrack create fail!!! state = " + state));
            this.mAudioTrack.release();
            i38 -= 2;
            i28 = i18;
            i17 = i19;
        }
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null || audioTrack.getState() != 1) {
            this.mCreateAudioTrackFail = true;
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, axiliary("create audioTrack fail mCreateAudioTrackFail = true"));
            setAudioTrack(null);
            callExceptionCallback(92, 66);
            return false;
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, axiliary("create audioTrack success times = " + i38));
        this.mStateRunner.setAudioTrack(this.mAudioTrack);
        return true;
    }

    private long getCalcBitMinSize(com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation) {
        if (audioInformation != null) {
            return (((float) ((audioInformation.getSampleRate() * audioInformation.getChannels()) * audioInformation.getBitDepth())) * 5.0f) / 1000.0f;
        }
        return 0L;
    }

    private int getGcd(int i17, int i18) {
        while (true) {
            int i19 = i18;
            int i27 = i17;
            i17 = i19;
            if (i17 <= 0) {
                return i27;
            }
            i18 = i27 % i17;
        }
    }

    private int getLcm(int i17, int i18) {
        return (i17 * i18) / getGcd(i17, i18);
    }

    private com.tencent.qqmusic.mediaplayer.BufferInfo initTempBufferInfoIfNeeded(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, int i17) {
        if (bufferInfo != null) {
            return bufferInfo;
        }
        com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2 = new com.tencent.qqmusic.mediaplayer.BufferInfo();
        bufferInfo2.setByteBufferCapacity(i17);
        return bufferInfo2;
    }

    private com.tencent.qqmusic.mediaplayer.FloatBufferInfo initTempFloatBufferInfoIfNeeded(com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo, int i17) {
        if (floatBufferInfo != null) {
            return floatBufferInfo;
        }
        com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo2 = new com.tencent.qqmusic.mediaplayer.FloatBufferInfo();
        floatBufferInfo2.setFloatBufferCapacity(i17);
        return floatBufferInfo2;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void flush() {
        this.mNeedFlush = true;
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
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = this.mInformation;
        if (audioInformation == null) {
            return this.mCurPosition;
        }
        long actualTime = this.mAudioEffectListener.getActualTime(com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.getAudioTrackPosition(this.mCurrentFrameCount, audioTrack));
        long channels = audioInformation.getChannels() * this.mTargetBitDepth * audioInformation.getPlaySample();
        long curPositionByDecoder = this.mHandleDecodeDataCallback.getCurPositionByDecoder() - java.lang.Math.max(0L, channels > 0 ? (this.mTrackBufferSizeInByte / channels) * 1000 : 0L);
        if (curPositionByDecoder < 0) {
            this.mCurPosition = actualTime;
        } else if (actualTime <= 0 || java.lang.Math.abs(actualTime - curPositionByDecoder) >= 5000) {
            this.mCurPosition = curPositionByDecoder;
        } else {
            this.mCurPosition = actualTime;
        }
        return this.mCurPosition;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0709  */
    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleDecodeData() {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.StreamDecodeDataComponent.handleDecodeData():void");
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void pause(boolean z17) {
        android.media.AudioTrack audioTrack;
        super.pause(z17);
        if (!z17 || (audioTrack = this.mAudioTrack) == null) {
            return;
        }
        try {
            if (audioTrack.getState() != 1 || audioTrack.getPlayState() == 2) {
                return;
            }
            audioTrack.pause();
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void release() {
        super.release();
        this.mCurrentFrameCount = 0L;
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void seek(int i17) {
        addSeekRecord(i17);
        refreshTimeAndNotify(i17);
    }

    @Override // com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent
    public void setAudioStreamType(int i17) {
        if (i17 == this.mAudioStreamType) {
            return;
        }
        try {
            this.mAudioStreamType = i17;
            android.media.AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack != null) {
                android.media.AudioTrack instantiateAudioTrackCompat = com.tencent.qqmusic.mediaplayer.BaseDecodeDataComponent.instantiateAudioTrackCompat(i17, audioTrack.getSampleRate(), this.mAudioTrack.getChannelConfiguration(), this.mAudioTrack.getAudioFormat(), this.mTrackBufferSizeInByte, 1);
                com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, axiliary("[setAudioStreamType] new AudioTrack, sampleRate: " + this.mAudioTrack.getSampleRate() + ", channels: " + this.mAudioTrack.getChannelConfiguration() + ", bitDepth: " + this.mAudioTrack.getAudioFormat() + ", buffer: " + this.mTrackBufferSizeInByte));
                int playState = this.mAudioTrack.getPlayState();
                if (playState == 3) {
                    pause(false);
                }
                this.mAudioTrack.release();
                setAudioTrack(instantiateAudioTrackCompat);
                this.mStateRunner.setAudioTrack(this.mAudioTrack);
                if (playState == 3) {
                    play();
                }
            }
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "failed in setting audio stream type to :" + i17, e17);
        }
    }
}
