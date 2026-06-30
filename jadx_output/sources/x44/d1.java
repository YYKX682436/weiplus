package x44;

/* loaded from: classes4.dex */
public final class d1 implements d44.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x44.e1 f451813a;

    public d1(x44.e1 e1Var) {
        this.f451813a = e1Var;
    }

    @Override // d44.b
    public final void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI$doAction$1");
        x44.e1 e1Var = this.f451813a;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("SnsAdJs.OpenFinderLiveUI", "to finder live ui success");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
            org.json.JSONObject l17 = e1Var.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI");
            e1Var.b(l17);
        } else {
            com.tencent.mars.xlog.Log.i("SnsAdJs.OpenFinderLiveUI", "to finder live ui failed, error is " + i18);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("livingError", i18);
            e1Var.b(e1Var.j(600013, "open finder living ui failed", jSONObject));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenFinderLiveUI$doAction$1");
    }
}
