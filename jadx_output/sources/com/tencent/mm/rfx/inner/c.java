package com.tencent.mm.rfx.inner;

/* loaded from: classes14.dex */
public class c implements com.tencent.mm.rfx.inner.i {

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaCodec f192232d;

    /* renamed from: e, reason: collision with root package name */
    public long f192233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaFormat f192234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.rfx.inner.RfxVideoSurface f192235g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.media.MediaCodec[] f192236h;

    public c(android.media.MediaFormat mediaFormat, com.tencent.mm.rfx.inner.RfxVideoSurface rfxVideoSurface, android.media.MediaCodec[] mediaCodecArr) {
        this.f192234f = mediaFormat;
        this.f192235g = rfxVideoSurface;
        this.f192236h = mediaCodecArr;
    }

    public void b(boolean z17) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        if (z17 && this.f192232d != null) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - this.f192233e;
            try {
                this.f192232d.stop();
            } catch (java.lang.Exception unused) {
            }
            try {
                this.f192232d.release();
            } catch (java.lang.Exception unused2) {
            }
            this.f192232d = null;
            this.f192235g.release();
            new java.lang.RuntimeException("init decoder timeout. cost: " + uptimeMillis + "ms");
        }
        if (!z17) {
            this.f192236h[0] = this.f192232d;
        }
        atomicInteger = com.tencent.mm.rfx.inner.RfxHardwareDecoder.decoderThreadCount;
        atomicInteger.getAndDecrement();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.rfx.inner.RfxVideoSurface rfxVideoSurface = this.f192235g;
        android.media.MediaFormat mediaFormat = this.f192234f;
        this.f192233e = android.os.SystemClock.uptimeMillis();
        try {
            android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            this.f192232d = createDecoderByType;
            createDecoderByType.configure(mediaFormat, rfxVideoSurface.getOutputSurface(), (android.media.MediaCrypto) null, 0);
            this.f192232d.start();
        } catch (java.lang.Exception unused) {
            android.media.MediaCodec mediaCodec = this.f192232d;
            if (mediaCodec != null) {
                mediaCodec.release();
                this.f192232d = null;
                rfxVideoSurface.release();
            }
        }
    }
}
