package vw3;

/* loaded from: classes.dex */
public final class p5 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw3.q5 f441069d;

    public p5(vw3.q5 q5Var) {
        this.f441069d = q5Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        vw3.q5 q5Var = this.f441069d;
        java.lang.Object systemService = q5Var.f441084f.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        android.widget.EditText editText = q5Var.f441088m;
        inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
    }
}
