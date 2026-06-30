package wl3;

/* loaded from: classes10.dex */
public final class d implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl3.e f447055d;

    public d(wl3.e eVar) {
        this.f447055d = eVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        wl3.e eVar = this.f447055d;
        android.view.ViewTreeObserver viewTreeObserver = eVar.f447062m;
        if (viewTreeObserver != null) {
            kotlin.jvm.internal.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = eVar.f447061i;
                kotlin.jvm.internal.o.d(view);
                eVar.f447062m = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = eVar.f447062m;
            kotlin.jvm.internal.o.d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(eVar);
            eVar.f447062m = null;
        }
        eVar.getClass();
        eVar.getClass();
    }
}
