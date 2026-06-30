package io.clipworks.androidplus.media;

/* loaded from: classes14.dex */
public class WrappedMediaCodec {
    private static final java.lang.String TAG = "WrappedMediaCodec";
    private static final java.util.concurrent.atomic.AtomicInteger kHandlerThreadIndexCounter = new java.util.concurrent.atomic.AtomicInteger();
    private final android.media.MediaCodec _backingMediaCodec;
    private android.os.HandlerThread _handlerThread;

    private WrappedMediaCodec(android.media.MediaCodec mediaCodec) {
        this._backingMediaCodec = mediaCodec;
    }

    public static io.clipworks.androidplus.media.WrappedMediaCodec createByCodecName(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new io.clipworks.androidplus.media.WrappedMediaCodec(android.media.MediaCodec.createByCodecName(str));
        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    public static io.clipworks.androidplus.media.WrappedMediaCodec createDecoderByType(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new io.clipworks.androidplus.media.WrappedMediaCodec(android.media.MediaCodec.createDecoderByType(str));
        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    public static io.clipworks.androidplus.media.WrappedMediaCodec createEncoderByType(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return new io.clipworks.androidplus.media.WrappedMediaCodec(android.media.MediaCodec.createEncoderByType(str));
        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            return null;
        }
    }

    public static android.view.Surface createPersistentInputSurface() {
        return android.media.MediaCodec.createPersistentInputSurface();
    }

    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        this._backingMediaCodec.configure(mediaFormat, surface, mediaCrypto, i17);
    }

    public android.view.Surface createInputSurface() {
        return this._backingMediaCodec.createInputSurface();
    }

    public int dequeueInputBuffer(long j17) {
        return this._backingMediaCodec.dequeueInputBuffer(j17);
    }

    public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        return this._backingMediaCodec.dequeueOutputBuffer(bufferInfo, j17);
    }

    public void flush() {
        this._backingMediaCodec.flush();
    }

    public java.lang.String getCanonicalName() {
        return this._backingMediaCodec.getCanonicalName();
    }

    public android.media.MediaCodecInfo getCodecInfo() {
        return this._backingMediaCodec.getCodecInfo();
    }

    public java.nio.ByteBuffer getInputBuffer(int i17) {
        try {
            return this._backingMediaCodec.getInputBuffer(i17);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public android.media.MediaFormat getInputFormat() {
        return this._backingMediaCodec.getInputFormat();
    }

    public android.media.Image getInputImage(int i17) {
        return this._backingMediaCodec.getInputImage(i17);
    }

    public android.os.PersistableBundle getMetrics() {
        return this._backingMediaCodec.getMetrics();
    }

    public java.lang.String getName() {
        return this._backingMediaCodec.getName();
    }

    public java.nio.ByteBuffer getOutputBuffer(int i17) {
        return this._backingMediaCodec.getOutputBuffer(i17);
    }

    public android.media.MediaFormat getOutputFormat() {
        return this._backingMediaCodec.getOutputFormat();
    }

    public android.media.Image getOutputImage(int i17) {
        return this._backingMediaCodec.getOutputImage(i17);
    }

    public void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        this._backingMediaCodec.queueInputBuffer(i17, i18, i19, j17, i27);
    }

    public void queueSecureInputBuffer(int i17, int i18, android.media.MediaCodec.CryptoInfo cryptoInfo, long j17, int i19) {
        this._backingMediaCodec.queueSecureInputBuffer(i17, i18, cryptoInfo, j17, i19);
    }

    public void release() {
        this._handlerThread.quitSafely();
        this._handlerThread = null;
        this._backingMediaCodec.release();
    }

    public void releaseOutputBuffer(int i17, boolean z17) {
        this._backingMediaCodec.releaseOutputBuffer(i17, z17);
    }

    public void reset() {
        this._backingMediaCodec.reset();
    }

    public void setAudioPresentation(android.media.AudioPresentation audioPresentation) {
        this._backingMediaCodec.setAudioPresentation(audioPresentation);
    }

    public void setCallback(android.media.MediaCodec.Callback callback, android.os.Handler handler) {
        this._backingMediaCodec.setCallback(callback, handler);
    }

    public void setCallbackOnHandlerThread(android.media.MediaCodec.Callback callback) {
        if (this._handlerThread == null) {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("AMC_HTCB_" + kHandlerThreadIndexCounter.getAndAdd(1));
            this._handlerThread = handlerThread;
            handlerThread.start();
        }
        this._backingMediaCodec.setCallback(callback, new android.os.Handler(this._handlerThread.getLooper()));
    }

    public void setInputSurface(android.view.Surface surface) {
        this._backingMediaCodec.setInputSurface(surface);
    }

    public void setOnFrameRenderedListener(android.media.MediaCodec.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this._backingMediaCodec.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    public void setOutputSurface(android.view.Surface surface) {
        this._backingMediaCodec.setOutputSurface(surface);
    }

    public void setParameters(android.os.Bundle bundle) {
        this._backingMediaCodec.setParameters(bundle);
    }

    public void setVideoScalingMode(int i17) {
        this._backingMediaCodec.setVideoScalingMode(i17);
    }

    public void signalEndOfInputStream() {
        this._backingMediaCodec.signalEndOfInputStream();
    }

    public void start() {
        this._backingMediaCodec.start();
    }

    public void stop() {
        this._backingMediaCodec.stop();
    }

    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler) {
        this._backingMediaCodec.configure(mediaFormat, surface, i17, mediaDescrambler);
    }

    public android.media.MediaFormat getOutputFormat(int i17) {
        return this._backingMediaCodec.getOutputFormat(i17);
    }

    public void releaseOutputBuffer(int i17, long j17) {
        this._backingMediaCodec.releaseOutputBuffer(i17, j17);
    }

    public void setCallback(android.media.MediaCodec.Callback callback) {
        this._backingMediaCodec.setCallback(callback);
    }
}
