package ej2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f253297d;

    public i(ej2.j jVar) {
        this.f253297d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ej2.j jVar = this.f253297d;
        android.widget.EditText editText = jVar.f253302e;
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) jVar.f253298a.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(jVar.f253302e, 0);
        }
    }
}
