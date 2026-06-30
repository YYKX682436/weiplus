package oc2;

/* loaded from: classes.dex */
public final class d implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f344162d;

    public d(kotlin.jvm.internal.f0 f0Var) {
        this.f344162d = f0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable == null || editable.length() == 0) {
            return;
        }
        this.f344162d.f310116d = java.lang.Integer.parseInt(editable.toString());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
