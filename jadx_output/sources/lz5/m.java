package lz5;

/* loaded from: classes14.dex */
public final class m implements java.util.Map, java.io.Serializable, zz5.f {

    /* renamed from: t, reason: collision with root package name */
    public static final lz5.m f322404t;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f322405d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object[] f322406e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f322407f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f322408g;

    /* renamed from: h, reason: collision with root package name */
    public int f322409h;

    /* renamed from: i, reason: collision with root package name */
    public int f322410i;

    /* renamed from: m, reason: collision with root package name */
    public int f322411m;

    /* renamed from: n, reason: collision with root package name */
    public int f322412n;

    /* renamed from: o, reason: collision with root package name */
    public int f322413o;

    /* renamed from: p, reason: collision with root package name */
    public lz5.o f322414p;

    /* renamed from: q, reason: collision with root package name */
    public lz5.p f322415q;

    /* renamed from: r, reason: collision with root package name */
    public lz5.n f322416r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f322417s;

    static {
        new lz5.g(null);
        lz5.m mVar = new lz5.m(0);
        mVar.f322417s = true;
        f322404t = mVar;
    }

    public m() {
        this(8);
    }

    public final int b(java.lang.Object obj) {
        c();
        while (true) {
            int j17 = j(obj);
            int i17 = this.f322409h * 2;
            int length = this.f322408g.length / 2;
            if (i17 > length) {
                i17 = length;
            }
            int i18 = 0;
            while (true) {
                int[] iArr = this.f322408g;
                int i19 = iArr[j17];
                if (i19 <= 0) {
                    int i27 = this.f322410i;
                    java.lang.Object[] objArr = this.f322405d;
                    if (i27 < objArr.length) {
                        int i28 = i27 + 1;
                        this.f322410i = i28;
                        objArr[i27] = obj;
                        this.f322407f[i27] = j17;
                        iArr[j17] = i28;
                        this.f322413o++;
                        this.f322412n++;
                        if (i18 > this.f322409h) {
                            this.f322409h = i18;
                        }
                        return i27;
                    }
                    g(1);
                } else {
                    if (kotlin.jvm.internal.o.b(this.f322405d[i19 - 1], obj)) {
                        return -i19;
                    }
                    i18++;
                    if (i18 > i17) {
                        k(this.f322408g.length * 2);
                        break;
                    }
                    j17 = j17 == 0 ? this.f322408g.length - 1 : j17 - 1;
                }
            }
        }
    }

