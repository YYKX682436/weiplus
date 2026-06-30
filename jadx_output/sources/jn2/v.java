package jn2;

/* loaded from: classes5.dex */
public final class v implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.w f300717d;

    public v(jn2.w wVar) {
        this.f300717d = wVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 3) {
            jn2.w wVar = this.f300717d;
            android.content.Context d17 = wVar.d();
            kotlin.jvm.internal.o.f(d17, "access$getContext(...)");
            android.widget.EditText editText = wVar.f300725i;
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) d17.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
            }
            jn2.w.c(wVar);
            te2.a9.f417883a.a(wVar.f300722f.h7(), 3, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            kotlinx.coroutines.y0 y0Var = wVar.f300721e;
            if (y0Var != null) {
                kotlinx.coroutines.l.d(y0Var, null, null, new jn2.u(wVar, textView, null), 3, null);
            }
        }
        return false;
    }
}
