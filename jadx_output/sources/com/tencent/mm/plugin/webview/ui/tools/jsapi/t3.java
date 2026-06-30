package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes8.dex */
public class t3 implements kh0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.u3 f185413a;

    public t3(com.tencent.mm.plugin.webview.ui.tools.jsapi.u3 u3Var) {
        this.f185413a = u3Var;
    }

    @Override // kh0.f
    public void a(org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("wepkg_info", jSONObject);
        com.tencent.mm.plugin.webview.ui.tools.jsapi.u3 u3Var = this.f185413a;
        u3Var.f185429e.i5(u3Var.f185428d, "getLocalWePkgInfo:ok", hashMap);
    }
}
