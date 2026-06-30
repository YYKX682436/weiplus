package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.r1 f185990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f185993g;

    public c0(com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f185990d = r1Var;
        this.f185991e = kVar;
        this.f185992f = y2Var;
        this.f185993g = hashMap;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var = this.f185990d;
        if (r1Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) r1Var).O("no");
        }
        nw4.g gVar = this.f185991e.f340863d;
        nw4.y2 y2Var = this.f185992f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":no", this.f185993g);
    }
}
