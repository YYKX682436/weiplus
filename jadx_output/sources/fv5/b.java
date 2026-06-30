package fv5;

/* loaded from: classes16.dex */
public class b implements java.lang.Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f267020g = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public int[] f267021d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f267022e;

    /* renamed from: f, reason: collision with root package name */
    public int f267023f;

    public b() {
        this(10);
    }

    public final int[] a(int[] iArr, int i17, int i18) {
        if (i17 > iArr.length) {
            throw new java.lang.IllegalArgumentException("Bad currentSize, originalSize: " + iArr.length + " currentSize: " + i17);
        }
        if (i17 + 1 > iArr.length) {
            int[] iArr2 = new int[i17 <= 4 ? 8 : (i17 >> 1) + i17];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i17);
            iArr = iArr2;
        }
        iArr[i17] = i18;
        return iArr;
    }

    public final int b(int[] iArr, int i17, int i18) {
        int i19 = i17 - 1;
        int i27 = 0;
        while (i27 <= i19) {
            int i28 = (i27 + i19) >>> 1;
            int i29 = iArr[i28];
            if (i29 < i18) {
                i27 = i28 + 1;
            } else {
                if (i29 <= i18) {
                    return i28;
                }
                i19 = i28 - 1;
            }
        }
        return ~i27;
    }

    public int c(int i17) {
        int b17 = b(this.f267021d, this.f267023f, i17);
        if (b17 < 0) {
            return 0;
        }
        return this.f267022e[b17];
    }

    public java.lang.Object clone() {
        try {
            fv5.b bVar = (fv5.b) super.clone();
            try {
                bVar.f267021d = (int[]) this.f267021d.clone();
                bVar.f267022e = (int[]) this.f267022e.clone();
                return bVar;
            } catch (java.lang.CloneNotSupportedException unused) {
                return bVar;
            }
        } catch (java.lang.CloneNotSupportedException unused2) {
            return null;
        }
    }

    public int d(int i17) {
        return b(this.f267021d, this.f267023f, i17);
    }

    public final int[] e(int[] iArr, int i17, int i18, int i19) {
        if (i17 > iArr.length) {
            throw new java.lang.IllegalArgumentException("Bad currentSize, originalSize: " + iArr.length + " currentSize: " + i17);
        }
        if (i17 + 1 <= iArr.length) {
            java.lang.System.arraycopy(iArr, i18, iArr, i18 + 1, i17 - i18);
            iArr[i18] = i19;
            return iArr;
        }
        int[] iArr2 = new int[i17 <= 4 ? 8 : i17 + (i17 >> 1)];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i18);
        iArr2[i18] = i19;
        java.lang.System.arraycopy(iArr, i18, iArr2, i18 + 1, iArr.length - i18);
        return iArr2;
    }

    public void f(int i17, int i18) {
        int b17 = b(this.f267021d, this.f267023f, i17);
        if (b17 >= 0) {
            this.f267022e[b17] = i18;
            return;
        }
        int i19 = ~b17;
        this.f267021d = e(this.f267021d, this.f267023f, i19, i17);
        this.f267022e = e(this.f267022e, this.f267023f, i19, i18);
        this.f267023f++;
    }

    public java.lang.String toString() {
        int i17 = this.f267023f;
        if (i17 <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17 * 28);
        sb6.append('{');
        for (int i18 = 0; i18 < this.f267023f; i18++) {
            if (i18 > 0) {
                sb6.append(", ");
            }
            sb6.append(this.f267021d[i18]);
            sb6.append('=');
            sb6.append(this.f267022e[i18]);
        }
        sb6.append('}');
        return sb6.toString();
    }

    public b(int i17) {
        if (i17 == 0) {
            int[] iArr = f267020g;
            this.f267021d = iArr;
            this.f267022e = iArr;
        } else {
            int[] iArr2 = new int[i17];
            this.f267021d = iArr2;
            this.f267022e = new int[iArr2.length];
        }
        this.f267023f = 0;
    }
}
