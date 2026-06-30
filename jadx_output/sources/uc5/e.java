package uc5;

/* loaded from: classes9.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        uc5.e eVar = uc5.n.f426527n;
        return com.tencent.mm.R.color.f478502m;
    }

    public final java.lang.CharSequence b(java.lang.CharSequence text, java.lang.String query, int i17) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(query, "query");
        if (r26.n0.N(query) || r26.n0.N(text)) {
            return text;
        }
        java.lang.String obj = text.toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = obj.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String lowerCase2 = query.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(text);
        int i18 = 0;
        boolean z17 = false;
        while (true) {
            int L = r26.n0.L(lowerCase, lowerCase2, i18, false, 4, null);
            if (L < 0) {
                break;
            }
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(i17), L, lowerCase2.length() + L, 33);
            i18 = L + lowerCase2.length();
            z17 = true;
        }
        return z17 ? spannableString : text;
    }
}
