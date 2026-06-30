package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.r1 f185952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f185955g;

    public b0(com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f185952d = r1Var;
        this.f185953e = kVar;
        this.f185954f = y2Var;
        this.f185955g = hashMap;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var = this.f185952d;
        if (r1Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) r1Var).O("ok");
        }
        nw4.g gVar = this.f185953e.f340863d;
        nw4.y2 y2Var = this.f185954f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", this.f185955g);
    }
}
