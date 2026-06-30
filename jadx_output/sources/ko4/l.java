package ko4;

/* loaded from: classes14.dex */
public final class l implements com.tencent.tav.codec.IMediaCodec {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f310080a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f310081b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tav.decoder.RenderContext f310082c;

    /* renamed from: d, reason: collision with root package name */
    public int f310083d;

    /* renamed from: e, reason: collision with root package name */
    public int f310084e;

    /* renamed from: f, reason: collision with root package name */
    public int f310085f;

    /* renamed from: g, reason: collision with root package name */
    public int f310086g;

    /* renamed from: h, reason: collision with root package name */
    public int f310087h;

    /* renamed from: i, reason: collision with root package name */
    public ko4.c f310088i;

    /* renamed from: j, reason: collision with root package name */
    public ko4.c f310089j;

    /* renamed from: k, reason: collision with root package name */
    public ko4.d f310090k;

    /* renamed from: l, reason: collision with root package name */
    public long f310091l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f310092m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f310093n;

    static {
        mq1.w0.wi();
        fp.d0.n("mediaplus");
    }

    public l() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("video_soft_gl", -4);
        this.f310080a = a17;
        this.f310088i = new ko4.c(3, 0, "in");
        this.f310089j = new ko4.c(3, 0, "out");
        this.f310092m = new java.lang.Object();
        a17.start();
        this.f310081b = new android.os.Handler(a17.getLooper());
    }

    public final void a(final yz5.a r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        this.f310081b.post(new java.lang.Runnable(r17) { // from class: ko4.k

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f310079d;

            {
                kotlin.jvm.internal.o.g(r17, "function");
                this.f310079d = r17;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f310079d.invoke();
            }
        });
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void bindSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        surfaceTexture.setDefaultBufferSize(this.f310083d, this.f310084e);
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        if (mediaFormat == null || surface == null) {
            xm5.b.b("VideoSoftDecoder", "format:" + mediaFormat + ", surface:" + surface, new java.lang.Object[0]);
            return;
        }
        this.f310083d = mediaFormat.getInteger("width");
        this.f310084e = mediaFormat.getInteger("height");
        this.f310085f = rs0.o.a(mediaFormat, "rotation-degrees", 0);
        this.f310086g = rs0.o.a(mediaFormat, "max-input-size", 0);
        xm5.b.c("VideoSoftDecoder", "configure [" + this.f310083d + ", " + this.f310084e + "], " + this.f310085f + ", " + this.f310086g + ", " + this.f310087h, new java.lang.Object[0]);
        if (this.f310086g <= 0) {
            this.f310086g = this.f310083d * this.f310084e;
        }
        this.f310088i = new ko4.c(3, this.f310086g, "in");
        this.f310089j = new ko4.c(5, this.f310087h, "out");
        a(new ko4.f(this, surface));
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.view.Surface createInputSurface() {
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public int dequeueInputBuffer(long j17) {
        int b17 = this.f310088i.b(j17);
        if (b17 >= 0) {
            return b17;
        }
        return -1;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo info, long j17) {
        kotlin.jvm.internal.o.g(info, "info");
        int a17 = this.f310089j.a(j17);
        if (a17 < 0) {
            return -1;
        }
        android.media.MediaCodec.BufferInfo bufferInfo = this.f310089j.c(a17).f310037a;
        info.presentationTimeUs = bufferInfo.presentationTimeUs;
        info.size = bufferInfo.size;
        return a17;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void flush() {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public java.nio.ByteBuffer getInputBuffer(int i17) {
        return this.f310088i.c(i17).f310038b;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.media.MediaFormat getInputFormat() {
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public java.nio.ByteBuffer getOutputBuffer(int i17) {
        return this.f310089j.c(i17).f310038b;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public android.media.MediaFormat getOutputFormat() {
        return null;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public boolean isSoft() {
        return true;
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void queueInputBuffer(int i17, int i18, int i19, long j17, int i27) {
        android.media.MediaCodec.BufferInfo bufferInfo = this.f310088i.c(i17).f310037a;
        bufferInfo.presentationTimeUs = j17;
        bufferInfo.size = i19;
        ko4.c cVar = this.f310088i;
        java.util.concurrent.locks.ReentrantLock reentrantLock = cVar.f310042d;
        reentrantLock.lock();
        try {
            cVar.f310046h++;
            cVar.f310043e.signalAll();
            reentrantLock.unlock();
            a(new ko4.g(this, i19));
        } catch (java.lang.Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void release() {
        this.f310081b.post(new ko4.h(this));
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void releaseOutputBuffer(int i17, boolean z17) {
        if (!z17) {
            a(new ko4.j(this));
            return;
        }
        a(new ko4.i(this, i17));
        synchronized (this.f310092m) {
            this.f310092m.wait(5000L);
        }
        if (this.f310093n) {
            this.f310093n = false;
            throw new java.lang.RuntimeException("render error");
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void reset() {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void setDataSource(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        long nInit = com.tencent.mm.mediaplus.VideoSoftDecoderJni.nInit(path);
        this.f310091l = nInit;
        int nGetErrCode = com.tencent.mm.mediaplus.VideoSoftDecoderJni.nGetErrCode(nInit);
        this.f310087h = com.tencent.mm.mediaplus.VideoSoftDecoderJni.nGetOutputBufferSize(this.f310091l);
        xm5.b.c("VideoSoftDecoder", "init " + this.f310091l + ' ' + this.f310087h + ' ' + nGetErrCode, new java.lang.Object[0]);
        if (nGetErrCode != 0) {
            throw new com.tencent.tav.core.ExportRuntimeException(new com.tencent.tav.core.ExportErrorStatus(-201, null, ""));
        }
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void signalEndOfInputStream() {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void start() {
    }

    @Override // com.tencent.tav.codec.IMediaCodec
    public void stop() {
    }
}
