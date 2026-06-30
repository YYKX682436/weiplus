package x44;

/* loaded from: classes4.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w44.b f451829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x44.g0 f451830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(w44.b bVar, x44.g0 g0Var) {
        super(0);
        this.f451829d = bVar;
        this.f451830e = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop$doAction$1");
        x44.g0 g0Var = this.f451830e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop$doAction$1");
        try {
            com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI halfScreenVangoghPageUI = (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI) this.f451829d.a();
            halfScreenVangoghPageUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("expandToTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.ScrollableFrameLayout scrollableFrameLayout = halfScreenVangoghPageUI.f163182f;
            if (scrollableFrameLayout != null) {
                scrollableFrameLayout.n();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("expandToTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.HalfScreenVangoghPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop");
            org.json.JSONObject l17 = g0Var.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop");
            g0Var.b(l17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("SnsAdJs.HalfScreenExpandToTop failed", th6);
            g0Var.b(g0Var.g("SnsAdJs.HalfScreenExpandToTop failed: " + th6.getMessage()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.HalfScreenExpandToTop$doAction$1");
        return f0Var;
    }
}
