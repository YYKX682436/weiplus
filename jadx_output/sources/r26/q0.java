package r26;

/* loaded from: classes14.dex */
public abstract class q0 {
    public static final int a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        jz5.u b17 = b(str, 10);
        if (b17 != null) {
            return b17.f302848d;
        }
        r26.h0.g(str);
        throw null;
    }

    public static final jz5.u b(java.lang.String str, int i17) {
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(str, "<this>");
        r26.a.a(i17);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i27 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.o.i(charAt, 48) < 0) {
            i18 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i18 = 0;
        }
        int i28 = 119304647;
        int i29 = 119304647;
        while (i18 < length) {
            int digit = java.lang.Character.digit((int) str.charAt(i18), i17);
            if (digit < 0) {
                return null;
            }
            int i37 = i27 ^ Integer.MIN_VALUE;
            if (java.lang.Integer.compare(i37, i29 ^ Integer.MIN_VALUE) > 0) {
                if (i29 == i28) {
                    i19 = i18;
                    i29 = (int) (((-1) & io.flutter.embedding.android.KeyboardMap.kValueMask) / (i17 & io.flutter.embedding.android.KeyboardMap.kValueMask));
                    if (java.lang.Integer.compare(i37, i29 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            i19 = i18;
            int i38 = i27 * i17;
            int i39 = i38 + digit;
            if (java.lang.Integer.compare(i39 ^ Integer.MIN_VALUE, i38 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i18 = i19 + 1;
            i27 = i39;
            i28 = 119304647;
        }
        return new jz5.u(i27);
    }

    public static final long c(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<this>");
        jz5.x d17 = d(str, 10);
        if (d17 != null) {
            return d17.f302852d;
        }
        r26.h0.g(str);
        throw null;
    }

    public static final jz5.x d(java.lang.String str, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(str, "<this>");
        r26.a.a(i17);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.o.i(charAt, 48) >= 0) {
            i18 = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i18 = 1;
        }
        long j17 = i17;
        long j18 = 0;
        long j19 = 0;
        long j27 = 512409557603043100L;
        while (i18 < length) {
            int digit = java.lang.Character.digit((int) str.charAt(i18), i17);
            if (digit < 0) {
                return null;
            }
            int i19 = i18;
            long j28 = j19 ^ Long.MIN_VALUE;
            long j29 = j17;
            if (java.lang.Long.compare(j28, j27 ^ Long.MIN_VALUE) > 0) {
                if (j27 == 512409557603043100L) {
                    if (j29 < j18) {
                        j27 = com.tencent.wcdb.core.Database.DictDefaultMatchValue < (j29 ^ Long.MIN_VALUE) ? j18 : 1L;
                    } else {
                        long j37 = (com.tencent.wcdb.core.Database.DictDefaultMatchValue / j29) << 1;
                        j27 = j37 + ((((-1) - (j37 * j29)) ^ Long.MIN_VALUE) < (j29 ^ Long.MIN_VALUE) ? 0 : 1);
                    }
                    if (java.lang.Long.compare(j28, j27 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long j38 = j19 * j29;
            long j39 = (digit & io.flutter.embedding.android.KeyboardMap.kValueMask) + j38;
            if (java.lang.Long.compare(j39 ^ Long.MIN_VALUE, j38 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            j19 = j39;
            i18 = i19 + 1;
            j17 = j29;
            j18 = 0;
        }
        return new jz5.x(j19);
    }
}
