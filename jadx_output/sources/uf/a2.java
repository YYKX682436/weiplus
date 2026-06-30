package uf;

/* loaded from: classes7.dex */
public final class a2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f426970d;

    public a2(uf.c2 c2Var) {
        this.f426970d = c2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        uf.c2 c2Var = this.f426970d;
        android.view.ViewTreeObserver viewTreeObserver = c2Var.f427006s;
        if (viewTreeObserver != null) {
            kotlin.jvm.internal.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = c2Var.f427005r;
                kotlin.jvm.internal.o.d(view);
                c2Var.f427006s = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = c2Var.f427006s;
            kotlin.jvm.internal.o.d(viewTreeObserver2);
            viewTreeObserver2.removeOnGlobalLayoutListener(c2Var);
            c2Var.f427006s = null;
        }
        c2Var.f426996f.f426988g.d();
        c2Var.f427011x.invoke(java.lang.Integer.valueOf(c2Var.f426996f.f426985d.size() + c2Var.f426996f.f426984c.size()));
    }
}
