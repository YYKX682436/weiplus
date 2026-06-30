package ov0;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.t f349128d;

    public e0(ov0.t tVar) {
        this.f349128d = tVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        ov0.t tVar = this.f349128d;
        if (z17) {
            android.text.Editable text = tVar.getEditText().getText();
            boolean z18 = false;
            if (text != null) {
                if (text.length() > 0) {
                    z18 = true;
                }
            }
            if (z18) {
                tVar.Q();
                return;
            }
        }
        tVar.J();
    }
}
