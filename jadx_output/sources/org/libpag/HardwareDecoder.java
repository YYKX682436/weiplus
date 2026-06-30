package org.libpag;

/* loaded from: classes13.dex */
class HardwareDecoder {

    /* renamed from: f, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f347750f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private android.media.MediaCodec f347752b;

    /* renamed from: a, reason: collision with root package name */
    private org.libpag.VideoSurface f347751a = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f347753c = true;

    /* renamed from: d, reason: collision with root package name */
    private android.media.MediaCodec.BufferInfo f347754d = new android.media.MediaCodec.BufferInfo();

    /* renamed from: e, reason: collision with root package name */
    private int f347755e = -1;

    /* loaded from: classes13.dex */
    public class a implements org.libpag.d.b {

        /* renamed from: a, reason: collision with root package name */
        private android.media.MediaCodec f347756a;

        /* renamed from: b, reason: collision with root package name */
        private long f347757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ android.media.MediaFormat f347758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ org.libpag.VideoSurface f347759d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ android.media.MediaCodec[] f347760e;

        public a(android.media.MediaFormat mediaFormat, org.libpag.VideoSurface videoSurface, android.media.MediaCodec[] mediaCodecArr) {
            this.f347758c = mediaFormat;
            this.f347759d = videoSurface;
            this.f347760e = mediaCodecArr;
        }

        @Override // org.libpag.d.b
        public void a(boolean z17) {
            if (z17 && this.f347756a != null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f347757b;
                try {
                    this.f347756a.stop();
                } catch (java.lang.Exception unused) {
                }
                try {
                    this.f347756a.release();
                } catch (java.lang.Exception unused2) {
                }
                this.f347756a = null;
                this.f347759d.a();
                new java.lang.RuntimeException("init decoder timeout. cost: " + uptimeMillis + "ms");
            }
            if (!z17) {
                this.f347760e[0] = this.f347756a;
            }
            org.libpag.HardwareDecoder.f347750f.getAndDecrement();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f347757b = android.os.SystemClock.uptimeMillis();
            try {
                android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(this.f347758c.getString("mime"));
                this.f347756a = createDecoderByType;
                createDecoderByType.configure(this.f347758c, this.f347759d.getInputSurface(), (android.media.MediaCrypto) null, 0);
                this.f347756a.start();
            } catch (java.lang.Exception unused) {
                android.media.MediaCodec mediaCodec = this.f347756a;
                if (mediaCodec != null) {
                    mediaCodec.release();
                    this.f347756a = null;
                    this.f347759d.a();
                }
            }
        }
    }

    private static org.libpag.HardwareDecoder Create(android.media.MediaFormat mediaFormat) {
        org.libpag.VideoSurface a17;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = f347750f;
        if (atomicInteger.get() >= 10 || (a17 = org.libpag.VideoSurface.a(mediaFormat.getInteger("width"), mediaFormat.getInteger("height"))) == null) {
            return null;
        }
        atomicInteger.getAndIncrement();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("libpag_GPUDecoder_init_decoder");
        try {
            handlerThread.start();
            android.media.MediaCodec[] mediaCodecArr = {null};
            boolean a18 = new org.libpag.d(handlerThread.getLooper()).a(new org.libpag.HardwareDecoder.a(mediaFormat, a17, mediaCodecArr), 2000L);
            handlerThread.quitSafely();
            if (!a18) {
                return null;
            }
            org.libpag.HardwareDecoder hardwareDecoder = new org.libpag.HardwareDecoder();
            hardwareDecoder.f347751a = a17;
            hardwareDecoder.f347752b = mediaCodecArr[0];
            return hardwareDecoder;
        } catch (java.lang.Error | java.lang.Exception unused) {
            f347750f.getAndDecrement();
            return null;
        }
    }

    private int dequeueInputBuffer() {
        try {
            return this.f347752b.dequeueInputBuffer(1000L);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -1;
        }
    }

    private int dequeueOutputBuffer() {
        try {
            return this.f347752b.dequeueOutputBuffer(this.f347754d, 1000L);
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    private java.nio.ByteBuffer getInputBuffer(int i17) {
        try {
            return this.f347752b.getInputBuffer(i17);
        } catch (java.lang.Error | java.lang.Exception unused) {
            return null;
        }
    }

    private org.libpag.VideoSurface getVideoSurface() {
        return this.f347751a;
    }

    private int onDecodeFrame() {
        releaseOutputBuffer();
        try {
            int dequeueOutputBuffer = dequeueOutputBuffer();
            if ((this.f347754d.flags & 4) == 0) {
                if (dequeueOutputBuffer >= 0) {
                    this.f347755e = dequeueOutputBuffer;
                }
                return this.f347755e != -1 ? 0 : -1;
            }
            if (dequeueOutputBuffer < 0) {
                return -3;
            }
            this.f347755e = dequeueOutputBuffer;
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
        if (this.f347753c) {
            return;
        }
        try {
            this.f347752b.flush();
            this.f347754d = new android.media.MediaCodec.BufferInfo();
            this.f347755e = -1;
        } catch (java.lang.Exception unused) {
        }
    }

    private void onRelease() {
        if (this.f347752b == null) {
            return;
        }
        releaseOutputBuffer();
        try {
            this.f347752b.stop();
        } catch (java.lang.Exception unused) {
        }
        try {
            this.f347752b.release();
        } catch (java.lang.Exception unused2) {
        }
        this.f347752b = null;
        this.f347751a.a();
    }

    private boolean onRenderFrame() {
        int i17 = this.f347755e;
        if (i17 == -1) {
            return false;
        }
        int releaseOutputBuffer = releaseOutputBuffer(i17, true);
        this.f347755e = -1;
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
        return this.f347754d.presentationTimeUs;
    }

    private int queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        try {
            this.f347752b.queueInputBuffer(i17, i18, i19, j17, i27);
            this.f347753c = false;
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }

    private void releaseOutputBuffer() {
        int i17 = this.f347755e;
        if (i17 != -1) {
            releaseOutputBuffer(i17, false);
            this.f347755e = -1;
        }
    }

    private int releaseOutputBuffer(int i17, boolean z17) {
        try {
            this.f347752b.releaseOutputBuffer(i17, z17);
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -2;
        }
    }
}
