package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class n0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211929d;

    public n0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f211929d = k0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211929d;
        com.tencent.mm.ui.widget.dialog.c1 c1Var = k0Var.f211854d;
        if (c1Var != null && !k0Var.W1) {
            c1Var.onDismiss();
        }
        com.tencent.mm.ui.widget.dialog.c1 c1Var2 = k0Var.f211860g;
        if (c1Var2 != null && !k0Var.f211862h) {
            c1Var2.onDismiss();
        }
        android.app.Dialog dialog = k0Var.f211864i;
        if (dialog != null) {
            com.tencent.mm.ui.widget.dialog.g.b(dialog);
        }
    }
}
