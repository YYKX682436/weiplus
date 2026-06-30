package com.tencent.thumbplayer.tmediacodec.codec;

/* loaded from: classes14.dex */
public abstract class ReuseCodecWrapper implements com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper {
    public static final int CANT_REUSE_LIMIT = 3;
    public static final int ID_HISTORY_LIMIT = 100;
    public static final int METHOD_DEQUEUE_INPUT_BUFFER = 0;
    public static final int METHOD_DEQUEUE_OUTPUT_BUFFER = 1;
    public static final int TRY_AGAIN_LATER_LIMIT = 100;
    private static final java.util.Map<android.view.Surface, com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper> mSurfaceMap = new java.util.concurrent.ConcurrentHashMap();
    private final com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.AdaptationWorkaroundMode mAdaptationMode;
    public boolean mAdaptive;
    private com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface mBackupSurface;
    private com.tencent.thumbplayer.tmediacodec.callback.CodecCallback mCallback;
    private int mCantReuseCount;
    private android.media.MediaCodecInfo.CodecCapabilities mCapabilities;
    private final android.media.MediaCodec mCodec;
    protected final com.tencent.thumbplayer.tmediacodec.codec.CodecMaxValues mCodecMaxValues;
    protected final java.lang.String mCodecName;
    public com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.DecodeState mDecodeState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.DecodeState.Started;
    private final int[] mDequeueInOutputTryAgainCount;
    private boolean mErrorHappened;
    public final com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper mFormat;
    private boolean mHasAlwaysTryAgainError;
    private boolean mHasConfigureCalled;
    private boolean mHasReused;
    private final java.util.HashSet<java.lang.Integer> mHoldBufferOutIndex;
    public boolean mIsRecycled;
    private boolean mReleaseCalled;
    private com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType mReuseType;
    public boolean mSecure;
    private com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState mState;
    private final java.util.Set<android.graphics.SurfaceTexture> mStoreToRelease;
    protected android.view.Surface mSurface;
    private final java.lang.String mTag;
    private long mThreadId;
    private final java.util.ArrayList<java.lang.Long> mThreadIdHistory;

    /* renamed from: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper$2, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType;

        static {
            int[] iArr = new int[com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.values().length];
            $SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType = iArr;
            try {
                iArr[com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType[com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType[com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType[com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_YES_WITH_FLUSH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public enum CodecState {
        Uninitialized,
        Configured,
        Error,
        Flushed,
        Running,
        EndOfStream,
        Released
    }

    /* loaded from: classes14.dex */
    public enum DecodeState {
        Started,
        DequeueIn,
        QueueIn,
        DequeueOut,
        ReleaseOut
    }

    public ReuseCodecWrapper(android.media.MediaCodec mediaCodec, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        java.lang.String str = "ReuseCodecWrapper[" + hashCode() + "]";
        this.mTag = str;
        this.mHoldBufferOutIndex = new java.util.HashSet<>();
        this.mThreadIdHistory = new java.util.ArrayList<>();
        this.mStoreToRelease = new java.util.LinkedHashSet();
        this.mDequeueInOutputTryAgainCount = new int[2];
        this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Uninitialized;
        this.mReuseType = com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType.KEEP_CODEC_RESULT_NO;
        boolean z17 = false;
        this.mErrorHappened = false;
        this.mHasAlwaysTryAgainError = false;
        this.mCantReuseCount = 0;
        this.mCodec = mediaCodec;
        this.mFormat = formatWrapper;
        this.mCodecMaxValues = new com.tencent.thumbplayer.tmediacodec.codec.CodecMaxValues(formatWrapper.maxWidth, formatWrapper.maxHeight, formatWrapper.maxInputSize);
        java.lang.String codeName = com.tencent.thumbplayer.tmediacodec.util.TUtils.getCodeName(mediaCodec);
        this.mCodecName = codeName;
        this.mAdaptationMode = com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.codecAdaptationWorkaroundMode(codeName);
        boolean z18 = android.os.Build.VERSION.SDK_INT != 29 || formatWrapper.rotationDegrees == 0;
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(str, "canCallGetCodecInfo:" + z18);
        if (z18) {
            this.mCapabilities = mediaCodec.getCodecInfo().getCapabilitiesForType(formatWrapper.sampleMimeType);
        }
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.mCapabilities;
        this.mAdaptive = codecCapabilities != null && com.tencent.thumbplayer.tmediacodec.util.TUtils.isAdaptive(codecCapabilities);
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.mCapabilities;
        if (codecCapabilities2 != null && com.tencent.thumbplayer.tmediacodec.util.TUtils.isSecure(codecCapabilities2)) {
            z17 = true;
        }
        this.mSecure = z17;
    }

