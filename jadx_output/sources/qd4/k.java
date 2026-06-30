package qd4;

/* loaded from: classes15.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI f361871e;

    public k(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI, java.lang.String str) {
        this.f361871e = jsapiSnsLabelUI;
        this.f361870d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$7");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI = this.f361871e;
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Y6(jsapiSnsLabelUI, arrayList);
        if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI) == null) {
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Y6(jsapiSnsLabelUI, new java.util.ArrayList());
        }
        java.lang.String str = this.f361870d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            i17 = -1;
        } else {
            if (!com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI).contains(str)) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI).add(str);
            }
            i17 = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI).indexOf(str);
        }
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).h(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.d7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361895p = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.b7(jsapiSnsLabelUI);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && i17 != -1) {
            if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.b7(jsapiSnsLabelUI) == jsapiSnsLabelUI.f169542f) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361897r.add(str);
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361899t.clear();
            } else if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.b7(jsapiSnsLabelUI) == jsapiSnsLabelUI.f169543g) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361898s.add(str);
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361900u.clear();
            }
        }
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).expandGroup(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.b7(jsapiSnsLabelUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.f169556w = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$7");
    }
}
