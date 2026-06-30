package f54;

/* loaded from: classes4.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f259765a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f259766b;

    public y(java.lang.String finderUsername, java.lang.String str) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f259765a = finderUsername;
        this.f259766b = str;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderUsername", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
        return this.f259765a;
    }
}