    private void bindingToBackupSurface() {
        if (this.mBackupSurface != null) {
            return;
        }
        com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface outputSurface = new com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface(1, 1);
        this.mBackupSurface = outputSurface;
        innerSetOutputSurface(outputSurface.getSurface(), true, true);
    }

    private java.lang.String byte2HexString(java.lang.Byte b17) {
        return java.lang.String.format("%02X", java.lang.Integer.valueOf(b17.intValue() & 255));
    }

    private int checkSurfaceState(android.view.Surface surface) {
        if (surface == null) {
            return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
        }
        if (surface.isValid()) {
            return 0;
        }
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
    }

    public static com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper create(android.media.MediaCodec mediaCodec, java.lang.String str, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        return com.tencent.thumbplayer.tmediacodec.util.TUtils.isVideo(str) ? new com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper(mediaCodec, formatWrapper) : new com.tencent.thumbplayer.tmediacodec.codec.AudioCodecWrapper(mediaCodec, formatWrapper);
    }

    private void dumpInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        if (com.tencent.thumbplayer.tmediacodec.TCodecManager.isDebug()) {
            try {
                java.nio.ByteBuffer byteBuffer = this.mCodec.getInputBuffers()[i17];
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n########################## " + this + " dumpInputBuffer ###################");
                for (int i28 = 0; i28 < 4; i28++) {
                    sb6.append("\n");
                    for (int i29 = 0; i29 < 16; i29++) {
                        sb6.append(" ");
                        sb6.append(byte2HexString(java.lang.Byte.valueOf(byteBuffer.get((i28 * 4) + i18 + i29))));
                    }
                }
                if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                    com.tencent.thumbplayer.tmediacodec.util.LogUtils.v(this.mTag, sb6.toString());
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(this.mTag, "dumpInputBuffer error", th6);
            }
        }
    }

    private void handleCoreAPIException(int i17, java.lang.String str, java.lang.Throwable th6) {
        handleCoreAPIException(i17, str, th6, false, this.mSurface);
    }

    private void innerSetOutputSurface(android.view.Surface surface) {
        innerSetOutputSurface(surface, true, false);
    }

    private boolean isAlwaysTryAgain(int i17, int i18) {
        if (i18 != -1) {
            this.mDequeueInOutputTryAgainCount[i17] = 0;
            return false;
        }
        int[] iArr = this.mDequeueInOutputTryAgainCount;
        int i19 = iArr[i17] + 1;
        iArr[i17] = i19;
        return i19 > 100;
    }

    private boolean isNotMyThread() {
        return java.lang.Thread.currentThread().getId() != this.mThreadId;
    }

    private void onReuseCodec() {
        int[] iArr = this.mDequeueInOutputTryAgainCount;
        iArr[0] = 0;
        iArr[1] = 0;
    }

    private final void processInputBufferWithReConfig(int i17, int i18, int i19, long j17, int i27) {
        this.mCodec.queueInputBuffer(i17, i18, i19, j17, i27);
    }

    private final void queueInputBufferForAdaptation(int i17, int i18, int i19, long j17, int i27) {
        int i28 = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.AnonymousClass2.$SwitchMap$com$tencent$thumbplayer$tmediacodec$reuse$ReuseHelper$ReuseType[this.mReuseType.ordinal()];
        if (i28 == 1) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "queueInputBufferForAdaptation error for KEEP_CODEC_RESULT_NO");
        } else if (i28 == 2) {
            processInputBufferWithReConfig(i17, i18, i19, j17, i27);
        } else {
            if (i28 != 3) {
                return;
            }
            this.mCodec.queueInputBuffer(i17, i18, i19, j17, i27);
        }
    }

    private void realConfigure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        int i18;
        java.lang.String str = null;
        try {
            if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                str = this + ", realConfigure mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i17 + " state:" + this.mState + " mHasConfigureCalled：" + this.mHasConfigureCalled;
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, str);
            }
            this.mCodec.configure(mediaFormat, surface, mediaCrypto, i17);
            setSurface(surface);
            this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Configured;
        } catch (java.lang.Throwable th6) {
            java.lang.String str2 = str;
            if (th6 instanceof java.lang.IllegalStateException) {
                i18 = 10000;
            } else {
                i18 = th6 instanceof android.media.MediaCodec.CryptoException ? 10001 : 0;
            }
            handleCoreAPIException(i18, str2, th6, true, surface);
            throw th6;
        }
    }

    private void releaseCodecWhenError(int i17) {
        if (i17 < 40000) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(this.mTag, this + "    releaseCodecWhenError, errorCode:" + i17);
            release();
        }
    }

    private void resetParam() {
        this.mHasAlwaysTryAgainError = false;
        this.mCantReuseCount = 0;
    }

    private void setSurface(android.view.Surface surface) {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.i(this.mTag, this + ", oldSurface:" + this.mSurface + " CodecWrapperSetSurface surface:" + surface);
        }
        this.mSurface = surface;
    }

    private void trackDecodeApi(int i17, int i18) {
        if (this.mHasAlwaysTryAgainError || !isAlwaysTryAgain(i17, i18)) {
            return;
        }
        this.mHasAlwaysTryAgainError = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(", trackDecodeApi state:");
        sb6.append(this.mState);
        sb6.append("  surfaceState:");
        android.view.Surface surface = this.mSurface;
        sb6.append(surface != null ? java.lang.Boolean.valueOf(surface.isValid()) : null);
        java.lang.String sb7 = sb6.toString();
        if (i17 == 0) {
            handleCoreAPIException(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN, sb7, null);
        } else if (i17 == 1) {
            handleCoreAPIException(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ALWAYS_RETURN_TRY_AGAIN, sb7, null);
        }
    }

    private void unBindingBackupSurface() {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, this + "unBindingBackupSurface");
        }
        com.tencent.thumbplayer.tmediacodec.preload.glrender.OutputSurface outputSurface = this.mBackupSurface;
        if (outputSurface != null) {
            outputSurface.release();
        }
        this.mBackupSurface = null;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void attachThread() {
        long id6 = java.lang.Thread.currentThread().getId();
        if (this.mThreadIdHistory.contains(java.lang.Long.valueOf(id6))) {
            return;
        }
        this.mThreadId = id6;
        this.mThreadIdHistory.add(java.lang.Long.valueOf(id6));
        if (this.mThreadIdHistory.size() > 100) {
            this.mThreadIdHistory.remove(0);
        }
    }

    public abstract com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuse(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper);

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuseType(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuse = canReuse(formatWrapper);
        this.mReuseType = canReuse;
        return canReuse;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore call method configure for isNotMyThread");
            return;
        }
        this.mHasConfigureCalled = true;
        this.mReleaseCalled = false;
        if (this.mState == com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Uninitialized) {
            realConfigure(mediaFormat, surface, mediaCrypto, i17);
        } else if (surface != null) {
            onReuseCodec();
            innerSetOutputSurface(surface);
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public int dequeueInputBuffer(long j17) {
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore call method dequeueInputBuffer for isNotMyThread");
            return -1;
        }
        int i17 = 0;
        java.lang.String str = null;
        try {
            int dequeueInputBuffer = this.mCodec.dequeueInputBuffer(j17);
            if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                str = this + ", dequeueInputBuffer state:" + this.mState + " decodeState:" + this.mDecodeState + " , result=" + dequeueInputBuffer;
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.v(this.mTag, str);
            }
            this.mDecodeState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.DecodeState.DequeueIn;
            this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Running;
            trackDecodeApi(0, dequeueInputBuffer);
            return dequeueInputBuffer;
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof java.lang.IllegalStateException) {
                i17 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            } else if (th6 instanceof java.lang.IllegalArgumentException) {
                i17 = 40001;
            }
            handleCoreAPIException(i17, str, th6);
            throw th6;
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore call method dequeueOutputBuffer for isNotMyThread");
            return -1;
        }
        java.lang.String str = null;
        try {
            int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, j17);
            if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                str = this + ", dequeueOutputBuffer outIndex:" + dequeueOutputBuffer;
                if (this instanceof com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper) {
                    com.tencent.thumbplayer.tmediacodec.util.LogUtils.v(this.mTag, str);
                }
            }
            this.mHoldBufferOutIndex.add(java.lang.Integer.valueOf(dequeueOutputBuffer));
            this.mDecodeState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.DecodeState.DequeueOut;
            trackDecodeApi(1, dequeueOutputBuffer);
            return dequeueOutputBuffer;
        } catch (java.lang.Throwable th6) {
            handleCoreAPIException(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL : 0 : com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_CODEC_EXCEPTION, str, th6);
            throw th6;
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void flush() {
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "call method flush for isNotMyThread...");
        }
        java.lang.String str = null;
        try {
            if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                str = this + ", flush state:" + this.mState;
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, str);
            }
            this.mCodec.flush();
            this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Flushed;
        } catch (java.lang.Throwable th6) {
            handleCoreAPIException(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_ILLEGAL : 0 : com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION, str, th6);
            throw th6;
        }
    }

    public final com.tencent.thumbplayer.tmediacodec.callback.CodecCallback getCallback() {
        return this.mCallback;
    }

    public final android.media.MediaCodec getCodec() {
        return this.mCodec;
    }

    public java.lang.String getCodecName() {
        return this.mCodecName;
    }

    public final com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper getFormat() {
        return this.mFormat;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public android.media.MediaCodec getMediaCodec() {
        return this.mCodec;
    }

    public boolean isNeedKeep() {
        return com.tencent.thumbplayer.tmediacodec.TCodecManager.isLeakFixed() ? !this.mErrorHappened && com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().isGlobalReuseEnable() && com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().isAllowKeepPool() : !this.mErrorHappened && com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().isGlobalReuseEnable();
    }

    public final boolean isReleaseCalled() {
        return this.mReleaseCalled;
    }

    public boolean needToErase() {
        return this.mCantReuseCount >= 3;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void prepareToReUse() {
        resetParam();
        if (com.tencent.thumbplayer.tmediacodec.TCodecManager.isLeakFixed()) {
            if (this.mState == com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Running) {
                try {
                    flush();
                } catch (java.lang.IllegalStateException e17) {
                    com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(this.mTag, "flush failed in prepareToReUse", e17);
                }
            }
        } else if (this.mState != com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Flushed) {
            flush();
        }
        this.mHasReused = true;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        java.lang.String str;
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore call method queueInputBuffer for isNotMyThread");
            return;
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            str = this + ", queueInputBuffer index:" + i17 + " offset:" + i18 + " size:" + i19 + " presentationTimeUs:" + j17 + " flags:" + i27 + " state:" + this.mState + " decodeState:" + this.mDecodeState;
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.v(this.mTag, str);
        } else {
            str = null;
        }
        try {
            if (this.mHasReused) {
                queueInputBufferForAdaptation(i17, i18, i19, j17, i27);
            } else {
                this.mCodec.queueInputBuffer(i17, i18, i19, j17, i27);
            }
            this.mDecodeState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.DecodeState.QueueIn;
        } catch (java.lang.Throwable th6) {
            handleCoreAPIException(!(th6 instanceof android.media.MediaCodec.CodecException) ? !(th6 instanceof java.lang.IllegalStateException) ? th6 instanceof android.media.MediaCodec.CryptoException ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.QUEUEINPUTBUFFER_CRYPTO_EXCEPTION : 0 : 50000 : 50001, str, th6);
            throw th6;
        }
    }

    public final void recycle() {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, this + ", recycle isRecycled:" + this.mIsRecycled + "  mSurfaceMap.size:" + mSurfaceMap.size() + "...... stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        if (this.mIsRecycled) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore recycle for has isRecycled is true.");
            return;
        }
        this.mHasConfigureCalled = false;
        this.mIsRecycled = true;
        com.tencent.thumbplayer.tmediacodec.util.ThreadManager.runOnSubThread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.this.mCodec.stop();
                        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.this.mCodec.release();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.this.mCodec.release();
                        throw th6;
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.this.mTag, "recycle codec ignore error,", th7);
                }
                if (com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.this.mCallback != null) {
                    com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.this.mCallback.onRealRelease();
                }
            }
        });
        this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Uninitialized;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void release() {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, this + " call release mHoldBufferOutIndex:" + this.mHoldBufferOutIndex + " mReleaseCalled:" + this.mReleaseCalled + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        this.mReleaseCalled = true;
        this.mHasConfigureCalled = false;
        if (isNeedKeep()) {
            try {
                flush();
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(this.mTag, "flush failed for not in the Executing state.", e17);
            }
            bindingToBackupSurface();
            com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().recycleCodecFromRunning(this);
            return;
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "Don't not keep the codec, release it ..., mErrorHappened:" + this.mErrorHappened);
        }
        com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().removeCodecFromRunningPool(this);
        recycle();
        this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Released;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void releaseOutputBuffer(int i17, boolean z17) {
        java.lang.String str;
        int i18;
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            str = this + ", releaseOutputBuffer render:" + z17;
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.v(this.mTag, str);
        } else {
            str = null;
        }
        try {
            this.mHoldBufferOutIndex.remove(java.lang.Integer.valueOf(i17));
            this.mCodec.releaseOutputBuffer(i17, z17);
        } catch (java.lang.Throwable th6) {
            if (this.mState != com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Flushed) {
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, this + ", releaseOutputBuffer failed, ignore e:", th6);
            }
            if (th6 instanceof android.media.MediaCodec.CodecException) {
                i18 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.RELEASEOUTPUTBUFFER_CODEC_EXCEPTION;
            } else {
                i18 = th6 instanceof java.lang.IllegalStateException ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.RELEASEOUTPUTBUFFER_ILLEGAL : 0;
            }
            handleCoreAPIException(i18, str, th6);
        }
        this.mDecodeState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.DecodeState.ReleaseOut;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void reset() {
        java.lang.String str = null;
        try {
            if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                str = this + ", callMsg state:" + this.mState;
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, str);
            }
            if (isNeedKeep()) {
                return;
            }
            this.mCodec.reset();
            this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Uninitialized;
        } catch (java.lang.Throwable th6) {
            handleCoreAPIException(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_ILLEGAL : 0 : com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_CODECEXCEPTION, str, th6);
            throw th6;
        }
    }

    public final void setCallback(com.tencent.thumbplayer.tmediacodec.callback.CodecCallback codecCallback) {
        this.mCallback = codecCallback;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void setCodecCallback(com.tencent.thumbplayer.tmediacodec.callback.CodecCallback codecCallback) {
        this.mCallback = codecCallback;
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void setOutputSurface(android.view.Surface surface) {
        innerSetOutputSurface(surface, false, false);
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void start() {
        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState codecState = this.mState;
        com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState codecState2 = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Configured;
        if (codecState != codecState2) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, "start ignore:" + this.mState);
            return;
        }
        java.lang.String str = null;
        try {
            if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
                str = this + ", start state:" + this.mState;
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, str);
            }
            if (this.mState == codecState2) {
                this.mCodec.start();
                this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Running;
            }
        } catch (java.lang.Throwable th6) {
            handleCoreAPIException(!(th6 instanceof android.media.MediaCodec.CodecException) ? th6 instanceof java.lang.IllegalStateException ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL : 0 : 20001, str, th6);
            throw th6;
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void stop() {
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, this + ", stop");
        }
        if (isNeedKeep()) {
            return;
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, this + ", codec real stop");
        }
        try {
            this.mCodec.stop();
            this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Uninitialized;
        } catch (java.lang.IllegalStateException e17) {
            this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Uninitialized;
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(this.mTag, "stop failed", e17);
            throw e17;
        }
    }

    public java.lang.String toString() {
        return super.toString() + " mReleaseCalled:" + this.mReleaseCalled + " isRecycled:" + this.mIsRecycled;
    }

    public void trackCantReuse() {
        this.mCantReuseCount++;
    }

    private void handleCoreAPIException(int i17, java.lang.String str, java.lang.Throwable th6, boolean z17, android.view.Surface surface) {
        int checkSurfaceState;
        this.mErrorHappened = true;
        java.lang.String str2 = str + " handleCoreAPIException exception:" + (th6 == null ? "" : th6.getLocalizedMessage());
        if (z17 && (checkSurfaceState = checkSurfaceState(surface)) != 0) {
            i17 = checkSurfaceState;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i17);
            jSONObject.put("exceptionMsg", str2);
            com.tencent.thumbplayer.tmediacodec.callback.CodecCallback codecCallback = this.mCallback;
            if (codecCallback != null) {
                codecCallback.onReuseCodecAPIException(jSONObject.toString(), th6);
            }
        } catch (org.json.JSONException unused) {
        }
        com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(this.mTag, "hasReused:" + this.mHasReused + "    errorCode:" + i17 + ", " + str2, th6);
        releaseCodecWhenError(i17);
    }

    private void innerSetOutputSurface(android.view.Surface surface, boolean z17, boolean z18) {
        java.lang.String str;
        int i17;
        if (this.mSurface == surface) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, this + ", innerSetOutputSurface error surface:" + surface + " is same, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            str = this + " configure, call innerSetOutputSurface surface:" + surface + "  decodeState:" + this.mDecodeState + " callByInner:" + z17;
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, str);
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        try {
            setSurface(surface);
            this.mCodec.setOutputSurface(surface);
            if (z18) {
                return;
            }
            unBindingBackupSurface();
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof java.lang.IllegalStateException) {
                i17 = 30000;
            } else {
                i17 = th6 instanceof java.lang.IllegalArgumentException ? 30001 : 0;
            }
            handleCoreAPIException(i17, str2, th6, true, surface);
            throw th6;
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore call method configure for isNotMyThread");
            return;
        }
        this.mHasConfigureCalled = true;
        this.mReleaseCalled = false;
        if (this.mState == com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Uninitialized) {
            realConfigure(mediaFormat, surface, i17, mediaDescrambler);
        } else if (surface != null) {
            onReuseCodec();
            innerSetOutputSurface(surface);
        }
    }

    private void realConfigure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        java.lang.String str;
        int i18;
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            str = this + ", configure mediaFormat:" + mediaFormat + " surface:" + surface + " flags:" + i17 + " descrambler:" + mediaDescrambler + " state:" + this.mState + " mHasConfigureCalled：" + this.mHasConfigureCalled;
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(this.mTag, str);
        } else {
            str = null;
        }
        java.lang.String str2 = str;
        try {
            this.mCodec.configure(mediaFormat, surface, i17, mediaDescrambler);
            setSurface(surface);
            this.mState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.CodecState.Configured;
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof android.media.MediaCodec.CodecException) {
                i18 = 10002;
            } else if (th6 instanceof java.lang.IllegalStateException) {
                i18 = 10000;
            } else {
                i18 = th6 instanceof android.media.MediaCodec.CryptoException ? 10001 : 0;
            }
            handleCoreAPIException(i18, str2, th6, true, surface);
            throw th6;
        }
    }

    @Override // com.tencent.thumbplayer.tmediacodec.codec.CodecWrapper
    public void releaseOutputBuffer(int i17, long j17) {
        java.lang.String str;
        int i18;
        if (isNotMyThread()) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.w(this.mTag, "ignore call method releaseOutputBuffer for isNotMyThread");
            return;
        }
        if (com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()) {
            str = this + ", releaseOutputBuffer API21" + i17;
            if (this instanceof com.tencent.thumbplayer.tmediacodec.codec.VideoCodecWrapper) {
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.v(this.mTag, str);
            }
        } else {
            str = null;
        }
        this.mHoldBufferOutIndex.remove(java.lang.Integer.valueOf(i17));
        try {
            this.mCodec.releaseOutputBuffer(i17, j17);
            this.mDecodeState = com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper.DecodeState.ReleaseOut;
        } catch (java.lang.Throwable th6) {
            if (th6 instanceof android.media.MediaCodec.CodecException) {
                i18 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.RELEASEOUTPUTBUFFER_CODEC_EXCEPTION;
            } else {
                i18 = th6 instanceof java.lang.IllegalStateException ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.RELEASEOUTPUTBUFFER_ILLEGAL : 0;
            }
            handleCoreAPIException(i18, str, th6);
            throw th6;
        }
    }
}
