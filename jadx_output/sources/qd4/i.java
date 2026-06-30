package qd4;

/* loaded from: classes15.dex */
public class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI f361868d;

    public i(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        this.f361868d = jsapiSnsLabelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI = this.f361868d;
        jsapiSnsLabelUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(jsapiSnsLabelUI.f169549p.f361897r, ",");
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(jsapiSnsLabelUI.f169549p.f361899t, ",");
        java.lang.String c19 = com.tencent.mm.sdk.platformtools.t8.c1(jsapiSnsLabelUI.f169549p.f361898s, ",");
        java.lang.String c110 = com.tencent.mm.sdk.platformtools.t8.c1(jsapiSnsLabelUI.f169549p.f361900u, ",");
        qd4.r rVar = jsapiSnsLabelUI.f169549p;
        if (rVar.f361895p != jsapiSnsLabelUI.f169542f || rVar.f361897r.size() != 0 || jsapiSnsLabelUI.f169549p.f361899t.size() != 0) {
            qd4.r rVar2 = jsapiSnsLabelUI.f169549p;
            if (rVar2.f361895p != jsapiSnsLabelUI.f169543g || rVar2.f361898s.size() != 0 || jsapiSnsLabelUI.f169549p.f361900u.size() != 0) {
                if ((jsapiSnsLabelUI.f169549p.f361895p == jsapiSnsLabelUI.f169542f && com.tencent.mm.sdk.platformtools.t8.K0(c17) && com.tencent.mm.sdk.platformtools.t8.K0(c18)) || (jsapiSnsLabelUI.f169549p.f361895p == jsapiSnsLabelUI.f169543g && com.tencent.mm.sdk.platformtools.t8.K0(c19) && com.tencent.mm.sdk.platformtools.t8.K0(c110))) {
                    db5.e1.y(jsapiSnsLabelUI, jsapiSnsLabelUI.getString(com.tencent.mm.R.string.jbn), "", jsapiSnsLabelUI.getString(com.tencent.mm.R.string.f493219jc4), null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                } else {
                    jsapiSnsLabelUI.l7();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
                return true;
            }
        }
        db5.e1.y(jsapiSnsLabelUI, jsapiSnsLabelUI.getString(com.tencent.mm.R.string.jbn), "", jsapiSnsLabelUI.getString(com.tencent.mm.R.string.f493219jc4), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$5");
        return true;
    }
}
