package ni2;

/* loaded from: classes.dex */
public final class z0 implements android.text.InputFilter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.regex.Pattern f337519d = java.util.regex.Pattern.compile("[a-zA-Z0-9\\u4E00-\\u9FA5]+");

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (charSequence == null) {
            return null;
        }
        if (this.f337519d.matcher(charSequence.subSequence(i17, i18).toString()).matches()) {
            return null;
        }
        return "";
    }
}
