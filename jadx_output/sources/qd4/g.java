package qd4;

/* loaded from: classes15.dex */
public class g implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI f361866a;

    public g(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        this.f361866a = jsapiSnsLabelUI;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$3");
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI = this.f361866a;
        if (i18 == com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).getChildrenCount(i17) - 1) {
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.c7(jsapiSnsLabelUI, i17);
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.U6(jsapiSnsLabelUI);
        } else {
            java.lang.String str = (java.lang.String) com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).getChild(i17, i18);
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).d(str);
            if (i17 == jsapiSnsLabelUI.f169542f) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.W6(jsapiSnsLabelUI, 1, com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361897r, str, view);
            } else if (i17 == jsapiSnsLabelUI.f169543g) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.W6(jsapiSnsLabelUI, 2, com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361898s, str, view);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$3");
        return false;
    }
}
