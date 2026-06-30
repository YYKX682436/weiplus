package fs0;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final hs0.a f266211a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f266212b;

    /* renamed from: c, reason: collision with root package name */
    public final long f266213c;

    /* renamed from: d, reason: collision with root package name */
    public final long f266214d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f266215e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f266216f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f266217g;

    /* renamed from: h, reason: collision with root package name */
    public final wo.i1 f266218h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaFormat f266219i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f266220j;

    /* renamed from: k, reason: collision with root package name */
    public final int f266221k;

    /* renamed from: l, reason: collision with root package name */
    public int f266222l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f266223m;

    /* renamed from: n, reason: collision with root package name */
    public long f266224n;

    /* renamed from: o, reason: collision with root package name */
    public long f266225o;

    /* renamed from: p, reason: collision with root package name */
    public android.media.MediaCodec.BufferInfo f266226p;

    /* renamed from: q, reason: collision with root package name */
    public int f266227q;

    /* renamed from: r, reason: collision with root package name */
    public long f266228r;

    /* renamed from: s, reason: collision with root package name */
    public final int f266229s;

    /* renamed from: t, reason: collision with root package name */
    public long f266230t;

    public f(hs0.a aVar, java.lang.String audioId, long j17, long j18, yz5.p pVar, yz5.a aVar2) {
        android.media.MediaFormat mediaFormat;
        android.media.MediaFormat mediaFormat2;
        kotlin.jvm.internal.o.g(audioId, "audioId");
        this.f266211a = aVar;
        this.f266212b = audioId;
        this.f266213c = j17;
        this.f266214d = j18;
        this.f266215e = pVar;
        this.f266216f = aVar2;
        java.lang.String concat = "MicroMsg.IAudioDecoder@".concat(audioId);
        this.f266217g = concat;
        this.f266223m = new java.lang.Object();
        this.f266226p = new android.media.MediaCodec.BufferInfo();
        this.f266229s = 1024;
        if (aVar != null) {
            this.f266219i = aVar.f284552f;
            com.tencent.mars.xlog.Log.i(concat, "create MediaCodecAACDecoder, audioId:" + audioId + ", startTimeMs:" + j17 + ", endTimeMs:" + j18 + ", mediaFormat:" + this.f266219i);
            android.media.MediaFormat mediaFormat3 = this.f266219i;
            if (mediaFormat3 != null) {
                int integer = mediaFormat3.getInteger("channel-count");
                this.f266221k = integer;
                android.media.MediaFormat mediaFormat4 = this.f266219i;
                if (mediaFormat4 != null) {
                    mediaFormat4.setInteger("max-input-size", integer * 16384);
                }
                android.media.MediaFormat mediaFormat5 = this.f266219i;
                kotlin.jvm.internal.o.d(mediaFormat5);
                this.f266222l = mediaFormat5.getInteger("sample-rate");
                android.media.MediaFormat mediaFormat6 = this.f266219i;
                kotlin.jvm.internal.o.d(mediaFormat6);
                java.lang.String string = mediaFormat6.getString("mime");
                kotlin.jvm.internal.o.d(string);
                android.media.MediaFormat mediaFormat7 = this.f266219i;
                if ((mediaFormat7 != null && mediaFormat7.containsKey("encoder-delay")) && (mediaFormat2 = this.f266219i) != null) {
                    mediaFormat2.setInteger("encoder-delay", 0);
                }
                android.media.MediaFormat mediaFormat8 = this.f266219i;
                if ((mediaFormat8 != null && mediaFormat8.containsKey("encoder-padding")) && (mediaFormat = this.f266219i) != null) {
                    mediaFormat.setInteger("encoder-padding", 0);
                }
                aVar.f();
                if (j17 >= 0) {
                    aVar.e(j17 * 1000);
                }
                wo.i1 c17 = wo.i1.c(string);
                this.f266218h = c17;
                c17.a(this.f266219i, null, null, 0);
            }
        }
    }

    public int a() {
        return this.f266221k;
    }

    public int b() {
        return this.f266222l;
    }

    public final void c(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) {
        android.media.MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
        kotlin.jvm.internal.o.g(bufferInfo2, "bufferInfo");
        long j17 = this.f266228r;
        java.lang.String str = this.f266217g;
        if (j17 <= 0) {
            this.f266228r = a06.d.c(((this.f266229s * 1.0d) / this.f266222l) * 1000000);
            com.tencent.mars.xlog.Log.i(str, "checkFrameDuration, frameDuration:" + this.f266228r);
        }
        if (byteBuffer != null) {
            byteBuffer.position(bufferInfo2.offset);
            byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            int i17 = 0;
            byteBuffer.position(0);
            byteBuffer.get(bArr);
            int i18 = 1;
            if (!(remaining == 0)) {
                com.tencent.mars.xlog.Log.i(str, "decoder pcmData size:" + remaining + ", pts:" + bufferInfo2.presentationTimeUs + ", diff:" + (bufferInfo2.presentationTimeUs - this.f266230t) + ", audioId:" + this.f266212b + ", frameCount:" + this.f266227q);
                long j18 = this.f266224n;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j18;
                this.f266225o = this.f266225o + elapsedRealtime;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(hashCode());
                sb6.append(" decode frame cost ");
                sb6.append(elapsedRealtime);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                int i19 = this.f266221k == 1 ? 2048 : 4096;
                if (remaining > i19) {
                    int i27 = remaining / i19;
                    int i28 = 0;
                    int i29 = 0;
                    while (remaining > 0) {
                        int i37 = remaining > i19 ? i19 : remaining;
                        byte[] bArr2 = new byte[i37];
                        java.lang.System.arraycopy(bArr, i28, bArr2, i17, i37);
                        remaining -= i37;
                        i28 += i37;
                        i29 += i18;
                        long j19 = this.f266228r * this.f266227q;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("split ret pcmData, leftSize:");
                        sb7.append(remaining);
                        sb7.append(", sizeOffset:");
                        sb7.append(i28);
                        sb7.append(", maxBufferSize:");
                        sb7.append(i19);
                        sb7.append(", copySize:");
                        sb7.append(i37);
                        sb7.append(", data.size:");
                        sb7.append(i37);
                        sb7.append(", splitCount:");
                        sb7.append(i27);
                        sb7.append(", bufferInfo.pts:");
                        bufferInfo2 = bufferInfo;
                        int i38 = i19;
                        sb7.append(bufferInfo2.presentationTimeUs);
                        sb7.append(", pts:");
                        sb7.append(j19);
                        sb7.append(", count:");
                        sb7.append(i29);
                        com.tencent.mars.xlog.Log.i(str, sb7.toString());
                        yz5.p pVar = this.f266215e;
                        if (pVar != null) {
                        }
                        this.f266227q++;
                        i19 = i38;
                        i18 = 1;
                        i17 = 0;
                    }
                } else {
                    yz5.p pVar2 = this.f266215e;
                    if (pVar2 != null) {
                    }
                    this.f266227q++;
                }
            }
            this.f266230t = bufferInfo2.presentationTimeUs;
        }
    }

    public abstract void d();

    public void e() {
        com.tencent.mm.sdk.platformtools.Log.a(this.f266217g, "stop decoder", new java.lang.Object[0]);
        synchronized (this.f266223m) {
            com.tencent.mars.xlog.Log.i(this.f266217g, "stopDecoder in lock");
            try {
                if (!this.f266220j) {
                    this.f266220j = true;
                    wo.i1 i1Var = this.f266218h;
                    if (i1Var != null) {
                        i1Var.y();
                    }
                    wo.i1 i1Var2 = this.f266218h;
                    if (i1Var2 != null) {
                        i1Var2.q();
                    }
                    yz5.a aVar = this.f266216f;
                    if (aVar != null) {
                    }
                    com.tencent.mars.xlog.Log.i(this.f266217g, hashCode() + " total decode used " + this.f266225o);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f266217g, e17, "stopDecoder error", new java.lang.Object[0]);
            }
        }
    }
}
