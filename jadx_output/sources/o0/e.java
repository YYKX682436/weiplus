package o0;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int[] f341840a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f341841b;

    /* renamed from: c, reason: collision with root package name */
    public o0.d[] f341842c;

    /* renamed from: d, reason: collision with root package name */
    public int f341843d;

    public e() {
        int[] iArr = new int[50];
        for (int i17 = 0; i17 < 50; i17++) {
            iArr[i17] = i17;
        }
        this.f341840a = iArr;
        this.f341841b = new java.lang.Object[50];
        this.f341842c = new o0.d[50];
    }

    public final boolean a(java.lang.Object value, java.lang.Object scope) {
        int i17;
        o0.d dVar;
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(scope, "scope");
        if (this.f341843d > 0) {
            i17 = b(value);
            if (i17 >= 0) {
                dVar = d(i17);
                return dVar.add(scope);
            }
        } else {
            i17 = -1;
        }
        int i18 = -(i17 + 1);
        int i19 = this.f341843d;
        int[] iArr = this.f341840a;
        if (i19 < iArr.length) {
            int i27 = iArr[i19];
            this.f341841b[i27] = value;
            o0.d[] dVarArr = this.f341842c;
            o0.d dVar2 = dVarArr[i27];
            if (dVar2 == null) {
                dVar2 = new o0.d();
                dVarArr[i27] = dVar2;
            }
            dVar = dVar2;
            if (i18 < i19) {
                kz5.v.j(iArr, iArr, i18 + 1, i18, i19);
            }
            this.f341840a[i18] = i27;
            this.f341843d++;
        } else {
            int length = iArr.length * 2;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.f341842c, length);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            o0.d[] dVarArr2 = (o0.d[]) copyOf;
            this.f341842c = dVarArr2;
            o0.d dVar3 = new o0.d();
            dVarArr2[i19] = dVar3;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(this.f341841b, length);
            kotlin.jvm.internal.o.f(copyOf2, "copyOf(this, newSize)");
            this.f341841b = copyOf2;
            copyOf2[i19] = value;
            int[] iArr2 = new int[length];
            int i28 = this.f341843d;
            while (true) {
                i28++;
                if (i28 >= length) {
                    break;
                }
                iArr2[i28] = i28;
            }
            int i29 = this.f341843d;
            if (i18 < i29) {
                kz5.v.j(this.f341840a, iArr2, i18 + 1, i18, i29);
            }
            iArr2[i18] = i19;
            if (i18 > 0) {
                kz5.v.n(this.f341840a, iArr2, 0, 0, i18, 6, null);
            }
            this.f341840a = iArr2;
            this.f341843d++;
            dVar = dVar3;
        }
        return dVar.add(scope);
    }

    public final int b(java.lang.Object obj) {
        int identityHashCode = java.lang.System.identityHashCode(obj);
        int i17 = this.f341843d - 1;
        int i18 = 0;
        while (i18 <= i17) {
            int i19 = (i18 + i17) >>> 1;
            java.lang.Object obj2 = this.f341841b[this.f341840a[i19]];
            kotlin.jvm.internal.o.d(obj2);
            int identityHashCode2 = java.lang.System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i18 = i19 + 1;
            } else {
                if (identityHashCode2 <= identityHashCode) {
                    if (obj == obj2) {
                        return i19;
                    }
                    for (int i27 = i19 - 1; -1 < i27; i27--) {
                        java.lang.Object obj3 = this.f341841b[this.f341840a[i27]];
                        kotlin.jvm.internal.o.d(obj3);
                        if (obj3 == obj) {
                            return i27;
                        }
                        if (java.lang.System.identityHashCode(obj3) != identityHashCode) {
                            break;
                        }
                    }
                    int i28 = i19 + 1;
                    int i29 = this.f341843d;
                    while (true) {
                        if (i28 >= i29) {
                            i28 = this.f341843d;
                            break;
                        }
                        java.lang.Object obj4 = this.f341841b[this.f341840a[i28]];
                        kotlin.jvm.internal.o.d(obj4);
                        if (obj4 == obj) {
                            return i28;
                        }
                        if (java.lang.System.identityHashCode(obj4) != identityHashCode) {
                            break;
                        }
                        i28++;
                    }
                    return -(i28 + 1);
                }
                i17 = i19 - 1;
            }
        }
        return -(i18 + 1);
    }

    public final boolean c(java.lang.Object value, java.lang.Object scope) {
        int i17;
        o0.d dVar;
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(scope, "scope");
        int b17 = b(value);
        if (b17 < 0 || (dVar = this.f341842c[(i17 = this.f341840a[b17])]) == null) {
            return false;
        }
        boolean remove = dVar.remove(scope);
        if (dVar.f341838d == 0) {
            int i18 = b17 + 1;
            int i19 = this.f341843d;
            if (i18 < i19) {
                int[] iArr = this.f341840a;
                kz5.v.j(iArr, iArr, b17, i18, i19);
            }
            int[] iArr2 = this.f341840a;
            int i27 = this.f341843d;
            iArr2[i27 - 1] = i17;
            this.f341841b[i17] = null;
            this.f341843d = i27 - 1;
        }
        return remove;
    }

    public final o0.d d(int i17) {
        o0.d dVar = this.f341842c[this.f341840a[i17]];
        kotlin.jvm.internal.o.d(dVar);
        return dVar;
    }
}
