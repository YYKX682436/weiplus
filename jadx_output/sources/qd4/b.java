package qd4;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI f361861d;

    public b(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        this.f361861d = jsapiSnsLabelUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$11");
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI = this.f361861d;
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361895p = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.b7(jsapiSnsLabelUI);
        if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.a7(jsapiSnsLabelUI) != null) {
            if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI) == null) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Y6(jsapiSnsLabelUI, com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.a7(jsapiSnsLabelUI));
            } else {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI).addAll(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.a7(jsapiSnsLabelUI));
            }
            java.util.Iterator it = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.a7(jsapiSnsLabelUI).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).d((java.lang.String) it.next());
            }
            java.util.HashSet hashSet = new java.util.HashSet(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI));
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI).clear();
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI).addAll(hashSet);
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.a7(jsapiSnsLabelUI).clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI.A = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            hashSet.clear();
        }
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).h(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.X6(jsapiSnsLabelUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        jsapiSnsLabelUI.d7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).d(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361895p);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = jsapiSnsLabelUI.f169555v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (u3Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = jsapiSnsLabelUI.f169555v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            if (u3Var2.isShowing()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.tencent.mm.ui.widget.dialog.u3 u3Var3 = jsapiSnsLabelUI.f169555v;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                u3Var3.dismiss();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$11");
    }
}
