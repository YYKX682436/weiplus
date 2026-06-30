package kk4;

/* loaded from: classes15.dex */
public class v implements kk4.b {
    public static final kk4.f Z = new kk4.f(null);

    /* renamed from: a0, reason: collision with root package name */
    public static final jz5.g f308574a0 = jz5.h.a(jz5.i.f302829d, kk4.e.f308523d);
    public boolean A;
    public wu5.c B;
    public long C;
    public long D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.a f308575J;
    public yz5.p K;
    public final jk4.a L;
    public boolean M;
    public long N;
    public boolean O;
    public long P;
    public final com.tencent.mm.sdk.platformtools.n3 Q;
    public java.lang.Runnable R;
    public boolean S;
    public boolean T;
    public long U;
    public long V;
    public final int W;
    public final int X;
    public wu5.c Y;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f308576a;

    /* renamed from: b, reason: collision with root package name */
    public kk4.c f308577b;

    /* renamed from: c, reason: collision with root package name */
    public dk4.a f308578c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f308579d;

    /* renamed from: e, reason: collision with root package name */
    public kk4.h f308580e;

    /* renamed from: f, reason: collision with root package name */
    public dn.o f308581f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f308582g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f308583h;

    /* renamed from: i, reason: collision with root package name */
    public pk4.w f308584i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f308585j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f308586k;

    /* renamed from: l, reason: collision with root package name */
    public float f308587l;

    /* renamed from: m, reason: collision with root package name */
    public nk4.s f308588m;

    /* renamed from: n, reason: collision with root package name */
    public int f308589n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f308590o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f308591p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f308592q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.p f308593r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f308594s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f308595t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.l f308596u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f308597v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.q f308598w;

    /* renamed from: x, reason: collision with root package name */
    public kk4.g0 f308599x;

    /* renamed from: y, reason: collision with root package name */
    public volatile pk4.v f308600y;

    /* renamed from: z, reason: collision with root package name */
    public long f308601z;

