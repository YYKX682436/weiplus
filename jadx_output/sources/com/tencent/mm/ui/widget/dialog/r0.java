package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class r0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f211959d;

    public r0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f211959d = k0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f211959d;
        android.view.ViewTreeObserver viewTreeObserver = k0Var.L1;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                k0Var.L1 = k0Var.K1.getViewTreeObserver();
            }
            k0Var.L1.removeGlobalOnLayoutListener(k0Var);
            k0Var.L1 = null;
        }
        if (k0Var.V1) {
            return;
        }
        k0Var.f211864i = null;
    }
}
