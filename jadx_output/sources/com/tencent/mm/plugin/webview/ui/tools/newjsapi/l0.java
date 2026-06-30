package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class l0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186328e;

    public l0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186327d = kVar;
        this.f186328e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        nw4.y2 y2Var = this.f186328e;
        nw4.k kVar = this.f186327d;
        if (str == null) {
            kVar.f340863d.a(y2Var, "invokeAsync error");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("err_msg");
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject.optString("type");
        java.lang.String str2 = optString2 != null ? optString2 : "";
        java.lang.Object opt = jSONObject.opt("result");
        if (opt == null) {
            opt = new org.json.JSONObject();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_msg", optString);
        hashMap.put("type", str2);
        hashMap.put("result", opt);
        kVar.f340863d.e(y2Var.f341013c, optString, hashMap);
    }
}
