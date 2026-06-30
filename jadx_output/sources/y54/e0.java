package y54;

/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI f459537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI) {
        super(0);
        this.f459537d = halfScreenVangoghPageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$doAntiAbuseJudgementAfterOpen$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$doAntiAbuseJudgementAfterOpen$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI = this.f459537d;
        com.tencent.mars.xlog.Log.e("SnsAd.HalfScreenVangogh", "the half vangogh is abused, dynamicCanvasInfo is ".concat(halfScreenVangoghPageUI.u4().D()));
        db5.t7.g(halfScreenVangoghPageUI, halfScreenVangoghPageUI.getString(com.tencent.mm.R.string.j5t));
        halfScreenVangoghPageUI.V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$doAntiAbuseJudgementAfterOpen$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI$doAntiAbuseJudgementAfterOpen$1");
        return f0Var;
    }
}
