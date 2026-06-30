package f54;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f259756a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f259757b;

    /* renamed from: c, reason: collision with root package name */
    public final int f259758c;

    public w(java.lang.String brandUsername, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(brandUsername, "brandUsername");
        this.f259756a = brandUsername;
        this.f259757b = str;
        this.f259758c = i17;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
        return this.f259756a;
    }
}
