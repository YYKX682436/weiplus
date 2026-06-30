package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class d1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186024e;

    public d1(nw4.k kVar, nw4.y2 y2Var) {
        this.f186023d = kVar;
        this.f186024e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.e1 e1Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.e1.f186046d;
        rk0.c.c("MicroMsg.JsApiGetAccessibilitySecureRiskInfo", "callback result", new java.lang.Object[0]);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_readmode_enable", java.lang.Boolean.valueOf(bundle.getBoolean("is_readmode_enable")));
        linkedHashMap.put("is_risk", java.lang.Boolean.valueOf(bundle.getBoolean("is_risk")));
        nw4.g gVar = this.f186023d.f340863d;
        nw4.y2 y2Var = this.f186024e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", linkedHashMap);
    }
}
