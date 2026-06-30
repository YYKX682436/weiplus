package f34;

/* loaded from: classes11.dex */
public class m extends c34.z implements com.tencent.mm.modelbase.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static int f259359u;

    /* renamed from: e, reason: collision with root package name */
    public f34.b f259360e;

    /* renamed from: f, reason: collision with root package name */
    public int f259361f;

    /* renamed from: g, reason: collision with root package name */
    public final f34.d f259362g;

    /* renamed from: h, reason: collision with root package name */
    public long f259363h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f259364i;

    /* renamed from: m, reason: collision with root package name */
    public int f259365m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f259366n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f259367o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f259368p;

    /* renamed from: q, reason: collision with root package name */
    public i11.e f259369q;

    /* renamed from: r, reason: collision with root package name */
    public float f259370r;

    /* renamed from: s, reason: collision with root package name */
    public float f259371s;

    /* renamed from: t, reason: collision with root package name */
    public final i11.c f259372t;

    public m(c34.x xVar) {
        super(xVar);
        this.f259362g = new f34.d();
        this.f259363h = 0L;
        this.f259364i = new com.tencent.mm.sdk.platformtools.n3();
        this.f259365m = 0;
        this.f259366n = "";
        this.f259367o = false;
        this.f259368p = false;
        this.f259370r = -85.0f;
        this.f259371s = -1000.0f;
        this.f259372t = new f34.j(this);
    }

    @Override // c34.z
    public void a() {
        c01.d9.e().q(1250, this);
        i11.e eVar = this.f259369q;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f259372t);
        }
        h();
        this.f38247d = null;
    }

    @Override // c34.z
    public void b() {
        f259359u = c34.h0.Bi().f259323b;
        this.f259363h = c34.h0.Bi().f259324c;
        this.f259370r = c34.h0.Bi().f259325d;
        this.f259371s = c34.h0.Bi().f259326e;
        c01.d9.e().a(1250, this);
        g();
    }

    @Override // c34.z
    public void c() {
        i11.e eVar = this.f259369q;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f259372t);
        }
    }

    @Override // c34.z
    public void d() {
        i11.e eVar = this.f259369q;
        if (eVar != null) {
            ((i11.h) eVar).k(this.f259372t, true);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // c34.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            r10.b()
            r10.h()
            i11.e r0 = r10.f259369q
            if (r0 != 0) goto Ld
            r10.g()
        Ld:
            i11.e r0 = r10.f259369q
            i11.c r1 = r10.f259372t
            i11.h r0 = (i11.h) r0
            r2 = 1
            r0.j(r1, r2)
            r0 = 22
            r1 = 10
            com.tencent.mm.plugin.report.service.b1.f(r0, r1)
            f34.c r0 = c34.h0.Bi()
            r0.getClass()
            java.lang.String r1 = "key_shake_card_item"
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            if (r3 == 0) goto L2f
            goto L3e
        L2f:
            java.util.Map r0 = r0.f259322a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L3e
            java.lang.Object r0 = r0.get(r1)
            goto L3f
        L3e:
            r0 = r4
        L3f:
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            long r7 = r10.f259363h
            long r5 = r5 - r7
            java.lang.String r3 = "MicroMsg.ShakeCardService"
            if (r0 == 0) goto L79
            boolean r9 = r0 instanceof f34.d
            if (r9 == 0) goto L79
            f34.d r0 = (f34.d) r0
            c34.x r2 = r10.f38247d
            com.tencent.mm.plugin.shake.ui.ShakeReportUI r2 = (com.tencent.mm.plugin.shake.ui.ShakeReportUI) r2
            r5 = 1250(0x4e2, float:1.752E-42)
            r6 = 1
            r2.Z6(r5, r0, r6)
            f34.c r0 = c34.h0.Bi()
            r0.getClass()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L6c
            goto L73
        L6c:
            java.util.Map r0 = r0.f259322a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r1, r4)
        L73:
            java.lang.String r0 = "getlbscard return data is no empty, don't do doNetSceneShakeCard, return ok"
            com.tencent.mars.xlog.Log.i(r3, r0)
            return
        L79:
            r0 = 0
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            com.tencent.mm.sdk.platformtools.n3 r7 = r10.f259364i
            if (r4 != 0) goto L82
            goto L86
        L82:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L88
        L86:
            r0 = r2
            goto La9
        L88:
            com.tencent.mm.plugin.report.service.g0 r0 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            int r1 = r10.f259365m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r4 = 11666(0x2d92, float:1.6348E-41)
            r0.d(r4, r1)
            f34.k r0 = new f34.k
            r0.<init>(r10)
            r4 = 3000(0xbb8, double:1.482E-320)
            r7.postDelayed(r0, r4)
            java.lang.String r0 = "ShakeCardService do not doNetSceneShakeCard, because time is not expire"
            com.tencent.mars.xlog.Log.i(r3, r0)
            r0 = 0
        La9:
            if (r0 == 0) goto Ldb
            boolean r0 = r10.f259367o
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "ShakeCardService is doing netscene, return"
            com.tencent.mars.xlog.Log.i(r3, r0)
            return
        Lb5:
            float r0 = r10.f259370r
            r1 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lca
            float r0 = r10.f259371s
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc6
            goto Lca
        Lc6:
            r10.f()
            goto Ldb
        Lca:
            r10.f259368p = r2
            java.lang.String r0 = "ShakeCardService location is not geted, wait 4 second"
            com.tencent.mars.xlog.Log.i(r3, r0)
            f34.l r0 = new f34.l
            r0.<init>(r10)
            r1 = 4000(0xfa0, double:1.9763E-320)
            r7.postDelayed(r0, r1)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f34.m.e():void");
    }

    public final void f() {
        if (this.f259367o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService is doing doNetSceneShakeCard, return");
            return;
        }
        this.f259367o = true;
        this.f259368p = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService do doNetSceneShakeCard");
        this.f259360e = new f34.b(this.f259371s, this.f259370r, this.f259365m, this.f259366n);
        c01.d9.e().g(this.f259360e);
    }

    public final void g() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f259369q = e17;
        e17.k(this.f259372t, true);
        com.tencent.mm.plugin.report.service.b1.f(22, 10);
    }

    public void h() {
        if (this.f259360e != null) {
            c01.d9.e().d(this.f259360e);
        }
    }

    public final void i() {
        long e17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        int i17 = f259359u;
        int i18 = 0;
        if (i17 >= 0 && i17 <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is valid");
            int i19 = f259359u;
            if (i19 == 1) {
                i18 = 10;
            } else if (i19 == 2) {
                i18 = 30;
            } else if (i19 == 3) {
                i18 = 60;
            } else if (i19 == 4) {
                i18 = 120;
            } else if (i19 == 5) {
                i18 = 240;
            }
            e17 = i18;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is not valid");
            e17 = g34.a.e(g34.a.b());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService updateWaitingTime wait nextInterval is " + e17);
        this.f259363h = currentTimeMillis + e17;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof f34.b) {
            f34.d dVar = ((f34.b) m1Var).f259321f;
            f34.d dVar2 = this.f259362g;
            dVar2.getClass();
            int i19 = dVar.f259328a;
            dVar2.f259328a = i19;
            dVar2.f259329b = dVar.f259329b;
            dVar2.f259330c = dVar.f259330c;
            dVar2.f259331d = dVar.f259331d;
            dVar2.f259332e = dVar.f259332e;
            dVar2.f259333f = dVar.f259333f;
            dVar2.f259334g = dVar.f259334g;
            dVar2.f259335h = dVar.f259335h;
            dVar2.f259336i = dVar.f259336i;
            dVar2.f259337j = dVar.f259337j;
            dVar2.f259338k = dVar.f259338k;
            dVar2.f259339l = dVar.f259339l;
            dVar2.f259340m = dVar.f259340m;
            dVar2.f259341n = dVar.f259341n;
            dVar2.f259342o = dVar.f259342o;
            dVar2.f259343p = dVar.f259343p;
            this.f259361f = i19;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd()  action_type:" + this.f259361f + "  frequency_level:" + f259359u + " control_flag:" + dVar2.f259336i);
            if (i17 == 0 && i18 == 0) {
                f259359u = dVar2.f259335h;
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd is OK ");
                c34.x xVar = this.f38247d;
                if (xVar != null) {
                    ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar).Z6(1250, dVar2, 1L);
                }
                i();
            } else if (!(i17 == 5 && i18 == -1) && (i17 != 4 || i18 == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + i17 + " errCode is " + i18);
                c34.x xVar2 = this.f38247d;
                if (xVar2 != null) {
                    ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar2).Z6(1250, dVar2, 2L);
                }
                i();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + i17 + " errCode is " + i18);
                c34.x xVar3 = this.f38247d;
                if (xVar3 != null) {
                    ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar3).Z6(1250, dVar2, 2L);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                long e17 = g34.a.e(g34.a.b());
                com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd wait nextInterval is " + e17);
                this.f259363h = currentTimeMillis + e17;
            }
            c34.h0.Bi().f259323b = f259359u;
            c34.h0.Bi().f259324c = this.f259363h;
            this.f259367o = false;
        }
    }
}
