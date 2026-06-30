package n0;

/* loaded from: classes14.dex */
public abstract class l4 {
    public static final boolean a(int[] iArr, int i17) {
        return (iArr[(i17 * 5) + 1] & 67108864) != 0;
    }

    public static final int b(int[] iArr, int i17) {
        return iArr[(i17 * 5) + 4];
    }

    public static final int c(int[] iArr, int i17) {
        return iArr[(i17 * 5) + 3];
    }

    public static final boolean d(int[] iArr, int i17) {
        return (iArr[(i17 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean e(int[] iArr, int i17) {
        return (iArr[(i17 * 5) + 1] & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
    }

    public static final boolean f(int[] iArr, int i17) {
        return (iArr[(i17 * 5) + 1] & 1073741824) != 0;
    }

    public static final int g(java.util.ArrayList arrayList, int i17, int i18) {
        int n17 = n(arrayList, i17, i18);
        return n17 >= 0 ? n17 : -(n17 + 1);
    }

    public static final int h(int[] iArr, int i17) {
        return iArr[(i17 * 5) + 1] & 67108863;
    }

    public static final int i(int[] iArr, int i17) {
        int i18 = i17 * 5;
        return iArr[i18 + 4] + m(iArr[i18 + 1] >> 30);
    }

    public static final int j(int[] iArr, int i17) {
        int i18 = i17 * 5;
        return iArr[i18 + 4] + m(iArr[i18 + 1] >> 28);
    }

    public static final void k(int[] iArr, int i17, int i18) {
        if (!(i18 >= 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        iArr[(i17 * 5) + 3] = i18;
    }

    public static final void l(int[] iArr, int i17, int i18) {
        if (!(i18 >= 0 && i18 < 67108863)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i19 = (i17 * 5) + 1;
        iArr[i19] = i18 | (iArr[i19] & (-67108864));
    }

    public static final int m(int i17) {
        switch (i17) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int n(java.util.ArrayList arrayList, int i17, int i18) {
        int size = arrayList.size() - 1;
        int i19 = 0;
        while (i19 <= size) {
            int i27 = (i19 + size) >>> 1;
            int i28 = ((n0.d) arrayList.get(i27)).f333477a;
            if (i28 < 0) {
                i28 += i18;
            }
            int i29 = kotlin.jvm.internal.o.i(i28, i17);
            if (i29 < 0) {
                i19 = i27 + 1;
            } else {
                if (i29 <= 0) {
                    return i27;
                }
                size = i27 - 1;
            }
        }
        return -(i19 + 1);
    }
}
