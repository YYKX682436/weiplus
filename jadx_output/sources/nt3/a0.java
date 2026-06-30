package nt3;

/* loaded from: classes10.dex */
public final class a0 extends ls0.n implements ls0.l {
    public yz5.l A;
    public ls0.w0 B;
    public long C;
    public final rs0.a D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f339709J;
    public volatile boolean K;
    public volatile boolean L;
    public final java.lang.Runnable M;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f339710a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f339711b;

    /* renamed from: c, reason: collision with root package name */
    public final int f339712c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f339713d;

    /* renamed from: e, reason: collision with root package name */
    public final int f339714e;

    /* renamed from: f, reason: collision with root package name */
    public final int f339715f;

    /* renamed from: g, reason: collision with root package name */
    public final int f339716g;

    /* renamed from: h, reason: collision with root package name */
    public final int f339717h;

    /* renamed from: i, reason: collision with root package name */
    public final int f339718i;

    /* renamed from: j, reason: collision with root package name */
    public final int f339719j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f339720k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.l f339721l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f339722m;

    /* renamed from: n, reason: collision with root package name */
    public final int f339723n;

    /* renamed from: o, reason: collision with root package name */
    public final long f339724o;

    /* renamed from: p, reason: collision with root package name */
    public final long f339725p;

    /* renamed from: q, reason: collision with root package name */
    public nt3.k f339726q;

    /* renamed from: r, reason: collision with root package name */
    public gs0.b f339727r;

    /* renamed from: s, reason: collision with root package name */
    public gs0.r f339728s;

    /* renamed from: t, reason: collision with root package name */
    public ds0.d0 f339729t;

    /* renamed from: u, reason: collision with root package name */
    public final ls0.b1 f339730u;

    /* renamed from: v, reason: collision with root package name */
    public hs0.a f339731v;

    /* renamed from: w, reason: collision with root package name */
    public android.os.HandlerThread f339732w;

