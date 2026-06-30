package gg1;

/* loaded from: classes7.dex */
public final class u implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.w f271630d;

    public u(gg1.w wVar) {
        this.f271630d = wVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        gg1.w wVar = this.f271630d;
        android.view.ViewTreeObserver viewTreeObserver = wVar.f271646s;
        if (viewTreeObserver != null) {
            kotlin.jvm.internal.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = wVar.f271645r;
                kotlin.jvm.internal.o.d(view);
                wVar.f271646s = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = wVar.f271646s;
            kotlin.jvm.internal.o.d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(wVar);
            wVar.f271646s = null;
        }
        wVar.f271650w.invoke(java.lang.Integer.valueOf(wVar.f271635e.f271592e.size() + wVar.f271635e.f271591d.size()));
    }
}
