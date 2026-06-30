package zl2;

/* loaded from: classes3.dex */
public final class i3 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f473821d;

    public i3(android.widget.EditText editText) {
        this.f473821d = editText;
    }

    @Override // android.text.InputFilter
    public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        android.widget.EditText editText = this.f473821d;
        if (editText != null) {
            editText.getText();
        }
        if (charSequence.toString().contentEquals("\n")) {
            return "";
        }
        return null;
    }
}
