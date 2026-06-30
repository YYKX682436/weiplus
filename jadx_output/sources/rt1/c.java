package rt1;

/* loaded from: classes7.dex */
public final class c implements android.text.InputFilter {
    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        android.text.SpannableStringBuilder valueOf = android.text.SpannableStringBuilder.valueOf(charSequence);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        valueOf.setSpan(new rt1.r1(android.os.SystemClock.elapsedRealtime()), 0, valueOf.length(), 18);
        return valueOf;
    }
}
