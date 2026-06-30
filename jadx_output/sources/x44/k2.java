package x44;

/* loaded from: classes4.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.m2 f451842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(x44.m2 m2Var, java.lang.String str) {
        super(2);
        this.f451842d = m2Var;
        this.f451843e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        kotlin.jvm.internal.o.g((java.util.Map) obj2, "<anonymous parameter 1>");
        if (booleanValue) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("phoneNumber", this.f451843e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
            x44.m2 m2Var = this.f451842d;
            m2Var.m(jSONObject);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber");
            m2Var.b(jSONObject);
        } else {
            x44.m2 m2Var2 = this.f451842d;
            m2Var2.b(w44.d.k(m2Var2, -1, "user does not allow requiring phone number", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestPhoneNumber$doAction$1$1");
        return f0Var;
    }
}
