package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f139762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m33.k1 f139763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.x5 f139764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139765g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.jsapi.q5 f139766h;

    public v5(android.content.Context context, m33.k1 k1Var, com.tencent.mm.plugin.game.luggage.jsapi.x5 x5Var, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        this.f139762d = context;
        this.f139763e = k1Var;
        this.f139764f = x5Var;
        this.f139765g = str;
        this.f139766h = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        final android.content.Context context = this.f139762d;
        m33.k1 k1Var = this.f139763e;
        final com.tencent.mm.plugin.game.luggage.jsapi.u5 u5Var = new com.tencent.mm.plugin.game.luggage.jsapi.u5(this.f139764f, this.f139765g, this.f139766h);
        final com.tencent.mm.plugin.game.p0 p0Var = (com.tencent.mm.plugin.game.p0) l1Var;
        p0Var.getClass();
        if (!com.tencent.mm.vfs.w6.j(k1Var.f323305c)) {
            u5Var.a("file not exist");
            return;
        }
        final l53.i iVar = new l53.i(k1Var, 3);
        final com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.fnv), true, 3, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.mm.plugin.game.p0$$a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(android.content.DialogInterface dialogInterface) {
                l53.i.this.a();
            }
        });
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.p0$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.game.p0 p0Var2 = com.tencent.mm.plugin.game.p0.this;
                p0Var2.getClass();
                iVar.b(context, new com.tencent.mm.plugin.game.x0(p0Var2, u5Var, f17));
            }
        });
    }
}
