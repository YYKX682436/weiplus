package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class z implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.r1 f186692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f186695g;

    public z(com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f186692d = r1Var;
        this.f186693e = kVar;
        this.f186694f = y2Var;
        this.f186695g = hashMap;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var = this.f186692d;
        if (r1Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) r1Var).O("cancelled");
        }
        nw4.g gVar = this.f186693e.f340863d;
        nw4.y2 y2Var = this.f186694f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":cancelled", this.f186695g);
    }
}
