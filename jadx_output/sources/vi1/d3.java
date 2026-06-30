package vi1;

/* loaded from: classes7.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437293d;

    public d3(vi1.k3 k3Var) {
        this.f437293d = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f437293d.f437390g;
        if (editText != null) {
            kotlin.jvm.internal.o.d(editText);
            java.lang.Object systemService = editText.getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                editText.requestFocus();
                inputMethodManager.showSoftInput(editText, 0);
            }
        }
    }
}
