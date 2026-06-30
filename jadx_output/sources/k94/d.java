package k94;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final k94.d f305942a = new k94.d();

    public static final void b(h94.a foldAdInfo, int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        r45.p3 p3Var = new r45.p3();
        r45.x2 x2Var = new r45.x2();
        f305942a.a(x2Var, foldAdInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getApurl", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getApurl", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
        x2Var.f389674h = com.tencent.mm.protobuf.g.c(foldAdInfo.f279732b);
        x2Var.f389670d = 1;
        x2Var.f389682s = i17;
        x2Var.f389685v = i18;
        x2Var.f389686w = i19;
        x2Var.f389687x = i27;
        x2Var.f389688y = i28;
        com.tencent.mars.xlog.Log.i("WsFoldAdReportHelper", "reportExpose, id = " + foldAdInfo.d() + ", exposure_type = " + i17);
        p3Var.f382693d = x2Var;
        p3Var.b().l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExpose", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
    }

    public final void a(r45.x2 x2Var, h94.a aVar) {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initReportPassThroughInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            x2Var.f389672f = com.tencent.mm.protobuf.g.c(aVar.f279734d);
            x2Var.f389673g = com.tencent.mm.protobuf.g.c(aVar.d());
            x2Var.f389679p = com.tencent.mm.sdk.platformtools.z.f193112h;
            x2Var.f389681r = java.lang.Long.parseLong(aVar.a());
            x2Var.f389675i = com.tencent.mm.protobuf.g.c(v34.b.e());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPosid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPosid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            x2Var.f389684u = aVar.f279738h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportExtraData", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportExtraData", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            x2Var.A = aVar.f279741k;
            x2Var.B = java.lang.System.currentTimeMillis();
            aVar.a();
            aVar.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdPosid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdPosid", "com.tencent.mm.plugin.sns.ad.wsfold.data.adinfo.FoldAdInfo");
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("WsFoldAdReportHelper", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initReportPassThroughInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdReportHelper");
    }
}
