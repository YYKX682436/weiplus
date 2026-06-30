package n74;

/* loaded from: classes4.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static n74.s0 f335438b;

    /* renamed from: a, reason: collision with root package name */
    public static final n74.u0 f335437a = new n74.u0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f335439c = new java.lang.Object();

    public static final boolean a(n74.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$disablePreRenderWeapp", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        u0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disablePreRenderWeapp", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_disable_mini_program_pre_render, 0);
        com.tencent.mars.xlog.Log.i("AdWeappPreRenderHelper", "disablePreRenderWeapp called " + Ni);
        boolean z17 = Ni > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disablePreRenderWeapp", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$disablePreRenderWeapp", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(n74.u0 r17, com.tencent.mm.plugin.sns.storage.SnsInfo r18, java.util.List r19, int r20) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.u0.b(n74.u0, com.tencent.mm.plugin.sns.storage.SnsInfo, java.util.List, int):boolean");
    }

    public static final boolean d(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPreRenderWeappType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreRenderWeappType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
            return false;
        }
        boolean z17 = adClickActionInfo.f162571b == 28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPreRenderWeappType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        return z17;
    }

    public final void c(s34.j0 j0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreRenderDefaultStrategy", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        java.lang.String wi6 = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).wi(j0Var.c());
        boolean wi7 = ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).wi(wi6, -1);
        com.tencent.mars.xlog.Log.i("AdWeappPreRenderHelper", "doPreRenderStrategyOneLogic, weappAppId is " + wi6 + ", isWeAppAlive is " + wi7);
        if (wi7) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 20);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreRenderDefaultStrategy", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        } else {
            e(j0Var, i17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreRenderDefaultStrategy", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        }
    }

    public final void e(s34.j0 j0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPreRender", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = j0Var.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWeappVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWeappVersion", "com.tencent.mm.plugin.sns.ad.adxml.AdGamePlayableClickActionInfo");
        b1Var.f317018d = j0Var.f402675c;
        b1Var.f317022f = j0Var.a();
        b1Var.f317032k = i17;
        com.tencent.mars.xlog.Log.i("AdWeappPreRenderHelper", "startPreRender");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).ij(b1Var, new n74.r0(j0Var, elapsedRealtime));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPreRender", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
    }
}
