package fn2;

/* loaded from: classes5.dex */
public final class r implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s f264363d;

    public r(fn2.s sVar) {
        this.f264363d = sVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 3) {
            java.lang.String obj = textView.getText().toString();
            fn2.s sVar = this.f264363d;
            sVar.f264383v = obj;
            android.content.Context c17 = sVar.c();
            kotlin.jvm.internal.o.f(c17, "access$getContext(...)");
            android.widget.EditText editText = sVar.f264373i;
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c17.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
            }
            com.tencent.mm.plugin.finder.live.widget.dv dvVar = sVar.f264379r;
            if (dvVar != null) {
                dvVar.b();
            }
            com.tencent.mm.plugin.finder.live.widget.dv dvVar2 = sVar.f264380s;
            if (dvVar2 != null) {
                dvVar2.e();
            }
            kotlinx.coroutines.y0 y0Var = sVar.f264369e;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.q1.f310570c, null, new fn2.q(sVar, null), 2, null);
            }
        }
        return false;
    }
}
