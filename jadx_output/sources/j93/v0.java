package j93;

/* loaded from: classes.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f298514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.x0 f298515e;

    public v0(db5.f3 f3Var, j93.x0 x0Var) {
        this.f298514d = f3Var;
        this.f298515e = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db5.f3 f3Var = this.f298514d;
        f3Var.M.performClick();
        f3Var.M.requestFocus();
        android.widget.EditText editText = f3Var.M;
        editText.setSelection(editText.getText().length());
        java.lang.Object systemService = this.f298515e.getActivity().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(f3Var.M, 0);
        }
    }
}
