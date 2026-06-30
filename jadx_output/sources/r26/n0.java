package r26;

/* loaded from: classes12.dex */
public abstract class n0 extends r26.i0 {
    public static final boolean B(java.lang.CharSequence charSequence, java.lang.CharSequence other, boolean z17) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(other, "other");
        return !(other instanceof java.lang.String) ? J(charSequence, other, 0, charSequence.length(), z17, false) < 0 : L(charSequence, (java.lang.String) other, 0, z17, 2, null) < 0;
    }

    public static boolean C(java.lang.CharSequence charSequence, char c17, boolean z17, int i17, java.lang.Object obj) {
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        return K(charSequence, c17, 0, z18, 2, null) >= 0;
    }

    public static /* synthetic */ boolean D(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return B(charSequence, charSequence2, z17);
    }

    public static boolean E(java.lang.CharSequence charSequence, char c17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        return charSequence.length() > 0 && r26.b.c(charSequence.charAt(H(charSequence)), c17, z17);
    }

    public static boolean F(java.lang.CharSequence charSequence, java.lang.CharSequence suffix, boolean z17, int i17, java.lang.Object obj) {
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        return (!z18 && (charSequence instanceof java.lang.String) && (suffix instanceof java.lang.String)) ? r26.i0.n((java.lang.String) charSequence, (java.lang.String) suffix, false) : U(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z18);
    }

    public static final e06.k G(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        return new e06.k(0, charSequence.length() - 1);
    }

    public static final int H(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int I(java.lang.CharSequence charSequence, java.lang.String string, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(string, "string");
        return (z17 || !(charSequence instanceof java.lang.String)) ? J(charSequence, string, i17, charSequence.length(), z17, false) : ((java.lang.String) charSequence).indexOf(string, i17);
    }

    public static final int J(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i17, int i18, boolean z17, boolean z18) {
        e06.i iVar;
        if (z18) {
            int H = H(charSequence);
            if (i17 > H) {
                i17 = H;
            }
            if (i18 < 0) {
                i18 = 0;
            }
            iVar = new e06.i(i17, i18, -1);
        } else {
            if (i17 < 0) {
                i17 = 0;
            }
            int length = charSequence.length();
            if (i18 > length) {
                i18 = length;
            }
            iVar = new e06.k(i17, i18);
        }
        boolean z19 = charSequence instanceof java.lang.String;
        int i19 = iVar.f246209d;
        int i27 = iVar.f246211f;
        int i28 = iVar.f246210e;
        if (z19 && (charSequence2 instanceof java.lang.String)) {
            if ((i27 > 0 && i19 <= i28) || (i27 < 0 && i28 <= i19)) {
                while (!r26.i0.r((java.lang.String) charSequence2, 0, (java.lang.String) charSequence, i19, charSequence2.length(), z17)) {
                    if (i19 != i28) {
                        i19 += i27;
                    }
                }
                return i19;
            }
        } else if ((i27 > 0 && i19 <= i28) || (i27 < 0 && i28 <= i19)) {
            while (!U(charSequence2, 0, charSequence, i19, charSequence2.length(), z17)) {
                if (i19 != i28) {
                    i19 += i27;
                }
            }
            return i19;
        }
        return -1;
    }

    public static int K(java.lang.CharSequence charSequence, char c17, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        return (z17 || !(charSequence instanceof java.lang.String)) ? M(charSequence, new char[]{c17}, i17, z17) : ((java.lang.String) charSequence).indexOf(c17, i17);
    }

    public static /* synthetic */ int L(java.lang.CharSequence charSequence, java.lang.String str, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        return I(charSequence, str, i17, z17);
    }

    public static final int M(java.lang.CharSequence charSequence, char[] chars, int i17, boolean z17) {
        boolean z18;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(chars, "chars");
        if (!z17 && chars.length == 1 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).indexOf(kz5.z.k0(chars), i17);
        }
        if (i17 < 0) {
            i17 = 0;
        }
        int H = H(charSequence);
        if (i17 > H) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i17);
            int length = chars.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z18 = false;
                    break;
                }
                if (r26.b.c(chars[i18], charAt, z17)) {
                    z18 = true;
                    break;
                }
                i18++;
            }
            if (z18) {
                return i17;
            }
            if (i17 == H) {
                return -1;
            }
            i17++;
        }
    }

    public static final boolean N(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        for (int i17 = 0; i17 < charSequence.length(); i17++) {
            if (!r26.a.b(charSequence.charAt(i17))) {
                return false;
            }
        }
        return true;
    }

    public static int O(java.lang.CharSequence charSequence, char c17, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = H(charSequence);
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        if (!z17 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).lastIndexOf(c17, i17);
        }
        char[] cArr = {c17};
        if (!z17 && (charSequence instanceof java.lang.String)) {
            return ((java.lang.String) charSequence).lastIndexOf(kz5.z.k0(cArr), i17);
        }
        int H = H(charSequence);
        if (i17 > H) {
            i17 = H;
        }
        while (-1 < i17) {
            if (r26.b.c(cArr[0], charSequence.charAt(i17), z17)) {
                return i17;
            }
            i17--;
        }
        return -1;
    }

    public static int P(java.lang.CharSequence charSequence, java.lang.String string, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = H(charSequence);
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(string, "string");
        return (z18 || !(charSequence instanceof java.lang.String)) ? J(charSequence, string, i19, 0, z18, true) : ((java.lang.String) charSequence).lastIndexOf(string, i19);
    }

    public static final java.util.List Q(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        return q26.h0.y(h0(charSequence, new java.lang.String[]{com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, "\n", "\r"}, false, 0, 6, null));
    }

    public static final java.lang.String R(java.lang.String str, int i17, char c17) {
        java.lang.CharSequence charSequence;
        kotlin.jvm.internal.o.g(str, "<this>");
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException("Desired length " + i17 + " is less than zero.");
        }
        if (i17 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17);
            int length = i17 - str.length();
            int i18 = 1;
            if (1 <= length) {
                while (true) {
                    sb6.append(c17);
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                }
            }
            sb6.append((java.lang.CharSequence) str);
            charSequence = sb6;
        }
        return charSequence.toString();
    }

    public static q26.n S(java.lang.CharSequence charSequence, char[] cArr, int i17, boolean z17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        c0(i18);
        return new r26.e(charSequence, i17, i18, new r26.j0(cArr, z17));
    }

    public static q26.n T(java.lang.CharSequence charSequence, java.lang.String[] strArr, int i17, boolean z17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = 0;
        }
        if ((i19 & 4) != 0) {
            z17 = false;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        c0(i18);
        return new r26.e(charSequence, i17, i18, new r26.k0(kz5.v.f(strArr), z17));
    }

    public static final boolean U(java.lang.CharSequence charSequence, int i17, java.lang.CharSequence other, int i18, int i19, boolean z17) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(other, "other");
        if (i18 < 0 || i17 < 0 || i17 > charSequence.length() - i19 || i18 > other.length() - i19) {
            return false;
        }
        for (int i27 = 0; i27 < i19; i27++) {
            if (!r26.b.c(charSequence.charAt(i17 + i27), other.charAt(i18 + i27), z17)) {
                return false;
            }
        }
        return true;
    }

    public static final java.lang.CharSequence V(java.lang.CharSequence charSequence, java.lang.CharSequence prefix) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        return j0(charSequence, prefix, false, 2, null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String W(java.lang.String str, java.lang.CharSequence prefix) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        if (!j0(str, prefix, false, 2, null)) {
            return str;
        }
        java.lang.String substring = str.substring(prefix.length());
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.CharSequence X(java.lang.CharSequence charSequence, int i17, int i18) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        if (i18 >= i17) {
            if (i18 == i17) {
                return charSequence.subSequence(0, charSequence.length());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(charSequence.length() - (i18 - i17));
            sb6.append(charSequence, 0, i17);
            sb6.append(charSequence, i18, charSequence.length());
            return sb6;
        }
        throw new java.lang.IndexOutOfBoundsException("End index (" + i18 + ") is less than start index (" + i17 + ").");
    }

    public static final java.lang.CharSequence Y(java.lang.CharSequence charSequence, java.lang.CharSequence suffix) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        return F(charSequence, suffix, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final java.lang.String Z(java.lang.String str, java.lang.CharSequence suffix) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        if (!F(str, suffix, false, 2, null)) {
            return str;
        }
        java.lang.String substring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String a0(java.lang.String str, java.lang.CharSequence prefix, java.lang.CharSequence suffix) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !j0(str, prefix, false, 2, null) || !F(str, suffix, false, 2, null)) {
            return str;
        }
        java.lang.String substring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.CharSequence b0(java.lang.CharSequence charSequence, int i17, int i18, java.lang.CharSequence replacement) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(replacement, "replacement");
        if (i18 >= i17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(charSequence, 0, i17);
            sb6.append(replacement);
            sb6.append(charSequence, i18, charSequence.length());
            return sb6;
        }
        throw new java.lang.IndexOutOfBoundsException("End index (" + i18 + ") is less than start index (" + i17 + ").");
    }

    public static final void c0(int i17) {
        if (i17 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Limit must be non-negative, but was " + i17).toString());
    }

    public static final java.util.List d0(java.lang.CharSequence charSequence, java.lang.String str, boolean z17, int i17) {
        c0(i17);
        int i18 = 0;
        int I = I(charSequence, str, 0, z17);
        if (I == -1 || i17 == 1) {
            return kz5.b0.c(charSequence.toString());
        }
        boolean z18 = i17 > 0;
        int i19 = 10;
        if (z18 && i17 <= 10) {
            i19 = i17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i19);
        do {
            arrayList.add(charSequence.subSequence(i18, I).toString());
            i18 = str.length() + I;
            if (z18 && arrayList.size() == i17 - 1) {
                break;
            }
            I = I(charSequence, str, i18, z17);
        } while (I != -1);
        arrayList.add(charSequence.subSequence(i18, charSequence.length()).toString());
        return arrayList;
    }

    public static java.util.List e0(java.lang.CharSequence charSequence, char[] delimiters, boolean z17, int i17, int i18, java.lang.Object obj) {
        boolean z18 = (i18 & 2) != 0 ? false : z17;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return d0(charSequence, java.lang.String.valueOf(delimiters[0]), z18, i19);
        }
        q26.a0 a0Var = new q26.a0(S(charSequence, delimiters, 0, z18, i19, 2, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a0Var, 10));
        java.util.Iterator it = a0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(k0(charSequence, (e06.k) it.next()));
        }
        return arrayList;
    }

    public static java.util.List f0(java.lang.CharSequence charSequence, java.lang.String[] delimiters, boolean z17, int i17, int i18, java.lang.Object obj) {
        boolean z18 = (i18 & 2) != 0 ? false : z17;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(delimiters, "delimiters");
        if (delimiters.length == 1) {
            java.lang.String str = delimiters[0];
            if (!(str.length() == 0)) {
                return d0(charSequence, str, z18, i19);
            }
        }
        q26.a0 a0Var = new q26.a0(T(charSequence, delimiters, 0, z18, i19, 2, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a0Var, 10));
        java.util.Iterator it = a0Var.iterator();
        while (it.hasNext()) {
            arrayList.add(k0(charSequence, (e06.k) it.next()));
        }
        return arrayList;
    }

    public static q26.n g0(java.lang.CharSequence charSequence, char[] delimiters, boolean z17, int i17, int i18, java.lang.Object obj) {
        boolean z18 = (i18 & 2) != 0 ? false : z17;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(delimiters, "delimiters");
        return q26.h0.o(S(charSequence, delimiters, 0, z18, i19, 2, null), new r26.m0(charSequence));
    }

    public static q26.n h0(java.lang.CharSequence charSequence, java.lang.String[] delimiters, boolean z17, int i17, int i18, java.lang.Object obj) {
        boolean z18 = (i18 & 2) != 0 ? false : z17;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(delimiters, "delimiters");
        return q26.h0.o(T(charSequence, delimiters, 0, z18, i19, 2, null), new r26.l0(charSequence));
    }

    public static boolean i0(java.lang.CharSequence charSequence, char c17, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        return charSequence.length() > 0 && r26.b.c(charSequence.charAt(0), c17, z17);
    }

    public static boolean j0(java.lang.CharSequence charSequence, java.lang.CharSequence prefix, boolean z17, int i17, java.lang.Object obj) {
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        return (!z18 && (charSequence instanceof java.lang.String) && (prefix instanceof java.lang.String)) ? r26.i0.y((java.lang.String) charSequence, (java.lang.String) prefix, false) : U(charSequence, 0, prefix, 0, prefix.length(), z18);
    }

    public static final java.lang.String k0(java.lang.CharSequence charSequence, e06.k range) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        kotlin.jvm.internal.o.g(range, "range");
        return charSequence.subSequence(range.h().intValue(), range.g().intValue() + 1).toString();
    }

    public static final java.lang.String l0(java.lang.String str, e06.k range) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(range, "range");
        java.lang.String substring = str.substring(range.h().intValue(), range.g().intValue() + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String m0(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(delimiter, "delimiter");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int L = L(str, delimiter, 0, false, 6, null);
        if (L == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(L + delimiter.length(), str.length());
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static java.lang.String n0(java.lang.String str, char c17, java.lang.String missingDelimiterValue, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            missingDelimiterValue = str;
        }
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int K = K(str, c17, 0, false, 6, null);
        if (K == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(K + 1, str.length());
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String o0(java.lang.String str, char c17, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int O = O(str, c17, 0, false, 6, null);
        if (O == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(O + 1, str.length());
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String p0(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(delimiter, "delimiter");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int P = P(str, delimiter, 0, false, 6, null);
        if (P == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(P + delimiter.length(), str.length());
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String q0(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(delimiter, "delimiter");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int L = L(str, delimiter, 0, false, 6, null);
        if (L == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(0, L);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static java.lang.String r0(java.lang.String str, char c17, java.lang.String missingDelimiterValue, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            missingDelimiterValue = str;
        }
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int K = K(str, c17, 0, false, 6, null);
        if (K == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(0, K);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.String s0(java.lang.String str, java.lang.String delimiter, java.lang.String missingDelimiterValue) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(delimiter, "delimiter");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int P = P(str, delimiter, 0, false, 6, null);
        if (P == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(0, P);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static java.lang.String t0(java.lang.String str, char c17, java.lang.String missingDelimiterValue, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            missingDelimiterValue = str;
        }
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(missingDelimiterValue, "missingDelimiterValue");
        int O = O(str, c17, 0, false, 6, null);
        if (O == -1) {
            return missingDelimiterValue;
        }
        java.lang.String substring = str.substring(0, O);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static final java.lang.CharSequence u0(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i17 = 0;
        boolean z17 = false;
        while (i17 <= length) {
            boolean b17 = r26.a.b(charSequence.charAt(!z17 ? i17 : length));
            if (z17) {
                if (!b17) {
                    break;
                }
                length--;
            } else if (b17) {
                i17++;
            } else {
                z17 = true;
            }
        }
        return charSequence.subSequence(i17, length + 1);
    }

    public static final java.lang.String v0(java.lang.String str, char... chars) {
        java.lang.CharSequence charSequence;
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i17 = length - 1;
                if (!kz5.z.E(chars, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i17 < 0) {
                    break;
                }
                length = i17;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static final java.lang.CharSequence w0(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.o.g(charSequence, "<this>");
        int length = charSequence.length();
        for (int i17 = 0; i17 < length; i17++) {
            if (!r26.a.b(charSequence.charAt(i17))) {
                return charSequence.subSequence(i17, charSequence.length());
            }
        }
        return "";
    }
}
