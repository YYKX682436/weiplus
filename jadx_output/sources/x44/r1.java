package x44;

/* loaded from: classes4.dex */
public final class r1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.t1 f451883a;

    public r1(x44.t1 t1Var) {
        this.f451883a = t1Var;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$doAction$1");
        boolean b17 = obj instanceof java.lang.Integer ? kotlin.jvm.internal.o.b(obj, 513) : false;
        com.tencent.mars.xlog.Log.i("SnsAdJs.FinderLivingNotice", "the living notice state is " + b17);
        if (i18 == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("noticed", b17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
            x44.t1 t1Var = this.f451883a;
            t1Var.m(jSONObject);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState");
            t1Var.b(jSONObject);
        } else {
            x44.t1 t1Var2 = this.f451883a;
            t1Var2.b(w44.d.k(t1Var2, 600001, "fail: query finder living notice failed: " + i18, null, 4, null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryFinderLivingNoticeState$doAction$1");
    }
}
