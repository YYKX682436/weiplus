package x;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Object[] f450840g;

    /* renamed from: h, reason: collision with root package name */
    public static int f450841h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.Object[] f450842i;

    /* renamed from: m, reason: collision with root package name */
    public static int f450843m;

    /* renamed from: d, reason: collision with root package name */
    public int[] f450844d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f450845e;

    /* renamed from: f, reason: collision with root package name */
    public int f450846f;

    public n() {
        this.f450844d = x.e.f450818a;
        this.f450845e = x.e.f450819b;
        this.f450846f = 0;
    }

    private void a(int i17) {
        if (i17 == 8) {
            synchronized (x.n.class) {
                java.lang.Object[] objArr = f450842i;
                if (objArr != null) {
                    this.f450845e = objArr;
                    f450842i = (java.lang.Object[]) objArr[0];
                    this.f450844d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f450843m--;
                    return;
                }
            }
        } else if (i17 == 4) {
            synchronized (x.n.class) {
                java.lang.Object[] objArr2 = f450840g;
                if (objArr2 != null) {
                    this.f450845e = objArr2;
                    f450840g = (java.lang.Object[]) objArr2[0];
                    this.f450844d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f450841h--;
                    return;
                }
            }
        }
        this.f450844d = new int[i17];
        this.f450845e = new java.lang.Object[i17 << 1];
    }

    public static void c(int[] iArr, java.lang.Object[] objArr, int i17) {
        if (iArr.length == 8) {
            synchronized (x.n.class) {
                if (f450843m < 10) {
                    objArr[0] = f450842i;
                    objArr[1] = iArr;
                    for (int i18 = (i17 << 1) - 1; i18 >= 2; i18--) {
                        objArr[i18] = null;
                    }
                    f450842i = objArr;
                    f450843m++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (x.n.class) {
                if (f450841h < 10) {
                    objArr[0] = f450840g;
                    objArr[1] = iArr;
                    for (int i19 = (i17 << 1) - 1; i19 >= 2; i19--) {
                        objArr[i19] = null;
                    }
                    f450840g = objArr;
                    f450841h++;
                }
            }
        }
    }

    public void b(int i17) {
        int i18 = this.f450846f;
        int[] iArr = this.f450844d;
        if (iArr.length < i17) {
            java.lang.Object[] objArr = this.f450845e;
            a(i17);
            if (this.f450846f > 0) {
                java.lang.System.arraycopy(iArr, 0, this.f450844d, 0, i18);
                java.lang.System.arraycopy(objArr, 0, this.f450845e, 0, i18 << 1);
            }
            c(iArr, objArr, i18);
        }
        if (this.f450846f != i18) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void clear() {
        int i17 = this.f450846f;
        if (i17 > 0) {
            int[] iArr = this.f450844d;
            java.lang.Object[] objArr = this.f450845e;
            this.f450844d = x.e.f450818a;
            this.f450845e = x.e.f450819b;
            this.f450846f = 0;
            c(iArr, objArr, i17);
        }
        if (this.f450846f > 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public boolean containsKey(java.lang.Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(java.lang.Object obj) {
        return g(obj) >= 0;
    }

    int d(java.lang.Object obj, int i17) {
        int i18 = this.f450846f;
        if (i18 == 0) {
            return -1;
        }
        try {
            int a17 = x.e.a(this.f450844d, i18, i17);
            if (a17 < 0 || obj.equals(this.f450845e[a17 << 1])) {
                return a17;
            }
            int i19 = a17 + 1;
            while (i19 < i18 && this.f450844d[i19] == i17) {
                if (obj.equals(this.f450845e[i19 << 1])) {
                    return i19;
                }
                i19++;
            }
            for (int i27 = a17 - 1; i27 >= 0 && this.f450844d[i27] == i17; i27--) {
                if (obj.equals(this.f450845e[i27 << 1])) {
                    return i27;
                }
            }
            return ~i19;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public int e(java.lang.Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x.n) {
            x.n nVar = (x.n) obj;
            if (this.f450846f != nVar.f450846f) {
                return false;
            }
            for (int i17 = 0; i17 < this.f450846f; i17++) {
                try {
                    java.lang.Object h17 = h(i17);
                    java.lang.Object l17 = l(i17);
                    java.lang.Object orDefault = nVar.getOrDefault(h17, null);
                    if (l17 == null) {
                        if (orDefault != null || !nVar.containsKey(h17)) {
                            return false;
                        }
                    } else if (!l17.equals(orDefault)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.f450846f != map.size()) {
                return false;
            }
            for (int i18 = 0; i18 < this.f450846f; i18++) {
                try {
                    java.lang.Object h18 = h(i18);
                    java.lang.Object l18 = l(i18);
                    java.lang.Object obj2 = map.get(h18);
                    if (l18 == null) {
                        if (obj2 != null || !map.containsKey(h18)) {
                            return false;
                        }
                    } else if (!l18.equals(obj2)) {
                        return false;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i17 = this.f450846f;
        if (i17 == 0) {
            return -1;
        }
        try {
            int a17 = x.e.a(this.f450844d, i17, 0);
            if (a17 < 0 || this.f450845e[a17 << 1] == null) {
                return a17;
            }
            int i18 = a17 + 1;
            while (i18 < i17 && this.f450844d[i18] == 0) {
                if (this.f450845e[i18 << 1] == null) {
                    return i18;
                }
                i18++;
            }
            for (int i19 = a17 - 1; i19 >= 0 && this.f450844d[i19] == 0; i19--) {
                if (this.f450845e[i19 << 1] == null) {
                    return i19;
                }
            }
            return ~i18;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(java.lang.Object obj) {
        int i17 = this.f450846f * 2;
        java.lang.Object[] objArr = this.f450845e;
        if (obj == null) {
            for (int i18 = 1; i18 < i17; i18 += 2) {
                if (objArr[i18] == null) {
                    return i18 >> 1;
                }
            }
            return -1;
        }
        for (int i19 = 1; i19 < i17; i19 += 2) {
            if (obj.equals(objArr[i19])) {
                return i19 >> 1;
            }
        }
        return -1;
    }

    public java.lang.Object get(java.lang.Object obj) {
        return getOrDefault(obj, null);
    }

    public java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int e17 = e(obj);
        return e17 >= 0 ? this.f450845e[(e17 << 1) + 1] : obj2;
    }

    public java.lang.Object h(int i17) {
        return this.f450845e[i17 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f450844d;
        java.lang.Object[] objArr = this.f450845e;
        int i17 = this.f450846f;
        int i18 = 1;
        int i19 = 0;
        int i27 = 0;
        while (i19 < i17) {
            java.lang.Object obj = objArr[i18];
            i27 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i19];
            i19++;
            i18 += 2;
        }
        return i27;
    }

    public void i(x.n nVar) {
        int i17 = nVar.f450846f;
        b(this.f450846f + i17);
        if (this.f450846f != 0) {
            for (int i18 = 0; i18 < i17; i18++) {
                put(nVar.h(i18), nVar.l(i18));
            }
        } else if (i17 > 0) {
            java.lang.System.arraycopy(nVar.f450844d, 0, this.f450844d, 0, i17);
            java.lang.System.arraycopy(nVar.f450845e, 0, this.f450845e, 0, i17 << 1);
            this.f450846f = i17;
        }
    }

    public boolean isEmpty() {
        return this.f450846f <= 0;
    }

    public java.lang.Object j(int i17) {
        java.lang.Object[] objArr = this.f450845e;
        int i18 = i17 << 1;
        java.lang.Object obj = objArr[i18 + 1];
        int i19 = this.f450846f;
        int i27 = 0;
        if (i19 <= 1) {
            c(this.f450844d, objArr, i19);
            this.f450844d = x.e.f450818a;
            this.f450845e = x.e.f450819b;
        } else {
            int i28 = i19 - 1;
            int[] iArr = this.f450844d;
            if (iArr.length <= 8 || i19 >= iArr.length / 3) {
                if (i17 < i28) {
                    int i29 = i17 + 1;
                    int i37 = i28 - i17;
                    java.lang.System.arraycopy(iArr, i29, iArr, i17, i37);
                    java.lang.Object[] objArr2 = this.f450845e;
                    java.lang.System.arraycopy(objArr2, i29 << 1, objArr2, i18, i37 << 1);
                }
                java.lang.Object[] objArr3 = this.f450845e;
                int i38 = i28 << 1;
                objArr3[i38] = null;
                objArr3[i38 + 1] = null;
            } else {
                a(i19 > 8 ? i19 + (i19 >> 1) : 8);
                if (i19 != this.f450846f) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i17 > 0) {
                    java.lang.System.arraycopy(iArr, 0, this.f450844d, 0, i17);
                    java.lang.System.arraycopy(objArr, 0, this.f450845e, 0, i18);
                }
                if (i17 < i28) {
                    int i39 = i17 + 1;
                    int i47 = i28 - i17;
                    java.lang.System.arraycopy(iArr, i39, this.f450844d, i17, i47);
                    java.lang.System.arraycopy(objArr, i39 << 1, this.f450845e, i18, i47 << 1);
                }
            }
            i27 = i28;
        }
        if (i19 != this.f450846f) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f450846f = i27;
        return obj;
    }

    public java.lang.Object k(int i17, java.lang.Object obj) {
        int i18 = (i17 << 1) + 1;
        java.lang.Object[] objArr = this.f450845e;
        java.lang.Object obj2 = objArr[i18];
        objArr[i18] = obj;
        return obj2;
    }

    public java.lang.Object l(int i17) {
        return this.f450845e[(i17 << 1) + 1];
    }

    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        int d17;
        int i18 = this.f450846f;
        if (obj == null) {
            d17 = f();
            i17 = 0;
        } else {
            int hashCode = obj.hashCode();
            i17 = hashCode;
            d17 = d(obj, hashCode);
        }
        if (d17 >= 0) {
            int i19 = (d17 << 1) + 1;
            java.lang.Object[] objArr = this.f450845e;
            java.lang.Object obj3 = objArr[i19];
            objArr[i19] = obj2;
            return obj3;
        }
        int i27 = ~d17;
        int[] iArr = this.f450844d;
        if (i18 >= iArr.length) {
            int i28 = 8;
            if (i18 >= 8) {
                i28 = (i18 >> 1) + i18;
            } else if (i18 < 4) {
                i28 = 4;
            }
            java.lang.Object[] objArr2 = this.f450845e;
            a(i28);
            if (i18 != this.f450846f) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.f450844d;
            if (iArr2.length > 0) {
                java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                java.lang.System.arraycopy(objArr2, 0, this.f450845e, 0, objArr2.length);
            }
            c(iArr, objArr2, i18);
        }
        if (i27 < i18) {
            int[] iArr3 = this.f450844d;
            int i29 = i27 + 1;
            java.lang.System.arraycopy(iArr3, i27, iArr3, i29, i18 - i27);
            java.lang.Object[] objArr3 = this.f450845e;
            java.lang.System.arraycopy(objArr3, i27 << 1, objArr3, i29 << 1, (this.f450846f - i27) << 1);
        }
        int i37 = this.f450846f;
        if (i18 == i37) {
            int[] iArr4 = this.f450844d;
            if (i27 < iArr4.length) {
                iArr4[i27] = i17;
                java.lang.Object[] objArr4 = this.f450845e;
                int i38 = i27 << 1;
                objArr4[i38] = obj;
                objArr4[i38 + 1] = obj2;
                this.f450846f = i37 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public java.lang.Object remove(java.lang.Object obj) {
        int e17 = e(obj);
        if (e17 >= 0) {
            return j(e17);
        }
        return null;
    }

    public java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int e17 = e(obj);
        if (e17 >= 0) {
            return k(e17, obj2);
        }
        return null;
    }

    public int size() {
        return this.f450846f;
    }

    public java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f450846f * 28);
        sb6.append('{');
        for (int i17 = 0; i17 < this.f450846f; i17++) {
            if (i17 > 0) {
                sb6.append(", ");
            }
            java.lang.Object h17 = h(i17);
            if (h17 != this) {
                sb6.append(h17);
            } else {
                sb6.append("(this Map)");
            }
            sb6.append('=');
            java.lang.Object l17 = l(i17);
            if (l17 != this) {
                sb6.append(l17);
            } else {
                sb6.append("(this Map)");
            }
        }
        sb6.append('}');
        return sb6.toString();
    }

    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int e17 = e(obj);
        if (e17 < 0) {
            return false;
        }
        java.lang.Object l17 = l(e17);
        if (obj2 != l17 && (obj2 == null || !obj2.equals(l17))) {
            return false;
        }
        j(e17);
        return true;
    }

    public boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int e17 = e(obj);
        if (e17 < 0) {
            return false;
        }
        java.lang.Object l17 = l(e17);
        if (l17 != obj2 && (obj2 == null || !obj2.equals(l17))) {
            return false;
        }
        k(e17, obj3);
        return true;
    }

    public n(int i17) {
        if (i17 == 0) {
            this.f450844d = x.e.f450818a;
            this.f450845e = x.e.f450819b;
        } else {
            a(i17);
        }
        this.f450846f = 0;
    }
}
