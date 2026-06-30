package t16;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final t16.i f414615a = new t16.i();

    public final t16.b a(java.util.List list, o06.v0 v0Var, l06.r rVar) {
        java.util.List S0 = kz5.n0.S0(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = S0.iterator();
        while (it.hasNext()) {
            t16.g b17 = b(it.next(), null);
            if (b17 != null) {
                arrayList.add(b17);
            }
        }
        if (v0Var == null) {
            return new t16.b(arrayList, new t16.h(rVar));
        }
        f26.z0 r17 = v0Var.h().r(rVar);
        kotlin.jvm.internal.o.f(r17, "getPrimitiveArrayKotlinType(...)");
        return new t16.d0(arrayList, r17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [t16.i] */
    public final t16.g b(java.lang.Object obj, o06.v0 v0Var) {
        if (obj instanceof java.lang.Byte) {
            return new t16.d(((java.lang.Number) obj).byteValue());
        }
        if (obj instanceof java.lang.Short) {
            return new t16.a0(((java.lang.Number) obj).shortValue());
        }
        if (obj instanceof java.lang.Integer) {
            return new t16.o(((java.lang.Number) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            return new t16.y(((java.lang.Number) obj).longValue());
        }
        if (obj instanceof java.lang.Character) {
            return new t16.e(((java.lang.Character) obj).charValue());
        }
        if (obj instanceof java.lang.Float) {
            return new t16.n(((java.lang.Number) obj).floatValue());
        }
        if (obj instanceof java.lang.Double) {
            return new t16.j(((java.lang.Number) obj).doubleValue());
        }
        if (obj instanceof java.lang.Boolean) {
            return new t16.c(((java.lang.Boolean) obj).booleanValue());
        }
        if (obj instanceof java.lang.String) {
            return new t16.b0((java.lang.String) obj);
        }
        if (obj instanceof byte[]) {
            return a(kz5.z.v0((byte[]) obj), v0Var, l06.r.f314898n);
        }
        boolean z17 = obj instanceof short[];
        int i17 = 0;
        ?? r27 = kz5.p0.f313996d;
        if (z17) {
            short[] sArr = (short[]) obj;
            kotlin.jvm.internal.o.g(sArr, "<this>");
            int length = sArr.length;
            if (length != 0) {
                if (length != 1) {
                    r27 = new java.util.ArrayList(sArr.length);
                    int length2 = sArr.length;
                    while (i17 < length2) {
                        r27.add(java.lang.Short.valueOf(sArr[i17]));
                        i17++;
                    }
                } else {
                    r27 = kz5.b0.c(java.lang.Short.valueOf(sArr[0]));
                }
            }
            return a(r27, v0Var, l06.r.f314899o);
        }
        if (obj instanceof int[]) {
            return a(kz5.z.x0((int[]) obj), v0Var, l06.r.f314900p);
        }
        if (obj instanceof long[]) {
            return a(kz5.z.y0((long[]) obj), v0Var, l06.r.f314902r);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            kotlin.jvm.internal.o.g(cArr, "<this>");
            int length3 = cArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    r27 = new java.util.ArrayList(cArr.length);
                    int length4 = cArr.length;
                    while (i17 < length4) {
                        r27.add(java.lang.Character.valueOf(cArr[i17]));
                        i17++;
                    }
                } else {
                    r27 = kz5.b0.c(java.lang.Character.valueOf(cArr[0]));
                }
            }
            return a(r27, v0Var, l06.r.f314897m);
        }
        if (obj instanceof float[]) {
            return a(kz5.z.w0((float[]) obj), v0Var, l06.r.f314901q);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            kotlin.jvm.internal.o.g(dArr, "<this>");
            int length5 = dArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    r27 = new java.util.ArrayList(dArr.length);
                    int length6 = dArr.length;
                    while (i17 < length6) {
                        r27.add(java.lang.Double.valueOf(dArr[i17]));
                        i17++;
                    }
                } else {
                    r27 = kz5.b0.c(java.lang.Double.valueOf(dArr[0]));
                }
            }
            return a(r27, v0Var, l06.r.f314903s);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new t16.z();
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        kotlin.jvm.internal.o.g(zArr, "<this>");
        int length7 = zArr.length;
        if (length7 != 0) {
            if (length7 != 1) {
                r27 = new java.util.ArrayList(zArr.length);
                int length8 = zArr.length;
                while (i17 < length8) {
                    r27.add(java.lang.Boolean.valueOf(zArr[i17]));
                    i17++;
                }
            } else {
                r27 = kz5.b0.c(java.lang.Boolean.valueOf(zArr[0]));
            }
        }
        return a(r27, v0Var, l06.r.f314896i);
    }
}
