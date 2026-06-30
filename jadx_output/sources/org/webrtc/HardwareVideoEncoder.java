package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class HardwareVideoEncoder implements org.webrtc.VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final java.lang.String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final java.lang.String TAG = "HardwareVideoEncoder";
    private static final int VIDEO_AVC_LEVEL_3 = 256;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final org.webrtc.BitrateAdjuster bitrateAdjuster;
    private org.webrtc.VideoEncoder.Callback callback;
    private org.webrtc.MediaCodecWrapper codec;
    private final java.lang.String codecName;
    private final org.webrtc.VideoCodecMimeType codecType;
    private java.nio.ByteBuffer configBuffer;
    private final org.webrtc.ThreadUtils.ThreadChecker encodeThreadChecker;
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final org.webrtc.MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private long nextPresentationTimestampUs;
    private java.nio.ByteBuffer[] outputBuffers;
    private final org.webrtc.HardwareVideoEncoder.BusyCount outputBuffersBusyCount;
    private java.lang.Thread outputThread;
    private final org.webrtc.ThreadUtils.ThreadChecker outputThreadChecker;
    private final java.util.Map<java.lang.String, java.lang.String> params;
    private volatile boolean running;
    private final org.webrtc.EglBase14.Context sharedContext;
    private volatile java.lang.Exception shutdownException;
    private final java.lang.Integer surfaceColorFormat;
    private org.webrtc.EglBase14 textureEglBase;
    private android.view.Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private final java.lang.Integer yuvColorFormat;
    private final org.webrtc.HardwareVideoEncoder.YuvFormat yuvFormat;
    private final org.webrtc.GlRectDrawer textureDrawer = new org.webrtc.GlRectDrawer();
    private final org.webrtc.VideoFrameDrawer videoFrameDrawer = new org.webrtc.VideoFrameDrawer();
    private final java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage.Builder> outputBuilders = new java.util.concurrent.LinkedBlockingDeque();

    /* loaded from: classes16.dex */
    public static class BusyCount {
        private int count;
        private final java.lang.Object countLock;

        private BusyCount() {
            this.countLock = new java.lang.Object();
        }

        public void decrement() {
            synchronized (this.countLock) {
                int i17 = this.count - 1;
                this.count = i17;
                if (i17 == 0) {
                    this.countLock.notifyAll();
                }
            }
        }

        public void increment() {
            synchronized (this.countLock) {
                this.count++;
            }
        }

        public void waitForZero() {
            boolean z17;
            synchronized (this.countLock) {
                z17 = false;
                while (this.count > 0) {
                    try {
                        this.countLock.wait();
                    } catch (java.lang.InterruptedException e17) {
                        org.webrtc.Logging.e(org.webrtc.HardwareVideoEncoder.TAG, "Interrupted while waiting on busy count", e17);
                        z17 = true;
                    }
                }
            }
            if (z17) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    /* loaded from: classes16.dex */
    public enum YuvFormat {
        I420 { // from class: org.webrtc.HardwareVideoEncoder.YuvFormat.1
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(java.nio.ByteBuffer byteBuffer, org.webrtc.VideoFrame.Buffer buffer) {
                org.webrtc.VideoFrame.I420Buffer i420 = buffer.toI420();
                org.webrtc.YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 { // from class: org.webrtc.HardwareVideoEncoder.YuvFormat.2
            @Override // org.webrtc.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(java.nio.ByteBuffer byteBuffer, org.webrtc.VideoFrame.Buffer buffer) {
                org.webrtc.VideoFrame.I420Buffer i420 = buffer.toI420();
                org.webrtc.YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        public abstract void fillBuffer(java.nio.ByteBuffer byteBuffer, org.webrtc.VideoFrame.Buffer buffer);

        public static org.webrtc.HardwareVideoEncoder.YuvFormat valueOf(int i17) {
            if (i17 == 19) {
                return I420;
            }
            if (i17 != 21 && i17 != 2141391872 && i17 != 2141391876) {
                throw new java.lang.IllegalArgumentException("Unsupported colorFormat: " + i17);
            }
            return NV12;
        }
    }

    public HardwareVideoEncoder(org.webrtc.MediaCodecWrapperFactory mediaCodecWrapperFactory, java.lang.String str, org.webrtc.VideoCodecMimeType videoCodecMimeType, java.lang.Integer num, java.lang.Integer num2, java.util.Map<java.lang.String, java.lang.String> map, int i17, int i18, org.webrtc.BitrateAdjuster bitrateAdjuster, org.webrtc.EglBase14.Context context) {
        org.webrtc.ThreadUtils.ThreadChecker threadChecker = new org.webrtc.ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new org.webrtc.ThreadUtils.ThreadChecker();
        this.outputBuffersBusyCount = new org.webrtc.HardwareVideoEncoder.BusyCount();
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = org.webrtc.HardwareVideoEncoder.YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i17;
        this.forcedKeyFrameNs = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(i18);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        threadChecker.detachThread();
    }

    private boolean canUseSurface() {
        return (this.sharedContext == null || this.surfaceColorFormat == null) ? false : true;
    }

    private java.lang.Thread createOutputThread() {
        return new java.lang.Thread() { // from class: org.webrtc.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (org.webrtc.HardwareVideoEncoder.this.running) {
                    org.webrtc.HardwareVideoEncoder.this.deliverEncodedImage();
                }
                org.webrtc.HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private org.webrtc.VideoCodecStatus encodeByteBuffer(org.webrtc.VideoFrame videoFrame, long j17, org.webrtc.VideoFrame.Buffer buffer, int i17) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer == -1) {
                org.webrtc.Logging.d(TAG, "Dropped frame, no input buffers available");
                return org.webrtc.VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i17, j17, 0);
                    return org.webrtc.VideoCodecStatus.OK;
                } catch (java.lang.IllegalStateException e17) {
                    org.webrtc.Logging.e(TAG, "queueInputBuffer failed", e17);
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

    private org.webrtc.VideoCodecStatus encodeTextureBuffer(org.webrtc.VideoFrame videoFrame, long j17) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            android.opengl.GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new org.webrtc.VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(java.util.concurrent.TimeUnit.MICROSECONDS.toNanos(j17));
            return org.webrtc.VideoCodecStatus.OK;
        } catch (java.lang.RuntimeException e17) {
            org.webrtc.Logging.e(TAG, "encodeTexture failed", e17);
            return org.webrtc.VideoCodecStatus.ERROR;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: IllegalStateException -> 0x0104, TryCatch #1 {IllegalStateException -> 0x0104, blocks: (B:9:0x002a, B:11:0x0064, B:15:0x0073, B:23:0x0099, B:24:0x00a1, B:25:0x0082, B:28:0x008c, B:31:0x00af, B:33:0x00c8, B:34:0x00e4), top: B:8:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deliverEncodedImage$0(int i17) {
        try {
            this.codec.releaseOutputBuffer(i17, false);
        } catch (java.lang.Exception e17) {
            org.webrtc.Logging.e(TAG, "releaseOutputBuffer failed", e17);
        }
        this.outputBuffersBusyCount.decrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        org.webrtc.Logging.d(TAG, "Releasing MediaCodec on output thread");
        this.outputBuffersBusyCount.waitForZero();
        try {
            this.codec.stop();
        } catch (java.lang.Exception e17) {
            org.webrtc.Logging.e(TAG, "Media encoder stop failed", e17);
        }
        try {
            this.codec.release();
        } catch (java.lang.Exception e18) {
            org.webrtc.Logging.e(TAG, "Media encoder release failed", e18);
            this.shutdownException = e18;
        }
        this.configBuffer = null;
        org.webrtc.Logging.d(TAG, "Release on output thread done");
    }

    private void requestKeyFrame(long j17) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j17;
        } catch (java.lang.IllegalStateException e17) {
            org.webrtc.Logging.e(TAG, "requestKeyFrame failed", e17);
        }
    }

    private org.webrtc.VideoCodecStatus resetCodec(int i17, int i18, boolean z17) {
        this.encodeThreadChecker.checkIsOnValidThread();
        org.webrtc.VideoCodecStatus release = release();
        if (release != org.webrtc.VideoCodecStatus.OK) {
            return release;
        }
        this.width = i17;
        this.height = i18;
        this.useSurfaceMode = z17;
        return initEncodeInternal();
    }

    private boolean shouldForceKeyFrame(long j17) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j18 = this.forcedKeyFrameNs;
        return j18 > 0 && j17 > this.lastKeyFrameNs + j18;
    }

    private org.webrtc.VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return org.webrtc.VideoCodecStatus.OK;
        } catch (java.lang.IllegalStateException e17) {
            org.webrtc.Logging.e(TAG, "updateBitrate failed", e17);
            return org.webrtc.VideoCodecStatus.ERROR;
        }
    }

    public void deliverEncodedImage() {
        java.nio.ByteBuffer slice;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            final int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -3) {
                    this.outputBuffersBusyCount.waitForZero();
                    this.outputBuffers = this.codec.getOutputBuffers();
                    return;
                }
                return;
            }
            java.nio.ByteBuffer byteBuffer = this.outputBuffers[dequeueOutputBuffer];
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                org.webrtc.Logging.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bufferInfo.size);
                this.configBuffer = allocateDirect;
                allocateDirect.put(byteBuffer);
                return;
            }
            this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                updateBitrate();
            }
            boolean z17 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z17 = false;
            }
            if (z17) {
                org.webrtc.Logging.d(TAG, "Sync frame generated");
            }
            if (z17 && this.codecType == org.webrtc.VideoCodecMimeType.H264) {
                org.webrtc.Logging.d(TAG, "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                slice = java.nio.ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                this.configBuffer.rewind();
                slice.put(this.configBuffer);
                slice.put(byteBuffer);
                slice.rewind();
            } else {
                slice = byteBuffer.slice();
            }
            org.webrtc.EncodedImage.FrameType frameType = z17 ? org.webrtc.EncodedImage.FrameType.VideoFrameKey : org.webrtc.EncodedImage.FrameType.VideoFrameDelta;
            this.outputBuffersBusyCount.increment();
            org.webrtc.EncodedImage createEncodedImage = this.outputBuilders.poll().setBuffer(slice, new java.lang.Runnable() { // from class: org.webrtc.HardwareVideoEncoder$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.HardwareVideoEncoder.this.lambda$deliverEncodedImage$0(dequeueOutputBuffer);
                }
            }).setFrameType(frameType).createEncodedImage();
            this.callback.onEncodedFrame(createEncodedImage, new org.webrtc.VideoEncoder.CodecSpecificInfo());
            createEncodedImage.release();
        } catch (java.lang.IllegalStateException e17) {
            org.webrtc.Logging.e(TAG, "deliverOutput failed", e17);
        }
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame videoFrame, org.webrtc.VideoEncoder.EncodeInfo encodeInfo) {
        org.webrtc.VideoCodecStatus resetCodec;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return org.webrtc.VideoCodecStatus.UNINITIALIZED;
        }
        org.webrtc.VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z17 = buffer instanceof org.webrtc.VideoFrame.TextureBuffer;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z18 = canUseSurface() && z17;
        if ((width != this.width || height != this.height || z18 != this.useSurfaceMode) && (resetCodec = resetCodec(width, height, z18)) != org.webrtc.VideoCodecStatus.OK) {
            return resetCodec;
        }
        if (this.outputBuilders.size() > 2) {
            org.webrtc.Logging.e(TAG, "Dropped frame, encoder queue full");
            return org.webrtc.VideoCodecStatus.NO_OUTPUT;
        }
        boolean z19 = false;
        for (org.webrtc.EncodedImage.FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == org.webrtc.EncodedImage.FrameType.VideoFrameKey) {
                z19 = true;
            }
        }
        if (z19 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int height2 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
        this.outputBuilders.offer(org.webrtc.EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        long j17 = this.nextPresentationTimestampUs;
        this.nextPresentationTimestampUs += (long) (java.util.concurrent.TimeUnit.SECONDS.toMicros(1L) / this.bitrateAdjuster.getAdjustedFramerateFps());
        org.webrtc.VideoCodecStatus encodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, j17) : encodeByteBuffer(videoFrame, j17, buffer, height2);
        if (encodeTextureBuffer != org.webrtc.VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        return encodeTextureBuffer;
    }

    public void fillInputBuffer(java.nio.ByteBuffer byteBuffer, org.webrtc.VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    @Override // org.webrtc.VideoEncoder
    public java.lang.String getImplementationName() {
        return "HWEncoder";
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            org.webrtc.VideoCodecMimeType videoCodecMimeType = this.codecType;
            if (videoCodecMimeType == org.webrtc.VideoCodecMimeType.VP8) {
                return new org.webrtc.VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecMimeType == org.webrtc.VideoCodecMimeType.H264) {
                return new org.webrtc.VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return org.webrtc.VideoEncoder.ScalingSettings.OFF;
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus initEncode(org.webrtc.VideoEncoder.Settings settings, org.webrtc.VideoEncoder.Callback callback) {
        int i17;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.useSurfaceMode = canUseSurface();
        int i18 = settings.startBitrate;
        if (i18 != 0 && (i17 = settings.maxFramerate) != 0) {
            this.bitrateAdjuster.setTargets(i18 * 1000, i17);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        org.webrtc.Logging.d(TAG, "initEncode: " + this.width + " x " + this.height + ". @ " + settings.startBitrate + "kbps. Fps: " + settings.maxFramerate + " Use surface mode: " + this.useSurfaceMode);
        return initEncodeInternal();
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus release() {
        org.webrtc.VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.outputThread == null) {
            videoCodecStatus = org.webrtc.VideoCodecStatus.OK;
        } else {
            this.running = false;
            if (!org.webrtc.ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                org.webrtc.Logging.e(TAG, "Media encoder release timeout");
                videoCodecStatus = org.webrtc.VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                org.webrtc.Logging.e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = org.webrtc.VideoCodecStatus.ERROR;
            } else {
                videoCodecStatus = org.webrtc.VideoCodecStatus.OK;
            }
        }
        this.textureDrawer.release();
        this.videoFrameDrawer.release();
        org.webrtc.EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        android.view.Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        this.outputBuilders.clear();
        this.codec = null;
        this.outputBuffers = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        return videoCodecStatus;
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus setRateAllocation(org.webrtc.VideoEncoder.BitrateAllocation bitrateAllocation, int i17) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i17 > 30) {
            i17 = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i17);
        return org.webrtc.VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus setRates(org.webrtc.VideoEncoder.RateControlParameters rateControlParameters) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.bitrateAdjuster.setTargets(rateControlParameters.bitrate.getSum(), rateControlParameters.framerateFps);
        return org.webrtc.VideoCodecStatus.OK;
    }
}
