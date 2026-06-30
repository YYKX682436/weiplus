package com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay;

/* loaded from: classes.dex */
public final class f implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186626b;

    public f(nw4.k kVar, nw4.y2 y2Var) {
        this.f186625a = kVar;
        this.f186626b = y2Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", "actionName:" + str + " data:" + obj);
        boolean b17 = kotlin.jvm.internal.o.b(str, "reportPayResult");
        java.lang.String str2 = null;
        nw4.k kVar = this.f186625a;
        nw4.y2 y2Var = this.f186626b;
        if (!b17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "wrong actionName");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        } else if (obj instanceof org.json.JSONObject) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            try {
                boolean z17 = true;
                if (!jSONObject.has("result")) {
                    z17 = false;
                }
                if (z17) {
                    str2 = jSONObject.getString("result");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
            }
            if (kotlin.jvm.internal.o.b(str2, ya.b.SUCCESS)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestMedicalInsurancePay", ya.b.SUCCESS);
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.i.b(jSONObject));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "fail");
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.i.b(jSONObject));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiRequestMedicalInsurancePay", "wrong data");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
        return false;
    }
}
