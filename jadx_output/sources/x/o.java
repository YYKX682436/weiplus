package x;

/* loaded from: classes13.dex */
public class o implements java.lang.Cloneable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f450847h = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f450848d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f450849e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object[] f450850f;

    /* renamed from: g, reason: collision with root package name */
    public int f450851g;

    public o() {
        this(10);
    }

    public void a(int i17, java.lang.Object obj) {
        int i18 = this.f450851g;
        if (i18 != 0 && i17 <= this.f450849e[i18 - 1]) {
            g(i17, obj);
            return;
        }
        if (this.f450848d && i18 >= this.f450849e.length) {
            d();
        }
        int i19 = this.f450851g;
        if (i19 >= this.f450849e.length) {
            int i27 = (i19 + 1) * 4;
            int i28 = 4;
            while (true) {
                if (i28 >= 32) {
                    break;
                }
                int i29 = (1 << i28) - 12;
                if (i27 <= i29) {
                    i27 = i29;
                    break;
                }
                i28++;
            }
            int i37 = i27 / 4;
            int[] iArr = new int[i37];
            java.lang.Object[] objArr = new java.lang.Object[i37];
            int[] iArr2 = this.f450849e;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr2 = this.f450850f;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f450849e = iArr;
            this.f450850f = objArr;
        }
        this.f450849e[i19] = i17;
        this.f450850f[i19] = obj;
        this.f450851g = i19 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x.o clone() {
        try {
            x.o oVar = (x.o) super.clone();
            oVar.f450849e = (int[]) this.f450849e.clone();
            oVar.f450850f = (java.lang.Object[]) this.f450850f.clone();
            return oVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    public boolean c(int i17) {
        if (this.f450848d) {
            d();
        }
        return x.e.a(this.f450849e, this.f450851g, i17) >= 0;
    }

    public final void d() {
        int i17 = this.f450851g;
        int[] iArr = this.f450849e;
        java.lang.Object[] objArr = this.f450850f;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            java.lang.Object obj = objArr[i19];
            if (obj != f450847h) {
                if (i19 != i18) {
                    iArr[i18] = iArr[i19];
                    objArr[i18] = obj;
                    objArr[i19] = null;
                }
                i18++;
            }
        }
        this.f450848d = false;
        this.f450851g = i18;
    }

    public java.lang.Object e(int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        int a17 = x.e.a(this.f450849e, this.f450851g, i17);
        return (a17 < 0 || (obj2 = this.f450850f[a17]) == f450847h) ? obj : obj2;
    }

    public int f(int i17) {
        if (this.f450848d) {
            d();
        }
        return this.f450849e[i17];
    }

    public void g(int i17, java.lang.Object obj) {
        int a17 = x.e.a(this.f450849e, this.f450851g, i17);
        if (a17 >= 0) {
            this.f450850f[a17] = obj;
            return;
        }
        int i18 = ~a17;
        int i19 = this.f450851g;
        if (i18 < i19) {
            java.lang.Object[] objArr = this.f450850f;
            if (objArr[i18] == f450847h) {
                this.f450849e[i18] = i17;
                objArr[i18] = obj;
                return;
            }
        }
        if (this.f450848d && i19 >= this.f450849e.length) {
            d();
            i18 = ~x.e.a(this.f450849e, this.f450851g, i17);
        }
        int i27 = this.f450851g;
        if (i27 >= this.f450849e.length) {
            int i28 = (i27 + 1) * 4;
            int i29 = 4;
            while (true) {
                if (i29 >= 32) {
                    break;
                }
                int i37 = (1 << i29) - 12;
                if (i28 <= i37) {
                    i28 = i37;
                    break;
                }
                i29++;
            }
            int i38 = i28 / 4;
            int[] iArr = new int[i38];
            java.lang.Object[] objArr2 = new java.lang.Object[i38];
            int[] iArr2 = this.f450849e;
            java.lang.System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            java.lang.Object[] objArr3 = this.f450850f;
            java.lang.System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f450849e = iArr;
            this.f450850f = objArr2;
        }
        int i39 = this.f450851g - i18;
        if (i39 != 0) {
            int[] iArr3 = this.f450849e;
            int i47 = i18 + 1;
            java.lang.System.arraycopy(iArr3, i18, iArr3, i47, i39);
            java.lang.Object[] objArr4 = this.f450850f;
            java.lang.System.arraycopy(objArr4, i18, objArr4, i47, this.f450851g - i18);
        }
        this.f450849e[i18] = i17;
        this.f450850f[i18] = obj;
        this.f450851g++;
    }

    public int h() {
        if (this.f450848d) {
            d();
        }
        return this.f450851g;
    }

    public java.lang.Object i(int i17) {
        if (this.f450848d) {
            d();
        }
        return this.f450850f[i17];
    }

    public java.lang.String toString() {
        if (h() <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f450851g * 28);
        sb6.append('{');
        for (int i17 = 0; i17 < this.f450851g; i17++) {
            if (i17 > 0) {
                sb6.append(", ");
            }
            sb6.append(f(i17));
            sb6.append('=');
            java.lang.Object i18 = i(i17);
            if (i18 != this) {
                sb6.append(i18);
            } else {
                sb6.append("(this Map)");
            }
        }
        sb6.append('}');
        return sb6.toString();
    }

    public o(int i17) {
        this.f450848d = false;
        if (i17 == 0) {
            this.f450849e = x.e.f450818a;
            this.f450850f = x.e.f450819b;
            return;
        }
        int i18 = i17 * 4;
        int i19 = 4;
        while (true) {
            if (i19 >= 32) {
                break;
            }
            int i27 = (1 << i19) - 12;
            if (i18 <= i27) {
                i18 = i27;
                break;
            }
            i19++;
        }
        int i28 = i18 / 4;
        this.f450849e = new int[i28];
        this.f450850f = new java.lang.Object[i28];
    }
}