    public final void c() {
        if (this.f322417s) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        c();
        int i17 = this.f322410i - 1;
        if (i17 >= 0) {
            int i18 = 0;
            while (true) {
                int[] iArr = this.f322407f;
                int i19 = iArr[i18];
                if (i19 >= 0) {
                    this.f322408g[i19] = 0;
                    iArr[i18] = -1;
                }
                if (i18 == i17) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        lz5.f.d(this.f322405d, 0, this.f322410i);
        java.lang.Object[] objArr = this.f322406e;
        if (objArr != null) {
            lz5.f.d(objArr, 0, this.f322410i);
        }
        this.f322413o = 0;
        this.f322410i = 0;
        this.f322412n++;
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        int i17;
        int i18 = this.f322410i;
        while (true) {
            i17 = -1;
            i18--;
            if (i18 < 0) {
                break;
            }
            if (this.f322407f[i18] >= 0) {
                java.lang.Object[] objArr = this.f322406e;
                kotlin.jvm.internal.o.d(objArr);
                if (kotlin.jvm.internal.o.b(objArr[i18], obj)) {
                    i17 = i18;
                    break;
                }
            }
        }
        return i17 >= 0;
    }

    public final void d(boolean z17) {
        int i17;
        java.lang.Object[] objArr = this.f322406e;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i17 = this.f322410i;
            if (i18 >= i17) {
                break;
            }
            int[] iArr = this.f322407f;
            int i27 = iArr[i18];
            if (i27 >= 0) {
                java.lang.Object[] objArr2 = this.f322405d;
                objArr2[i19] = objArr2[i18];
                if (objArr != null) {
                    objArr[i19] = objArr[i18];
                }
                if (z17) {
                    iArr[i19] = i27;
                    this.f322408g[i27] = i19 + 1;
                }
                i19++;
            }
            i18++;
        }
        lz5.f.d(this.f322405d, i19, i17);
        if (objArr != null) {
            lz5.f.d(objArr, i19, this.f322410i);
        }
        this.f322410i = i19;
    }

    public final boolean e(java.util.Collection m17) {
        kotlin.jvm.internal.o.g(m17, "m");
        for (java.lang.Object obj : m17) {
            if (obj != null) {
                try {
                    if (!f((java.util.Map.Entry) obj)) {
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        lz5.n nVar = this.f322416r;
        if (nVar != null) {
            return nVar;
        }
        lz5.n nVar2 = new lz5.n(this);
        this.f322416r = nVar2;
        return nVar2;
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.f322413o == map.size() && e(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(java.util.Map.Entry entry) {
        kotlin.jvm.internal.o.g(entry, "entry");
        int h17 = h(entry.getKey());
        if (h17 < 0) {
            return false;
        }
        java.lang.Object[] objArr = this.f322406e;
        kotlin.jvm.internal.o.d(objArr);
        return kotlin.jvm.internal.o.b(objArr[h17], entry.getValue());
    }

    public final void g(int i17) {
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2 = this.f322405d;
        int length = objArr2.length;
        int i18 = this.f322410i;
        int i19 = length - i18;
        int i27 = i18 - this.f322413o;
        if (i19 < i17 && i19 + i27 >= i17 && i27 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i28 = i18 + i17;
        if (i28 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        if (i28 > objArr2.length) {
            int length2 = objArr2.length;
            int i29 = length2 + (length2 >> 1);
            if (i29 - i28 < 0) {
                i29 = i28;
            }
            if (i29 - 2147483639 > 0) {
                i29 = i28 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, i29);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
            this.f322405d = copyOf;
            java.lang.Object[] objArr3 = this.f322406e;
            if (objArr3 != null) {
                objArr = java.util.Arrays.copyOf(objArr3, i29);
                kotlin.jvm.internal.o.f(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f322406e = objArr;
            int[] copyOf2 = java.util.Arrays.copyOf(this.f322407f, i29);
            kotlin.jvm.internal.o.f(copyOf2, "copyOf(...)");
            this.f322407f = copyOf2;
            int highestOneBit = java.lang.Integer.highestOneBit((i29 >= 1 ? i29 : 1) * 3);
            if (highestOneBit > this.f322408g.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        int h17 = h(obj);
        if (h17 < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.f322406e;
        kotlin.jvm.internal.o.d(objArr);
        return objArr[h17];
    }

    public final int h(java.lang.Object obj) {
        int j17 = j(obj);
        int i17 = this.f322409h;
        while (true) {
            int i18 = this.f322408g[j17];
            if (i18 == 0) {
                return -1;
            }
            if (i18 > 0) {
                int i19 = i18 - 1;
                if (kotlin.jvm.internal.o.b(this.f322405d[i19], obj)) {
                    return i19;
                }
            }
            i17--;
            if (i17 < 0) {
                return -1;
            }
            j17 = j17 == 0 ? this.f322408g.length - 1 : j17 - 1;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        lz5.h hVar = new lz5.h(this);
        int i17 = 0;
        while (hVar.hasNext()) {
            int i18 = hVar.f322401e;
            lz5.m mVar = hVar.f322400d;
            if (i18 >= mVar.f322410i) {
                throw new java.util.NoSuchElementException();
            }
            hVar.f322401e = i18 + 1;
            hVar.f322402f = i18;
            java.lang.Object obj = mVar.f322405d[i18];
            int hashCode = obj != null ? obj.hashCode() : 0;
            java.lang.Object[] objArr = mVar.f322406e;
            kotlin.jvm.internal.o.d(objArr);
            java.lang.Object obj2 = objArr[hVar.f322402f];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            hVar.c();
            i17 += hashCode ^ hashCode2;
        }
        return i17;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f322413o == 0;
    }

    public final int j(java.lang.Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f322411m;
    }

    public final void k(int i17) {
        boolean z17;
        this.f322412n++;
        if (this.f322410i > this.f322413o) {
            d(false);
        }
        this.f322408g = new int[i17];
        this.f322411m = java.lang.Integer.numberOfLeadingZeros(i17) + 1;
        int i18 = 0;
        while (i18 < this.f322410i) {
            int i19 = i18 + 1;
            int j17 = j(this.f322405d[i18]);
            int i27 = this.f322409h;
            while (true) {
                int[] iArr = this.f322408g;
                if (iArr[j17] == 0) {
                    iArr[j17] = i19;
                    this.f322407f[i18] = j17;
                    z17 = true;
                    break;
                } else {
                    i27--;
                    if (i27 < 0) {
                        z17 = false;
                        break;
                    }
                    j17 = j17 == 0 ? iArr.length - 1 : j17 - 1;
                }
            }
            if (!z17) {
                throw new java.lang.IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i18 = i19;
        }
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        lz5.o oVar = this.f322414p;
        if (oVar != null) {
            return oVar;
        }
        lz5.o oVar2 = new lz5.o(this);
        this.f322414p = oVar2;
        return oVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f322405d
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.o.g(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f322406e
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f322407f
            r0 = r0[r12]
            int r1 = r11.f322409h
            int r1 = r1 * 2
            int[] r2 = r11.f322408g
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            r6 = -1
            if (r0 != 0) goto L2e
            int[] r0 = r11.f322408g
            int r0 = r0.length
            int r0 = r0 + r6
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f322409h
            if (r4 <= r5) goto L3a
            int[] r0 = r11.f322408g
            r0[r1] = r2
            goto L69
        L3a:
            int[] r5 = r11.f322408g
            r7 = r5[r0]
            if (r7 != 0) goto L43
            r5[r1] = r2
            goto L69
        L43:
            if (r7 >= 0) goto L48
            r5[r1] = r6
            goto L60
        L48:
            java.lang.Object[] r5 = r11.f322405d
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f322408g
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L62
            r9[r1] = r7
            int[] r4 = r11.f322407f
            r4[r8] = r1
        L60:
            r1 = r0
            r4 = r2
        L62:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f322408g
            r0[r1] = r6
        L69:
            int[] r0 = r11.f322407f
            r0[r12] = r6
            int r12 = r11.f322413o
            int r12 = r12 + r6
            r11.f322413o = r12
            int r12 = r11.f322412n
            int r12 = r12 + 1
            r11.f322412n = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lz5.m.l(int):void");
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        c();
        int b17 = b(obj);
        java.lang.Object[] objArr = this.f322406e;
        if (objArr == null) {
            objArr = lz5.f.c(this.f322405d.length);
            this.f322406e = objArr;
        }
        if (b17 >= 0) {
            objArr[b17] = obj2;
            return null;
        }
        int i17 = (-b17) - 1;
        java.lang.Object obj3 = objArr[i17];
        objArr[i17] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map from) {
        kotlin.jvm.internal.o.g(from, "from");
        c();
        java.util.Set<java.util.Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (java.util.Map.Entry entry : entrySet) {
            int b17 = b(entry.getKey());
            java.lang.Object[] objArr = this.f322406e;
            if (objArr == null) {
                objArr = lz5.f.c(this.f322405d.length);
                this.f322406e = objArr;
            }
            if (b17 >= 0) {
                objArr[b17] = entry.getValue();
            } else {
                int i17 = (-b17) - 1;
                if (!kotlin.jvm.internal.o.b(entry.getValue(), objArr[i17])) {
                    objArr[i17] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        c();
        int h17 = h(obj);
        if (h17 < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.f322406e;
        kotlin.jvm.internal.o.d(objArr);
        java.lang.Object obj2 = objArr[h17];
        l(h17);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f322413o;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((this.f322413o * 3) + 2);
        sb6.append("{");
        lz5.h hVar = new lz5.h(this);
        int i17 = 0;
        while (hVar.hasNext()) {
            if (i17 > 0) {
                sb6.append(", ");
            }
            int i18 = hVar.f322401e;
            lz5.m mVar = hVar.f322400d;
            if (i18 >= mVar.f322410i) {
                throw new java.util.NoSuchElementException();
            }
            hVar.f322401e = i18 + 1;
            hVar.f322402f = i18;
            java.lang.Object obj = mVar.f322405d[i18];
            if (obj == mVar) {
                sb6.append("(this Map)");
            } else {
                sb6.append(obj);
            }
            sb6.append('=');
            java.lang.Object[] objArr = mVar.f322406e;
            kotlin.jvm.internal.o.d(objArr);
            java.lang.Object obj2 = objArr[hVar.f322402f];
            if (obj2 == mVar) {
                sb6.append("(this Map)");
            } else {
                sb6.append(obj2);
            }
            hVar.c();
            i17++;
        }
        sb6.append("}");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        lz5.p pVar = this.f322415q;
        if (pVar != null) {
            return pVar;
        }
        lz5.p pVar2 = new lz5.p(this);
        this.f322415q = pVar2;
        return pVar2;
    }

    public m(int i17) {
        java.lang.Object[] c17 = lz5.f.c(i17);
        int[] iArr = new int[i17];
        int highestOneBit = java.lang.Integer.highestOneBit((i17 < 1 ? 1 : i17) * 3);
        this.f322405d = c17;
        this.f322406e = null;
        this.f322407f = iArr;
        this.f322408g = new int[highestOneBit];
        this.f322409h = 2;
        this.f322410i = 0;
        this.f322411m = java.lang.Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
