package v22;

/* loaded from: classes10.dex */
public final class o extends v22.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Surface f432837c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f432838d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f432839e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f432840f;

    /* renamed from: g, reason: collision with root package name */
    public final gp.c f432841g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f432842h;

    /* renamed from: i, reason: collision with root package name */
    public final long f432843i;

    /* renamed from: j, reason: collision with root package name */
    public final long f432844j;

    /* renamed from: k, reason: collision with root package name */
    public final int f432845k;

    /* renamed from: l, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f432846l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f432847m;

    public o(java.lang.String videoPath, android.view.Surface surface) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f432837c = surface;
        this.f432838d = "MicroMsg.MixVideoDecoder";
        gp.c cVar = new gp.c();
        this.f432841g = cVar;
        this.f432842h = "";
        this.f432843i = 60000L;
        this.f432844j = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        this.f432845k = 10;
        this.f432846l = new android.media.MediaCodec.BufferInfo();
        this.f432847m = new java.lang.Object();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MixVideoDecoder", "create decoder with path: ".concat(videoPath));
            cVar.k(videoPath);
            int d17 = cVar.d();
            for (int i17 = 0; i17 < d17; i17++) {
                android.media.MediaFormat e17 = this.f432841g.e(i17);
                kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
                java.lang.String string = e17.getString("mime");
                kotlin.jvm.internal.o.d(string);
                if (r26.n0.B(string, "video", false)) {
                    java.lang.String string2 = e17.getString("mime");
                    kotlin.jvm.internal.o.d(string2);
                    this.f432842h = string2;
                    this.f432840f = e17;
                    java.lang.String str = this.f432838d;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("find video format ");
                    android.media.MediaFormat mediaFormat = this.f432840f;
                    if (mediaFormat == null) {
                        kotlin.jvm.internal.o.o("mediaFormat");
                        throw null;
                    }
                    sb6.append(mediaFormat);
                    sb6.append(", mime: ");
                    sb6.append(string2);
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                    this.f432841g.i(i17);
                    return;
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f432838d, e18, "init create extractor error", new java.lang.Object[0]);
        }
    }

    @Override // v22.a0
    public int a() {
        if (this.f432840f != null) {
            java.lang.String str = this.f432842h;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                try {
                    wo.i1 c17 = wo.i1.c(str);
                    this.f432839e = c17;
                    android.media.MediaFormat mediaFormat = this.f432840f;
                    if (mediaFormat == null) {
                        kotlin.jvm.internal.o.o("mediaFormat");
                        throw null;
                    }
                    c17.a(mediaFormat, this.f432837c, null, 0);
                    wo.i1 i1Var = this.f432839e;
                    if (i1Var != null) {
                        i1Var.x();
                        return 0;
                    }
                    kotlin.jvm.internal.o.o("decoder");
                    throw null;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(this.f432838d, "init decoder error " + e17.getMessage());
                }
            }
        }
        return -1;
    }

    @Override // v22.a0
    public void b(boolean z17) {
        if (z17) {
            return;
        }
        synchronized (this.f432847m) {
            try {
                this.f432847m.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f432838d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // v22.a0
    public void c() {
        pm0.v.m("EmojiMixVideoDecoder_decodeThread", true, new v22.n(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0167, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v22.o.d():boolean");
    }
}
