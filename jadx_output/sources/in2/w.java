package in2;

/* loaded from: classes10.dex */
public final class w implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f292916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in2.t f292917g;

    public w(in2.f0 f0Var, int i17, android.widget.EditText editText, in2.t tVar) {
        this.f292914d = f0Var;
        this.f292915e = i17;
        this.f292916f = editText;
        this.f292917g = tVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (6 != i17) {
            return false;
        }
        in2.f0 f0Var = this.f292914d;
        dk2.yg ygVar = (dk2.yg) f0Var.f292826h.get(this.f292915e);
        android.widget.EditText editText = this.f292916f;
        java.lang.String obj = r26.n0.u0(editText.getText().toString()).toString();
        ygVar.getClass();
        kotlin.jvm.internal.o.g(obj, "<set-?>");
        ygVar.f234393a = obj;
        android.content.Context context = editText.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!f0Var.x(context)) {
            return true;
        }
        in2.t tVar = this.f292917g;
        tVar.f292902h.clearFocus();
        java.lang.Object systemService = editText.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(tVar.f292902h.getWindowToken(), 0);
        f0Var.f292834s = false;
        return true;
    }
}
