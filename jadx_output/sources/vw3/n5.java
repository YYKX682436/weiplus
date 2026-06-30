package vw3;

/* loaded from: classes.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw3.q5 f441042d;

    public n5(vw3.q5 q5Var) {
        this.f441042d = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vw3.q5 q5Var = this.f441042d;
        java.lang.Object systemService = q5Var.f441084f.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(q5Var.f441088m, 0);
    }
}
