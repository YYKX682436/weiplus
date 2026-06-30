package x44;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.p0 f451856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(x44.p0 p0Var, android.app.Activity activity) {
        super(2);
        this.f451856d = p0Var;
        this.f451857e = activity;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String phone = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        kotlin.jvm.internal.o.g(phone, "phone");
        if (intValue == 0) {
            if (phone.length() > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
                x44.p0 p0Var = this.f451856d;
                org.json.JSONObject l17 = p0Var.l();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone");
                p0Var.b(l17);
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().confirmDialPhoneNum(this.f451857e, phone);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
                return f0Var;
            }
        }
        x44.p0 p0Var2 = this.f451856d;
        p0Var2.b(w44.d.k(p0Var2, 600008, "fail:obtain smart phone number failed!", null, 4, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.MakeSmartPhone$doAction$2");
        return f0Var2;
    }
}
