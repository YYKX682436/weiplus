package j93;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f298512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.w f298513e;

    public v(db5.f3 f3Var, j93.w wVar) {
        this.f298512d = f3Var;
        this.f298513e = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db5.f3 f3Var = this.f298512d;
        f3Var.M.performClick();
        f3Var.M.requestFocus();
        android.widget.EditText editText = f3Var.M;
        editText.setSelection(editText.getText().length());
        java.lang.Object systemService = this.f298513e.getActivity().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(f3Var.M, 0);
        }
    }
}
