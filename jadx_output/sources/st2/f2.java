package st2;

/* loaded from: classes3.dex */
public final class f2 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f412288b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f412289c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f412290d;

    /* renamed from: a, reason: collision with root package name */
    public static final st2.f2 f412287a = new st2.f2();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f412291e = jz5.h.b(st2.d2.f412260d);

    public static void d(st2.f2 f2Var, gk2.e eVar, l81.b1 bundle, boolean z17, int i17, java.lang.Object obj) {
        f2Var.getClass();
        kotlin.jvm.internal.o.g(bundle, "bundle");
        if (com.tencent.mm.sdk.platformtools.t8.K0(bundle.f317014b)) {
            com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[tryToPreRender] fail, appId is empty!");
            return;
        }
        boolean wi6 = ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).wi(bundle.f317014b, zl2.q4.f473933a.x());
        com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[tryToPreRender] hasInstance:" + wi6 + ",appId:" + bundle.f317014b + ",patch:" + bundle.f317022f);
        if (wi6) {
            return;
        }
        f2Var.b(eVar, bundle);
    }

    public final void a(gk2.e eVar) {
        java.util.LinkedList<r45.ue2> list;
        r45.dv1 dv1Var;
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.ve2 ve2Var = (eVar == null || (dv1Var = ((mm2.f6) eVar.a(mm2.f6.class)).f329038n) == null) ? null : (r45.ve2) dv1Var.getCustom(5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        if (ve2Var != null && (list = ve2Var.getList(1)) != null) {
            for (r45.ue2 ue2Var : list) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f317014b = ue2Var.getString(0);
                b1Var.f317022f = ue2Var.getString(2);
                dk2.ah ahVar = new dk2.ah();
                if (ue2Var.getBoolean(1)) {
                    ahVar.f233222r = 1;
                } else if (ue2Var.getBoolean(3)) {
                    ahVar.f233222r = 2;
                } else if (ue2Var.getBoolean(4)) {
                    ahVar.f233222r = 3;
                }
                ahVar.f233213f = 1;
                b1Var.f317028i = ahVar;
                b1Var.f317032k = zl2.r4.f473950a.w1() ? 1176 : 1177;
                b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, 10, null, false, null, false, null, null, false, ue2Var.getInteger(5) == 1, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -516, 2047, null);
                b1Var.f317016c = zl2.q4.f473933a.x();
                arrayList.add(b1Var);
            }
        }
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            l81.b1 b1Var2 = (l81.b1) obj;
            if (com.tencent.mm.sdk.platformtools.t8.K0(b1Var2.f317014b)) {
                com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[checkPreRender] index:" + i17 + " fail, appId:" + b1Var2.f317014b);
                return;
            }
            boolean wi6 = ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).wi(b1Var2.f317014b, zl2.q4.f473933a.x());
            com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[checkPreRender] index:" + i17 + " hasInstance:" + wi6 + ",appId:" + b1Var2.f317014b + ",patch:" + b1Var2.f317022f);
            if (!wi6) {
                f412287a.b(eVar, b1Var2);
            }
            i17 = i18;
        }
    }

    public final void b(gk2.e eVar, l81.b1 b1Var) {
        l81.p0 p0Var = b1Var.f317028i;
        dk2.ah ahVar = p0Var instanceof dk2.ah ? (dk2.ah) p0Var : null;
        java.lang.Integer valueOf = ahVar != null ? java.lang.Integer.valueOf(ahVar.f233222r) : null;
        if (valueOf == null || valueOf.intValue() != 1) {
            if (valueOf != null && valueOf.intValue() == 2) {
                c(b1Var);
                return;
            }
            if (valueOf != null && valueOf.intValue() == 3) {
                c(b1Var);
                com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[prepareEnv]");
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.f88833x);
                f412288b = true;
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preRender] performanceLevel:");
        sb6.append(((java.lang.Number) ((jz5.n) f412291e).getValue()).intValue());
        sb6.append(",appId:");
        sb6.append(b1Var.f317014b);
        sb6.append(",patch:");
        sb6.append(b1Var.f317022f);
        sb6.append(",type:");
        zl2.q4 q4Var = zl2.q4.f473933a;
        sb6.append(q4Var.x());
        sb6.append(",preloadIfFail:false");
        com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f317014b) || com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f317022f)) {
            com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[preRender] fail, stack:" + new com.tencent.mm.sdk.platformtools.z3());
        } else {
            b1Var.f317016c = q4Var.x();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f412290d = true;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).ij(b1Var, new st2.e2(eVar, b1Var, currentTimeMillis, false));
        }
    }

    public final void c(l81.b1 b1Var) {
        com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[preloadPkg],username:" + b1Var.f317012a + ",appId:" + b1Var.f317014b + ",path:" + b1Var.f317022f);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f317012a) || !com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f317014b)) {
            ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).z8(b1Var.f317012a, b1Var.f317014b, 4);
            f412289c = true;
        } else {
            com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[preloadPkg] fail, stack:" + new com.tencent.mm.sdk.platformtools.z3());
        }
    }
}
