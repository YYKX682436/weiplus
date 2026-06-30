package l44;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f316222a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f316223b;

    public l(boolean z17, boolean z18) {
        this.f316222a = z17;
        this.f316223b = z18;
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFollowState", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFollowState", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
        return this.f316223b;
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHasRequested", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHasRequested", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
        return this.f316222a;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
        java.lang.String str = "RequestResult(hasRequested=" + this.f316222a + ", followState=" + this.f316223b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
        return str;
    }
}
