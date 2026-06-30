package f54;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f259759a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f259760b;

    /* renamed from: c, reason: collision with root package name */
    public final int f259761c;

    /* renamed from: d, reason: collision with root package name */
    public final int f259762d;

    /* renamed from: e, reason: collision with root package name */
    public final f54.w f259763e;

    /* renamed from: f, reason: collision with root package name */
    public final f54.y f259764f;

    public x(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, f54.w brandFollowInfo, f54.y finderFollowInfo) {
        kotlin.jvm.internal.o.g(brandFollowInfo, "brandFollowInfo");
        kotlin.jvm.internal.o.g(finderFollowInfo, "finderFollowInfo");
        this.f259759a = str;
        this.f259760b = str2;
        this.f259761c = i17;
        this.f259762d = i18;
        this.f259763e = brandFollowInfo;
        this.f259764f = finderFollowInfo;
    }

    public final f54.w a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBrandFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBrandFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        return this.f259763e;
    }

    public final f54.y b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderFollowInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        return this.f259764f;
    }
}
