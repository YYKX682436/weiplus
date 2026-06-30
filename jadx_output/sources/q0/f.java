package q0;

/* loaded from: classes14.dex */
public final class f extends q0.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object[] f359221e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f359222f;

    /* renamed from: g, reason: collision with root package name */
    public final int f359223g;

    /* renamed from: h, reason: collision with root package name */
    public final int f359224h;

    public f(java.lang.Object[] root, java.lang.Object[] tail, int i17, int i18) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(tail, "tail");
        this.f359221e = root;
        this.f359222f = tail;
        this.f359223g = i17;
        this.f359224h = i18;
        if (d() > 32) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + d()).toString());
    }

    @Override // java.util.List, p0.e
    public p0.e add(int i17, java.lang.Object obj) {
        t0.c.b(i17, d());
        if (i17 == d()) {
            return add(obj);
        }
        int n17 = n();
        if (i17 >= n17) {
            return g(this.f359221e, i17 - n17, obj);
        }
        q0.e eVar = new q0.e(null);
        return g(e(this.f359221e, this.f359224h, i17, obj, eVar), 0, eVar.f359220a);
    }

    @Override // kz5.b
    public int d() {
        return this.f359223g;
    }

    public final java.lang.Object[] e(java.lang.Object[] objArr, int i17, int i18, java.lang.Object obj, q0.e eVar) {
        java.lang.Object[] objArr2;
        int i19 = (i18 >> i17) & 31;
        if (i17 == 0) {
            if (i19 == 0) {
                objArr2 = new java.lang.Object[32];
            } else {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
                objArr2 = copyOf;
            }
            kz5.v.k(objArr, objArr2, i19 + 1, i19, 31);
            eVar.f359220a = objArr[31];
            objArr2[i19] = obj;
            return objArr2;
        }
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr, 32);
        kotlin.jvm.internal.o.f(copyOf2, "copyOf(this, newSize)");
        int i27 = i17 - 5;
        java.lang.Object obj2 = objArr[i19];
        if (obj2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        copyOf2[i19] = e((java.lang.Object[]) obj2, i27, i18, obj, eVar);
        while (true) {
            i19++;
            if (i19 >= 32 || copyOf2[i19] == null) {
                break;
            }
            java.lang.Object obj3 = objArr[i19];
            if (obj3 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            copyOf2[i19] = e((java.lang.Object[]) obj3, i27, 0, eVar.f359220a, eVar);
        }
        return copyOf2;
    }

    public final q0.f g(java.lang.Object[] objArr, int i17, java.lang.Object obj) {
        int n17 = n();
        int i18 = this.f359223g;
        int i19 = i18 - n17;
        java.lang.Object[] objArr2 = this.f359222f;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
        if (i19 < 32) {
            kz5.v.k(objArr2, copyOf, i17 + 1, i17, i19);
            copyOf[i17] = obj;
            return new q0.f(objArr, copyOf, i18 + 1, this.f359224h);
        }
        java.lang.Object obj2 = objArr2[31];
        kz5.v.k(objArr2, copyOf, i17 + 1, i17, i19 - 1);
        copyOf[i17] = obj;
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = obj2;
        return j(objArr, copyOf, objArr3);
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        java.lang.Object[] objArr;
        t0.c.a(i17, d());
        if (n() <= i17) {
            objArr = this.f359222f;
        } else {
            objArr = this.f359221e;
            for (int i18 = this.f359224h; i18 > 0; i18 -= 5) {
                java.lang.Object obj = objArr[(i17 >> i18) & 31];
                if (obj == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                objArr = (java.lang.Object[]) obj;
            }
        }
        return objArr[i17 & 31];
    }

    public final java.lang.Object[] h(java.lang.Object[] objArr, int i17, int i18, q0.e eVar) {
        java.lang.Object[] h17;
        int i19 = (i18 >> i17) & 31;
        if (i17 == 5) {
            eVar.f359220a = objArr[i19];
            h17 = null;
        } else {
            java.lang.Object obj = objArr[i19];
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            h17 = h((java.lang.Object[]) obj, i17 - 5, i18, eVar);
        }
        if (h17 == null && i19 == 0) {
            return null;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
        copyOf[i19] = h17;
        return copyOf;
    }

    @Override // p0.e
    public p0.e i(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        q0.h hVar = new q0.h(this, this.f359221e, this.f359222f, this.f359224h);
        hVar.L(predicate);
        return hVar.g();
    }

    public final q0.f j(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i17 = this.f359223g;
        int i18 = i17 >> 5;
        int i19 = this.f359224h;
        if (i18 <= (1 << i19)) {
            return new q0.f(k(objArr, i19, objArr2), objArr3, i17 + 1, i19);
        }
        java.lang.Object[] objArr4 = new java.lang.Object[32];
        objArr4[0] = objArr;
        int i27 = i19 + 5;
        return new q0.f(k(objArr4, i27, objArr2), objArr3, i17 + 1, i27);
    }

    public final java.lang.Object[] k(java.lang.Object[] objArr, int i17, java.lang.Object[] objArr2) {
        java.lang.Object[] objArr3;
        int d17 = ((d() - 1) >> i17) & 31;
        if (objArr != null) {
            objArr3 = java.util.Arrays.copyOf(objArr, 32);
            kotlin.jvm.internal.o.f(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new java.lang.Object[32];
        }
        if (i17 == 5) {
            objArr3[d17] = objArr2;
        } else {
            objArr3[d17] = k((java.lang.Object[]) objArr3[d17], i17 - 5, objArr2);
        }
        return objArr3;
    }

    public final java.lang.Object[] l(java.lang.Object[] objArr, int i17, int i18, q0.e eVar) {
        java.lang.Object[] copyOf;
        int i19 = (i18 >> i17) & 31;
        if (i17 == 0) {
            if (i19 == 0) {
                copyOf = new java.lang.Object[32];
            } else {
                copyOf = java.util.Arrays.copyOf(objArr, 32);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            }
            kz5.v.k(objArr, copyOf, i19, i19 + 1, 32);
            copyOf[31] = eVar.f359220a;
            eVar.f359220a = objArr[i19];
            return copyOf;
        }
        int n17 = objArr[31] == null ? 31 & ((n() - 1) >> i17) : 31;
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr, 32);
        kotlin.jvm.internal.o.f(copyOf2, "copyOf(this, newSize)");
        int i27 = i17 - 5;
        int i28 = i19 + 1;
        if (i28 <= n17) {
            while (true) {
                java.lang.Object obj = copyOf2[n17];
                if (obj == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                copyOf2[n17] = l((java.lang.Object[]) obj, i27, 0, eVar);
                if (n17 == i28) {
                    break;
                }
                n17--;
            }
        }
        java.lang.Object obj2 = copyOf2[i19];
        if (obj2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        copyOf2[i19] = l((java.lang.Object[]) obj2, i27, i18, eVar);
        return copyOf2;
    }

    @Override // kz5.h, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        t0.c.b(i17, d());
        return new q0.i(this.f359221e, this.f359222f, i17, d(), (this.f359224h / 5) + 1);
    }

    public final p0.e m(java.lang.Object[] objArr, int i17, int i18, int i19) {
        q0.f fVar;
        int d17 = d() - i17;
        if (d17 != 1) {
            java.lang.Object[] objArr2 = this.f359222f;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, 32);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            int i27 = d17 - 1;
            if (i19 < i27) {
                kz5.v.k(objArr2, copyOf, i19, i19 + 1, d17);
            }
            copyOf[i27] = null;
            return new q0.f(objArr, copyOf, (i17 + d17) - 1, i18);
        }
        if (i18 == 0) {
            if (objArr.length == 33) {
                objArr = java.util.Arrays.copyOf(objArr, 32);
                kotlin.jvm.internal.o.f(objArr, "copyOf(this, newSize)");
            }
            return new q0.l(objArr);
        }
        q0.e eVar = new q0.e(null);
        java.lang.Object[] h17 = h(objArr, i18, i17 - 1, eVar);
        kotlin.jvm.internal.o.d(h17);
        java.lang.Object obj = eVar.f359220a;
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
        if (h17[1] == null) {
            java.lang.Object obj2 = h17[0];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            fVar = new q0.f((java.lang.Object[]) obj2, objArr3, i17, i18 - 5);
        } else {
            fVar = new q0.f(h17, objArr3, i17, i18);
        }
        return fVar;
    }

    public final int n() {
        return (d() - 1) & (-32);
    }

    public final java.lang.Object[] o(java.lang.Object[] objArr, int i17, int i18, java.lang.Object obj) {
        int i19 = (i18 >> i17) & 31;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
        if (i17 == 0) {
            copyOf[i19] = obj;
        } else {
            java.lang.Object obj2 = copyOf[i19];
            if (obj2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            copyOf[i19] = o((java.lang.Object[]) obj2, i17 - 5, i18, obj);
        }
        return copyOf;
    }

    @Override // kz5.h, java.util.List
    public p0.e set(int i17, java.lang.Object obj) {
        t0.c.a(i17, d());
        int n17 = n();
        java.lang.Object[] objArr = this.f359222f;
        java.lang.Object[] objArr2 = this.f359221e;
        int i18 = this.f359224h;
        if (n17 > i17) {
            return new q0.f(o(objArr2, i18, i17, obj), objArr, d(), i18);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
        copyOf[i17 & 31] = obj;
        return new q0.f(objArr2, copyOf, d(), i18);
    }

    @Override // p0.e
    public p0.e v(int i17) {
        t0.c.a(i17, d());
        int n17 = n();
        java.lang.Object[] objArr = this.f359221e;
        int i18 = this.f359224h;
        return i17 >= n17 ? m(objArr, n17, i18, i17 - n17) : m(l(objArr, i18, i17, new q0.e(this.f359222f[0])), n17, i18, 0);
    }

    @Override // p0.e
    public p0.d x() {
        return new q0.h(this, this.f359221e, this.f359222f, this.f359224h);
    }

    @Override // java.util.Collection, java.util.List, p0.e
    public p0.e add(java.lang.Object obj) {
        int n17 = n();
        int i17 = this.f359223g;
        int i18 = i17 - n17;
        java.lang.Object[] objArr = this.f359222f;
        java.lang.Object[] objArr2 = this.f359221e;
        if (i18 < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, 32);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            copyOf[i18] = obj;
            return new q0.f(objArr2, copyOf, i17 + 1, this.f359224h);
        }
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = obj;
        return j(objArr2, objArr, objArr3);
    }
}
