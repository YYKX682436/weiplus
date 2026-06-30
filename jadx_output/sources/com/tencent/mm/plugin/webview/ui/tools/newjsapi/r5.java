package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class r5 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.g f186481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.newjsapi.s5 f186482b;

    public r5(nw4.g gVar, com.tencent.mm.plugin.webview.ui.tools.newjsapi.s5 s5Var) {
        this.f186481a = gVar;
        this.f186482b = s5Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.s5 s5Var = this.f186482b;
        nw4.g gVar = this.f186481a;
        if (z17 || z18) {
            java.lang.String str = s5Var.f186516b;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("err_desc", "");
            gVar.e(str, "launchAppByScheme:ok", linkedHashMap);
            return;
        }
        java.lang.String str2 = s5Var.f186516b;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("err_desc", "open url fail");
        gVar.e(str2, "launchAppByScheme:fail", linkedHashMap2);
    }
}