    public v(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f308576a = "MicroMsg.TP.MMCdnTPPlayer@" + hashCode();
        this.f308583h = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.f308587l = 1.0f;
        this.f308601z = 200L;
        this.C = -1L;
        this.D = -1L;
        this.F = 3;
        this.L = new jk4.a();
        kk4.i m17 = m();
        kk4.f0 f0Var = new kk4.f0(context, null);
        this.f308577b = f0Var;
        f0Var.setOnErrorListener(m17);
        kk4.c cVar = this.f308577b;
        if (cVar != null) {
            ((kk4.f0) cVar).setOnPreparedListener(m17);
        }
        kk4.c cVar2 = this.f308577b;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).setOnVideoSizeChangedListener(m17);
        }
        kk4.c cVar3 = this.f308577b;
        if (cVar3 != null) {
            ((kk4.f0) cVar3).f308541q = m17;
        }
        if (cVar3 != null) {
            ((kk4.f0) cVar3).setOnInfoListener(m17);
        }
        kk4.c cVar4 = this.f308577b;
        if (cVar4 != null) {
            ((kk4.f0) cVar4).setOnCompletionListener(m17);
        }
        kk4.c cVar5 = this.f308577b;
        if (cVar5 != null) {
            ((kk4.f0) cVar5).setOnSeekCompleteListener(m17);
        }
        this.O = true;
        this.P = -1L;
        this.Q = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.W = 5000;
        this.X = 3;
    }

    public static final void j(kk4.v vVar) {
        dn.o oVar = vVar.f308581f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            long j17 = bVar.f42534d2;
            java.lang.String str = bVar.field_mediaId;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = str == null ? "" : str;
            java.lang.String str4 = bVar.f42536f2;
            java.lang.String str5 = str4 == null ? "" : str4;
            int i17 = bVar.field_requestVideoFormat;
            java.lang.String str6 = bVar.f42535e2;
            long j18 = bVar.f42546p2;
            long j19 = bVar.f42547q2;
            ((c61.l7) b6Var).hl(j17, str2, str3, str5, i17, str6, 0, j18, j19, j18 >= j19 ? 3 : 0, ((int) bVar.f42540j2) / 1000, bVar.f42537g2, bVar.Y1, bVar.f42545o2);
        }
    }

    public static void q(kk4.v vVar, ck4.b bVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleOnBufferingEnd");
        }
        if (bVar == null) {
            vVar.getClass();
            return;
        }
        java.lang.Runnable runnable = vVar.R;
        if (runnable != null) {
            vVar.Q.removeCallbacks(runnable);
            vVar.R = null;
        }
        nk4.s sVar = vVar.f308588m;
        if (sVar != null) {
            ((kw2.m0) sVar).E(new nk4.b(bVar.f42534d2, android.os.SystemClock.uptimeMillis(), null, 4, null));
        }
        ((ku5.t0) ku5.t0.f312615d).k(new kk4.j(bVar), 20L);
    }

    public void A(boolean z17) {
        this.E = z17;
        kk4.c cVar = this.f308577b;
        if (cVar != null) {
            ((kk4.f0) cVar).setLoopback(z17);
        }
    }

    public void B(dk4.a mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        this.f308578c = mediaInfo;
        kk4.h hVar = this.f308580e;
        if (!kotlin.jvm.internal.o.b(hVar != null ? hVar.f308545d : null, mediaInfo.f234482s)) {
            java.lang.String mediaId = mediaInfo.f234482s;
            kotlin.jvm.internal.o.f(mediaId, "mediaId");
            java.lang.String path = mediaInfo.f234483t;
            kotlin.jvm.internal.o.f(path, "path");
            this.f308580e = new kk4.h(this, mediaId, path);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setMediaInfo, resourceLoader:");
        kk4.h hVar2 = this.f308580e;
        sb6.append(hVar2 != null ? hVar2.hashCode() : 0);
        sb6.append(", isLocal:");
        dk4.a aVar = this.f308578c;
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f234468e) : null);
        com.tencent.mars.xlog.Log.i(this.f308576a, sb6.toString());
    }

    public void C(boolean z17) {
        kk4.c cVar = this.f308577b;
        if (cVar != null) {
            ((kk4.f0) cVar).setOutputMute(z17);
        }
    }

    public void D(yz5.q qVar) {
        this.f308598w = qVar;
        if (this.L.f300141k != 1000) {
            r();
        }
    }

    public final void E(yz5.l lVar) {
        this.f308594s = lVar;
        if (this.L.f300132b > 0) {
            if (lVar != null) {
                lVar.invoke(this.f308577b);
            }
            E(null);
        }
    }

    public void F(yz5.l lVar) {
        this.f308590o = lVar;
        if (!s() || lVar == null) {
            return;
        }
        pm0.v.X(new kk4.m(this));
    }

    public void G(yz5.l lVar) {
        this.f308592q = lVar;
        if (!t() || lVar == null) {
            return;
        }
        kk4.c cVar = this.f308577b;
        yz5.l lVar2 = this.f308592q;
        if (lVar2 != null) {
            lVar2.invoke(cVar);
        }
    }

    public void H(long j17, long j18) {
        com.tencent.mars.xlog.Log.i(this.f308576a, "setPlayRange: " + j17 + " - " + j18);
        this.C = j17;
        this.D = j18;
        l();
        k();
    }

    public void I(pk4.v vVar, long j17) {
        this.f308600y = vVar;
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.w(this.f308576a, "setProgressListener: invalid interval " + j17);
        } else {
            this.f308601z = j17;
        }
        l();
    }

    public void J(android.view.Surface surface, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSurface() surface:");
        sb6.append(surface != null ? java.lang.Integer.valueOf(surface.hashCode()) : null);
        sb6.append(' ');
        sb6.append(w());
        com.tencent.mars.xlog.Log.i(this.f308576a, sb6.toString());
        kk4.c cVar = this.f308577b;
        if (cVar != null) {
            ((kk4.f0) cVar).setSurface(surface);
        }
        if (z17) {
            x(1);
        }
    }

    public void K(float f17) {
        com.tencent.mars.xlog.Log.i(this.f308576a, "setVolume: " + f17);
        kk4.c cVar = this.f308577b;
        if (cVar != null) {
            ((kk4.f0) cVar).setAudioGainRatio(f17);
        }
    }

    public void L() {
        boolean z17 = this.f308582g;
        java.lang.String str = this.f308576a;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startCdnDownload() already start cdn " + w());
            return;
        }
        kk4.h hVar = this.f308580e;
        dk4.a aVar = this.f308578c;
        if (hVar == null || aVar == null) {
            return;
        }
        if (hVar.f308548g || aVar.f234468e || this.H) {
            com.tencent.mars.xlog.Log.i(str, "local file or complete or fromExternResourceLoader");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "startCdnDownload");
        ek4.s Di = ((cf0.z) i95.n0.c(cf0.z.class)).Di();
        java.lang.String str2 = aVar.f234482s;
        if (str2 == null) {
            str2 = "";
        }
        Di.h(str2, new kk4.o(this), new kk4.p(this, Di, aVar));
        this.f308582g = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0.f308548g == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            r8 = this;
            wu5.c r0 = r8.Y
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = r8.f308576a
            java.lang.String r1 = "startCheckCdn"
            com.tencent.mars.xlog.Log.i(r0, r1)
            kk4.h r0 = r8.f308580e
            r1 = 0
            if (r0 == 0) goto L18
            boolean r0 = r0.f308548g
            r2 = 1
            if (r0 != r2) goto L18
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L24
            java.lang.String r0 = r8.f308576a
            java.lang.String r1 = "startCheckCdn but isAllComplete"
            com.tencent.mars.xlog.Log.i(r0, r1)
            return
        L24:
            kk4.q r3 = new kk4.q
            r3.<init>(r8)
            wu5.c r0 = r8.Y
            if (r0 == 0) goto L30
            r0.cancel(r1)
        L30:
            ku5.u0 r0 = ku5.t0.f312615d
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 1000(0x3e8, double:4.94E-321)
            r2 = r0
            ku5.t0 r2 = (ku5.t0) r2
            wu5.c r0 = r2.d(r3, r4, r6)
            r8.Y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.v.M():void");
    }

    public final void N() {
        com.tencent.mars.xlog.Log.i(this.f308576a, "startProgressTimer " + w());
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = -1L;
        kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
        g0Var2.f310121d = -1L;
        kk4.r rVar = new kk4.r(g0Var2, this, g0Var);
        wu5.c cVar = this.B;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        long j17 = this.f308601z;
        this.B = ((ku5.t0) u0Var).d(rVar, j17, j17);
    }

    public void O() {
        com.tencent.mars.xlog.Log.i(this.f308576a, "startToPlay: currentPlayState=" + this.f308579d);
        M();
        if (!u()) {
            ((com.tencent.mm.feature.performance.p4) kk4.f.a(Z)).b(this);
            this.f308586k = true;
            kk4.b.a(this, null, 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f308576a, "already start " + w());
        x(3);
        if (s()) {
            pm0.v.X(new kk4.m(this));
        }
    }

    public void P() {
        com.tencent.mars.xlog.Log.i(this.f308576a, "stopAsync() " + w());
        jk4.a aVar = this.L;
        long j17 = aVar.f300131a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        aVar.f300133c = android.os.SystemClock.elapsedRealtime() - j17;
        pm0.v.O("TP.Player", new kk4.s(this));
    }

    public final void Q() {
        if (this.Y != null) {
            com.tencent.mars.xlog.Log.i(this.f308576a, "stopCheckCdn");
            wu5.c cVar = this.Y;
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.Y = null;
        }
    }

    public void R() {
        com.tencent.mars.xlog.Log.i(this.f308576a, "stopProgressTimer " + w());
        pm0.v.X(new kk4.u(this));
        wu5.c cVar = this.B;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.B = null;
    }

    public final void S(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f308576a, "updateIsReaStartDownloader() isReaStartDownloader:" + z17);
        this.f308583h.set(z17);
    }

    @Override // kk4.b
    public void b(boolean z17, boolean z18) {
        kk4.c cVar;
        com.tencent.mars.xlog.Log.i(this.f308576a, "pause: currentPlayState=" + this.f308579d + ", " + w() + ", " + z17 + ", " + z18);
        ((com.tencent.mm.feature.performance.p4) kk4.f.a(Z)).a(this);
        this.f308586k = false;
        if (u() && s()) {
            kk4.c cVar2 = this.f308577b;
            if (cVar2 != null) {
                ((kk4.f0) cVar2).pause();
            }
            if (z17 && (cVar = this.f308577b) != null) {
                ((kk4.f0) cVar).pauseDownload();
            }
            if (!this.f308585j) {
                dn.o oVar = this.f308581f;
                q(this, oVar instanceof ck4.b ? (ck4.b) oVar : null, false, 2, null);
            }
        }
        Q();
        if (z17) {
            if (!this.H) {
                dk4.a aVar = this.f308578c;
                if ((aVar == null || aVar.f234468e) ? false : true) {
                    kk4.b.e(this, null, 1, null);
                    return;
                }
            }
            this.f308582g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[Catch: Exception -> 0x0172, TryCatch #0 {Exception -> 0x0172, blocks: (B:3:0x0005, B:6:0x000d, B:21:0x0078, B:24:0x0098, B:27:0x009e, B:29:0x00aa, B:34:0x00b6, B:35:0x00e1, B:37:0x00e5, B:38:0x00ee, B:40:0x00f2, B:41:0x0108, B:43:0x010c, B:44:0x0115, B:46:0x0119, B:48:0x0122, B:51:0x012b, B:52:0x0161, B:56:0x012f, B:58:0x0133, B:60:0x00c1, B:62:0x00c5, B:63:0x00d9, B:65:0x0139, B:67:0x013d, B:68:0x0146, B:70:0x014a, B:71:0x0158, B:73:0x015c), top: B:2:0x0005 }] */
    @Override // kk4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.v.c(java.lang.String):void");
    }

    @Override // kk4.b
    public void d(yz5.a finish) {
        kotlin.jvm.internal.o.g(finish, "finish");
        boolean z17 = this.f308582g;
        java.lang.String str = this.f308576a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "stopCdnDownload() not start cdn " + w());
            finish.invoke();
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "stopCdnDownload");
        ek4.s Di = ((cf0.z) i95.n0.c(cf0.z.class)).Di();
        dk4.a aVar = this.f308578c;
        java.lang.String str2 = aVar != null ? aVar.f234482s : null;
        if (str2 == null) {
            str2 = "";
        }
        Di.k(str2, new kk4.t(this, finish));
        this.f308582g = false;
        kk4.h hVar = this.f308580e;
        if (hVar != null) {
            hVar.f308549h = false;
        }
    }

    public final void k() {
        kk4.c cVar = this.f308577b;
        long currentPositionMs = cVar != null ? ((kk4.f0) cVar).getCurrentPositionMs() : 0L;
        long j17 = this.D;
        long j18 = this.C;
        if (0 <= j18 && j18 < j17) {
            kk4.c cVar2 = this.f308577b;
            if (currentPositionMs < java.lang.Math.min(j17, (cVar2 != null ? ((kk4.f0) cVar2).getDurationMs() : 0L) - ((long) 34)) && j18 <= currentPositionMs) {
                return;
            }
            if (this.E) {
                kk4.c cVar3 = this.f308577b;
                if (cVar3 != null) {
                    ((kk4.f0) cVar3).seekTo((int) this.C, 3);
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f308576a, "checkPlayRange currentMs:" + currentPositionMs + " not in playRange:[" + this.C + ", " + this.D + ']');
            stop();
        }
    }

    public final void l() {
        long j17 = this.D;
        long j18 = this.C;
        boolean z17 = ((0L > j18 ? 1 : (0L == j18 ? 0 : -1)) <= 0 && (j18 > j17 ? 1 : (j18 == j17 ? 0 : -1)) < 0) || this.f308600y != null;
        if (z17 && !this.A) {
            this.A = true;
            if (s()) {
                N();
                return;
            }
            return;
        }
        if (z17) {
            return;
        }
        R();
        wu5.c cVar = this.B;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.B = null;
        this.A = false;
    }

    public kk4.i m() {
        return new kk4.i(this);
    }

    public dn.o n() {
        ck4.c cVar = ck4.c.f42548a;
        dk4.a aVar = this.f308578c;
        java.lang.String str = aVar != null ? aVar.f234482s : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = aVar != null ? aVar.f234484u : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = aVar != null ? aVar.f234483t : null;
        if (str3 == null) {
            str3 = "";
        }
        int i17 = aVar != null ? aVar.f234464a : 2;
        java.lang.String str4 = aVar != null ? aVar.f234465b : null;
        if (str4 == null) {
            str4 = "xV2";
        }
        java.lang.String str5 = aVar != null ? aVar.f234466c : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = aVar != null ? aVar.f234467d : null;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.String str7 = aVar != null ? aVar.f234481r : null;
        return cVar.b(str, str2, str3, i17, str4, str5, str6, str7 == null ? "" : str7, this.f308580e, this.f308576a);
    }

    public long o() {
        kk4.c cVar = this.f308577b;
        if (cVar != null) {
            return ((kk4.f0) cVar).getCurrentPositionMs();
        }
        return 0L;
    }

    public final com.tencent.pigeon.flutter_thumb_player.FlutterTPPlayFeedbackInfo p() {
        nk4.s sVar;
        dn.o oVar = this.f308581f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar == null || (sVar = this.f308588m) == null) {
            return null;
        }
        kw2.d0 d0Var = (kw2.d0) ((kw2.m0) sVar).f313059d.get(java.lang.Long.valueOf(bVar.f42534d2));
        if (d0Var == null) {
            return null;
        }
        so2.i3 c17 = cu2.x.c(cu2.x.f222449a, d0Var.f312910e, false, false, false, 14, null);
        int i17 = c17.field_videoCodecId;
        d0Var.f312947w0 = i17 != 26 ? i17 != 172 ? i17 != 193 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "H266" : "H265" : "H264";
        d0Var.f312941t0 = c17.field_videoBitrate;
        d0Var.f312943u0 = c17.field_audioBitrate;
        d0Var.f312951y0 = c17.field_frameRate;
        long j17 = d0Var.Q0;
        long j18 = d0Var.A;
        long j19 = d0Var.f312928n;
        long j27 = d0Var.f312932p;
        long j28 = d0Var.S;
        int i18 = d0Var.B0;
        return new com.tencent.pigeon.flutter_thumb_player.FlutterTPPlayFeedbackInfo(j17, j18, j19, j27, j28, i18, java.lang.String.valueOf(i18), d0Var.f312918i * 1000, d0Var.f312953z0, d0Var.A0, d0Var.f312920j, d0Var.f312941t0, d0Var.f312947w0, d0Var.Z, d0Var.G, d0Var.f312934q, d0Var.f312901J);
    }

    public final void r() {
        ((com.tencent.mm.feature.performance.p4) kk4.f.a(Z)).a(this);
        yz5.q qVar = this.f308598w;
        if (qVar != null) {
            kk4.c cVar = this.f308577b;
            jk4.a aVar = this.L;
            qVar.invoke(cVar, java.lang.Integer.valueOf(aVar.f300141k), java.lang.Integer.valueOf(aVar.f300140j));
        }
    }

    @Override // kk4.b
    public void recycle() {
        com.tencent.mars.xlog.Log.i(this.f308576a, "recycle " + w());
        ((com.tencent.mm.feature.performance.p4) kk4.f.a(Z)).a(this);
        kk4.b.h(this, null, false, 2, null);
        pm0.v.O("TP.Player", new kk4.n(this));
        R();
        wu5.c cVar = this.B;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.B = null;
        this.A = false;
        this.f308599x = null;
    }

    public boolean s() {
        return this.f308579d == 5;
    }

    @Override // kk4.b
    public void stop() {
        nk4.s sVar;
        ((com.tencent.mm.feature.performance.p4) kk4.f.a(Z)).a(this);
        java.lang.String str = this.f308576a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop() ");
        sb6.append(w());
        sb6.append(", fromExternResourceLoader:");
        sb6.append(this.H);
        sb6.append(", isLocal:");
        dk4.a aVar = this.f308578c;
        sb6.append(aVar != null ? java.lang.Boolean.valueOf(aVar.f234468e) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        this.f308586k = false;
        if (!u()) {
            com.tencent.mars.xlog.Log.i(this.f308576a, "stop() return for isStartPlay. " + w());
            pk4.w wVar = this.f308584i;
            if (wVar != null) {
                ((qk4.d) wVar).a();
                return;
            }
            return;
        }
        dn.o oVar = this.f308581f;
        if ((oVar instanceof ck4.b) && (sVar = this.f308588m) != null) {
            ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            long j17 = bVar != null ? bVar.f42534d2 : 0L;
            ck4.b bVar2 = oVar instanceof ck4.b ? (ck4.b) oVar : null;
            java.lang.String str2 = bVar2 != null ? bVar2.field_mediaId : null;
            if (str2 == null) {
                str2 = "";
            }
            ((kw2.m0) sVar).C(new nk4.o(j17, str2, null, android.os.SystemClock.uptimeMillis(), null));
        }
        R();
        Q();
        this.f308600y = null;
        this.f308599x = null;
        this.P = -1L;
        this.M = false;
        this.T = false;
        this.S = false;
        this.O = false;
        this.N = 0L;
        kk4.c cVar = this.f308577b;
        if (cVar != null) {
            cVar.stop();
        }
        kk4.c cVar2 = this.f308577b;
        if (cVar2 != null) {
            ((kk4.f0) cVar2).reset();
        }
        if (!this.H) {
            dk4.a aVar2 = this.f308578c;
            if ((aVar2 == null || aVar2.f234468e) ? false : true) {
                kk4.b.e(this, null, 1, null);
                com.tencent.mars.xlog.Log.i(this.f308576a, "stop() end " + w());
            }
        }
        this.f308582g = false;
        com.tencent.mars.xlog.Log.i(this.f308576a, "stop() end " + w());
    }

    public boolean t() {
        int i17 = this.f308579d;
        return i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7;
    }

    public boolean u() {
        switch (this.f308579d) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final int v(int i17) {
        dn.o oVar = this.f308581f;
        if ((oVar instanceof ck4.b ? (ck4.b) oVar : null) == null) {
            return i17;
        }
        if (i17 > 4) {
            if (i17 == 5) {
                return 1;
            }
            if (i17 == 6) {
                return 2;
            }
            if (i17 == 10) {
                return 4;
            }
            if (i17 >= 8 && i17 <= 11) {
                return 3;
            }
        }
        return 0;
    }

    public java.lang.String w() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId:");
        dk4.a aVar = this.f308578c;
        sb6.append(aVar != null ? aVar.f234482s : null);
        sb6.append(" isViewFocused:");
        sb6.append(this.f308585j);
        sb6.append(" width:");
        dk4.a aVar2 = this.f308578c;
        sb6.append(aVar2 != null ? java.lang.Integer.valueOf(aVar2.f234485v) : null);
        sb6.append(" height:");
        dk4.a aVar3 = this.f308578c;
        sb6.append(aVar3 != null ? java.lang.Integer.valueOf(aVar3.f234486w) : null);
        sb6.append(" duration:");
        dk4.a aVar4 = this.f308578c;
        sb6.append(aVar4 != null ? java.lang.Long.valueOf(aVar4.f234470g) : null);
        sb6.append(", timeOffset:");
        dk4.a aVar5 = this.f308578c;
        sb6.append(aVar5 != null ? java.lang.Long.valueOf(aVar5.f234479p) : null);
        return sb6.toString();
    }

    public boolean x(int i17) {
        com.tencent.mars.xlog.Log.i(this.f308576a, "playWithSource source=" + i17 + ' ' + w() + ' ');
        if (!this.f308585j) {
            com.tencent.mars.xlog.Log.i(this.f308576a, "playWithSource() return for isViewFocused:" + this.f308585j);
            return false;
        }
        if (!u()) {
            com.tencent.mars.xlog.Log.i(this.f308576a, "playWithSource() return for currentState:" + this.f308579d);
            return false;
        }
        boolean s17 = s();
        if (s17) {
            com.tencent.mars.xlog.Log.i(this.f308576a, "playWithSource() return for isPlaying:" + s17);
        } else if (t()) {
            com.tencent.mars.xlog.Log.i(this.f308576a, "realPlay()");
            kk4.c cVar = this.f308577b;
            if (cVar != null) {
                ((kk4.f0) cVar).start();
            }
        }
        L();
        kk4.c cVar2 = this.f308577b;
        if (cVar2 == null) {
            return true;
        }
        ((kk4.f0) cVar2).resumeDownload();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r5.M == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean y(int r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f308576a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "prepareVideo() source:"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " isMoovReady:"
            r1.append(r6)
            kk4.h r6 = r5.f308580e
            r2 = 0
            if (r6 == 0) goto L1e
            boolean r6 = r6.f308547f
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L1f
        L1e:
            r6 = r2
        L1f:
            r1.append(r6)
            java.lang.String r6 = " isAllCompleted:"
            r1.append(r6)
            kk4.h r6 = r5.f308580e
            if (r6 == 0) goto L32
            boolean r6 = r6.f308548g
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L33
        L32:
            r6 = r2
        L33:
            r1.append(r6)
            java.lang.String r6 = " downloadUrl:"
            r1.append(r6)
            dk4.a r6 = r5.f308578c
            if (r6 == 0) goto L41
            java.lang.String r2 = r6.f234484u
        L41:
            r1.append(r2)
            r6 = 32
            r1.append(r6)
            java.lang.String r6 = r5.w()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r6)
            r5.M()
            boolean r6 = r5.t()
            r0 = 0
            if (r6 != 0) goto Lbe
            int r6 = r5.f308579d
            r1 = 3
            r2 = 1
            if (r6 != r1) goto L69
            r6 = r2
            goto L6a
        L69:
            r6 = r0
        L6a:
            if (r6 == 0) goto L6d
            goto Lbe
        L6d:
            kk4.h r6 = r5.f308580e
            if (r6 == 0) goto Lbd
            boolean r1 = r6.f308547f
            if (r1 != 0) goto L8e
            boolean r1 = r6.f308548g
            if (r1 != 0) goto L8e
            dk4.a r1 = r5.f308578c
            if (r1 == 0) goto L83
            boolean r1 = r1.f234468e
            if (r1 != r2) goto L83
            r1 = r2
            goto L84
        L83:
            r1 = r0
        L84:
            if (r1 != 0) goto L8e
            boolean r1 = r5.H
            if (r1 != 0) goto L8e
            boolean r1 = r5.M
            if (r1 == 0) goto Lbd
        L8e:
            java.lang.String r1 = r5.f308576a
            java.lang.String r3 = "real prepare player"
            com.tencent.mars.xlog.Log.i(r1, r3)
            kk4.c r1 = r5.f308577b
            if (r1 == 0) goto Laa
            com.tencent.thumbplayer.api.TPOptionalParam r3 = new com.tencent.thumbplayer.api.TPOptionalParam
            r3.<init>()
            r4 = 123(0x7b, float:1.72E-43)
            com.tencent.thumbplayer.api.TPOptionalParam r0 = r3.buildBoolean(r4, r0)
            kk4.f0 r1 = (kk4.f0) r1
            r1.setPlayerOptionalParam(r0)
        Laa:
            kk4.c r0 = r5.f308577b
            if (r0 == 0) goto Lb3
            kk4.f0 r0 = (kk4.f0) r0
            r0.enableTPAssetResourceLoader(r6)
        Lb3:
            kk4.c r6 = r5.f308577b
            if (r6 == 0) goto Lbc
            kk4.f0 r6 = (kk4.f0) r6
            r6.prepareAsync()
        Lbc:
            return r2
        Lbd:
            return r0
        Lbe:
            java.lang.String r6 = r5.f308576a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "prepareVideo return for state:"
            r1.<init>(r2)
            int r2 = r5.f308579d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kk4.v.y(int):boolean");
    }

    public void z(int i17, boolean z17, yz5.l lVar) {
        nk4.s sVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekTo:");
        sb6.append(i17);
        sb6.append(", accurate:");
        sb6.append(z17);
        sb6.append(", isPause:");
        sb6.append(this.f308579d == 6);
        com.tencent.mars.xlog.Log.i(this.f308576a, sb6.toString());
        this.I = lVar;
        if (z17) {
            kk4.c cVar = this.f308577b;
            if (cVar != null) {
                ((kk4.f0) cVar).seekTo(i17, 3);
            }
        } else {
            kk4.c cVar2 = this.f308577b;
            if (cVar2 != null) {
                ((kk4.f0) cVar2).seekTo(i17);
            }
        }
        this.S = true;
        dn.o oVar = this.f308581f;
        ck4.b bVar = oVar instanceof ck4.b ? (ck4.b) oVar : null;
        if (bVar != null && (sVar = this.f308588m) != null) {
            long j17 = bVar.f42534d2;
            android.os.SystemClock.uptimeMillis();
            kw2.d0 d0Var = (kw2.d0) ((kw2.m0) sVar).f313059d.get(java.lang.Long.valueOf(j17));
            if (d0Var != null) {
                d0Var.f312933p0 = 1;
            }
        }
        if (s()) {
            x(2);
        }
    }
}
