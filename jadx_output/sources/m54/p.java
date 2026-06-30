package m54;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.ADInfo f324297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f324299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.sns.storage.ADInfo aDInfo, java.lang.String str, long j17) {
        super(2);
        this.f324297d = aDInfo;
        this.f324298e = str;
        this.f324299f = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3$1$1");
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3$1$1");
        m54.j0 j0Var = m54.j0.f324287a;
        java.lang.String str = this.f324298e;
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = this.f324297d;
        if (intValue == 0) {
            j0Var.c(7100001, aDInfo, str, 0);
        } else {
            j0Var.c(booleanValue ? 7100002 : 7100003, aDInfo, str, (int) (java.lang.System.currentTimeMillis() - this.f324299f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$3$1$1");
        return f0Var;
    }
}
