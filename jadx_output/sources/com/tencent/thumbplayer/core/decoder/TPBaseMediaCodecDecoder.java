package com.tencent.thumbplayer.core.decoder;

/* loaded from: classes14.dex */
public abstract class TPBaseMediaCodecDecoder implements com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder {
    private static final int DUMP_BYTE_BUFFER_BYTES = 100;
    private static final int DUMP_ONE_LINE_BYTES = 20;
    private static final int MEDIA_CODEC_ERROR_INDEX = -1000;
    private static long MEDIA_CODEC_INPUT_TIMEOUT_US = 2000;
    private static long MEDIA_CODEC_OUTPUT_TIMEOUT_US = 2000;
    private static final int MSG_FLUSH = 1002;
    private static final int MSG_RELEASE = 1003;
    private static final int MSG_RELEASE_OUTPUT_BUFFER = 1000;
    private static final java.lang.String MSG_RELEASE_OUTPUT_BUFFER_INDEX_KEY = "index";
    private static final java.lang.String MSG_RELEASE_OUTPUT_BUFFER_RENDER_KEY = "render";
    private static final java.lang.String MSG_RELEASE_OUTPUT_BUFFER_RENDER_TIME_NS_KEY = "renderTimestampNs";
    private static final int MSG_SET_OUTPUT_SURFACE = 1001;
    private static boolean sTMediaCodecInited;
    protected int mCodecId;
    private com.tencent.thumbplayer.tmediacodec.TMediaCodec mCodec = null;
    protected android.view.Surface mSurface = null;
    protected boolean mStarted = false;
    private com.tencent.thumbplayer.core.decoder.TPFrameInfo mFrameInfo = new com.tencent.thumbplayer.core.decoder.TPFrameInfo();
    private boolean mEnableSetOutputSurfaceApi = false;
    private boolean mEnableReleaseOutputBufferWithTimestamp = false;
    private android.media.MediaCodec.CryptoInfo mCryptoInfo = null;
    protected android.media.MediaCrypto mMediaCrypto = null;
    protected boolean mEnableAsyncMode = false;
    private android.os.HandlerThread mDecodeThread = null;
    private com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.AsyncDecodeHandler mDecoderHandler = null;
    private java.util.concurrent.BlockingQueue<java.lang.Integer> mInputQueue = new java.util.concurrent.LinkedBlockingQueue();
    private java.util.concurrent.BlockingQueue<com.tencent.thumbplayer.core.decoder.TPFrameInfo> mOutputQueue = new java.util.concurrent.LinkedBlockingQueue();
    protected int mEnableRendererSharpen = 0;
    protected boolean mEnableHdrCustomRender = false;
    protected java.lang.String mSharpenShaderPath = "assets/shaders";
    protected boolean mSwitchEnableRendererSharpen = true;
    protected boolean mEnableDefaultCodecForDolby = false;
    protected boolean mIsDolbyCodecFallback = false;
    private boolean mRestartCodecOnException = false;
    protected int mDrmType = -1;
    private boolean mEnableAudioPassThrough = false;
    protected boolean mEnableMediaCodecReuse = false;
    private final java.lang.Object mThreadLock = new java.lang.Object();
    private int mHandlerResult = 0;

