package im2;

/* loaded from: classes.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292413e;

    public k0(im2.z3 z3Var, android.view.View view) {
        this.f292412d = z3Var;
        this.f292413e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = this.f292412d.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(this.f292413e.getWindowToken(), 0);
    }
}
