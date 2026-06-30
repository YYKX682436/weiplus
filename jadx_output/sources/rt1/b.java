package rt1;

/* loaded from: classes7.dex */
public final class b extends android.text.Spannable.Factory {
    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        android.text.SpannableStringBuilder valueOf = android.text.SpannableStringBuilder.valueOf(charSequence);
        kotlin.jvm.internal.o.f(valueOf, "valueOf(...)");
        return valueOf;
    }
}
