package st1;

/* loaded from: classes5.dex */
public final class a implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f412198d;

    public a(java.lang.CharSequence charSequence) {
        this.f412198d = charSequence;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        for (int i28 = 0; i28 < charSequence.length(); i28++) {
            if (!r26.n0.C(this.f412198d, charSequence.charAt(i28), false, 2, null)) {
                return "";
            }
        }
        return charSequence;
    }
}
