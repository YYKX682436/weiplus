package i54;

/* loaded from: classes4.dex */
public final class i implements h54.h {
    @Override // h54.h
    public void a(h54.d jsApiContext, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiLiteAppFormAction");
        kotlin.jvm.internal.o.g(jsApiContext, "jsApiContext");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("actionData");
        if (optString == null || optString.length() == 0) {
            jsApiContext.a("data is empty", kz5.c1.l(new jz5.l("ret", "-1"), new jz5.l("err_msg", "the context is invalid!!!")));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, 60);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiLiteAppFormAction");
            return;
        }
        h54.a d17 = jsApiContext.d();
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("event", "onFormWebviewPerformAction");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String a17 = jsApiContext.d().a();
        if (a17 == null) {
            a17 = "";
        }
        jSONObject.put("componentId", a17);
        java.lang.String b17 = jsApiContext.b();
        jSONObject.put("callbackId", b17 != null ? b17 : "");
        jSONObject.put("actionData", optString);
        lVarArr[1] = new jz5.l("params", jSONObject.toString());
        d17.c(kz5.c1.l(lVarArr));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiLiteAppFormAction");
    }
}
