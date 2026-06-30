package m54;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m54.a0 f324243a = new m54.a0();

    public final void a(java.lang.String uxInfo, int i17, java.lang.String adExtInfo, java.lang.String canvasDynamicInfo, long j17, yz5.a aVar, yz5.a aVar2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAntiCheating", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghAntiCheatingUtil");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        kotlin.jvm.internal.o.g(adExtInfo, "adExtInfo");
        kotlin.jvm.internal.o.g(canvasDynamicInfo, "canvasDynamicInfo");
        ib4.a aVar3 = new ib4.a("", "", uxInfo, i17, adExtInfo, canvasDynamicInfo, j17);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        if (d17 != null) {
            d17.a(4679, new m54.z(aVar, aVar2));
            d17.g(aVar3);
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.VangoghAntiAbuseUtil", "the scene queue is null!!!!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAntiCheating", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghAntiCheatingUtil");
    }
}
