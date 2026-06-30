package k94;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final k94.f f305946a = new k94.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f305947b = new java.util.HashMap();

    public final void a(java.lang.String traceId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        com.tencent.mars.xlog.Log.i("WsFoldAdVideoStatistic", "clear video play info, id = ".concat(traceId));
        k94.e eVar = (k94.e) f305947b.get(traceId);
        if (eVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            eVar.f305943a = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            eVar.f305944b = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearVideoPlayInfo", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }

    public final void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdVideoComplete", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        if (!(str == null || str.length() == 0)) {
            java.util.HashMap hashMap = f305947b;
            k94.e eVar = (k94.e) hashMap.get(str);
            if ((eVar != null ? java.lang.Integer.valueOf(eVar.a()) : null) != null) {
                k94.e eVar2 = (k94.e) hashMap.get(str);
                if (eVar2 != null) {
                    k94.e eVar3 = (k94.e) hashMap.get(str);
                    int a17 = eVar3 != null ? eVar3.a() : 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                    eVar2.f305943a = a17 + 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayCount", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
                }
                k94.e eVar4 = (k94.e) hashMap.get(str);
                if (eVar4 != null) {
                    eVar4.a();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdVideoComplete", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdVideoComplete", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }

    public final void c(h94.a foldAdInfo, r45.fb6 videoInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        java.util.HashMap hashMap = f305947b;
        if (hashMap.get(foldAdInfo.d()) == null) {
            foldAdInfo.d();
            hashMap.put(foldAdInfo.d(), new k94.e(0, 0, videoInfo.f374188n));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }

    public final void d(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
            return;
        }
        k94.e eVar = (k94.e) f305947b.get(str);
        if (eVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
            eVar.f305944b = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayDurationMs", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic$VideoPlayInfo");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdPlayTime", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdVideoStatistic");
    }
}
