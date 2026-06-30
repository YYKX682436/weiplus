package u0;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f423443a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f423444b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f423445c;

    public k(int i17, long[] keys, java.lang.Object[] values) {
        kotlin.jvm.internal.o.g(keys, "keys");
        kotlin.jvm.internal.o.g(values, "values");
        this.f423443a = i17;
        this.f423444b = keys;
        this.f423445c = values;
    }

    public final int a(long j17) {
        int i17 = this.f423443a - 1;
        if (i17 == -1) {
            return -1;
        }
        long[] jArr = this.f423444b;
        int i18 = 0;
        if (i17 == 0) {
            long j18 = jArr[0];
            if (j18 == j17) {
                return 0;
            }
            return j18 > j17 ? -2 : -1;
        }
        while (i18 <= i17) {
            int i19 = (i18 + i17) >>> 1;
            long j19 = jArr[i19] - j17;
            if (j19 < 0) {
                i18 = i19 + 1;
            } else {
                if (j19 <= 0) {
                    return i19;
                }
                i17 = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    public final u0.k b(long j17, java.lang.Object obj) {
        long[] jArr;
        int i17;
        java.lang.Object[] objArr = this.f423445c;
        int length = objArr.length;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= length) {
                break;
            }
            if (objArr[i19] != null) {
                i27++;
            }
            i19++;
        }
        int i28 = i27 + 1;
        long[] jArr2 = new long[i28];
        java.lang.Object[] objArr2 = new java.lang.Object[i28];
        if (i28 > 1) {
            int i29 = 0;
            while (true) {
                jArr = this.f423444b;
                i17 = this.f423443a;
                if (i18 >= i28 || i29 >= i17) {
                    break;
                }
                long j18 = jArr[i29];
                java.lang.Object obj2 = objArr[i29];
                if (j18 > j17) {
                    jArr2[i18] = j17;
                    objArr2[i18] = obj;
                    i18++;
                    break;
                }
                if (obj2 != null) {
                    jArr2[i18] = j18;
                    objArr2[i18] = obj2;
                    i18++;
                }
                i29++;
            }
            if (i29 == i17) {
                int i37 = i28 - 1;
                jArr2[i37] = j17;
                objArr2[i37] = obj;
            } else {
                while (i18 < i28) {
                    long j19 = jArr[i29];
                    java.lang.Object obj3 = objArr[i29];
                    if (obj3 != null) {
                        jArr2[i18] = j19;
                        objArr2[i18] = obj3;
                        i18++;
                    }
                    i29++;
                }
            }
        } else {
            jArr2[0] = j17;
            objArr2[0] = obj;
        }
        return new u0.k(i28, jArr2, objArr2);
    }
}
