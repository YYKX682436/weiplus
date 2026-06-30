package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class o4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186404e;

    public o4(nw4.k kVar, nw4.y2 y2Var) {
        this.f186403d = kVar;
        this.f186404e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.brandService.GetBizResponse getBizResponse = (com.tencent.mm.brandService.GetBizResponse) obj;
        boolean z17 = getBizResponse.f63621d;
        nw4.k kVar = this.f186403d;
        nw4.y2 y2Var = this.f186404e;
        if (!z17) {
            java.util.Map l17 = kz5.c1.l(new jz5.l("err_desc", getBizResponse.f63624g));
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", l17);
            return;
        }
        java.lang.String str = getBizResponse.f63627m;
        if (str.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "Failed to parse fullInfo JSON: ".concat(str), e17);
                jSONObject = new org.json.JSONObject();
            }
        }
        java.util.Map l18 = kz5.c1.l(new jz5.l("biz", getBizResponse.f63622e), new jz5.l("interactiveIdentityType", java.lang.Integer.valueOf(getBizResponse.f63623f)), new jz5.l("initFlag", java.lang.Boolean.valueOf(getBizResponse.f63626i)), new jz5.l("fullInfo", jSONObject));
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", l18);
    }
}
