package cq1;

/* loaded from: classes8.dex */
public final class a0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cq1.d0 f221327d;

    public a0(cq1.d0 d0Var) {
        this.f221327d = d0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        cq1.d0 d0Var = this.f221327d;
        android.view.ViewTreeObserver viewTreeObserver = d0Var.f221338i;
        if (viewTreeObserver != null) {
            boolean z17 = false;
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                z17 = true;
            }
            if (!z17) {
                android.view.View view = d0Var.f221339m;
                d0Var.f221338i = view != null ? view.getViewTreeObserver() : null;
            }
            android.view.ViewTreeObserver viewTreeObserver2 = d0Var.f221338i;
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.removeGlobalOnLayoutListener(d0Var);
            }
            d0Var.f221338i = null;
        }
        android.app.Dialog dialog = d0Var.f221337h;
        if (dialog != null) {
            com.tencent.mm.ui.widget.dialog.g.b(dialog);
        }
        d0Var.getClass();
        d0Var.f221337h = null;
    }
}
