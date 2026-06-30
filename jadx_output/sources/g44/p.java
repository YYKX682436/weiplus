package g44;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper f268835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper adFinderOpenAppMarketHalfScreenHelper) {
        super(0);
        this.f268835d = adFinderOpenAppMarketHalfScreenHelper;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i64.p0 d17;
        i64.p0 d18;
        i64.p0 d19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper$setOnDetachListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper$setOnDetachListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper adFinderOpenAppMarketHalfScreenHelper = this.f268835d;
        boolean z17 = adFinderOpenAppMarketHalfScreenHelper.f162662t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isAppMarketBtnClick$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper");
        if (!z17) {
            h44.c d27 = adFinderOpenAppMarketHalfScreenHelper.d();
            java.lang.String str = null;
            java.lang.String str2 = (d27 == null || (d19 = d27.d()) == null) ? null : d19.f289271a;
            h44.c d28 = adFinderOpenAppMarketHalfScreenHelper.d();
            java.lang.String str3 = (d28 == null || (d18 = d28.d()) == null) ? null : d18.f289272b;
            h44.c d29 = adFinderOpenAppMarketHalfScreenHelper.d();
            if (d29 != null && (d17 = d29.d()) != null) {
                str = d17.f289273c;
            }
            ca4.m0.B0(str2, str3, str, 2, "2");
        }
        adFinderOpenAppMarketHalfScreenHelper.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper$setOnDetachListener$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.halfscreen.AdFinderOpenAppMarketHalfScreenHelper$setOnDetachListener$1");
        return f0Var;
    }
}