    /* loaded from: classes14.dex */
    public class AsyncDecodeHandler extends android.os.Handler {
        public AsyncDecodeHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int onReleaseOutputBuffer;
            synchronized (com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.mThreadLock) {
                switch (message.what) {
                    case 1000:
                        onReleaseOutputBuffer = com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.onReleaseOutputBuffer(message.getData());
                        break;
                    case 1001:
                        onReleaseOutputBuffer = com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.onSetOutputSurface((android.view.Surface) message.obj);
                        break;
                    case 1002:
                        onReleaseOutputBuffer = com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.onFlush();
                        break;
                    case 1003:
                        onReleaseOutputBuffer = com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.onRelease();
                        break;
                    default:
                        onReleaseOutputBuffer = 0;
                        break;
                }
                com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.handleMessageComplete(onReleaseOutputBuffer);
            }
        }
    }

    /* loaded from: classes14.dex */
    public class BufferCallback extends com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback {
        private BufferCallback() {
        }

        @Override // com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback
        public void onError(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, android.media.MediaCodec.CodecException codecException) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.getLogTag(), "onError: " + com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.getStackTrace(codecException));
            com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.handleRelease();
        }

        @Override // com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback
        public void onInputBufferAvailable(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17) {
            try {
                com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.mInputQueue.put(java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.getLogTag(), com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.getStackTrace(e17));
            }
        }

        @Override // com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback
        public void onOutputBufferAvailable(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
            try {
                com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo = new com.tencent.thumbplayer.core.decoder.TPFrameInfo();
                tPFrameInfo.errCode = 0;
                tPFrameInfo.bufferIndex = i17;
                tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.processOutputBuffer(tMediaCodec, i17, bufferInfo, tPFrameInfo);
                com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.mOutputQueue.put(tPFrameInfo);
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.getLogTag(), com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.getStackTrace(e17));
            }
        }

        @Override // com.tencent.thumbplayer.tmediacodec.TMediaCodec.Callback
        public void onOutputFormatChanged(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, android.media.MediaFormat mediaFormat) {
            com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.processOutputFormatChanged(mediaFormat);
        }
    }

    public TPBaseMediaCodecDecoder(int i17) {
        this.mCodecId = i17;
        initTMediaCodec();
    }

    private void bufferSizeCheck(java.nio.ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() < bArr.length) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "decodeAsync, not enough space, byteBuffer.remaining:" + byteBuffer.remaining() + ", buffer size:" + bArr.length);
            try {
                dumpByteArray(bArr, 0, 100, 20);
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), e17.toString());
            }
        }
    }

    private int decodeAsync(byte[] bArr, boolean z17, long j17, boolean z18) {
        java.lang.Integer poll = this.mInputQueue.poll();
        if (poll == null) {
            return 1;
        }
        try {
            java.nio.ByteBuffer inputBuffer = this.mCodec.getInputBuffer(poll.intValue());
            if (inputBuffer != null) {
                bufferSizeCheck(inputBuffer, bArr);
                inputBuffer.put(bArr);
            }
            if (!z18 || this.mCryptoInfo == null) {
                this.mCodec.queueInputBuffer(poll.intValue(), 0, bArr.length, j17, z17 ? 1 : 0);
            } else {
                this.mCodec.queueSecureInputBuffer(poll.intValue(), 0, this.mCryptoInfo, j17, z17 ? 1 : 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            return onMediaCodecException(e17);
        }
    }

    private com.tencent.thumbplayer.core.decoder.TPFrameInfo dequeueOutputBufferAsync() {
        this.mFrameInfo.errCode = 1;
        com.tencent.thumbplayer.core.decoder.TPFrameInfo poll = this.mOutputQueue.poll();
        return poll == null ? this.mFrameInfo : poll;
    }

    private void dumpByteArray(byte[] bArr, int i17, int i18, int i19) {
        if (bArr == null || i17 < 0 || i18 <= 0 || i17 >= bArr.length || i17 >= i18 || i19 <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (bArr.length <= i18) {
            i18 = bArr.length;
        }
        int min = java.lang.Math.min(i18 - i17, 100) + i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "dumpByteArray begin:");
        int i27 = 0;
        while (i17 < min) {
            java.lang.String hexString = java.lang.Integer.toHexString(bArr[i17] & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb6.append(hexString.toUpperCase());
            i27++;
            if (i27 % i19 == 0) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), sb6.toString());
                sb6.setLength(0);
            } else {
                sb6.append(" ");
            }
            i17++;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "dumpByteArray end.");
    }

    private void exitDecodeThread() {
        android.os.HandlerThread handlerThread = this.mDecodeThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.mDecodeThread.join();
            } catch (java.lang.InterruptedException unused) {
            }
            this.mDecodeThread = null;
        }
    }

    private int flushAsync() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "flushAsync: ");
        android.os.Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1002;
        return waitingForHandleMessage(obtainMessage);
    }

    private int handleFlush() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "handleFlush: ");
        com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null) {
            return 104;
        }
        try {
            tMediaCodec.flush();
            return 0;
        } catch (java.lang.Exception e17) {
            return onMediaCodecException(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessageComplete(int i17) {
        this.mHandlerResult = i17;
        this.mThreadLock.notify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int handleRelease() {
        com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null) {
            return 101;
        }
        this.mStarted = false;
        try {
            try {
                tMediaCodec.stop();
                return 0;
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "stop: failed!" + getStackTrace(e17));
                this.mCodec.release();
                this.mCodec = null;
                return 3;
            }
        } finally {
            this.mCodec.release();
            this.mCodec = null;
        }
    }

    private int handleReleaseOutputBuffer(int i17, boolean z17, long j17) {
        com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null || i17 < 0) {
            return 3;
        }
        try {
            if (this.mEnableReleaseOutputBufferWithTimestamp && z17) {
                tMediaCodec.releaseOutputBuffer(i17, j17);
                return 0;
            }
            tMediaCodec.releaseOutputBuffer(i17, z17);
            return 0;
        } catch (java.lang.Exception e17) {
            return onMediaCodecException(e17);
        }
    }

    private int handleSetOutputSurface(android.view.Surface surface) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "setOutputSurface: " + surface);
        android.view.Surface surface2 = this.mSurface;
        int i17 = 3;
        if (surface2 == surface) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "setOutputSurface: set the same surface.");
            return 0;
        }
        this.mSurface = surface;
        if (this.mCodec == null) {
            return 0;
        }
        if (surface2 != null && surface != null) {
            try {
                if (surface.isValid() && this.mEnableSetOutputSurfaceApi) {
                    this.mCodec.setOutputSurface(surface);
                    i17 = 0;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "setOutputSurface onMediaCodecException:\n" + getStackTrace(e17));
                return 3;
            }
        }
        return i17;
    }

    private int handleSignalEndOfStream(int i17) {
        try {
            this.mCodec.queueInputBuffer(i17, 0, 0, 0L, 4);
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "handleSignalEndOfStream: failed!" + getStackTrace(e17));
            return 3;
        }
    }

    private boolean initMediaCodecInternal() {
        java.lang.String str = "video/hevc";
        try {
            java.util.List<java.lang.String> mimeCandidates = getMimeCandidates();
            boolean z17 = false;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            for (int i17 = 0; i17 < mimeCandidates.size() && str2 == null; i17++) {
                str3 = mimeCandidates.get(i17);
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "initMediaCodec with mime:" + str3 + " mDrmType:" + this.mDrmType);
                android.media.MediaCrypto mediaCrypto = this.mMediaCrypto;
                boolean requiresSecureDecoderComponent = mediaCrypto != null ? mediaCrypto.requiresSecureDecoderComponent(str3) : false;
                if (requiresSecureDecoderComponent && com.tencent.thumbplayer.core.common.TPCodecUtils.isInDRMLevel1Blacklist(this.mDrmType)) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "Device " + com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName() + " DrmType " + this.mDrmType + " fallback to L3.");
                    z17 = false;
                } else {
                    z17 = requiresSecureDecoderComponent;
                }
                str2 = getCodecName(str3, z17);
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "initMediaCodec got codecName:" + str2 + " secureComponent " + z17);
            }
            if (str2 == null) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "initMediaCodec failed, codecName is null.");
                if (this.mEnableDefaultCodecForDolby && "video/dolby-vision".equalsIgnoreCase(str3)) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "initMediaCodec failed, try use mime type:video/hevc");
                    str2 = com.tencent.thumbplayer.core.common.TPCodecUtils.getDecoderName("video/hevc", z17);
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "retry initMediaCodec codecName:" + str2);
                    if (str2 == null) {
                        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "retry initMediaCodec failed codecName is null");
                        return false;
                    }
                    this.mIsDolbyCodecFallback = true;
                }
                return false;
            }
            str = str3;
            if (com.tencent.thumbplayer.tmediacodec.util.MimeTypes.AUDIO_DTS.equals(str)) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "initMediaCodec current mime type:" + str + " is audio dts, need set input timeout to 0!");
                MEDIA_CODEC_INPUT_TIMEOUT_US = 0L;
                MEDIA_CODEC_OUTPUT_TIMEOUT_US = 0L;
            }
            com.tencent.thumbplayer.tmediacodec.TMediaCodec createByCodecName = com.tencent.thumbplayer.tmediacodec.TMediaCodec.createByCodecName(str2);
            this.mCodec = createByCodecName;
            createByCodecName.setReuseEnable(this.mEnableMediaCodecReuse && !this.mEnableAsyncMode);
            this.mCodec.setCodecCallback(new com.tencent.thumbplayer.tmediacodec.callback.SimpleCodecCallback() { // from class: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.2
                @Override // com.tencent.thumbplayer.tmediacodec.callback.SimpleCodecCallback, com.tencent.thumbplayer.tmediacodec.callback.CodecCallback
                public void onReuseCodecAPIException(java.lang.String str4, java.lang.Throwable th6) {
                    super.onReuseCodecAPIException(str4, th6);
                    com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaCodecException(com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.mCodecId, str4);
                }

                @Override // com.tencent.thumbplayer.tmediacodec.callback.SimpleCodecCallback, com.tencent.thumbplayer.tmediacodec.callback.CodecCallback
                public void onStarted(java.lang.Boolean bool, java.lang.String str4) {
                    super.onStarted(bool, str4);
                    com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaCodecReady(com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.this.mCodecId, str4);
                }
            });
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "initMediaCodec codec name: " + str2);
            if (this.mEnableAsyncMode) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "MediaCodec EnableAsyncMode！");
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("MediaCodecThread");
                this.mDecodeThread = handlerThread;
                handlerThread.start();
                this.mDecoderHandler = new com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.AsyncDecodeHandler(this.mDecodeThread.getLooper());
                this.mCodec.setCallback(new com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.BufferCallback(), this.mDecoderHandler);
            }
            com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 1);
            configCodec(this.mCodec, str);
            com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 2);
            com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 3);
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec start");
            this.mCodec.start();
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "initMediaCodec, start codec finished");
            com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            this.mStarted = true;
            if (this.mDrmType != -1) {
                boolean z18 = com.tencent.thumbplayer.core.common.TPCodecUtils.getDecoderName(str, true) != null;
                com.tencent.thumbplayer.core.decoder.TPMediaDrmInfo tPMediaDrmInfo = new com.tencent.thumbplayer.core.decoder.TPMediaDrmInfo();
                tPMediaDrmInfo.supportSecureDecoder = z18;
                tPMediaDrmInfo.supportSecureDecrypt = z17;
                tPMediaDrmInfo.componentName = str2;
                tPMediaDrmInfo.drmType = this.mDrmType;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "DRM Info: supportSecureDecoder: " + tPMediaDrmInfo.supportSecureDecoder + " supportSecureDecrypt:" + tPMediaDrmInfo.supportSecureDecrypt + " componentName: " + tPMediaDrmInfo.componentName + " drmType: " + tPMediaDrmInfo.drmType);
                com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaDrmInfo(this.mCodecId, tPMediaDrmInfo);
            }
            return true;
        } catch (java.lang.Exception e17) {
            onInitMediaCodecError();
            com.tencent.thumbplayer.core.decoder.TPMediaCodecManager.onMediaCodecReportEvent(this.mCodecId, 4);
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), getStackTrace(e17));
            return false;
        }
    }

    private static synchronized void initTMediaCodec() {
        synchronized (com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.class) {
            if (sTMediaCodecInited) {
                return;
            }
            com.tencent.thumbplayer.tmediacodec.TCodecManager.init();
            com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().setLogEnable(true);
            com.tencent.thumbplayer.tmediacodec.TCodecManager.getInstance().setLogProxy(new com.tencent.thumbplayer.tmediacodec.util.ILogProxy() { // from class: com.tencent.thumbplayer.core.decoder.TPBaseMediaCodecDecoder.1
                @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
                public void d(java.lang.String str, java.lang.String str2) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(1, str, str2);
                }

                @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
                public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, str, str2);
                }

                @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
                public void i(java.lang.String str, java.lang.String str2) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, str, str2);
                }

                @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
                public void v(java.lang.String str, java.lang.String str2) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(0, str, str2);
                }

                @Override // com.tencent.thumbplayer.tmediacodec.util.ILogProxy
                public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, str, str2);
                }
            });
            sTMediaCodecInited = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onFlush() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        int handleFlush = handleFlush();
        this.mCodec.start();
        return handleFlush;
    }

    private int onMediaCodecException(java.lang.Exception exc) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "onMediaCodecException!\n" + getStackTrace(exc));
        resetFrameInfo();
        processMediaCodecException(exc);
        if (this.mRestartCodecOnException) {
            initMediaCodecInternal();
            return 4;
        }
        handleRelease();
        return 103;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onRelease() {
        this.mInputQueue.clear();
        this.mOutputQueue.clear();
        return handleRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onReleaseOutputBuffer(android.os.Bundle bundle) {
        if (bundle == null) {
            return 3;
        }
        return handleReleaseOutputBuffer(bundle.getInt("index"), bundle.getBoolean(MSG_RELEASE_OUTPUT_BUFFER_RENDER_KEY), bundle.getLong(MSG_RELEASE_OUTPUT_BUFFER_RENDER_TIME_NS_KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onSetOutputSurface(android.view.Surface surface) {
        return handleSetOutputSurface(surface);
    }

    private int queueInputBuffer(byte[] bArr, long j17, boolean z17) {
        android.media.MediaCodec.CryptoInfo cryptoInfo;
        try {
            java.nio.ByteBuffer[] inputBuffers = this.mCodec.getInputBuffers();
            int dequeueInputBuffer = this.mCodec.dequeueInputBuffer(MEDIA_CODEC_INPUT_TIMEOUT_US);
            if (dequeueInputBuffer < 0) {
                return dequeueInputBuffer == -1 ? 1 : 103;
            }
            java.nio.ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
            bufferSizeCheck(byteBuffer, bArr);
            byteBuffer.put(bArr);
            if (!z17 || (cryptoInfo = this.mCryptoInfo) == null) {
                this.mCodec.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, j17, 0);
            } else {
                this.mCodec.queueSecureInputBuffer(dequeueInputBuffer, 0, cryptoInfo, j17, 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            return onMediaCodecException(e17);
        }
    }

    private int releaseAsync() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "releaseAsync: ");
        android.os.Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1003;
        int waitingForHandleMessage = waitingForHandleMessage(obtainMessage);
        exitDecodeThread();
        return waitingForHandleMessage;
    }

    private int releaseOutputBufferAsync(int i17, boolean z17, long j17) {
        android.os.Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1000;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("index", i17);
        bundle.putBoolean(MSG_RELEASE_OUTPUT_BUFFER_RENDER_KEY, z17);
        bundle.putLong(MSG_RELEASE_OUTPUT_BUFFER_RENDER_TIME_NS_KEY, j17);
        obtainMessage.setData(bundle);
        return waitingForHandleMessage(obtainMessage);
    }

    private void resetFrameInfo() {
        com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo = this.mFrameInfo;
        tPFrameInfo.bufferIndex = -1000;
        tPFrameInfo.ptsUs = -1L;
        tPFrameInfo.renderTimestampNs = -1L;
        tPFrameInfo.data = null;
        tPFrameInfo.errCode = 103;
    }

    private android.media.MediaCodecInfo selectCodec(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (!codecInfoAt.isEncoder()) {
                for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    private int setOutputSurfaceAsync(android.view.Surface surface) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "setOutputSurfaceAsync: " + surface);
        android.os.Message obtainMessage = this.mDecoderHandler.obtainMessage();
        obtainMessage.what = 1001;
        obtainMessage.obj = surface;
        return waitingForHandleMessage(obtainMessage);
    }

    private int signalEndOfStreamAsync() {
        java.lang.Integer poll = this.mInputQueue.poll();
        if (poll == null) {
            return 1;
        }
        return handleSignalEndOfStream(poll.intValue());
    }

    private int waitingForHandleMessage(android.os.Message message) {
        synchronized (this.mThreadLock) {
            message.sendToTarget();
            try {
                this.mThreadLock.wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
        return this.mHandlerResult;
    }

    public abstract void configCodec(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, java.lang.String str);

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int decode(byte[] bArr, boolean z17, long j17, boolean z18) {
        if (!this.mStarted || this.mCodec == null) {
            return 101;
        }
        return this.mEnableAsyncMode ? decodeAsync(bArr, z17, j17, z18) : queueInputBuffer(bArr, j17, z18);
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public com.tencent.thumbplayer.core.decoder.TPFrameInfo dequeueOutputBuffer() {
        if (this.mCodec == null) {
            return this.mFrameInfo;
        }
        resetFrameInfo();
        if (this.mEnableAsyncMode) {
            return dequeueOutputBufferAsync();
        }
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        try {
            int dequeueOutputBuffer = this.mCodec.dequeueOutputBuffer(bufferInfo, MEDIA_CODEC_OUTPUT_TIMEOUT_US);
            if (dequeueOutputBuffer >= 0) {
                int i17 = bufferInfo.flags;
                if (i17 == 4) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM");
                    this.mFrameInfo.errCode = 2;
                } else if (i17 == 2 && this.mEnableAudioPassThrough) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_CODEC_CONFIG, AudioPassThrough");
                    com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo = this.mFrameInfo;
                    tPFrameInfo.bufferIndex = dequeueOutputBuffer;
                    tPFrameInfo.ptsUs = bufferInfo.presentationTimeUs;
                    processOutputConfigData(this.mCodec, dequeueOutputBuffer, bufferInfo, tPFrameInfo);
                } else {
                    com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo2 = this.mFrameInfo;
                    tPFrameInfo2.bufferIndex = dequeueOutputBuffer;
                    tPFrameInfo2.ptsUs = bufferInfo.presentationTimeUs;
                    tPFrameInfo2.renderTimestampNs = java.lang.System.nanoTime();
                    com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo3 = this.mFrameInfo;
                    tPFrameInfo3.errCode = 0;
                    processOutputBuffer(this.mCodec, dequeueOutputBuffer, bufferInfo, tPFrameInfo3);
                }
            } else if (dequeueOutputBuffer == -2) {
                processOutputFormatChanged(this.mCodec.getOutputFormat());
                this.mFrameInfo.errCode = 1;
            } else if (dequeueOutputBuffer == -1) {
                this.mFrameInfo.errCode = 1;
            } else if (dequeueOutputBuffer == -3) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: INFO_OUTPUT_BUFFERS_CHANGED!");
                this.mFrameInfo.errCode = 1;
            } else if (bufferInfo.flags == 4) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "dequeueOutputBuffer: BUFFER_FLAG_END_OF_STREAM!");
                this.mFrameInfo.errCode = 2;
            } else {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, getLogTag(), "dequeueOutputBuffer: TP_ERROR_DECODE_FAILED! index = " + dequeueOutputBuffer);
                this.mFrameInfo.errCode = 103;
            }
            return this.mFrameInfo;
        } catch (java.lang.Exception e17) {
            this.mFrameInfo.errCode = onMediaCodecException(e17);
            return this.mFrameInfo;
        }
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int flush() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "flush: ");
        if (this.mCodec == null) {
            return 104;
        }
        return this.mEnableAsyncMode ? flushAsync() : handleFlush();
    }

    public abstract java.lang.String getCodecName(java.lang.String str, boolean z17);

    public abstract java.lang.String getLogTag();

    public abstract java.util.List<java.lang.String> getMimeCandidates();

    public java.lang.String getStackTrace(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void onInitMediaCodecError() {
        release();
    }

    public abstract void processMediaCodecException(java.lang.Exception exc);

    public abstract void processOutputBuffer(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo);

    public abstract void processOutputConfigData(com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec, int i17, android.media.MediaCodec.BufferInfo bufferInfo, com.tencent.thumbplayer.core.decoder.TPFrameInfo tPFrameInfo);

    public abstract void processOutputFormatChanged(android.media.MediaFormat mediaFormat);

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int release() {
        return this.mEnableAsyncMode ? releaseAsync() : handleRelease();
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int releaseOutputBuffer(int i17, boolean z17, long j17) {
        if (this.mCodec == null || i17 < 0) {
            return 3;
        }
        return this.mEnableAsyncMode ? releaseOutputBufferAsync(i17, z17, j17) : handleReleaseOutputBuffer(i17, z17, j17);
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public void setCryptoInfo(int i17, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i18, int i19, int i27) {
        if (this.mCryptoInfo == null) {
            this.mCryptoInfo = new android.media.MediaCodec.CryptoInfo();
        }
        this.mCryptoInfo.set(i17, iArr, iArr2, bArr, bArr2, i18);
        this.mCryptoInfo.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(i19, i27));
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOperateRate(float f17) {
        if (this.mCodec != null) {
            try {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "setOperateRate: " + f17);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putShort(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, (short) 0);
                bundle.putFloat("operating-rate", f17);
                this.mCodec.setParameters(bundle);
            } catch (java.lang.Exception unused) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "setOperateRate: " + f17 + " failed.");
            }
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setOutputSurface(android.view.Surface surface) {
        return this.mEnableAsyncMode ? setOutputSurfaceAsync(surface) : handleSetOutputSurface(surface);
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBool(int i17, boolean z17) {
        if (i17 == 0) {
            this.mEnableSetOutputSurfaceApi = z17;
        } else if (i17 != 1) {
            if (i17 == 3) {
                this.mEnableAudioPassThrough = z17;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "BOOL_SET_IS_AUDIO_PASSTHROUGH mEnableAudioPassThrough:" + this.mEnableAudioPassThrough);
            } else if (i17 == 4) {
                this.mEnableMediaCodecReuse = z17;
            } else if (i17 == 7) {
                this.mEnableReleaseOutputBufferWithTimestamp = z17;
            } else if (i17 == 99) {
                this.mEnableHdrCustomRender = z17;
            } else {
                if (i17 != 299) {
                    com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "Unknown paramKey: " + i17);
                    return false;
                }
                this.mEnableDefaultCodecForDolby = z17;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "BOOL_SET mEnableDefaultCodecForDolby:" + this.mEnableDefaultCodecForDolby);
            }
        } else if (this.mStarted) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "BOOL_ENABLE_ASYNC_MODE must setup before started!");
        } else {
            this.mEnableAsyncMode = z17;
        }
        return true;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamBytes(int i17, byte[] bArr) {
        return false;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamInt(int i17, int i18) {
        if (i17 == 100) {
            this.mEnableRendererSharpen = i18;
            return true;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "Unknown paramKey: " + i17);
        return false;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamLong(int i17, long j17) {
        return false;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamObject(int i17, java.lang.Object obj) {
        if (i17 != 300) {
            return false;
        }
        this.mMediaCrypto = (android.media.MediaCrypto) obj;
        return true;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean setParamString(int i17, java.lang.String str) {
        if (i17 == 101) {
            this.mSharpenShaderPath = str;
            return true;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(3, getLogTag(), "Unknown paramKey: " + i17);
        return false;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int setSharpenSwitch() {
        this.mSwitchEnableRendererSharpen = !this.mSwitchEnableRendererSharpen;
        return 0;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int signalEndOfStream() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, getLogTag(), "signalEndOfStream: ");
        com.tencent.thumbplayer.tmediacodec.TMediaCodec tMediaCodec = this.mCodec;
        if (tMediaCodec == null) {
            return 3;
        }
        if (this.mEnableAsyncMode) {
            return signalEndOfStreamAsync();
        }
        int dequeueInputBuffer = tMediaCodec.dequeueInputBuffer(MEDIA_CODEC_INPUT_TIMEOUT_US);
        return dequeueInputBuffer >= 0 ? handleSignalEndOfStream(dequeueInputBuffer) : dequeueInputBuffer == -1 ? 1 : 3;
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public boolean startDecoder() {
        return initMediaCodecInternal();
    }

    @Override // com.tencent.thumbplayer.core.decoder.ITPMediaCodecDecoder
    public int switchHdrModeWithSurface(android.view.Surface surface, int i17) {
        return 0;
    }
}
