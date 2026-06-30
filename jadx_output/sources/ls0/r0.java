package ls0;

/* loaded from: classes10.dex */
public class r0 extends ls0.n implements ls0.l {
    public final long A;
    public fs0.g B;
    public gs0.b C;
    public gs0.w D;
    public ds0.d0 E;
    public ls0.k F;
    public final hs0.a G;
    public final ls0.b1 H;
    public hs0.a I;

    /* renamed from: J, reason: collision with root package name */
    public hs0.a f320886J;
    public android.os.HandlerThread K;
    public android.os.HandlerThread L;
    public boolean M;
    public boolean N;
    public yz5.l O;
    public android.graphics.Bitmap P;
    public ls0.w0 Q;
    public yz5.l R;
    public long S;
    public final rs0.a T;
    public volatile boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f320887a;

    /* renamed from: a0, reason: collision with root package name */
    public long f320888a0;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f320889b;

    /* renamed from: b0, reason: collision with root package name */
    public int f320890b0;

    /* renamed from: c, reason: collision with root package name */
    public final int f320891c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f320892c0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f320893d;

    /* renamed from: d0, reason: collision with root package name */
    public final int f320894d0;

    /* renamed from: e, reason: collision with root package name */
    public int f320895e;

    /* renamed from: e0, reason: collision with root package name */
    public volatile boolean f320896e0;

    /* renamed from: f, reason: collision with root package name */
    public int f320897f;

    /* renamed from: f0, reason: collision with root package name */
    public volatile boolean f320898f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f320899g;

    /* renamed from: g0, reason: collision with root package name */
    public volatile boolean f320900g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f320901h;

    /* renamed from: h0, reason: collision with root package name */
    public volatile boolean f320902h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f320903i;

    /* renamed from: i0, reason: collision with root package name */
    public final ls0.q0 f320904i0;

    /* renamed from: j, reason: collision with root package name */
    public int f320905j;

    /* renamed from: j0, reason: collision with root package name */
    public final java.lang.Runnable f320906j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f320907k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f320908l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f320909m;

    /* renamed from: n, reason: collision with root package name */
    public final int f320910n;

    /* renamed from: o, reason: collision with root package name */
    public final int f320911o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f320912p;

    /* renamed from: q, reason: collision with root package name */
    public final int f320913q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f320914r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.l f320915s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f320916t;

    /* renamed from: u, reason: collision with root package name */
    public final int f320917u;

    /* renamed from: v, reason: collision with root package name */
    public final int f320918v;

    /* renamed from: w, reason: collision with root package name */
    public final int f320919w;

    /* renamed from: x, reason: collision with root package name */
    public final int f320920x;

    /* renamed from: y, reason: collision with root package name */
    public final int f320921y;

    /* renamed from: z, reason: collision with root package name */
    public long f320922z;

