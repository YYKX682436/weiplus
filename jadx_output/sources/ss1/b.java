package ss1;

/* loaded from: classes8.dex */
public final class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss1.d f411883d;

    public b(ss1.d dVar) {
        this.f411883d = dVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        android.view.View view;
        ss1.d dVar = this.f411883d;
        android.view.ViewTreeObserver viewTreeObserver = dVar.f411891m;
        if (viewTreeObserver != null) {
            kotlin.jvm.internal.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive() && (view = dVar.f411890i) != null) {
                kotlin.jvm.internal.o.d(view);
                dVar.f411891m = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = dVar.f411891m;
            kotlin.jvm.internal.o.d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(dVar);
            dVar.f411891m = null;
        }
        if (!dVar.f411892n) {
            dVar.f411886e = null;
        }
        rv.m3 m3Var = dVar.f411894p;
        if (m3Var != null) {
            kotlin.jvm.internal.o.d(m3Var);
            com.tencent.mm.plugin.webview.ui.tools.x3 x3Var = ((com.tencent.mm.plugin.webview.ui.tools.w3) m3Var).f187008a;
            x3Var.f187647g = null;
            x3Var.c(x3Var.f187646f ? "cancel" : "hide", null);
        }
    }
}
