package v22;

/* loaded from: classes10.dex */
public final class q extends v22.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Surface f432849c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f432850d;

    /* renamed from: e, reason: collision with root package name */
    public wo.i1 f432851e;

    /* renamed from: f, reason: collision with root package name */
    public android.media.MediaFormat f432852f;

    /* renamed from: g, reason: collision with root package name */
    public final gp.c f432853g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f432854h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f432855i;

    /* renamed from: j, reason: collision with root package name */
    public long f432856j;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.HandlerThread f432857k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Object f432858l;

    /* renamed from: m, reason: collision with root package name */
    public final v22.p f432859m;

    public q(java.lang.String videoPath, int i17, android.view.Surface surface) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f432849c = surface;
        this.f432850d = "MicroMsg.EmojiMixVideoDecoderAsync";
        gp.c cVar = new gp.c();
        this.f432853g = cVar;
        this.f432854h = "";
        int i18 = pu5.i.f358473b;
        this.f432857k = pu5.f.a("EmojiMixVideoDecoderAsync_decodeThread", 5);
        this.f432858l = new java.lang.Object();
        this.f432859m = new v22.p(this);
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMixVideoDecoderAsync", "create decoder with path: ".concat(videoPath));
            cVar.k(videoPath);
            int d17 = cVar.d();
            for (int i19 = 0; i19 < d17; i19++) {
                android.media.MediaFormat e17 = this.f432853g.e(i19);
                kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
                java.lang.String string = e17.getString("mime");
                kotlin.jvm.internal.o.d(string);
                if (r26.n0.B(string, "video", false)) {
                    java.lang.String string2 = e17.getString("mime");
                    kotlin.jvm.internal.o.d(string2);
                    this.f432854h = string2;
                    this.f432852f = e17;
                    com.tencent.mars.xlog.Log.i(this.f432850d, "find video format " + this.f432852f + ", mime: " + string2);
                    this.f432853g.i(i19);
                    return;
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f432850d, e18, "init create extractor error", new java.lang.Object[0]);
        }
    }

    public static final void d(v22.q qVar, android.media.MediaCodec.BufferInfo bufferInfo) {
        com.tencent.mars.xlog.Log.i(qVar.f432850d, "processDecodeBuffer pts: " + bufferInfo.presentationTimeUs + ", size: " + bufferInfo.size);
        yz5.l lVar = qVar.f432800a;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(bufferInfo.presentationTimeUs * 1000));
        }
        synchronized (qVar.f432858l) {
            try {
                qVar.f432858l.wait(3000L);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(qVar.f432850d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // v22.a0
    public int a() {
        if (this.f432852f == null) {
            return -1;
        }
        java.lang.String str = this.f432854h;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1;
        }
        try {
            wo.i1 c17 = wo.i1.c(str);
            this.f432851e = c17;
            c17.a(this.f432852f, this.f432849c, null, 0);
            boolean c18 = fp.h.c(23);
            v22.p pVar = this.f432859m;
            if (c18) {
                android.os.HandlerThread handlerThread = this.f432857k;
                handlerThread.start();
                android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
                wo.i1 i1Var = this.f432851e;
                if (i1Var != null) {
                    i1Var.f447719a.setCallback(pVar, handler);
                }
            } else {
                wo.i1 i1Var2 = this.f432851e;
                if (i1Var2 != null) {
                    i1Var2.f447719a.setCallback(pVar);
                }
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f432850d, "init decoder error " + e17.getMessage());
            return -1;
        }
    }

    @Override // v22.a0
    public void b(boolean z17) {
        if (z17) {
            return;
        }
        synchronized (this.f432858l) {
            try {
                this.f432858l.notifyAll();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f432850d, e17, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // v22.a0
    public void c() {
        wo.i1 i1Var = this.f432851e;
        if (i1Var != null) {
            if (i1Var != null) {
                i1Var.x();
            }
        } else {
            yz5.a aVar = this.f432801b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
