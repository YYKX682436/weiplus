package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes8.dex */
public final class k0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.m0 f138288d;

    public k0(com.tencent.mm.plugin.fts.ui.widget.m0 m0Var) {
        this.f138288d = m0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.fts.ui.widget.m0 m0Var = this.f138288d;
        ((androidx.lifecycle.b0) ((jz5.n) m0Var.f138299n).getValue()).g(androidx.lifecycle.n.DESTROYED);
        android.content.DialogInterface.OnDismissListener onDismissListener = m0Var.f138300o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(m0Var);
        }
    }
}
