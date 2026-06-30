package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class p1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186420e;

    public p1(nw4.k kVar, nw4.y2 y2Var) {
        this.f186419d = kVar;
        this.f186420e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        nw4.k kVar = this.f186419d;
        nw4.y2 y2Var = this.f186420e;
        if (map != null) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", map);
            return;
        }
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
    }
}
