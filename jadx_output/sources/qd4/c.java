package qd4;

/* loaded from: classes15.dex */
public class c implements android.content.DialogInterface.OnClickListener {
    public c(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$12");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$12");
    }
}