    /* renamed from: x, reason: collision with root package name */
    public android.os.HandlerThread f339733x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f339734y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f339735z;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(java.lang.String str, java.util.ArrayList imageList, int i17, java.lang.String outputFilePath, int i18, int i19, int i27, int i28, int i29, int i37, long j17, long j18, boolean z17, yz5.l lVar) {
        boolean z18;
        java.lang.String str2;
        ls0.b1 b1Var;
        java.lang.String str3;
        kotlin.jvm.internal.o.g(imageList, "imageList");
        kotlin.jvm.internal.o.g(outputFilePath, "outputFilePath");
        this.f339710a = str;
        this.f339711b = imageList;
        this.f339712c = i17;
        this.f339713d = outputFilePath;
        this.f339714e = i18;
        this.f339715f = i19;
        this.f339716g = i27;
        this.f339717h = i28;
        this.f339718i = i29;
        this.f339719j = i37;
        this.f339720k = z17;
        this.f339721l = lVar;
        this.f339722m = "MicroMsg.MediaCodecRemuxerFake";
        this.f339724o = j17;
        this.f339725p = -1L;
        this.D = new rs0.a("remuxCost");
        java.util.Iterator it = imageList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = true;
                break;
            } else if (!com.tencent.mm.vfs.w6.j((java.lang.String) it.next())) {
                z18 = false;
                break;
            }
        }
        if (!z18 || com.tencent.mm.sdk.platformtools.t8.K0(this.f339713d) || this.f339714e <= 0 || this.f339715f <= 0) {
            com.tencent.mars.xlog.Log.e(this.f339722m, "create MediaCodecRemuxer error, outputFilePath:" + this.f339713d + ", outputWidth:" + this.f339714e + ", outputHeight:" + this.f339715f + ", videoFps:" + this.f339723n + ", outputFps:" + this.f339719j);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxVideoParaError");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 10L, 1L);
            throw new java.lang.IllegalArgumentException("create MediaCodecRemuxer error");
        }
        rs0.p.f399310a.c(this.f339712c);
        com.tencent.mm.vfs.w6.u(com.tencent.mm.vfs.w6.r(this.f339713d));
        st3.o.f412557a.c();
        int i38 = st3.o.f412559c;
        int i39 = st3.o.f412560d;
        this.f339723n = 15;
        if (j18 == 0) {
            this.f339725p = 15000;
        } else {
            this.f339725p = j18;
        }
        boolean z19 = this.f339720k;
        if (z19) {
            com.tencent.mars.xlog.Log.i(this.f339722m, "mixMuxerController init useX264Encode, bitrate %s, width %s, height %s, fps %s", java.lang.Integer.valueOf(this.f339716g), java.lang.Integer.valueOf(this.f339714e), java.lang.Integer.valueOf(this.f339715f), java.lang.Integer.valueOf(this.f339719j));
            str2 = "MicroMsg.MediaEditorIDKeyStat";
            b1Var = new ls0.b1(this.f339724o, this.f339725p, this.f339716g, this.f339714e, this.f339715f, this.f339720k, this.f339719j, false, null);
        } else {
            str2 = "MicroMsg.MediaEditorIDKeyStat";
            b1Var = new ls0.b1(this.f339724o, this.f339725p, this.f339716g, z19, false, null, 48, null);
        }
        this.f339730u = b1Var;
        com.tencent.mm.sdk.platformtools.Log.c(this.f339722m, "create MediaCodecRemuxer, outputFilePath: " + this.f339713d + ", inputWidth: " + i38 + ", inputHeight: " + i39 + ", videoFps: 15 ,outputBitrate :" + this.f339716g + ", outputAudioBitrate:" + this.f339717h + " , outputWidth: " + this.f339714e + ", outputHeight: " + this.f339715f + ", startTimeMs: " + j17 + ", endTimeMs: " + j18 + " , outputFps: " + this.f339719j + " , videoDuration: 15000 , remuxStartTime: " + this.f339724o + " ,remuxEndTime: " + this.f339725p, new java.lang.Object[0]);
        java.lang.String str4 = this.f339722m;
        this.B = new ls0.w0(b1Var, null, this.f339713d, this.f339712c, this.f339718i, 1);
        java.lang.String str5 = this.f339710a;
        if (com.tencent.mm.vfs.w6.j(str5)) {
            kotlin.jvm.internal.o.d(str5);
            hs0.a aVar = new hs0.a(str5);
            if (aVar.f284557k) {
                str3 = str2;
                com.tencent.mars.xlog.Log.i(str3, "markRemuxMusicMediaExtractorCreateFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 15L, 1L);
            } else {
                str3 = str2;
            }
            this.f339731v = aVar;
        } else {
            str3 = str2;
        }
        try {
            int i47 = this.f339719j;
            int min = i47 > 0 ? java.lang.Math.min(i47, 15) : 15;
            es0.d dVar = new es0.d(false, 1, 0 == true ? 1 : 0);
            dVar.f256314d = this.f339716g;
            dVar.f256315e = min;
            dVar.f256313c = this.f339715f;
            dVar.f256312b = this.f339714e;
            dVar.f256320j = true;
            nt3.w wVar = new nt3.w(this);
            nt3.x xVar = new nt3.x(this);
            try {
                if (this.f339720k) {
                    com.tencent.mars.xlog.Log.i(str4, "useX264Encode");
                    com.tencent.mm.plugin.sight.base.h hVar = b1Var.f320804e;
                    gs0.r rVar = new gs0.r(hVar != null ? hVar.f162415a : -1, dVar.f256312b, dVar.f256313c);
                    this.f339728s = rVar;
                    rVar.a();
                } else {
                    this.f339727r = fp.h.c(23) ? new gs0.p(dVar, new nt3.o(wVar, xVar)) : new gs0.l(dVar, new nt3.p(wVar, xVar));
                }
            } catch (java.lang.Exception e17) {
                if (dVar.f256320j) {
                    dVar.f256320j = false;
                    try {
                        this.f339727r = fp.h.c(23) ? new gs0.p(dVar, new nt3.q(wVar, xVar)) : new gs0.l(dVar, new nt3.r(wVar, xVar));
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1092L, 12L, 1L);
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(str4, e17, "create encoder again error", new java.lang.Object[0]);
                        com.tencent.mars.xlog.Log.i(str3, "markRemuxH264EncoderInitFailed");
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.C(986L, 16L, 1L);
                        h(false);
                        g0Var.C(1092L, 11L, 1L);
                    }
                } else {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str4, e17, "create encoder error", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.i(str3, "markRemuxH264EncoderInitFailed");
                    com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var2.C(986L, 16L, 1L);
                    h(false);
                    g0Var2.C(1092L, 11L, 1L);
                }
            }
            if (this.f339728s != null || this.f339727r != null) {
                gs0.b bVar = this.f339727r;
                this.f339726q = new nt3.k(this.f339711b, this.f339724o, this.f339725p, null, bVar != null ? bVar.c() : null, this.f339714e, this.f339715f, this.f339720k, this.f339719j, new nt3.v(this, dVar));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str4, e18, "remux impl error", new java.lang.Object[0]);
        }
        this.M = new nt3.l(this);
    }

    public static final void e(nt3.a0 a0Var) {
        com.tencent.mars.xlog.Log.i(a0Var.f339722m, "checkFinishEncode, encodeFrameCount:" + a0Var.I + ", drawFrameCount:" + a0Var.f339709J + ", isFinishEncode:" + a0Var.L + ", isDecodeEnd:" + a0Var.K);
        if (a0Var.I >= a0Var.f339709J && a0Var.K) {
            a0Var.f();
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberMatch");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 90L, 1L);
        } else if (a0Var.K) {
            com.tencent.mm.sdk.platformtools.u3.l(a0Var.M);
            com.tencent.mm.sdk.platformtools.u3.i(a0Var.M, 1000L);
        }
    }

    @Override // ls0.l
    public void a(yz5.l blendBitmapProvider) {
        kotlin.jvm.internal.o.g(blendBitmapProvider, "blendBitmapProvider");
        this.A = blendBitmapProvider;
    }

    @Override // ls0.n, ls0.l
    public int b() {
        com.tencent.mars.xlog.Log.i(this.f339722m, "start remux, initFinish:" + this.f339734y);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.C = android.os.SystemClock.elapsedRealtime();
        this.D.f399288b.b();
        com.tencent.mars.xlog.Log.getLogLevel();
        if (this.f339734y) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1092L, 2L, 1L);
            android.os.HandlerThread handlerThread = this.f339732w;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.f339732w = pm0.v.m("MediaCodecRemux_audioMix", false, new nt3.m(this));
            android.os.HandlerThread handlerThread2 = this.f339733x;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            if (this.f339726q != null) {
                this.f339733x = pm0.v.m("MediaCodecRemux_videoMix", false, new nt3.n(this));
            }
        } else {
            this.f339735z = true;
        }
        return 0;
    }

    @Override // ls0.l
    public void c(yz5.l blurBgProvider) {
        kotlin.jvm.internal.o.g(blurBgProvider, "blurBgProvider");
    }

    @Override // ls0.n
    public void d(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i(this.f339722m, "finishEncode %s", java.lang.Boolean.valueOf(this.f339720k));
        if (this.f339720k) {
            gs0.r rVar = this.f339728s;
            if (rVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.X264TransEncoder", "stop isCancel:false");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                synchronized (rVar.f275016f) {
                    rVar.f275014d = true;
                    rVar.f275015e = false;
                    rVar.f275013c.quit();
                    ru5.i iVar = rVar.f275012b;
                    if (iVar != null) {
                        iVar.g();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.X264TransEncoder", "stop finish, cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
                }
            }
            g(true);
        } else {
            gs0.b bVar = this.f339727r;
            if (bVar != null) {
                bVar.b();
            }
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.M);
        this.L = true;
    }

    public final synchronized void g(boolean z17) {
        yz5.l lVar;
        com.tencent.mars.xlog.Log.i(this.f339722m, "finishRemux, isVideo: " + z17 + ", isAudioRemuxFinish:" + this.G + ", isVideoRemuxFinish:" + this.F + ", isInvokeEndCallback:" + this.E);
        if (z17) {
            this.F = true;
        } else {
            this.G = true;
        }
        if (this.G && this.F && !this.E) {
            this.D.a();
            this.E = true;
            ls0.w0 w0Var = this.B;
            if (w0Var != null && (lVar = w0Var.f320954n) != null) {
                ((ls0.u0) lVar).invoke(this.f339721l);
            }
            android.os.HandlerThread handlerThread = this.f339732w;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            android.os.HandlerThread handlerThread2 = this.f339733x;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
            }
            long j17 = this.C;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.tencent.mars.xlog.Log.i(this.f339722m, "remux used " + elapsedRealtime + " decodeFrame:" + this.H + ", encodeFrame:" + this.I + ", drawFrameCount:" + this.f339709J);
            try {
                if (com.tencent.mm.plugin.sight.base.e.d(this.f339713d, true) != null) {
                    rs0.p pVar = rs0.p.f399310a;
                    pVar.d(this.f339712c, elapsedRealtime);
                    pVar.e(r14.f162383b, r14.f162386e, this.f339723n);
                    if (this.H / this.I >= 1.5d) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameCountDiffError");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 53L, 1L);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final synchronized void h(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f339722m, "onDecoderEncoderFailed, isDecoder:" + z17);
        if (!this.E) {
            this.D.a();
            this.E = true;
            try {
                android.os.HandlerThread handlerThread = this.f339732w;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                android.os.HandlerThread handlerThread2 = this.f339733x;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                com.tencent.mm.vfs.w6.h(this.f339713d);
                long j17 = this.C;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.tencent.mars.xlog.Log.i(this.f339722m, "onDecoderEncoderFailed, finish, costTime:" + elapsedRealtime);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f339722m, e17, "onDecoderEncoderFailed error:" + e17.getMessage(), new java.lang.Object[0]);
            }
            yz5.l lVar = this.f339721l;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }
}
