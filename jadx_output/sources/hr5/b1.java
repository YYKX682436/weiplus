package hr5;

/* loaded from: classes15.dex */
public abstract class b1 {
    public static final zq5.v a(long j17, long j18, gr5.n contentScale, gr5.b alignment, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        if (zq5.h.b(j17) || zq5.h.b(j18)) {
            zq5.v vVar = zq5.v.f475094f;
            return zq5.v.f475094f;
        }
        if (i17 % 90 == 0) {
            return (zq5.v) ((jz5.n) new hr5.l(j17, j18, contentScale, alignment, i17, !z17, null).f284403o).getValue();
        }
        throw new java.lang.IllegalArgumentException("rotation must be multiple of 90".toString());
    }

    public static final zq5.n b(long j17, long j18, gr5.n contentScale, gr5.b alignment, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        if (zq5.h.b(j17) || zq5.h.b(j18)) {
            return zq5.n.f475081e;
        }
        if (i17 % 90 == 0) {
            return (zq5.n) ((jz5.n) new hr5.l(j17, j18, contentScale, alignment, i17, !z17, null).f284402n).getValue();
        }
        throw new java.lang.IllegalArgumentException("rotation must be multiple of 90".toString());
    }

    public static final long c(long j17, long j18) {
        long b17 = zq5.u.b(zq5.h.g(j18));
        return zq5.a0.a(zq5.l.b(b17) / ((int) (j17 >> 32)), zq5.l.c(b17) / zq5.g.b(j17));
    }

    public static final zq5.n d(long j17, long j18, gr5.n contentScale, gr5.b alignment, boolean z17, int i17, float f17, long j19) {
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        boolean b17 = zq5.h.b(j17);
        zq5.n nVar = zq5.n.f475081e;
        if (b17 || zq5.h.b(j18)) {
            return nVar;
        }
        if (!(i17 % 90 == 0)) {
            throw new java.lang.IllegalArgumentException("rotation must be multiple of 90".toString());
        }
        float f18 = -1;
        long a17 = zq5.m.a(zq5.l.b(j19) * f18, zq5.l.c(j19) * f18);
        long g17 = zq5.h.g(j17);
        float b18 = zq5.l.b(a17) / f17;
        float c17 = zq5.l.c(a17) / f17;
        float b19 = (zq5.l.b(a17) + zq5.t.b(g17)) / f17;
        float c18 = (zq5.l.c(a17) + zq5.t.a(g17)) / f17;
        long d17 = zq5.h.d(j18, i17);
        zq5.n other = b(j17, d17, contentScale, alignment, z17, 0);
        kotlin.jvm.internal.o.g(other, "other");
        float f19 = other.f475082a;
        if (!(b19 > f19 && other.f475084c > b18 && c18 > other.f475083b && other.f475085d > c17)) {
            return nVar;
        }
        float f27 = other.f475083b;
        return zq5.o.b(zq5.o.c(zq5.o.a(zq5.o.b(new zq5.n(b18 - f19, c17 - f27, b19 - f19, c18 - f27), zq5.u.a(other.f475084c - f19, other.f475085d - f27)), contentScale.a(zq5.h.g(d17), zq5.h.g(j17))), zq5.h.g(j18), i17), zq5.h.g(j18));
    }

    public static final long e(float f17, long j17, float f18, long j18, long j19, float f19) {
        long e17 = zq5.l.e(zq5.l.f(zq5.l.a(j17, f17), -1.0f), zq5.l.a(j18, f17));
        double d17 = (f19 * 3.141592653589793d) / 180;
        long f27 = zq5.l.f(zq5.l.f(zq5.l.d(zq5.m.a((float) ((zq5.l.b(e17) * java.lang.Math.cos(d17)) - (zq5.l.c(e17) * java.lang.Math.sin(d17))), (float) ((zq5.l.b(e17) * java.lang.Math.sin(d17)) + (zq5.l.c(e17) * java.lang.Math.cos(d17)))), zq5.l.e(zq5.l.a(j18, f18), zq5.l.a(j19, f17))), f18), -1.0f);
        if (!(zq5.l.b(f27) == -0.0f)) {
            if (!(zq5.l.c(f27) == -0.0f)) {
                return f27;
            }
        }
        return zq5.m.a(zq5.b.b(zq5.l.b(f27)), zq5.b.b(zq5.l.c(f27)));
    }

