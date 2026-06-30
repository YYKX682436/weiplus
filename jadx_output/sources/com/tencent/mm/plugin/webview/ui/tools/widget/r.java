package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f187517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy4.m0 f187518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f187519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f187520g;

    public r(o25.y1 y1Var, hy4.m0 m0Var, yz5.l lVar, com.tencent.mm.plugin.webview.core.r0 r0Var) {
        this.f187517d = y1Var;
        this.f187518e = m0Var;
        this.f187519f = lVar;
        this.f187520g = r0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem instanceof db5.h4) {
            com.tencent.mm.plugin.webview.ui.tools.widget.q qVar = new com.tencent.mm.plugin.webview.ui.tools.widget.q(this.f187518e, this.f187519f, this.f187520g);
            ((com.tencent.mm.pluginsdk.forward.m) this.f187517d).aj((db5.h4) menuItem, qVar);
        }
    }
}
