package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class w0 extends com.tencent.mm.plugin.fts.ui.widget.m0 {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.ui.widget.k1 f138338p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f138339q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f138340r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f138341s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f138342t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f138343u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context, com.tencent.mm.plugin.fts.ui.widget.k1 proxy) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(proxy, "proxy");
        this.f138338p = proxy;
        this.f138339q = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.v0(this, context));
        this.f138340r = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.t0(this));
        this.f138341s = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.p0(this));
        this.f138342t = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.u0(context, this));
        this.f138343u = jz5.h.b(new com.tencent.mm.plugin.fts.ui.widget.o0(this));
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.m0
    public void D() {
        android.view.Window window;
        super.D();
        if (!com.tencent.mm.ui.b4.c(getContext()) || (window = getWindow()) == null) {
            return;
        }
        new n3.m3(window, window.getDecorView()).b(true);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(0);
        com.tencent.mm.ui.a4.f197117a.j(window);
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.m0, androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        jz5.g gVar = this.f138343u;
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        if (view != null) {
            view.setContentDescription(getContext().getString(com.tencent.mm.R.string.idl));
        }
        ((com.tencent.mm.plugin.fts.ui.widget.b1) ((jz5.n) this.f138342t).getValue()).f138247b = new com.tencent.mm.plugin.fts.ui.widget.q0(this);
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.fts.ui.widget.r0(this));
        }
        this.f138300o = new com.tencent.mm.plugin.fts.ui.widget.s0(this);
    }
}
