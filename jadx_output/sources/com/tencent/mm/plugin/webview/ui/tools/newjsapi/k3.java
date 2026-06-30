package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class k3 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186301b;

    public k3(nw4.k kVar, nw4.y2 y2Var) {
        this.f186300a = kVar;
        this.f186301b = y2Var;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleHaoKanAction", "dismiss is null");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", 0);
        hashMap.put("dialogShowed", 1);
        nw4.g gVar = this.f186300a.f340863d;
        nw4.y2 y2Var = this.f186301b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).wi(2L, 2L, 1L);
    }

    @Override // tg0.h1
    public void b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result", 1);
        hashMap.put("dialogShowed", 1);
        nw4.g gVar = this.f186300a.f340863d;
        nw4.y2 y2Var = this.f186301b;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).wi(1L, 2L, 1L);
    }
}
