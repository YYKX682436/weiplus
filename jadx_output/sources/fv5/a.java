package fv5;

/* loaded from: classes15.dex */
public class a implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public int[] f267017d = new int[10];

    /* renamed from: e, reason: collision with root package name */
    public boolean[] f267018e = new boolean[10];

    /* renamed from: f, reason: collision with root package name */
    public int f267019f = 0;

    public boolean a(int i17) {
        int i18;
        int[] iArr = this.f267017d;
        int i19 = this.f267019f - 1;
        int i27 = 0;
        while (true) {
            if (i27 > i19) {
                i18 = ~i27;
                break;
            }
            i18 = (i27 + i19) >>> 1;
            int i28 = iArr[i18];
            if (i28 >= i17) {
                if (i28 <= i17) {
                    break;
                }
                i19 = i18 - 1;
            } else {
                i27 = i18 + 1;
            }
        }
        return i18 >= 0;
    }

    public void b(int i17, boolean z17) {
        int i18;
        int[] iArr = this.f267017d;
        int i19 = this.f267019f - 1;
        int i27 = 0;
        while (true) {
            if (i27 <= i19) {
                i18 = (i27 + i19) >>> 1;
                int i28 = iArr[i18];
                if (i28 >= i17) {
                    if (i28 <= i17) {
                        break;
                    } else {
                        i19 = i18 - 1;
                    }
                } else {
                    i27 = i18 + 1;
                }
            } else {
                i18 = ~i27;
                break;
            }
        }
        if (i18 >= 0) {
            this.f267018e[i18] = z17;
            return;
        }
        int i29 = ~i18;
        int[] iArr2 = this.f267017d;
        int i37 = this.f267019f;
        if (i37 > iArr2.length) {
            throw new java.lang.IllegalArgumentException("Bad currentSize, originalSize: " + iArr2.length + " currentSize: " + i37);
        }
        if (i37 + 1 <= iArr2.length) {
            java.lang.System.arraycopy(iArr2, i29, iArr2, i29 + 1, i37 - i29);
            iArr2[i29] = i17;
        } else {
            int[] iArr3 = new int[i37 <= 4 ? 8 : i37 + (i37 >> 1)];
            java.lang.System.arraycopy(iArr2, 0, iArr3, 0, i29);
            iArr3[i29] = i17;
            java.lang.System.arraycopy(iArr2, i29, iArr3, i29 + 1, iArr2.length - i29);
            iArr2 = iArr3;
        }
        this.f267017d = iArr2;
        boolean[] zArr = this.f267018e;
        int i38 = this.f267019f;
        if (i38 > zArr.length) {
            throw new java.lang.IllegalArgumentException("Bad currentSize, originalSize: " + zArr.length + " currentSize: " + i38);
        }
        if (i38 + 1 <= zArr.length) {
            java.lang.System.arraycopy(zArr, i29, zArr, i29 + 1, i38 - i29);
            zArr[i29] = z17;
        } else {
            boolean[] zArr2 = new boolean[i38 > 4 ? i38 + (i38 >> 1) : 8];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i29);
            zArr2[i29] = z17;
            java.lang.System.arraycopy(zArr, i29, zArr2, i29 + 1, zArr.length - i29);
            zArr = zArr2;
        }
        this.f267018e = zArr;
        this.f267019f++;
    }

    public java.lang.Object clone() {
        try {
            fv5.a aVar = (fv5.a) super.clone();
            try {
                aVar.f267017d = (int[]) this.f267017d.clone();
                aVar.f267018e = (boolean[]) this.f267018e.clone();
                return aVar;
            } catch (java.lang.CloneNotSupportedException unused) {
                return aVar;
            }
        } catch (java.lang.CloneNotSupportedException unused2) {
            return null;
        }
    }

    public java.lang.String toString() {
        int i17 = this.f267019f;
        if (i17 <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17 * 28);
        sb6.append('{');
        for (int i18 = 0; i18 < this.f267019f; i18++) {
            if (i18 > 0) {
                sb6.append(", ");
            }
            sb6.append(this.f267017d[i18]);
            sb6.append('=');
            sb6.append(this.f267018e[i18]);
        }
        sb6.append('}');
        return sb6.toString();
    }
}
