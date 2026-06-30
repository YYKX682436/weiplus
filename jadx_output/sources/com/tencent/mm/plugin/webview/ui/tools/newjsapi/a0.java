package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class a0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.r1 f185929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f185930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f185932g;

    public a0(com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var, nw4.k kVar, nw4.y2 y2Var, java.util.HashMap hashMap) {
        this.f185929d = r1Var;
        this.f185930e = kVar;
        this.f185931f = y2Var;
        this.f185932g = hashMap;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var = this.f185929d;
        if (r1Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) r1Var).O("dismiss");
        }
        nw4.g gVar = this.f185930e.f340863d;
        nw4.y2 y2Var = this.f185931f;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":dismiss", this.f185932g);
    }
}
