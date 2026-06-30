package p2;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final p2.b f351373b = new p2.b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f351374c = {18, 20, 17, 15};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f351375d = {65535, 262143, 32767, 8191};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f351376e = {32767, 8191, 65535, 262143};

    /* renamed from: a, reason: collision with root package name */
    public final long f351377a;

    public static long a(long j17, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 1) != 0) {
            i17 = j(j17);
        }
        if ((i28 & 2) != 0) {
            i18 = h(j17);
        }
        if ((i28 & 4) != 0) {
            i19 = i(j17);
        }
        if ((i28 & 8) != 0) {
            i27 = g(j17);
        }
        boolean z17 = true;
        if (!(i19 >= 0 && i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("minHeight(" + i19 + ") and minWidth(" + i17 + ") must be >= 0").toString());
        }
        if (!(i18 >= i17 || i18 == Integer.MAX_VALUE)) {
            throw new java.lang.IllegalArgumentException(("maxWidth(" + i18 + ") must be >= minWidth(" + i17 + ')').toString());
        }
        if (i27 < i19 && i27 != Integer.MAX_VALUE) {
            z17 = false;
        }
        if (z17) {
            return f351373b.b(i17, i18, i19, i27);
        }
        throw new java.lang.IllegalArgumentException(("maxHeight(" + i27 + ") must be >= minHeight(" + i19 + ')').toString());
    }

    public static final boolean b(long j17, long j18) {
        return j17 == j18;
    }

    public static final boolean c(long j17) {
        int i17 = (int) (3 & j17);
        return (((int) (j17 >> (f351374c[i17] + 31))) & f351376e[i17]) != 0;
    }

    public static final boolean d(long j17) {
        return (((int) (j17 >> 33)) & f351375d[(int) (3 & j17)]) != 0;
    }

    public static final boolean e(long j17) {
        return g(j17) == i(j17);
    }

    public static final boolean f(long j17) {
        return h(j17) == j(j17);
    }

    public static final int g(long j17) {
        int i17 = (int) (3 & j17);
        int i18 = ((int) (j17 >> (f351374c[i17] + 31))) & f351376e[i17];
        if (i18 == 0) {
            return Integer.MAX_VALUE;
        }
        return i18 - 1;
    }

    public static final int h(long j17) {
        int i17 = ((int) (j17 >> 33)) & f351375d[(int) (3 & j17)];
        if (i17 == 0) {
            return Integer.MAX_VALUE;
        }
        return i17 - 1;
    }

    public static final int i(long j17) {
        int i17 = (int) (3 & j17);
        return ((int) (j17 >> f351374c[i17])) & f351376e[i17];
    }

    public static final int j(long j17) {
        return ((int) (j17 >> 2)) & f351375d[(int) (3 & j17)];
    }

    public static java.lang.String k(long j17) {
        int h17 = h(j17);
        java.lang.String valueOf = h17 == Integer.MAX_VALUE ? "Infinity" : java.lang.String.valueOf(h17);
        int g17 = g(j17);
        return "Constraints(minWidth = " + j(j17) + ", maxWidth = " + valueOf + ", minHeight = " + i(j17) + ", maxHeight = " + (g17 != Integer.MAX_VALUE ? java.lang.String.valueOf(g17) : "Infinity") + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p2.c) {
            return this.f351377a == ((p2.c) obj).f351377a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f351377a);
    }

    public java.lang.String toString() {
        return k(this.f351377a);
    }
}
