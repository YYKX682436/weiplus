package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes7.dex */
public final class n4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186373e;

    public n4(nw4.k kVar, nw4.y2 y2Var) {
        this.f186372d = kVar;
        this.f186373e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        org.json.JSONArray jSONArray;
        com.tencent.mm.brandService.GetBizResponse getBizResponse = (com.tencent.mm.brandService.GetBizResponse) obj;
        boolean z17 = getBizResponse.f63621d;
        nw4.k kVar = this.f186372d;
        nw4.y2 y2Var = this.f186373e;
        if (!z17) {
            java.util.Map l17 = kz5.c1.l(new jz5.l("err_desc", getBizResponse.f63624g));
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", l17);
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = getBizResponse.f63625h;
        if (str == null) {
            str = "[]";
        }
        try {
            jSONArray = new org.json.JSONArray(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "Failed to parse bizList JSON: ".concat(str), e17);
            jSONArray = new org.json.JSONArray();
        }
        linkedHashMap.put("result", jSONArray);
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", linkedHashMap);
    }
}
