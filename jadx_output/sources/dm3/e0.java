package dm3;

/* loaded from: classes11.dex */
public class e0 extends al5.a0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f241676e;

    /* renamed from: f, reason: collision with root package name */
    public final pj4.t f241677f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f241678g;

    /* renamed from: h, reason: collision with root package name */
    public long f241679h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.wd6 f241680i;

    /* renamed from: m, reason: collision with root package name */
    public b66.n f241681m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241682n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView f241683o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f241684p;

    /* renamed from: q, reason: collision with root package name */
    public qk.a9 f241685q;

    /* renamed from: r, reason: collision with root package name */
    public final b66.t f241686r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f241687s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.Future f241688t;

    /* renamed from: u, reason: collision with root package name */
    public int f241689u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f241690v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f241691w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f241692x;

    /* renamed from: y, reason: collision with root package name */
    public final int f241693y;

    public e0(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t tVar) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(container, "container");
        this.f241676e = container;
        this.f241677f = tVar;
        this.f241678g = "MicroMsg.TingPullDownView";
        r45.wd6 wd6Var = new r45.wd6();
        this.f241680i = wd6Var;
        android.content.Context context = container.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView = new com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView(context);
        container.addView(tingMusicLyricsView);
        this.f241683o = tingMusicLyricsView;
        if (j0Var != null) {
            try {
                str2 = j0Var.f355142g;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(o(), "getOftenRead exp: %s", e17.getMessage());
            }
        } else {
            str2 = null;
        }
        wd6Var.parseFrom(android.util.Base64.decode(str2, 2));
        com.tencent.mars.xlog.Log.i(o(), "bindMvView " + hashCode());
        this.f241686r = new dm3.b0(this);
        this.f241693y = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(dm3.e0 e0Var, jm4.n2 n2Var, b66.n nVar) {
        qk.a9 a9Var = e0Var.f241685q;
        if (a9Var != null) {
            ((ul4.i) a9Var).f428617e = null;
        }
        if (n2Var != 0) {
            urgen.ur_2BA9.UR_882D.UR_F619(((b66.i) n2Var).getCppPointer(), nVar);
        }
        qk.a9 a9Var2 = e0Var.f241685q;
        if (a9Var2 != null) {
            jm4.h0 h0Var = jm4.h0.f300389f;
            byte[] byteArray = new bw5.vo0().toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            ((ul4.i) a9Var2).e(h0Var, byteArray);
        }
        ((b66.q) nVar).j(e0Var.f241686r);
        e0Var.f241681m = null;
    }

    @Override // al5.a0
    public void b() {
        com.tencent.mars.xlog.Log.i(o(), "beforeJumpDetail");
        ((ku5.t0) ku5.t0.f312615d).B(new dm3.y(this));
    }

    @Override // al5.a0
    public void c() {
        b();
    }

    @Override // al5.a0
    public long d() {
        return this.f241693y;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // al5.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r9 = this;
            r0 = 0
            r9.f5862d = r0
            java.lang.String r1 = r9.o()
            java.lang.String r2 = "Ting.onPostClose"
            com.tencent.mars.xlog.Log.i(r1, r2)
            r9.f241687s = r0
            java.util.concurrent.Future r1 = r9.f241688t
            r2 = 0
            if (r1 == 0) goto L1c
            boolean r1 = r1.cancel(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L1d
        L1c:
            r1 = r2
        L1d:
            boolean r3 = iq.b.y()
            r4 = 1
            if (r3 != 0) goto L33
            android.widget.FrameLayout r3 = r9.f241676e
            android.content.Context r3 = r3.getContext()
            boolean r3 = iq.b.F(r3, r0)
            if (r3 == 0) goto L31
            goto L33
        L31:
            r3 = r0
            goto L34
        L33:
            r3 = r4
        L34:
            long r5 = r9.f241679h
            long r5 = com.tencent.mm.sdk.platformtools.t8.H1(r5)
            r7 = 5
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L41
            r0 = r4
        L41:
            b66.n r4 = r9.f241681m
            if (r4 == 0) goto L88
            b66.q r4 = (b66.q) r4
            java.lang.String r4 = r4.d()
            if (r4 == 0) goto L88
            jm4.n2 r4 = r9.q()
            if (r4 == 0) goto L62
            jm4.p2 r4 = (jm4.p2) r4
            jm4.g3 r4 = r4.f()
            if (r4 == 0) goto L62
            b66.q r4 = (b66.q) r4
            java.lang.String r4 = r4.d()
            goto L63
        L62:
            r4 = r2
        L63:
            b66.n r5 = r9.f241681m
            if (r5 == 0) goto L6e
            b66.q r5 = (b66.q) r5
            java.lang.String r5 = r5.d()
            goto L6f
        L6e:
            r5 = r2
        L6f:
            boolean r4 = kotlin.jvm.internal.o.b(r4, r5)
            if (r4 != 0) goto L88
            java.lang.String r4 = r9.o()
            java.lang.String r5 = "onPostClose stop current task"
            com.tencent.mars.xlog.Log.i(r4, r5)
            b66.n r4 = r9.f241681m
            if (r4 == 0) goto L91
            b66.q r4 = (b66.q) r4
            r4.stop()
            goto L91
        L88:
            java.lang.String r4 = r9.o()
            java.lang.String r5 = "onPostClose task not change"
            com.tencent.mars.xlog.Log.i(r4, r5)
        L91:
            b66.n r4 = r9.f241681m
            if (r4 == 0) goto L9c
            b66.t r5 = r9.f241686r
            b66.q r4 = (b66.q) r4
            r4.j(r5)
        L9c:
            r9.f241681m = r2
            java.lang.String r2 = r9.o()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onPostClose@"
            r4.<init>(r5)
            int r5 = r9.hashCode()
            r4.append(r5)
            r5 = 32
            r4.append(r5)
            r4.append(r3)
            r4.append(r5)
            boolean r3 = r9.f241691w
            r4.append(r3)
            r4.append(r5)
            r4.append(r0)
            r4.append(r5)
            boolean r0 = r9.f241690v
            r4.append(r0)
            java.lang.String r0 = " 0 "
            r4.append(r0)
            int r0 = r9.f241689u
            r4.append(r0)
            java.lang.String r0 = ", cancelRet: "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView r0 = r9.f241683o
            if (r0 == 0) goto Lee
            r0.b()
        Lee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dm3.e0.g():void");
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return "TingPullDownView";
    }

    @Override // al5.a0
    public void h() {
        bw5.v70 d17;
        boolean z17 = true;
        this.f5862d = true;
        com.tencent.mars.xlog.Log.i(o(), "Ting.onPostOpen");
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView = this.f241683o;
        if (tingMusicLyricsView != null) {
            tingMusicLyricsView.a();
        }
        this.f241690v = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).nj();
        this.f241692x = true;
        boolean z18 = false;
        this.f241691w = false;
        r45.wd6 wd6Var = this.f241680i;
        java.lang.String str = wd6Var.f389078d;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e(o(), "onPostOpenInner listen_id is null or blank");
            return;
        }
        if (this.f241690v) {
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            java.lang.String listen_id = wd6Var.f389078d;
            kotlin.jvm.internal.o.f(listen_id, "listen_id");
            ((rk4.z8) g9Var).getClass();
            jm4.g3 g3Var = zk4.l.f473540c;
            if (g3Var != null && rk4.k5.a(g3Var).h()) {
                bw5.lp0 b17 = rk4.k5.b(g3Var);
                z18 = kotlin.jvm.internal.o.b((b17 == null || (d17 = b17.d()) == null) ? null : d17.getListenId(), listen_id);
            }
            this.f241691w = z18;
            if (z18) {
                s();
                b66.g q17 = q();
                b66.n a17 = q17 != null ? ((b66.i) q17).a() : null;
                this.f241681m = a17;
                if (a17 != null) {
                    ((b66.q) a17).a(this.f241686r);
                }
            } else {
                r();
                kotlin.jvm.internal.o.d(str);
                n(str);
            }
        } else {
            kotlin.jvm.internal.o.d(str);
            n(str);
        }
        com.tencent.mars.xlog.Log.i(o(), "onPostOpen@" + hashCode() + ' ' + this.f241691w + "  " + this.f241690v);
        this.f241679h = com.tencent.mm.sdk.platformtools.t8.i1();
    }

    @Override // al5.a0
    public void i() {
        this.f241692x = false;
        com.tencent.mars.xlog.Log.i(o(), "Ting.onPreClose needShowFloatBallWhenClose: " + this.f241684p);
        if (this.f241684p || p()) {
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
            bk4.d1.f21452a.a(true);
            this.f241684p = false;
        }
    }

    @Override // al5.a0
    public void j() {
        boolean wi6 = ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).wi();
        this.f241684p = wi6;
        if (wi6) {
            ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(true);
        }
        com.tencent.mars.xlog.Log.i(o(), "Ting.onPreOpen hasTingFloatBallBefore: " + wi6);
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).getClass();
        bk4.d1.f21452a.a(false);
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    public final void n(java.lang.String listenId) {
        java.lang.String str;
        b66.n nVar;
        kotlin.jvm.internal.o.g(listenId, "listenId");
        if (this.f241681m != null) {
            com.tencent.mars.xlog.Log.i(o(), "doPlay do not createPlayer");
            return;
        }
        b66.g q17 = q();
        b66.n nVar2 = null;
        if (q17 != null && (nVar = (b66.n) urgen.ur_2BA9.UR_882D.UR_2B77(((b66.i) q17).getCppPointer())) != null) {
            if (nVar instanceof jm4.g3) {
                ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
                ul4.i iVar = new ul4.i(bw5.eq0.StandAlone, null, new com.tencent.unit_rc.WeakPtr(nVar));
                this.f241685q = iVar;
                urgen.ur_0025.UR_C8FE.UR_4F23(((jm4.h3) ((jm4.g3) nVar)).getCppPointer(), iVar);
            }
            nVar2 = nVar;
        }
        if (nVar2 != null) {
            bw5.hq0 hq0Var = new bw5.hq0();
            hq0Var.f28326d = true;
            hq0Var.f28330h[1] = true;
            byte[] byteArray = hq0Var.toByteArray();
            long cppPointer = ((b66.q) nVar2).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_2BA9.UR_C8FE.UR_69B0(cppPointer, byteArray);
        }
        this.f241681m = nVar2;
        com.tencent.mars.xlog.Log.i(o(), "doPlay createPlayer");
        s();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        il4.f fVar = eVar.f292122s;
        fVar.f292135g = listenId;
        pj4.t tVar = this.f241677f;
        if (tVar != null && (str = tVar.f355292h) != null) {
            fVar.f292132d.put("textstatus", str);
        }
        il4.l.q(eVar, false, null, null, 12, null);
        if (nVar2 != null) {
            ((b66.q) nVar2).a(this.f241686r);
        }
        int i17 = jm4.m3.f300398e;
        com.tencent.unit_rc.BaseObjectDef baseObjectDef = (jm4.k3) urgen.ur_0025.UR_65C4.UR_C306(new java.lang.String[]{listenId});
        kotlin.jvm.internal.o.e(baseObjectDef, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskService");
        ((b66.c) baseObjectDef).e(2001);
        if (nVar2 != null) {
            urgen.ur_2BA9.UR_C8FE.UR_EC42(((b66.q) nVar2).getCppPointer(), baseObjectDef, 0);
        }
    }

    public java.lang.String o() {
        return this.f241678g;
    }

    @Override // al5.a0, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(o(), "onDestroy@" + hashCode());
    }

    public final boolean p() {
        java.lang.String str = this.f241680i.f389078d;
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        kotlin.jvm.internal.o.d(str);
        return urgen.ur_2BA9.UR_5405.UR_9DEB(str, null);
    }

    public final jm4.n2 q() {
        if (p()) {
            jm4.u2 a17 = jm4.w2.f300435d.a();
            if (a17 == null) {
                return null;
            }
            return ((jm4.w2) a17).a(bw5.eq0.BizAudio);
        }
        jm4.u2 a18 = jm4.w2.f300435d.a();
        if (a18 == null) {
            return null;
        }
        return ((jm4.w2) a18).a(bw5.eq0.TingMusic);
    }

    public void r() {
        this.f241689u = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Di();
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ni();
    }

    public final void s() {
        dm3.c0 c0Var = new dm3.c0(new java.lang.ref.WeakReference(this));
        if (this.f241682n) {
            return;
        }
        r45.wd6 wd6Var = this.f241680i;
        java.lang.String str = wd6Var.f389078d;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        this.f241682n = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.l70 l70Var = new bw5.l70();
        bw5.k70 k70Var = new bw5.k70();
        k70Var.f29272d = wd6Var.f389078d;
        boolean[] zArr = k70Var.f29279n;
        zArr[1] = true;
        k70Var.f29276h = true;
        zArr[11] = true;
        k70Var.f29273e = 1;
        zArr[2] = true;
        l70Var.f29674d.add(k70Var);
        l70Var.f29676f[3] = true;
        byte[] byteArray = l70Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        lVar.f70664a = new qk.s9(byteArray);
        lVar.f70665b = new qk.t9();
        lVar.f70666c = "/cgi-bin/mmlistenappsvr/articlegettext";
        lVar.f70667d = 5950;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mars.xlog.Log.i(o(), "getMMListenItem callback listenId = " + wd6Var.f389078d);
        com.tencent.mm.modelbase.z2.d(a17, new dm3.z(this, c0Var), false);
    }
}
