package f93;

/* loaded from: classes8.dex */
public final class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.u4 f260498d;

    public w4(f93.u4 u4Var) {
        this.f260498d = u4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f93.u4 u4Var = this.f260498d;
        u4Var.a();
        java.lang.Object systemService = u4Var.a().getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(u4Var.a(), 0);
        u4Var.a().setCursorVisible(false);
        u4Var.a().setCursorVisible(true);
    }
}
