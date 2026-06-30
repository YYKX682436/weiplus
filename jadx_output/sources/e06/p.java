package e06;

/* loaded from: classes10.dex */
public abstract class p extends e06.o {
    public static final int b(int i17, int i18) {
        return i17 < i18 ? i18 : i17;
    }

    public static final long c(long j17, long j18) {
        return j17 < j18 ? j18 : j17;
    }

    public static final double d(double d17, double d18, double d19) {
        if (d18 <= d19) {
            return d17 < d18 ? d18 : d17 > d19 ? d19 : d17;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d19 + " is less than minimum " + d18 + '.');
    }

    public static final float e(float f17, float f18, float f19) {
        if (f18 <= f19) {
            return f17 < f18 ? f18 : f17 > f19 ? f19 : f17;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f19 + " is less than minimum " + f18 + '.');
    }

    public static final int f(int i17, int i18, int i19) {
        if (i18 <= i19) {
            return i17 < i18 ? i18 : i17 > i19 ? i19 : i17;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i19 + " is less than minimum " + i18 + '.');
    }

    public static final int g(int i17, e06.h range) {
        kotlin.jvm.internal.o.g(range, "range");
        if (range instanceof e06.f) {
            return ((java.lang.Number) i(java.lang.Integer.valueOf(i17), (e06.f) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i17 < ((java.lang.Number) range.h()).intValue() ? ((java.lang.Number) range.h()).intValue() : i17 > ((java.lang.Number) range.g()).intValue() ? ((java.lang.Number) range.g()).intValue() : i17;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final long h(long j17, long j18, long j19) {
        if (j18 <= j19) {
            return j17 < j18 ? j18 : j17 > j19 ? j19 : j17;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j19 + " is less than minimum " + j18 + '.');
    }

    public static final java.lang.Comparable i(java.lang.Comparable comparable, e06.f range) {
        kotlin.jvm.internal.o.g(comparable, "<this>");
        kotlin.jvm.internal.o.g(range, "range");
        if (!range.isEmpty()) {
            return (!range.d(comparable, range.h()) || range.d(range.h(), comparable)) ? (!range.d(range.g(), comparable) || range.d(comparable, range.g())) ? comparable : range.g() : range.h();
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static final int j(e06.k kVar, c06.e random) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        kotlin.jvm.internal.o.g(random, "random");
        try {
            return c06.f.c(random, kVar);
        } catch (java.lang.IllegalArgumentException e17) {
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    public static final long k(e06.n nVar, c06.e random) {
        kotlin.jvm.internal.o.g(nVar, "<this>");
        kotlin.jvm.internal.o.g(random, "random");
        try {
            return c06.f.d(random, nVar);
        } catch (java.lang.IllegalArgumentException e17) {
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    public static final e06.i l(e06.i iVar, int i17) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        e06.o.a(i17 > 0, java.lang.Integer.valueOf(i17));
        if (iVar.f246211f <= 0) {
            i17 = -i17;
        }
        return new e06.i(iVar.f246209d, iVar.f246210e, i17);
    }

    public static final e06.k m(int i17, int i18) {
        if (i18 > Integer.MIN_VALUE) {
            return new e06.k(i17, i18 - 1);
        }
        e06.k kVar = e06.k.f246216g;
        return e06.k.f246216g;
    }
}
