package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class k8 implements m33.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186316b;

    public k8(nw4.k kVar, nw4.y2 y2Var) {
        this.f186315a = kVar;
        this.f186316b = y2Var;
    }

    @Override // m33.h1
    public void a(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail success");
        nw4.g gVar = this.f186315a.f340863d;
        nw4.y2 y2Var = this.f186316b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ": success", null);
    }

    @Override // m33.h1
    public void b(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail fail");
        nw4.g gVar = this.f186315a.f340863d;
        nw4.y2 y2Var = this.f186316b;
        java.lang.String str = y2Var.f341013c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y2Var.f341019i);
        sb6.append(": fail ");
        sb6.append(map != null ? map.get("error") : null);
        gVar.e(str, sb6.toString(), null);
    }
}
