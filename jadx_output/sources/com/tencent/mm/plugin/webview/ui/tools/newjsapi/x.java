package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class x implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186640e;

    public x(nw4.k kVar, nw4.y2 y2Var) {
        this.f186639d = kVar;
        this.f186640e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cleanRet", java.lang.Integer.valueOf(((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d));
        nw4.g gVar = this.f186639d.f340863d;
        nw4.y2 y2Var = this.f186640e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":success", hashMap);
    }
}
