package qd4;

/* loaded from: classes15.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI f361873d;

    public m(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        this.f361873d = jsapiSnsLabelUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$9");
        int i18 = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        this.f361873d.j7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$9");
    }
}
