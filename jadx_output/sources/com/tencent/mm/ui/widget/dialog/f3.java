package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes14.dex */
public class f3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f211789d;

    public f3(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f211789d = z2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f211789d;
        com.tencent.mm.ui.widget.dialog.q3 q3Var = z2Var.f212054J;
        if (q3Var != null) {
            q3Var.dismiss();
            dialogInterface.dismiss();
        }
        android.view.ViewTreeObserver viewTreeObserver = z2Var.f212062n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                z2Var.f212062n = z2Var.f212061m.getViewTreeObserver();
            }
            z2Var.f212062n.removeGlobalOnLayoutListener(z2Var);
            z2Var.f212062n = null;
        }
        if (z2Var.f212063o) {
            return;
        }
        z2Var.f212055d = null;
    }
}
