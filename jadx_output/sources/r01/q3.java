package r01;

@j95.b
/* loaded from: classes11.dex */
public class q3 extends i95.w {
    public static long C;
    public static final java.lang.Object D = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public r01.x f368193d;

    /* renamed from: g, reason: collision with root package name */
    public r01.f0 f368196g;

    /* renamed from: v, reason: collision with root package name */
    public r01.d f368208v;

    /* renamed from: z, reason: collision with root package name */
    public eq1.u f368212z;

    /* renamed from: e, reason: collision with root package name */
    public r01.x1 f368194e = null;

    /* renamed from: f, reason: collision with root package name */
    public r01.r1 f368195f = null;

    /* renamed from: h, reason: collision with root package name */
    public r01.e0 f368197h = null;

    /* renamed from: i, reason: collision with root package name */
    public s01.m f368198i = null;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.u f368199m = null;

    /* renamed from: n, reason: collision with root package name */
    public s01.g f368200n = null;

    /* renamed from: o, reason: collision with root package name */
    public s01.d0 f368201o = null;

    /* renamed from: p, reason: collision with root package name */
    public s01.v f368202p = null;

    /* renamed from: q, reason: collision with root package name */
    public s01.z f368203q = null;

    /* renamed from: r, reason: collision with root package name */
    public s01.y f368204r = null;

    /* renamed from: s, reason: collision with root package name */
    public r01.q f368205s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.storage.b2 f368206t = null;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.storage.h2 f368207u = null;

    /* renamed from: w, reason: collision with root package name */
    public r01.e f368209w = null;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.storage.r1 f368210x = null;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.storage.f1 f368211y = null;
    public java.lang.Boolean A = java.lang.Boolean.FALSE;
    public final com.tencent.matrix.lifecycle.h B = new r01.p3(this);

    public static r01.d Ai() {
        if (qj().f368208v == null) {
            qj().f368208v = new r01.d();
        }
        return qj().f368208v;
    }

    public static r01.e Bi() {
        gm0.j1.b().c();
        if (qj().f368209w == null) {
            qj().f368209w = new r01.e(gm0.j1.u().f273153f);
        }
        return qj().f368209w;
    }

    public static s01.v Di() {
        gm0.j1.b().c();
        if (qj().f368202p == null) {
            qj().f368202p = new s01.v(gm0.j1.u().f273153f);
        }
        return qj().f368202p;
    }

    public static s01.y Ni() {
        gm0.j1.b().c();
        if (qj().f368204r == null) {
            qj().f368204r = new s01.y();
        }
        return qj().f368204r;
    }

    public static s01.z Ri() {
        gm0.j1.b().c();
        if (qj().f368203q == null) {
            qj().f368203q = new s01.z();
        }
        return qj().f368203q;
    }

    public static s01.m Ui() {
        gm0.j1.b().c();
        if (qj().f368198i == null) {
            qj().f368198i = new s01.m(gm0.j1.u().f273153f);
        }
        return qj().f368198i;
    }

    public static s01.d0 Vi() {
        gm0.j1.b().c();
        if (qj().f368201o == null) {
            qj().f368201o = new s01.d0(gm0.j1.u().f273153f);
        }
        return qj().f368201o;
    }

    public static r01.r1 Zi() {
        gm0.j1.b().c();
        if (qj().f368195f == null) {
            qj().f368195f = new r01.r1();
        }
        return qj().f368195f;
    }

    public static s01.g aj() {
        gm0.j1.b().c();
        if (qj().f368200n == null) {
            qj().f368200n = new s01.g(gm0.j1.u().f273153f);
        }
        return qj().f368200n;
    }

    public static r01.q bj() {
        gm0.j1.b().c();
        if (qj().f368205s == null) {
            qj().f368205s = new r01.q(gm0.j1.u().f273153f);
        }
        return qj().f368205s;
    }

    public static r01.x cj() {
        gm0.j1.b().c();
        if (qj().f368193d == null) {
            qj().f368193d = new r01.x(gm0.j1.u().f273153f);
        }
        return qj().f368193d;
    }

