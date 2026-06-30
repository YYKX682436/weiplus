package n44;

/* loaded from: classes15.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.m0 f334913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(n44.m0 m0Var) {
        super(0);
        this.f334913d = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object e17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$adHalfScreenHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$adHalfScreenHelper$2");
        n44.m0 m0Var = this.f334913d;
        i64.z a17 = n44.m0.a(m0Var);
        if (!(a17 != null && a17.b() == 0)) {
            i64.z a18 = n44.m0.a(m0Var);
            if (!(a18 != null && a18.b() == 5)) {
                i64.z a19 = n44.m0.a(m0Var);
                if (a19 != null && a19.b() == 22) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdHalfScreenWeComProfileHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdHalfScreenWeComProfileHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                    e17 = (n44.x0) ((jz5.n) m0Var.f334994l).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdHalfScreenWeComProfileHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdHalfScreenWeComProfileHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                } else {
                    i64.z a27 = n44.m0.a(m0Var);
                    if (a27 != null && a27.b() == 18) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdHalfScreenKefuConfirmHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdHalfScreenKefuConfirmHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                        e17 = (n44.r) ((jz5.n) m0Var.f334996n).getValue();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdHalfScreenKefuConfirmHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdHalfScreenKefuConfirmHelper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                    } else {
                        e17 = null;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$adHalfScreenHelper$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$adHalfScreenHelper$2");
                return e17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdHalfScreenH5Helper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        e17 = m0Var.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdHalfScreenH5Helper", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$adHalfScreenHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper$adHalfScreenHelper$2");
        return e17;
    }
}
