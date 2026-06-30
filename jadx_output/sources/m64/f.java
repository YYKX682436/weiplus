package m64;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f324395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f324396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f324397f;

    public f(android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f324395d = context;
        this.f324396e = snsInfo;
        this.f324397f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        boolean a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader$doClickInfoPreload$1");
        android.content.Context context = this.f324395d;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f324396e;
        int i17 = this.f324397f;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m64.h hVar = m64.h.f324399a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
            a17 = hVar.a(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (a17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader$doClickInfoPreload$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        n64.a aVar = m64.h.f324400b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        java.util.List r17 = kz5.d0.r(kz5.z.I(new java.util.List[]{aVar.b(snsInfo.getAdXml()), aVar.b(snsInfo.getAdInfo())}));
        n74.u0 u0Var = n74.u0.f335437a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        } else {
            if (i17 == 0) {
                ((ku5.t0) ku5.t0.f312615d).g(new n74.t0(snsInfo, r17, 1045));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper");
        ((ku5.t0) ku5.t0.f312615d).g(new n74.j0(snsInfo, r17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper");
        m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("TimelineAdExposurePreloader", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader$doClickInfoPreload$1");
    }
}
