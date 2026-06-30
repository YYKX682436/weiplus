package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class p implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f187484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f187485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f187486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f187487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hy4.m0 f187488h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f187489i;

    public p(com.tencent.mm.ui.widget.dialog.k0 k0Var, o25.y1 y1Var, android.content.Context context, com.tencent.mm.plugin.webview.core.r0 r0Var, hy4.m0 m0Var, android.view.View view) {
        this.f187484d = k0Var;
        this.f187485e = y1Var;
        this.f187486f = context;
        this.f187487g = r0Var;
        this.f187488h = m0Var;
        this.f187489i = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f187484d;
        kotlin.jvm.internal.o.d(k0Var);
        int i17 = k0Var.S1 ? 3 : 1;
        android.content.Context context = this.f187486f;
        kotlin.jvm.internal.o.d(g4Var);
        kotlin.jvm.internal.o.d(k0Var);
        ((com.tencent.mm.pluginsdk.forward.m) this.f187485e).Ai(context, g4Var, k0Var, i17, new com.tencent.mm.plugin.webview.ui.tools.widget.o(this.f187489i, k0Var, this.f187486f));
        this.f187488h.f286175c = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(this.f187487g.i());
    }
}
