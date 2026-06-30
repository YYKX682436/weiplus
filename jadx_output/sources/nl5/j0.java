package nl5;

/* loaded from: classes5.dex */
public final class j0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f338314d;

    public j0(nl5.s0 s0Var) {
        this.f338314d = s0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        nl5.s0 s0Var = this.f338314d;
        if (s0Var.f338375z) {
            com.tencent.mm.ui.yk.a("SelectableEditTextHelper", "onFocusChange:" + z17, new java.lang.Object[0]);
            if (!z17) {
                s0Var.i(false);
            }
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = s0Var.f338366q;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
