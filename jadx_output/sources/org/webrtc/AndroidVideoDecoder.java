package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class AndroidVideoDecoder implements org.webrtc.VideoDecoder, org.webrtc.VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final java.lang.String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final java.lang.String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final java.lang.String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final java.lang.String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final java.lang.String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final java.lang.String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final java.lang.String TAG = "AndroidVideoDecoder";
    private org.webrtc.VideoDecoder.Callback callback;
    private org.webrtc.MediaCodecWrapper codec;
    private final java.lang.String codecName;
    private final org.webrtc.VideoCodecMimeType codecType;
    private int colorFormat;
    private org.webrtc.ThreadUtils.ThreadChecker decoderThreadChecker;
    private final java.util.concurrent.BlockingDeque<org.webrtc.AndroidVideoDecoder.FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final org.webrtc.MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private java.lang.Thread outputThread;
    private org.webrtc.ThreadUtils.ThreadChecker outputThreadChecker;
    private org.webrtc.AndroidVideoDecoder.DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final org.webrtc.EglBase.Context sharedContext;
    private volatile java.lang.Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private android.view.Surface surface;
    private org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final java.lang.Object dimensionLock = new java.lang.Object();
    private final java.lang.Object renderedTextureMetadataLock = new java.lang.Object();

    /* loaded from: classes16.dex */
    public static class DecodedTextureMetadata {
        final java.lang.Integer decodeTimeMs;
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j17, java.lang.Integer num) {
            this.presentationTimestampUs = j17;
            this.decodeTimeMs = num;
        }
    }

    /* loaded from: classes16.dex */
    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        public FrameInfo(long j17, int i17) {
            this.decodeStartTimeMs = j17;
            this.rotation = i17;
        }
    }

    public AndroidVideoDecoder(org.webrtc.MediaCodecWrapperFactory mediaCodecWrapperFactory, java.lang.String str, org.webrtc.VideoCodecMimeType videoCodecMimeType, int i17, org.webrtc.EglBase.Context context) {
        if (!isSupportedColorFormat(i17)) {
            throw new java.lang.IllegalArgumentException("Unsupported color format: " + i17);
        }
        org.webrtc.Logging.d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i17 + " context: " + context);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i17;
        this.sharedContext = context;
        this.frameInfos = new java.util.concurrent.LinkedBlockingDeque();
    }

    private org.webrtc.VideoFrame.Buffer copyI420Buffer(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27) {
        if (i17 % 2 != 0) {
            throw new java.lang.AssertionError("Stride is not divisible by two: " + i17);
        }
        int i28 = (i19 + 1) / 2;
        int i29 = i18 % 2;
        int i37 = i29 == 0 ? (i27 + 1) / 2 : i27 / 2;
        int i38 = i17 / 2;
        int i39 = (i17 * i18) + 0;
        int i47 = i38 * i37;
        int i48 = i39 + ((i38 * i18) / 2);
        int i49 = i48 + i47;
        org.webrtc.VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i19, i27);
        byteBuffer.limit((i17 * i27) + 0);
        byteBuffer.position(0);
        copyPlane(byteBuffer.slice(), i17, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i19, i27);
        byteBuffer.limit(i39 + i47);
        byteBuffer.position(i39);
        copyPlane(byteBuffer.slice(), i38, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i28, i37);
        if (i29 == 1) {
            byteBuffer.position(i39 + ((i37 - 1) * i38));
            java.nio.ByteBuffer dataU = allocateI420Buffer.getDataU();
            dataU.position(allocateI420Buffer.getStrideU() * i37);
            dataU.put(byteBuffer);
        }
        byteBuffer.limit(i49);
        byteBuffer.position(i48);
        copyPlane(byteBuffer.slice(), i38, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i28, i37);
        if (i29 == 1) {
            byteBuffer.position(i48 + (i38 * (i37 - 1)));
            java.nio.ByteBuffer dataV = allocateI420Buffer.getDataV();
            dataV.position(allocateI420Buffer.getStrideV() * i37);
            dataV.put(byteBuffer);
        }
        return allocateI420Buffer;
    }

    private org.webrtc.VideoFrame.Buffer copyNV12ToI420Buffer(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27) {
        return new org.webrtc.NV12Buffer(i19, i27, i17, i18, byteBuffer, null).toI420();
    }

    private java.lang.Thread createOutputThread() {
        return new java.lang.Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                org.webrtc.AndroidVideoDecoder.this.outputThreadChecker = new org.webrtc.ThreadUtils.ThreadChecker();
                while (org.webrtc.AndroidVideoDecoder.this.running) {
                    org.webrtc.AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                org.webrtc.AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i17, android.media.MediaCodec.BufferInfo bufferInfo, int i18, java.lang.Integer num) {
        int i19;
        int i27;
        int i28;
        int i29;
        synchronized (this.dimensionLock) {
            i19 = this.width;
            i27 = this.height;
            i28 = this.stride;
            i29 = this.sliceHeight;
        }
        int i37 = bufferInfo.size;
        if (i37 < ((i19 * i27) * 3) / 2) {
            org.webrtc.Logging.e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        int i38 = (i37 >= ((i28 * i27) * 3) / 2 || i29 != i27 || i28 <= i19) ? i28 : (i37 * 2) / (i27 * 3);
        java.nio.ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i17];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        java.nio.ByteBuffer slice = byteBuffer.slice();
        org.webrtc.VideoFrame.Buffer copyI420Buffer = this.colorFormat == 19 ? copyI420Buffer(slice, i38, i29, i19, i27) : copyNV12ToI420Buffer(slice, i38, i29, i19, i27);
        this.codec.releaseOutputBuffer(i17, false);
        org.webrtc.VideoFrame videoFrame = new org.webrtc.VideoFrame(copyI420Buffer, i18, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i17, android.media.MediaCodec.BufferInfo bufferInfo, int i18, java.lang.Integer num) {
        int i19;
        int i27;
        synchronized (this.dimensionLock) {
            i19 = this.width;
            i27 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                this.codec.releaseOutputBuffer(i17, false);
                return;
            }
            this.surfaceTextureHelper.setTextureSize(i19, i27);
            this.surfaceTextureHelper.setFrameRotation(i18);
            this.renderedTextureMetadata = new org.webrtc.AndroidVideoDecoder.DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
            this.codec.releaseOutputBuffer(i17, true);
        }
    }

    private org.webrtc.VideoCodecStatus initDecodeInternal(int i17, int i18) {
        this.decoderThreadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i17 + " height: " + i18);
        if (this.outputThread != null) {
            org.webrtc.Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i17;
        this.height = i18;
        this.stride = i17;
        this.sliceHeight = i18;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                android.media.MediaFormat createVideoFormat = android.media.MediaFormat.createVideoFormat(this.codecType.mimeType(), i17, i18);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                java.lang.Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                org.webrtc.Logging.d(TAG, "initDecodeInternal done");
                return org.webrtc.VideoCodecStatus.OK;
            } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
                org.webrtc.Logging.e(TAG, "initDecode failed", e17);
                release();
                return org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (java.io.IOException | java.lang.IllegalArgumentException | java.lang.IllegalStateException unused) {
            org.webrtc.Logging.e(TAG, "Cannot create media decoder " + this.codecName);
            return org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i17) {
        for (int i18 : org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }

    private void reformat(android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "Decoder format changed: " + mediaFormat.toString());
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            if (integer != this.width || integer2 != this.height) {
                if (this.hasDecodedFirstFrame) {
                    stopOnOutputThread(new java.lang.RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2));
                    return;
                }
                if (integer > 0 && integer2 > 0) {
                    this.width = integer;
                    this.height = integer2;
                }
                org.webrtc.Logging.w(TAG, "Unexpected format dimensions. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2 + ". Skip it");
                return;
            }
            if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                this.colorFormat = mediaFormat.getInteger("color-format");
                org.webrtc.Logging.d(TAG, "Color: 0x" + java.lang.Integer.toHexString(this.colorFormat));
                if (!isSupportedColorFormat(this.colorFormat)) {
                    stopOnOutputThread(new java.lang.IllegalStateException("Unsupported color format: " + this.colorFormat));
                    return;
                }
            }
            synchronized (this.dimensionLock) {
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                    this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                }
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                }
                org.webrtc.Logging.d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = java.lang.Math.max(this.width, this.stride);
                this.sliceHeight = java.lang.Math.max(this.height, this.sliceHeight);
            }
        }
    }

    private org.webrtc.VideoCodecStatus reinitDecode(int i17, int i18) {
        this.decoderThreadChecker.checkIsOnValidThread();
        org.webrtc.VideoCodecStatus releaseInternal = releaseInternal();
        return releaseInternal != org.webrtc.VideoCodecStatus.OK ? releaseInternal : initDecodeInternal(i17, i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (java.lang.Exception e17) {
            org.webrtc.Logging.e(TAG, "Media decoder stop failed", e17);
        }
        try {
            this.codec.release();
        } catch (java.lang.Exception e18) {
            org.webrtc.Logging.e(TAG, "Media decoder release failed", e18);
            this.shutdownException = e18;
        }
        org.webrtc.Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private org.webrtc.VideoCodecStatus releaseInternal() {
        if (!this.running) {
            org.webrtc.Logging.d(TAG, "release: Decoder is not running.");
            return org.webrtc.VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!org.webrtc.ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                org.webrtc.Logging.e(TAG, "Media decoder release timeout", new java.lang.RuntimeException());
                return org.webrtc.VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException != null) {
                org.webrtc.Logging.e(TAG, "Media decoder release error", new java.lang.RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return org.webrtc.VideoCodecStatus.ERROR;
            }
            this.codec = null;
            this.outputThread = null;
            return org.webrtc.VideoCodecStatus.OK;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(java.lang.Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public org.webrtc.VideoFrame.I420Buffer allocateI420Buffer(int i17, int i18) {
        return org.webrtc.JavaI420Buffer.allocate(i17, i18);
    }

    public void copyPlane(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, int i19, int i27) {
        org.webrtc.YuvHelper.copyPlane(byteBuffer, i17, byteBuffer2, i18, i19, i27);
    }

    public org.webrtc.SurfaceTextureHelper createSurfaceTextureHelper() {
        return org.webrtc.SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public org.webrtc.VideoCodecStatus decode(org.webrtc.EncodedImage encodedImage, org.webrtc.VideoDecoder.DecodeInfo decodeInfo) {
        int i17;
        int i18;
        org.webrtc.VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        if (this.codec == null || this.callback == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decode uninitalized, codec: ");
            sb6.append(this.codec != null);
            sb6.append(", callback: ");
            sb6.append(this.callback);
            org.webrtc.Logging.d(TAG, sb6.toString());
            return org.webrtc.VideoCodecStatus.UNINITIALIZED;
        }
        java.nio.ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            org.webrtc.Logging.e(TAG, "decode() - no input data");
            return org.webrtc.VideoCodecStatus.ERR_PARAMETER;
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            org.webrtc.Logging.e(TAG, "decode() - input buffer empty");
            return org.webrtc.VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i17 = this.width;
            i18 = this.height;
        }
        int i19 = encodedImage.encodedWidth;
        int i27 = encodedImage.encodedHeight;
        if (i19 * i27 > 0 && ((i19 != i17 || i27 != i18) && (reinitDecode = reinitDecode(i19, i27)) != org.webrtc.VideoCodecStatus.OK)) {
            return reinitDecode;
        }
        if (this.keyFrameRequired && encodedImage.frameType != org.webrtc.EncodedImage.FrameType.VideoFrameKey) {
            org.webrtc.Logging.e(TAG, "decode() - key frame required first");
            return org.webrtc.VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (dequeueInputBuffer < 0) {
                org.webrtc.Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return org.webrtc.VideoCodecStatus.ERROR;
            }
            try {
                java.nio.ByteBuffer byteBuffer2 = this.codec.getInputBuffers()[dequeueInputBuffer];
                if (byteBuffer2.capacity() < remaining) {
                    org.webrtc.Logging.e(TAG, "decode() - HW buffer too small");
                    return org.webrtc.VideoCodecStatus.ERROR;
                }
                byteBuffer2.put(encodedImage.buffer);
                this.frameInfos.offer(new org.webrtc.AndroidVideoDecoder.FrameInfo(android.os.SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, java.util.concurrent.TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return org.webrtc.VideoCodecStatus.OK;
                } catch (java.lang.IllegalStateException e17) {
                    org.webrtc.Logging.e(TAG, "queueInputBuffer failed", e17);
                    this.frameInfos.pollLast();
                    return org.webrtc.VideoCodecStatus.ERROR;
                }
            } catch (java.lang.IllegalStateException e18) {
                org.webrtc.Logging.e(TAG, "getInputBuffers failed", e18);
                return org.webrtc.VideoCodecStatus.ERROR;
            }
        } catch (java.lang.IllegalStateException e19) {
            org.webrtc.Logging.e(TAG, "dequeueInputBuffer failed", e19);
            return org.webrtc.VideoCodecStatus.ERROR;
        }
    }

    public void deliverDecodedFrame() {
        java.lang.Integer num;
        int i17;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (dequeueOutputBuffer < 0) {
                org.webrtc.Logging.v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
                return;
            }
            org.webrtc.AndroidVideoDecoder.FrameInfo poll = this.frameInfos.poll();
            if (poll != null) {
                num = java.lang.Integer.valueOf((int) (android.os.SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                i17 = poll.rotation;
            } else {
                num = null;
                i17 = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i17, num);
            } else {
                deliverByteFrame(dequeueOutputBuffer, bufferInfo, i17, num);
            }
        } catch (java.lang.IllegalStateException e17) {
            org.webrtc.Logging.e(TAG, "deliverDecodedFrame failed", e17);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public java.lang.String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public org.webrtc.VideoCodecStatus initDecode(org.webrtc.VideoDecoder.Settings settings, org.webrtc.VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new org.webrtc.ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new android.view.Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame videoFrame) {
        long j17;
        java.lang.Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            org.webrtc.AndroidVideoDecoder.DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new java.lang.IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j17 = decodedTextureMetadata.presentationTimestampUs * 1000;
            num = decodedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.callback.onDecodedFrame(new org.webrtc.VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j17), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public org.webrtc.VideoCodecStatus release() {
        org.webrtc.Logging.d(TAG, "release");
        org.webrtc.VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }
}
