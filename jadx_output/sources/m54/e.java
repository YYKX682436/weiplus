package m54;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f324263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f324263d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$3");
        com.tencent.mars.xlog.Log.i("SnsAd.LandPageLauncher", "job end with: " + ((java.lang.Throwable) obj));
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f324263d.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageSky$3");
        return f0Var;
    }
}
