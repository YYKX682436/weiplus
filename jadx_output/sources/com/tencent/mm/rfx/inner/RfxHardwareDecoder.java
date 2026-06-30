package com.tencent.mm.rfx.inner;

/* loaded from: classes14.dex */
public class RfxHardwareDecoder {
    private static final int DECODER_THREAD_MAX_COUNT = 10;
    private static final int END_OF_STREAM = -3;
    private static final int ERROR = -2;
    private static final int INIT_DECODER_TIMEOUT_MS = 2000;
    private static final int SUCCESS = 0;
    private static final int TIMEOUT_US = 1000;
    private static final int TRY_AGAIN_LATER = -1;
    private static final java.util.concurrent.atomic.AtomicInteger decoderThreadCount = new java.util.concurrent.atomic.AtomicInteger();
    private android.media.MediaCodec decoder;
    private com.tencent.mm.rfx.inner.RfxVideoSurface videoSurface = null;
    private boolean disableFlush = true;
    private android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
    private int lastOutputBufferIndex = -1;
    private boolean released = false;

    private static com.tencent.mm.rfx.inner.RfxHardwareDecoder Create(com.tencent.mm.rfx.inner.RfxVideoSurface rfxVideoSurface, android.media.MediaFormat mediaFormat) {
        if (rfxVideoSurface != null) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = decoderThreadCount;
            if (atomicInteger.get() < 10) {
                rfxVideoSurface.retain();
                atomicInteger.getAndIncrement();
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("rfxpag_RfxHardwareDecoder_init_decoder");
                handlerThread.start();
                com.tencent.mm.rfx.inner.j jVar = new com.tencent.mm.rfx.inner.j(handlerThread.getLooper());
                boolean z17 = true;
                android.media.MediaCodec[] mediaCodecArr = {null};
                com.tencent.mm.rfx.inner.c cVar = new com.tencent.mm.rfx.inner.c(mediaFormat, rfxVideoSurface, mediaCodecArr);
                if (android.os.Looper.myLooper() != jVar.getLooper()) {
                    com.tencent.mm.rfx.inner.h hVar = new com.tencent.mm.rfx.inner.h(cVar);
                    if (jVar.post(hVar)) {
                        synchronized (hVar) {
                            long uptimeMillis = android.os.SystemClock.uptimeMillis() + 2000;
                            while (!hVar.f192242e) {
                                long uptimeMillis2 = uptimeMillis - android.os.SystemClock.uptimeMillis();
                                if (uptimeMillis2 <= 0) {
                                    hVar.f192243f = true;
                                } else {
                                    try {
                                        hVar.wait(uptimeMillis2);
                                    } catch (java.lang.InterruptedException unused) {
                                    }
                                }
                            }
                        }
                    }
                    z17 = false;
                    break;
                }
                cVar.run();
                handlerThread.quitSafely();
                if (!z17) {
                    return null;
                }
                com.tencent.mm.rfx.inner.RfxHardwareDecoder rfxHardwareDecoder = new com.tencent.mm.rfx.inner.RfxHardwareDecoder();
                rfxHardwareDecoder.videoSurface = rfxVideoSurface;
                rfxHardwareDecoder.decoder = mediaCodecArr[0];
                return rfxHardwareDecoder;
            }
        }
        return null;
    }

    private static boolean ForceSoftwareDecoder() {
        return false;
    }

    private int dequeueInputBuffer() {
        try {
            return this.decoder.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -1;
        }
    }

    private int dequeueOutputBuffer() {
        try {
            return this.decoder.dequeueOutputBuffer(this.bufferInfo, 1000L);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    private java.nio.ByteBuffer getInputBuffer(int i17) {
        try {
            return this.decoder.getInputBuffer(i17);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return null;
        }
    }

    private int onDecodeFrame() {
        releaseOutputBuffer();
        try {
            int dequeueOutputBuffer = dequeueOutputBuffer();
            if ((this.bufferInfo.flags & 4) == 0) {
                if (dequeueOutputBuffer >= 0) {
                    this.lastOutputBufferIndex = dequeueOutputBuffer;
                }
                return this.lastOutputBufferIndex != -1 ? 0 : -1;
            }
            if (dequeueOutputBuffer < 0) {
                return -3;
            }
            this.lastOutputBufferIndex = dequeueOutputBuffer;
            return -3;
        } catch (java.lang.Exception unused) {
            return -2;
        }
    }

    private int onEndOfStream() {
        int dequeueInputBuffer = dequeueInputBuffer();
        if (dequeueInputBuffer >= 0) {
            return queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
        }
        return -1;
    }

    private void onFlush() {
        if (this.disableFlush) {
            return;
        }
        try {
            this.decoder.flush();
            this.bufferInfo = new android.media.MediaCodec.BufferInfo();
            this.lastOutputBufferIndex = -1;
        } catch (java.lang.Exception unused) {
        }
    }

    private void onRelease() {
        if (this.released) {
            return;
        }
        this.released = true;
        releaseOutputBuffer();
        releaseDecoder();
    }

    private boolean onRenderFrame() {
        int i17 = this.lastOutputBufferIndex;
        if (i17 == -1) {
            return false;
        }
        int releaseOutputBuffer = releaseOutputBuffer(i17, true);
        this.lastOutputBufferIndex = -1;
        return releaseOutputBuffer == 0;
    }

    private int onSendBytes(java.nio.ByteBuffer byteBuffer, long j17) {
        int dequeueInputBuffer = dequeueInputBuffer();
        if (dequeueInputBuffer < 0) {
            return -1;
        }
        java.nio.ByteBuffer inputBuffer = getInputBuffer(dequeueInputBuffer);
        if (inputBuffer == null) {
            return -2;
        }
        inputBuffer.clear();
        byteBuffer.position(0);
        inputBuffer.put(byteBuffer);
        return queueInputBuffer(dequeueInputBuffer, 0, byteBuffer.limit(), j17, 0);
    }

    private long presentationTime() {
        return this.bufferInfo.presentationTimeUs;
    }

    private int queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.decoder.queueInputBuffer(i17, i18, i19, j17, i27);
            this.disableFlush = false;
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }

    private void releaseAsync(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        decoderThreadCount.getAndIncrement();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("rfxpag_RfxHardwareDecoder_release_decoder");
        handlerThread.start();
        new android.os.Handler(handlerThread.getLooper()).post(new com.tencent.mm.rfx.inner.f(this, runnable, handlerThread));
    }

    private void releaseDecoder() {
        if (this.decoder == null) {
            return;
        }
        releaseAsync(new com.tencent.mm.rfx.inner.d(this));
    }

    private void releaseOutputBuffer() {
        int i17 = this.lastOutputBufferIndex;
        if (i17 != -1) {
            releaseOutputBuffer(i17, false);
            this.lastOutputBufferIndex = -1;
        }
    }

    private int releaseOutputBuffer(int i17, boolean z17) {
        try {
            this.decoder.releaseOutputBuffer(i17, z17);
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }
}