    /* JADX WARN: Removed duplicated region for block: B:193:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, android.graphics.Rect r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, long r36, long r38, boolean r40, boolean r41, int r42, int r43, boolean r44, int r45, yz5.l r46, yz5.l r47, int r48, kotlin.jvm.internal.i r49) {
        /*
            Method dump skipped, instructions count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ls0.r0.<init>(java.lang.String, java.lang.String, int, java.lang.String, android.graphics.Rect, int, int, int, int, int, int, int, int, int, long, long, boolean, boolean, int, int, boolean, int, yz5.l, yz5.l, int, kotlin.jvm.internal.i):void");
    }

    public static final void e(ls0.r0 r0Var) {
        int i17;
        com.tencent.mars.xlog.Log.i(r0Var.f320916t, "checkFinishEncode, encodeFrameCount:" + r0Var.Y + ", drawFrameCount:" + r0Var.Z + ", useRequestDraw:" + r0Var.f320900g0 + ", isFinishEncode:" + r0Var.f320902h0 + ", isDecodeEnd:" + r0Var.f320896e0);
        int i18 = r0Var.Y;
        if (i18 > 0 && (i17 = r0Var.Z) > 0 && i18 >= i17 && r0Var.f320896e0) {
            r0Var.f();
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEndWithFrameNumberMatch");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 90L, 1L);
        } else if (r0Var.f320896e0) {
            ((ku5.t0) ku5.t0.f312615d).A("DECODE_END_FINISH_ENCODE_CHECK");
            ((ku5.t0) ku5.t0.f312615d).l(r0Var.f320906j0, 1000L, "DECODE_END_FINISH_ENCODE_CHECK");
        }
    }

    @Override // ls0.l
    public void a(yz5.l blendBitmapProvider) {
        kotlin.jvm.internal.o.g(blendBitmapProvider, "blendBitmapProvider");
        this.O = blendBitmapProvider;
        ls0.k kVar = this.F;
        if (kVar != null) {
            kVar.f(blendBitmapProvider);
        }
    }

    @Override // ls0.n, ls0.l
    public int b() {
        int i17;
        com.tencent.mars.xlog.Log.i(this.f320916t, "start remux, initFinish:" + this.M);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.S = android.os.SystemClock.elapsedRealtime();
        android.graphics.Bitmap bitmap = this.P;
        if (bitmap != null && (i17 = this.f320919w) > 0) {
            this.P = com.tencent.mm.sdk.platformtools.x.w0(bitmap, -i17);
        }
        this.T.f399288b.b();
        if (this.M) {
            android.os.HandlerThread handlerThread = this.K;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.K = pm0.v.m("MediaCodecRemux_audioMix", false, new ls0.y(this));
            android.os.HandlerThread handlerThread2 = this.L;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            if (this.B != null) {
                this.L = pm0.v.m("MediaCodecRemux_videoMix", false, new ls0.z(this));
            }
        } else {
            this.N = true;
        }
        return 0;
    }

    @Override // ls0.l
    public void c(yz5.l blurBgProvider) {
        kotlin.jvm.internal.o.g(blurBgProvider, "blurBgProvider");
        this.R = blurBgProvider;
        ls0.k kVar = this.F;
        if (kVar != null) {
            kVar.g(blurBgProvider);
        }
    }

    @Override // ls0.n
    public void d(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.P = bitmap;
        ls0.k kVar = this.F;
        if (kVar != null) {
            com.tencent.mars.xlog.Log.i(kVar.f320848b, "setDrawBlendBitmap:" + bitmap.hashCode());
            kVar.f320859m = bitmap;
        }
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i(this.f320916t, "finishEncode");
        if (this.f320908l) {
            gs0.w wVar = this.D;
            if (wVar != null) {
                wVar.d();
            }
            g(true);
        } else {
            gs0.b bVar = this.C;
            if (bVar != null) {
                bVar.b();
            }
        }
        ((ku5.t0) ku5.t0.f312615d).A("DECODE_END_FINISH_ENCODE_CHECK");
        this.f320902h0 = true;
    }

    public final synchronized void g(boolean z17) {
        yz5.l lVar;
        com.tencent.mars.xlog.Log.i(this.f320916t, "finishRemux, isVideo: " + z17 + ", isAudioRemuxFinish:" + this.W + ", isVideoRemuxFinish:" + this.V + ", isInvokeEndCallback:" + this.U);
        if (z17) {
            this.V = true;
        } else {
            this.W = true;
        }
        if (this.W && this.V && !this.U) {
            ls0.k kVar = this.F;
            if (kVar != null) {
                kVar.e();
            }
            this.T.a();
            this.U = true;
            try {
                com.tencent.mm.vfs.w6.h(ls0.d1.f320816a.a(this.f320889b));
            } catch (java.lang.Exception unused) {
            }
            this.f320904i0.b();
            this.G.d();
            hs0.a aVar = this.f320886J;
            if (aVar != null) {
                aVar.d();
            }
            ls0.w0 w0Var = this.Q;
            if (w0Var != null && (lVar = w0Var.f320954n) != null) {
                ((ls0.u0) lVar).invoke(this.f320915s);
            }
            android.os.HandlerThread handlerThread = this.K;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            android.os.HandlerThread handlerThread2 = this.L;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            long j17 = this.S;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.tencent.mars.xlog.Log.i(this.f320916t, "remux used " + elapsedRealtime + " decodeFrame:" + this.X + ", encodeFrame:" + this.Y + ", drawFrameCount:" + this.Z + ", writeDtsCount:" + this.f320890b0);
            try {
                if (com.tencent.mm.plugin.sight.base.e.d(this.f320893d, true) != null) {
                    rs0.p pVar = rs0.p.f399310a;
                    pVar.d(this.f320891c, elapsedRealtime);
                    pVar.e(r14.f162383b, r14.f162386e, this.f320921y);
                    if (this.X / this.Y >= 1.5d) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxFrameCountDiffError");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 53L, 1L);
                    }
                    pVar.b(this.f320893d);
                }
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    public final es0.d h() {
        int i17 = this.f320921y;
        int i18 = this.f320907k;
        if (i18 > 0) {
            i17 = java.lang.Math.min(i18, i17);
        }
        es0.d dVar = new es0.d(this.f320909m);
        dVar.f256314d = this.f320899g;
        dVar.f256315e = i17;
        dVar.f256313c = this.f320897f;
        dVar.f256312b = this.f320895e;
        int i19 = this.f320910n;
        dVar.f256321k = i19;
        int i27 = this.f320911o;
        dVar.f256322l = i27;
        int i28 = this.f320913q;
        if (i28 > 0) {
            dVar.f256317g = i28;
        }
        while (true) {
            int i29 = dVar.f256315e;
            int i37 = (dVar.f256317g * i29) - 1;
            java.lang.String str = this.f320916t;
            if (i37 > 1) {
                com.tencent.mars.xlog.Log.i(str, "steve: hardcoder qp:" + i19 + ", " + i27);
                return dVar;
            }
            dVar.f256315e = i29 + 1;
            com.tencent.mars.xlog.Log.e(str, "encodeConfig.frameRate + 1");
        }
    }

    public final synchronized void i(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i(this.f320916t, "onDecoderEncoderFailed, isDecoder:" + z17 + " isEncoder:" + z18);
        this.f320904i0.b();
        if (z17) {
            fs0.g gVar = this.B;
            if (gVar != null) {
                gVar.c();
            }
            this.B = null;
        }
        if (z18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 162L, 1L, false);
            gs0.b bVar = this.C;
            if (bVar != null) {
                bVar.f();
            }
            this.C = null;
        }
        if (!this.U) {
            this.H.b();
            ls0.k kVar = this.F;
            if (kVar != null) {
                kVar.e();
            }
            this.T.a();
            this.U = true;
            try {
                com.tencent.mm.vfs.w6.h(ls0.d1.f320816a.a(this.f320889b));
                this.G.d();
                hs0.a aVar = this.f320886J;
                if (aVar != null) {
                    aVar.d();
                }
                android.os.HandlerThread handlerThread = this.K;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                android.os.HandlerThread handlerThread2 = this.L;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                }
                com.tencent.mm.vfs.w6.h(this.f320893d);
                long j17 = this.S;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.tencent.mars.xlog.Log.i(this.f320916t, "onDecoderEncoderFailed, finish, costTime:" + elapsedRealtime);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f320916t, e17, "onDecoderEncoderFailed error:" + e17.getMessage(), new java.lang.Object[0]);
            }
            yz5.l lVar = this.f320915s;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }

    public final int j(int i17, int i18) {
        if (i17 <= i18) {
            return i18;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf((i18 - 1) & i17);
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return i17;
        }
        int intValue = valueOf.intValue();
        return intValue * 2 > i18 ? (i17 - intValue) + i18 : i17 - intValue;
    }
}
