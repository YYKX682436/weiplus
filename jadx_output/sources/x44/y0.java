package x44;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x44.a1 f451933f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.app.Activity activity, java.lang.String str, x44.a1 a1Var) {
        super(1);
        this.f451931d = activity;
        this.f451932e = str;
        this.f451933f = a1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        java.lang.String it = (java.lang.String) obj;
        x44.a1 a1Var = this.f451933f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        kotlin.jvm.internal.o.g(it, "it");
        try {
            x64.u.f452333a.b(this.f451931d, it, this.f451932e, 10, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            org.json.JSONObject l17 = a1Var.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat");
            a1Var.b(l17);
        } catch (java.lang.Throwable th6) {
            a1Var.b(a1Var.g("there is something error: " + th6.getMessage()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenCustomerServiceChat$doAction$1");
        return f0Var;
    }
}
