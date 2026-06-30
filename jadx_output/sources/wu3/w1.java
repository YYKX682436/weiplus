package wu3;

/* loaded from: classes5.dex */
public final class w1 {
    public w1(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.CharSequence a(java.lang.String source, java.lang.CharSequence charSequence, int i17) {
        int I;
        kotlin.jvm.internal.o.g(source, "source");
        android.text.SpannableString spannableString = new android.text.SpannableString(source);
        if (charSequence == null || charSequence.length() == 0) {
            return spannableString;
        }
        int length = charSequence.length();
        int i18 = 0;
        do {
            I = r26.n0.I(source, charSequence.toString(), i18, false);
            if (I != -1) {
                int i19 = I + length;
                i18 += i19;
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(i17), I, i19, 33);
            }
        } while (I != -1);
        return spannableString;
    }
}
