package x44;

/* loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.e0 f451804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x44.e0 e0Var) {
        super(3);
        this.f451804d = e0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo$doAction$2$1");
        java.util.Map map = (java.util.Map) obj3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo$doAction$2$1");
        if (map == null) {
            x44.e0 e0Var = this.f451804d;
            e0Var.b(w44.d.k(e0Var, -1, "there is something error!!", null, 4, null));
        } else {
            java.lang.Object obj4 = map.get("ret");
            if ((obj4 instanceof java.lang.Integer) && ((java.lang.Number) obj4).intValue() == 0) {
                java.lang.Object obj5 = map.get("latitude");
                java.lang.Object obj6 = map.get("longitude");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("latitude", obj5);
                jSONObject.put("longitude", obj6);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo");
                x44.e0 e0Var2 = this.f451804d;
                e0Var2.m(jSONObject);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo");
                e0Var2.b(jSONObject);
            } else {
                x44.e0 e0Var3 = this.f451804d;
                e0Var3.b(w44.d.k(e0Var3, -1, "there is something error!!", null, 4, null));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo$doAction$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo$doAction$2$1");
        return f0Var;
    }
}
