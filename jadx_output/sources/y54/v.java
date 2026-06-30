package y54;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI f459567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI dynamicCanvasPageUI) {
        super(0);
        this.f459567d = dynamicCanvasPageUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI$parseData$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI$parseData$5");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI dynamicCanvasPageUI = this.f459567d;
        com.tencent.mars.xlog.Log.e("SnsAd.DynamicCanvas", "the vangogh is abused, dynamicCanvasInfo is ".concat(dynamicCanvasPageUI.u4().D()));
        db5.t7.g(dynamicCanvasPageUI, dynamicCanvasPageUI.getString(com.tencent.mm.R.string.j5t));
        dynamicCanvasPageUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI$parseData$5");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.DynamicCanvasPageUI$parseData$5");
        return f0Var;
    }
}
