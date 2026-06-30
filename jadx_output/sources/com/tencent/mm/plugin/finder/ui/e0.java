package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class e0 {
    public e0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.ui.MMActivity context, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, true);
        k0Var.q(context.getResources().getString(com.tencent.mm.R.string.mah), 17);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.a0(context);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.c0(context, callback);
        k0Var.f211854d = new com.tencent.mm.plugin.finder.ui.d0(callback);
        k0Var.v();
    }
}
