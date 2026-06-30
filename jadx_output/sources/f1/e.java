package f1;

/* loaded from: classes14.dex */
public abstract class e {
    public static f1.d a(f1.d dVar, f1.a0 whitePoint, f1.b adaptation, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            adaptation = f1.b.f258464b;
        }
        kotlin.jvm.internal.o.g(dVar, "<this>");
        kotlin.jvm.internal.o.g(whitePoint, "whitePoint");
        kotlin.jvm.internal.o.g(adaptation, "adaptation");
        if (!f1.c.a(dVar.f258472b, f1.c.f258466a)) {
            return dVar;
        }
        f1.y yVar = (f1.y) dVar;
        if (c(yVar.f258523d, whitePoint)) {
            return dVar;
        }
        float[] a17 = whitePoint.a();
        return new f1.y(yVar.f258471a, yVar.f258527h, whitePoint, f(b(adaptation.f258465a, yVar.f258523d.a(), a17), yVar.f258528i), yVar.f258530k, yVar.f258532m, yVar.f258524e, yVar.f258525f, yVar.f258526g, -1);
    }

    public static final float[] b(float[] matrix, float[] srcWhitePoint, float[] dstWhitePoint) {
        kotlin.jvm.internal.o.g(matrix, "matrix");
        kotlin.jvm.internal.o.g(srcWhitePoint, "srcWhitePoint");
        kotlin.jvm.internal.o.g(dstWhitePoint, "dstWhitePoint");
        h(matrix, srcWhitePoint);
        h(matrix, dstWhitePoint);
        return f(e(matrix), g(new float[]{dstWhitePoint[0] / srcWhitePoint[0], dstWhitePoint[1] / srcWhitePoint[1], dstWhitePoint[2] / srcWhitePoint[2]}, matrix));
    }

    public static final boolean c(f1.a0 a17, f1.a0 b17) {
        kotlin.jvm.internal.o.g(a17, "a");
        kotlin.jvm.internal.o.g(b17, "b");
        if (a17 == b17) {
            return true;
        }
        return java.lang.Math.abs(a17.f258462a - b17.f258462a) < 0.001f && java.lang.Math.abs(a17.f258463b - b17.f258463b) < 0.001f;
    }

    public static f1.k d(f1.d connect, f1.d destination, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            f1.h hVar = f1.h.f258476a;
            destination = f1.h.f258479d;
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        kotlin.jvm.internal.o.g(connect, "$this$connect");
        kotlin.jvm.internal.o.g(destination, "destination");
        if (connect == destination) {
            return new f1.i(connect, 1);
        }
        long j17 = f1.c.f258466a;
        return (f1.c.a(connect.f258472b, j17) && f1.c.a(destination.f258472b, j17)) ? new f1.j((f1.y) connect, (f1.y) destination, i17, null) : new f1.k(connect, destination, i17, null);
    }

    public static final float[] e(float[] m17) {
        kotlin.jvm.internal.o.g(m17, "m");
        float f17 = m17[0];
        float f18 = m17[3];
        float f19 = m17[6];
        float f27 = m17[1];
        float f28 = m17[4];
        float f29 = m17[7];
        float f37 = m17[2];
        float f38 = m17[5];
        float f39 = m17[8];
        float f47 = (f28 * f39) - (f29 * f38);
        float f48 = (f29 * f37) - (f27 * f39);
        float f49 = (f27 * f38) - (f28 * f37);
        float f57 = (f17 * f47) + (f18 * f48) + (f19 * f49);
        float[] fArr = new float[m17.length];
        fArr[0] = f47 / f57;
        fArr[1] = f48 / f57;
        fArr[2] = f49 / f57;
        fArr[3] = ((f19 * f38) - (f18 * f39)) / f57;
        fArr[4] = ((f39 * f17) - (f19 * f37)) / f57;
        fArr[5] = ((f37 * f18) - (f38 * f17)) / f57;
        fArr[6] = ((f18 * f29) - (f19 * f28)) / f57;
        fArr[7] = ((f19 * f27) - (f29 * f17)) / f57;
        fArr[8] = ((f17 * f28) - (f18 * f27)) / f57;
        return fArr;
    }

    public static final float[] f(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.o.g(lhs, "lhs");
        kotlin.jvm.internal.o.g(rhs, "rhs");
        float f17 = lhs[0] * rhs[0];
        float f18 = lhs[3];
        float f19 = rhs[1];
        float f27 = lhs[6];
        float f28 = rhs[2];
        float f29 = lhs[1];
        float f37 = rhs[0];
        float f38 = lhs[4];
        float f39 = lhs[7];
        float f47 = lhs[2] * f37;
        float f48 = lhs[5];
        float f49 = f47 + (rhs[1] * f48);
        float f57 = lhs[8];
        float f58 = lhs[0];
        float f59 = rhs[3] * f58;
        float f66 = rhs[4];
        float f67 = f59 + (f18 * f66);
        float f68 = rhs[5];
        float f69 = lhs[1];
        float f76 = rhs[3];
        float f77 = lhs[2];
        float f78 = f58 * rhs[6];
        float f79 = lhs[3];
        float f86 = rhs[7];
        float f87 = f78 + (f79 * f86);
        float f88 = rhs[8];
        float f89 = rhs[6];
        return new float[]{f17 + (f18 * f19) + (f27 * f28), (f29 * f37) + (f19 * f38) + (f39 * f28), f49 + (f28 * f57), f67 + (f27 * f68), (f69 * f76) + (f38 * f66) + (f39 * f68), (f76 * f77) + (f48 * rhs[4]) + (f68 * f57), f87 + (f27 * f88), (f69 * f89) + (lhs[4] * f86) + (f39 * f88), (f77 * f89) + (lhs[5] * rhs[7]) + (f57 * f88)};
    }

    public static final float[] g(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.o.g(lhs, "lhs");
        kotlin.jvm.internal.o.g(rhs, "rhs");
        float f17 = lhs[0];
        float f18 = lhs[1];
        float f19 = lhs[2];
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], rhs[3] * f17, rhs[4] * f18, rhs[5] * f19, f17 * rhs[6], f18 * rhs[7], f19 * rhs[8]};
    }

    public static final float[] h(float[] lhs, float[] rhs) {
        kotlin.jvm.internal.o.g(lhs, "lhs");
        kotlin.jvm.internal.o.g(rhs, "rhs");
        float f17 = rhs[0];
        float f18 = rhs[1];
        float f19 = rhs[2];
        rhs[0] = (lhs[0] * f17) + (lhs[3] * f18) + (lhs[6] * f19);
        rhs[1] = (lhs[1] * f17) + (lhs[4] * f18) + (lhs[7] * f19);
        rhs[2] = (lhs[2] * f17) + (lhs[5] * f18) + (lhs[8] * f19);
        return rhs;
    }
}
