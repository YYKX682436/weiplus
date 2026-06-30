package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class m0 {
    public static final long a(java.lang.String str, long j17, long j18, long j19) {
        java.lang.String str2;
        int i17 = kotlinx.coroutines.internal.n0.f310511a;
        try {
            str2 = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j17;
        }
        java.lang.Long j27 = r26.h0.j(str2);
        if (j27 == null) {
            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = j27.longValue();
        if (j18 <= longValue && longValue <= j19) {
            return longValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j18 + ".." + j19 + ", but is '" + longValue + '\'').toString());
    }

    public static int b(java.lang.String str, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            i18 = 1;
        }
        if ((i27 & 8) != 0) {
            i19 = Integer.MAX_VALUE;
        }
        return (int) a(str, i17, i18, i19);
    }
}
