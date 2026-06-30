package r26;

/* loaded from: classes7.dex */
public abstract class p0 extends r26.o0 {
    public static final char A0(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new java.util.NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static final java.lang.Character B0(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return java.lang.Character.valueOf(charSequence.charAt(0));
    }

    public static final java.lang.Character C0(java.lang.CharSequence charSequence, int i17) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        boolean z17 = false;
        if (i17 >= 0 && i17 < charSequence.length()) {
            z17 = true;
        }
        if (z17) {
            return java.lang.Character.valueOf(charSequence.charAt(i17));
        }
        return null;
    }

    public static final char D0(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new java.util.NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(r26.n0.H(charSequence));
    }

    public static final java.lang.String E0(java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested character count " + i17 + " is less than zero.").toString());
        }
        int length = str.length();
        if (i17 > length) {
            i17 = length;
        }
        java.lang.String substring = str.substring(0, i17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String F0(java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested character count " + i17 + " is less than zero.").toString());
        }
        int length = str.length();
        if (i17 > length) {
            i17 = length;
        }
        java.lang.String substring = str.substring(length - i17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.util.List x0(java.lang.CharSequence charSequence, int i17) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kz5.s1.a(i17, i17);
        int length = charSequence.length();
        java.util.ArrayList arrayList = new java.util.ArrayList((length / i17) + (length % i17 == 0 ? 0 : 1));
        int i18 = 0;
        while (true) {
            if (!(i18 >= 0 && i18 < length)) {
                return arrayList;
            }
            int i19 = i18 + i17;
            java.lang.CharSequence it = charSequence.subSequence(i18, (i19 < 0 || i19 > length) ? length : i19);
            kotlin.jvm.internal.o.g(it, "it");
            arrayList.add(it.toString());
            i18 = i19;
        }
    }

    public static final java.lang.String y0(java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Requested character count " + i17 + " is less than zero.").toString());
        }
        int length = str.length();
        if (i17 > length) {
            i17 = length;
        }
        java.lang.String substring = str.substring(i17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String z0(java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        if (i17 >= 0) {
            int length = str.length() - i17;
            return E0(str, length >= 0 ? length : 0);
        }
        throw new java.lang.IllegalArgumentException(("Requested character count " + i17 + " is less than zero.").toString());
    }
}