    public static r01.e0 fj() {
        boolean z17;
        gm0.j1.b().c();
        if (qj().f368197h == null) {
            qj().f368197h = new r01.e0();
            r01.e0 e0Var = qj().f368197h;
            e0Var.getClass();
            gm0.j1.n().f273288b.a(675, e0Var);
            gm0.j1.n().f273288b.a(672, e0Var);
            gm0.j1.n().f273288b.a(674, e0Var);
            synchronized (e0Var.f368050d) {
                e0Var.f368054h.clear();
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_kf_guide_appbrand_enable, 0) != 1) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            } else {
                z17 = true;
            }
            r01.c0 c0Var = e0Var.f368051e;
            c0Var.f368034a = z17;
            c0Var.f368035b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_biz_kf_guide_appbrand_appid, "wx3591b9dad10767f7", true);
            c0Var.f368036c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_biz_kf_guide_appbrand_path, "pages/profile/profile.html", true);
            c0Var.f368037d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_kf_guide_appbrand_version_type, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizKFService", "initKFGuideAppBrandConfig: %s", c0Var);
        }
        return qj().f368197h;
    }

    public static r01.f0 hj() {
        gm0.j1.b().c();
        if (qj().f368196g == null) {
            qj().f368196g = new r01.f0(gm0.j1.u().f273153f);
        }
        return qj().f368196g;
    }

    public static com.tencent.mm.storage.f1 ij() {
        gm0.j1.b().c();
        if (qj().f368211y == null) {
            qj().f368211y = new com.tencent.mm.storage.f1(gm0.j1.u().f273153f);
        }
        return qj().f368211y;
    }

    public static com.tencent.mm.storage.r1 mj() {
        gm0.j1.b().c();
        if (qj().f368210x == null) {
            qj().f368210x = new com.tencent.mm.storage.r1(gm0.j1.u().f273153f);
        }
        return qj().f368210x;
    }

    public static com.tencent.mm.storage.b2 nj() {
        gm0.j1.b().c();
        if (qj().f368206t == null) {
            synchronized (D) {
                if (qj().f368206t == null) {
                    l75.k0 wi6 = ((com.tencent.mm.plugin.biz.q) i95.n0.c(com.tencent.mm.plugin.biz.q.class)).wi();
                    if (wi6 != null) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1378L, 23L, 1L, false);
                        com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct bizQualityReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct();
                        bizQualityReportStruct.f55411d = 2L;
                        bizQualityReportStruct.k();
                        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "newBizDb create ok!");
                    } else {
                        wi6 = gm0.j1.u().f273153f;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1378L, 22L, 1L, false);
                        com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct bizQualityReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct();
                        bizQualityReportStruct2.f55411d = 1L;
                        bizQualityReportStruct2.k();
                        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "newBizDb is null!");
                    }
                    try {
                        qj().f368206t = new com.tencent.mm.storage.b2(wi6);
                        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "create bizTimeLineInfoStorage success!");
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreBiz", "create bizTimeLineInfoStorage fail! %s", th6.getMessage());
                        com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct bizQualityReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct();
                        bizQualityReportStruct3.f55411d = 3L;
                        bizQualityReportStruct3.k();
                        qj().f368206t = new com.tencent.mm.storage.b2(gm0.j1.u().f273153f);
                    }
                }
            }
        }
        return qj().f368206t;
    }

    public static com.tencent.mm.storage.h2 oj() {
        gm0.j1.b().c();
        if (qj().f368207u == null) {
            qj().f368207u = new com.tencent.mm.storage.h2(gm0.j1.u().f273153f);
        }
        return qj().f368207u;
    }

    public static r01.x1 pj() {
        gm0.j1.b().c();
        if (qj().f368194e == null) {
            qj().f368194e = new r01.x1();
        }
        return qj().f368194e;
    }

    public static r01.q3 qj() {
        return (r01.q3) i95.n0.c(r01.q3.class);
    }

    public static long rj() {
        java.lang.Object m17;
        if (C == 0 && (m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NEED_TO_UPDATE_CONVERSATION_TIME_DIVIDER_LONG, null)) != null && (m17 instanceof java.lang.Long)) {
            long longValue = ((java.lang.Long) m17).longValue();
            C = longValue;
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime : %d.(get from ConfigStorage)", java.lang.Long.valueOf(longValue));
        }
        if (C == 0) {
            C = java.lang.System.currentTimeMillis();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEED_TO_UPDATE_CONVERSATION_TIME_DIVIDER_LONG, java.lang.Long.valueOf(C));
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "temp session needUpdateTime is 0, so get current time : %d.", java.lang.Long.valueOf(C));
        }
        return C;
    }

    public static com.tencent.mm.storage.u wi() {
        gm0.j1.b().c();
        if (qj().f368199m == null) {
            qj().f368199m = new com.tencent.mm.storage.u(gm0.j1.u().f273153f);
        }
        return qj().f368199m;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "onAccountInitialized");
        super.onAccountInitialized(context);
        ((r01.l1) i95.n0.c(r01.l1.class)).cj();
        ox.g gVar = (ox.g) ((tk.o) i95.n0.c(tk.o.class));
        gVar.getClass();
        com.tencent.wechat.mm.biz.y0.f218792a = ox.e.f349462a;
        com.tencent.wechat.mm.biz.y0.f218793b = ox.f.f349468a;
        com.tencent.wechat.iam.biz.l0.f217758c.e(gVar.fj(), gVar.mj(), new ox.b(gVar));
        ((t01.m) ((rm.c0) i95.n0.c(rm.c0.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "initBasic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "registerForeGroundEvent");
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(this.B);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        r01.r1 r1Var = this.f368195f;
        if (r1Var != null) {
            r1Var.getClass();
        }
        r01.e0 e0Var = this.f368197h;
        if (e0Var != null) {
            e0Var.getClass();
            gm0.j1.n().f273288b.q(675, e0Var);
            gm0.j1.n().f273288b.q(672, e0Var);
            gm0.j1.n().f273288b.q(674, e0Var);
            synchronized (e0Var.f368050d) {
                e0Var.f368054h.clear();
            }
            ((java.util.HashSet) e0Var.f368053g).clear();
        }
        if (qj().f368212z != null) {
            qj().f368212z.a();
            qj().f368212z = null;
        }
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        r01.m0 m0Var = l1Var.f368147i;
        m0Var.getClass();
        m0Var.f368153a = "";
        m0Var.f368154b = null;
        r01.m0 m0Var2 = l1Var.f368148m;
        m0Var2.getClass();
        m0Var2.f368153a = "";
        m0Var2.f368154b = null;
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(l1Var.f368144f);
        l1Var.f368144f = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "teardownAllAccounts");
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "unregisterForeGroundEvent");
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.removeLifecycleCallback(this.B);
    }
}
