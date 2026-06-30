package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class b9 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f184964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 f184965e;

    public b9(nw4.y2 y2Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var) {
        this.f184964d = y2Var;
        this.f184965e = e9Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        nw4.y2 y2Var = this.f184964d;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.e9 e9Var = this.f184965e;
        if (i18 != -1) {
            e9Var.f185084a.i5(y2Var, "cancel", kz5.b1.e(new jz5.l("err_msg", "cancel")));
            return;
        }
        java.lang.Object obj = ((java.util.HashMap) y2Var.f340790a).get("liteAppUuid");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        long parseLong = java.lang.Long.parseLong(str);
        jz5.l[] lVarArr = {new jz5.l("bindMobile", c01.z1.c())};
        e9Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jz5.l lVar = lVarArr[0];
        jSONObject.put(lVar.f302833d.toString(), lVar.f302834e.toString());
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEventToTopPage(parseLong, "onBindMobileChange", jSONObject);
        e9Var.f185084a.i5(y2Var, "ok", kz5.b1.e(new jz5.l("err_msg", "ok")));
    }
}
