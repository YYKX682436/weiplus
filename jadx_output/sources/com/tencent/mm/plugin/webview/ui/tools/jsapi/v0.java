package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public final class v0 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185454b;

    public v0(nw4.k kVar, nw4.y2 y2Var) {
        this.f185453a = kVar;
        this.f185454b = y2Var;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        nw4.g gVar = this.f185453a.f340863d;
        java.lang.String str2 = this.f185454b.f341013c;
        if (str == null) {
            str = "";
        }
        gVar.e(str2, "rebaseWxappPubLibAndRestart:".concat(str), null);
        return java.lang.Boolean.TRUE;
    }
}
