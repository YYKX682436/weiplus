package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes3.dex */
public final class b7 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f151059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f151060b;

    public b7(o25.y1 y1Var, kotlin.jvm.internal.h0 h0Var) {
        this.f151059a = y1Var;
        this.f151060b = h0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f151060b.f310123d;
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) this.f151059a).bj(k0Var, (db5.h4) menuItem);
    }
}
