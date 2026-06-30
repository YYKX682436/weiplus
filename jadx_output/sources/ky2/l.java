package ky2;

/* loaded from: classes.dex */
public final class l implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f313560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f313561f;

    public l(ky2.w wVar, int i17, android.widget.EditText editText) {
        this.f313559d = wVar;
        this.f313560e = i17;
        this.f313561f = editText;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        ky2.r rVar = (ky2.r) this.f313559d.f313585e.get(this.f313560e);
        android.widget.EditText editText = this.f313561f;
        java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
        rVar.getClass();
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        rVar.f313575a = obj;
        editText.clearFocus();
        java.lang.Object systemService = editText.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        return true;
    }
}
