package ni2;

/* loaded from: classes5.dex */
public final class e1 implements android.text.InputFilter {
    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence source, int i17, int i18, android.text.Spanned dest, int i19, int i27) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(dest, "dest");
        int i28 = 0;
        int i29 = 0;
        while (true) {
            int i37 = 2;
            if (i28 >= dest.length()) {
                break;
            }
            java.lang.String ch6 = java.lang.Character.toString(dest.charAt(i28));
            kotlin.jvm.internal.o.f(ch6, "toString(...)");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[一-龥]");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            if (!compile.matcher(ch6).matches()) {
                i37 = 1;
            }
            i29 += i37;
            i28++;
        }
        while (i17 < i18) {
            java.lang.String ch7 = java.lang.Character.toString(source.charAt(i17));
            kotlin.jvm.internal.o.f(ch7, "toString(...)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("[一-龥]");
            kotlin.jvm.internal.o.f(compile2, "compile(...)");
            i29 += compile2.matcher(ch7).matches() ? 2 : 1;
            if (i29 > 8) {
                return "";
            }
            i17++;
        }
        return source;
    }
}
