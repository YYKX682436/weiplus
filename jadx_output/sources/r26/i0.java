package r26;

/* loaded from: classes12.dex */
public abstract class i0 extends r26.h0 {
    public static /* synthetic */ boolean A(java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return y(str, str2, z17);
    }

    public static final java.lang.String l(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!java.lang.Character.isLowerCase(charAt)) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        char titleCase = java.lang.Character.toTitleCase(charAt);
        if (titleCase != java.lang.Character.toUpperCase(charAt)) {
            sb6.append(titleCase);
        } else {
            java.lang.String substring = str.substring(0, 1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.lang.String upperCase = substring.toUpperCase(locale);
            kotlin.jvm.internal.o.f(upperCase, "toUpperCase(...)");
            sb6.append(upperCase);
        }
        java.lang.String substring2 = str.substring(1);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final byte[] m(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final boolean n(java.lang.String str, java.lang.String suffix, boolean z17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        return !z17 ? str.endsWith(suffix) : r(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean o(java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return n(str, str2, z17);
    }

    public static final boolean p(java.lang.String str, java.lang.String str2, boolean z17) {
        return str == null ? str2 == null : !z17 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean q(java.lang.String str, java.lang.String str2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return p(str, str2, z17);
    }

    public static final boolean r(java.lang.String str, int i17, java.lang.String other, int i18, int i19, boolean z17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(other, "other");
        return !z17 ? str.regionMatches(i17, other, i18, i19) : str.regionMatches(z17, i17, other, i18, i19);
    }

    public static final java.lang.String s(java.lang.CharSequence charSequence, int i17) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        int i18 = 1;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + i17 + '.').toString());
        }
        if (i17 == 0) {
            return "";
        }
        if (i17 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i17];
            for (int i19 = 0; i19 < i17; i19++) {
                cArr[i19] = charAt;
            }
            return new java.lang.String(cArr);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(charSequence.length() * i17);
        if (1 <= i17) {
            while (true) {
                sb6.append(charSequence);
                if (i18 == i17) {
                    break;
                }
                i18++;
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.d(sb7);
        return sb7;
    }

    public static final java.lang.String t(java.lang.String str, java.lang.String oldValue, java.lang.String newValue, boolean z17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(oldValue, "oldValue");
        kotlin.jvm.internal.o.g(newValue, "newValue");
        int i17 = 0;
        int I = r26.n0.I(str, oldValue, 0, z17);
        if (I < 0) {
            return str;
        }
        int length = oldValue.length();
        int i18 = length >= 1 ? length : 1;
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(length2);
        do {
            sb6.append((java.lang.CharSequence) str, i17, I);
            sb6.append(newValue);
            i17 = I + length;
            if (I >= str.length()) {
                break;
            }
            I = r26.n0.I(str, oldValue, I + i18, z17);
        } while (I > 0);
        sb6.append((java.lang.CharSequence) str, i17, str.length());
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static java.lang.String u(java.lang.String str, char c17, char c18, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(str, "<this>");
        if (!z17) {
            java.lang.String replace = str.replace(c17, c18);
            kotlin.jvm.internal.o.f(replace, "replace(...)");
            return replace;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        for (int i18 = 0; i18 < str.length(); i18++) {
            char charAt = str.charAt(i18);
            if (r26.b.c(charAt, c17, z17)) {
                charAt = c18;
            }
            sb6.append(charAt);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static /* synthetic */ java.lang.String v(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return t(str, str2, str3, z17);
    }

    public static final java.lang.String w(java.lang.String str, java.lang.String oldValue, java.lang.String newValue, boolean z17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(oldValue, "oldValue");
        kotlin.jvm.internal.o.g(newValue, "newValue");
        int L = r26.n0.L(str, oldValue, 0, z17, 2, null);
        return L < 0 ? str : r26.n0.b0(str, L, oldValue.length() + L, newValue).toString();
    }

    public static /* synthetic */ java.lang.String x(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        return w(str, str2, str3, z17);
    }

    public static final boolean y(java.lang.String str, java.lang.String prefix, boolean z17) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        return !z17 ? str.startsWith(prefix) : r(str, 0, prefix, 0, prefix.length(), z17);
    }

    public static boolean z(java.lang.String str, java.lang.String prefix, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        return !z18 ? str.startsWith(prefix, i17) : r(str, i17, prefix, 0, prefix.length(), z18);
    }
}