    public static final zq5.n f(long j17, long j18, gr5.n contentScale, gr5.b alignment, boolean z17, int i17, float f17, boolean z18, gr5.f containerWhitespace) {
        e06.e eVar;
        e06.e eVar2;
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(containerWhitespace, "containerWhitespace");
        if (zq5.h.b(j17) || zq5.h.b(j18)) {
            return zq5.n.f475081e;
        }
        if (!(i17 % 90 == 0)) {
            throw new java.lang.IllegalArgumentException(("rotation must be multiple of 90, rotation=" + i17).toString());
        }
        float f18 = containerWhitespace.f274921a;
        float f19 = containerWhitespace.f274924d;
        float f27 = containerWhitespace.f274923c;
        float f28 = containerWhitespace.f274922b;
        if (!(f18 >= 0.0f && f28 >= 0.0f && f27 >= 0.0f && f19 >= 0.0f)) {
            throw new java.lang.IllegalArgumentException(("containerWhitespace must be greater than or equal to 0f, containerWhitespace=" + containerWhitespace).toString());
        }
        gr5.b f29 = gr5.c.f(alignment, java.lang.Boolean.valueOf(z17));
        zq5.n b17 = b(j17, zq5.h.d(j18, i17), contentScale, f29, false, 0);
        if (z18) {
            b17 = zq5.o.b(b17, zq5.h.g(j17));
        }
        int i18 = (int) (j17 >> 32);
        int b18 = zq5.g.b(j17);
        kotlin.jvm.internal.o.g(b17, "<this>");
        float f37 = b17.f475082a * f17;
        float f38 = b17.f475083b * f17;
        float f39 = b17.f475084c * f17;
        float f47 = b17.f475085d * f17;
        float f48 = f39 - f37;
        float f49 = f47 - f38;
        if (a06.d.b(f48) >= i18) {
            float f57 = -1;
            float f58 = (f39 - i18) * f57;
            float f59 = f37 * f57;
            if (f58 > f59) {
                f58 = f59;
            }
            eVar = new e06.e(f58, f59);
        } else if (gr5.c.d(f29)) {
            eVar = new e06.e(0.0f, 0.0f);
        } else if (gr5.c.c(f29)) {
            float f66 = (f39 - i18) * (-1);
            eVar = new e06.e(f66, f66);
        } else {
            float f67 = (f37 - ((i18 - f48) / 2.0f)) * (-1);
            eVar = new e06.e(f67, f67);
        }
        if (a06.d.b(f49) >= b18) {
            float f68 = -1;
            float f69 = (f47 - b18) * f68;
            float f76 = f38 * f68;
            if (f69 > f76) {
                f69 = f76;
            }
            eVar2 = new e06.e(f69, f76);
        } else if (gr5.c.e(f29)) {
            eVar2 = new e06.e(0.0f, 0.0f);
        } else if (gr5.c.b(f29)) {
            float f77 = (f47 - b18) * (-1);
            eVar2 = new e06.e(f77, f77);
        } else {
            float f78 = (f38 - ((b18 - f49) / 2.0f)) * (-1);
            eVar2 = new e06.e(f78, f78);
        }
        float b19 = zq5.b.b(((java.lang.Number) eVar.h()).floatValue());
        float b27 = zq5.b.b(((java.lang.Number) eVar2.h()).floatValue());
        float b28 = zq5.b.b(((java.lang.Number) eVar.g()).floatValue());
        float b29 = zq5.b.b(((java.lang.Number) eVar2.g()).floatValue());
        float f79 = i18 - f48;
        if (f79 < 0.0f) {
            f79 = 0.0f;
        }
        float f86 = 2;
        float f87 = f79 / f86;
        float f88 = b18 - f49;
        if (f88 < 0.0f) {
            f88 = 0.0f;
        }
        float f89 = f88 / f86;
        float f96 = f27 - f87;
        if (f96 < 0.0f) {
            f96 = 0.0f;
        }
        float f97 = f19 - f89;
        if (f97 < 0.0f) {
            f97 = 0.0f;
        }
        float f98 = f18 - f87;
        if (f98 < 0.0f) {
            f98 = 0.0f;
        }
        float f99 = f28 - f89;
        return new zq5.n(zq5.b.b(b19 - f96), zq5.b.b(b27 - f97), zq5.b.b(b28 + f98), zq5.b.b(b29 + (f99 >= 0.0f ? f99 : 0.0f)));
    }

    public static final long g(long j17, long j18, gr5.n contentScale, gr5.b alignment, boolean z17, int i17, float f17, long j19, long j27) {
        long j28;
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        if (zq5.h.b(j17) || zq5.h.b(j18)) {
            return zq5.l.f475077b;
        }
        int i18 = i17 % 90;
        if (!(i18 == 0)) {
            throw new java.lang.IllegalArgumentException("rotation must be multiple of 90".toString());
        }
        if (zq5.h.b(j17) || zq5.h.b(j18)) {
            j28 = zq5.l.f475077b;
        } else {
            if (!(i18 == 0)) {
                throw new java.lang.IllegalArgumentException("rotation must be multiple of 90".toString());
            }
            long d17 = zq5.h.d(j18, i17);
            long d18 = zq5.m.d(zq5.m.c(j27, zq5.h.g(j18), i17), contentScale.a(zq5.h.g(d17), zq5.h.g(j17)));
            zq5.n b17 = b(j17, d17, contentScale, alignment, z17, 0);
            j28 = zq5.l.e(d18, zq5.m.a(b17.f475082a, b17.f475083b));
        }
        return zq5.h.b(j17) ? zq5.l.f475077b : zq5.l.e(zq5.l.f(j28, f17), j19);
    }
}
