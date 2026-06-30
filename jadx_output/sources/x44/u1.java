package x44;

/* loaded from: classes4.dex */
public final class u1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.v1 f451902a;

    public u1(x44.v1 v1Var) {
        this.f451902a = v1Var;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState$doAction$1");
        x44.v1 v1Var = this.f451902a;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.QueryFinderLivingState", "the living state error is " + i18);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("livingError", i18);
            v1Var.b(v1Var.j(600010, "query finder living state failed", jSONObject));
        } else if (obj instanceof java.lang.Integer) {
            com.tencent.mars.xlog.Log.i("SnsAdJs.QueryFinderLivingState", "the living state is " + obj);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("isLiving", kotlin.jvm.internal.o.b(obj, 770));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
            v1Var.m(jSONObject2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState");
            v1Var.b(jSONObject2);
        } else {
            com.tencent.mars.xlog.Log.e("SnsAdJs.QueryFinderLivingState", "the living state is not integer!");
            x44.v1 v1Var2 = this.f451902a;
            v1Var2.b(w44.d.k(v1Var2, 600010, "the living state is not integer!", null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingState$doAction$1");
    }
}
