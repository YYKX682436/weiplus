package in2;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.t f292933d;

    public y(in2.t tVar) {
        this.f292933d = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in2.t tVar = this.f292933d;
        java.lang.Object systemService = tVar.f292902h.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(tVar.f292902h, 0);
    }
}
