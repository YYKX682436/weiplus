package qj5;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f363969d;

    public e(qj5.n nVar) {
        this.f363969d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        qj5.n nVar = this.f363969d;
        nVar.u();
        android.view.ViewTreeObserver viewTreeObserver = nVar.f363992z2;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = nVar.f363991y2;
                nVar.f363992z2 = view != null ? view.getViewTreeObserver() : null;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(nVar);
        }
        nVar.f363992z2 = null;
        qj5.o oVar = nVar.f363983q2;
        if (oVar != null) {
            com.tencent.mm.ui.widget.dialog.g.b(oVar);
        } else {
            kotlin.jvm.internal.o.o("containerDialog");
            throw null;
        }
    }
}
