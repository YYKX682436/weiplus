package m54;

/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f324300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo f324302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f324303g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j17, java.lang.String str, com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, boolean z17) {
        super(0);
        this.f324300d = j17;
        this.f324301e = str;
        this.f324302f = aDInfo;
        this.f324303g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f324300d;
        java.lang.String str = this.f324301e;
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = this.f324302f;
        boolean z17 = this.f324303g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m54.s sVar = m54.s.f324305a;
            java.lang.String str2 = aDInfo.uxInfo;
            if (str2 == null) {
                str2 = "";
            }
            m54.s.a(sVar, j17, str, str2, z17, new m54.p(aDInfo, str, currentTimeMillis));
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3");
        return f0Var;
    }
}
