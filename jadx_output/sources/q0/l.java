package q0;

/* loaded from: classes14.dex */
public final class l extends q0.c implements p0.b {

    /* renamed from: f, reason: collision with root package name */
    public static final q0.l f359241f = new q0.l(new java.lang.Object[0]);

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object[] f359242e;

    public l(java.lang.Object[] buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f359242e = buffer;
    }

    @Override // java.util.List, p0.e
    public p0.e add(int i17, java.lang.Object obj) {
        java.lang.Object[] objArr = this.f359242e;
        t0.c.b(i17, objArr.length);
        java.lang.Object[] objArr2 = this.f359242e;
        if (i17 == objArr2.length) {
            return add(obj);
        }
        if (objArr2.length < 32) {
            java.lang.Object[] objArr3 = new java.lang.Object[objArr2.length + 1];
            kz5.v.p(objArr2, objArr3, 0, 0, i17, 6, null);
            kz5.v.k(objArr2, objArr3, i17 + 1, i17, objArr.length);
            objArr3[i17] = obj;
            return new q0.l(objArr3);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, size)");
        kz5.v.k(objArr2, copyOf, i17 + 1, i17, objArr.length - 1);
        copyOf[i17] = obj;
        java.lang.Object[] objArr4 = new java.lang.Object[32];
        objArr4[0] = objArr2[31];
        return new q0.f(copyOf, objArr4, objArr.length + 1, 0);
    }

    @Override // q0.c, java.util.Collection, java.util.List, p0.e
    public p0.e addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        if (d() + elements.size() > 32) {
            p0.d x17 = x();
            x17.addAll(elements);
            return ((q0.h) x17).g();
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.f359242e, d() + elements.size());
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
        int d17 = d();
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            copyOf[d17] = it.next();
            d17++;
        }
        return new q0.l(copyOf);
    }

    @Override // kz5.b
    public int d() {
        return this.f359242e.length;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        t0.c.a(i17, d());
        return this.f359242e[i17];
    }

    @Override // p0.e
    public p0.e i(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        int d17 = d();
        int d18 = d();
        java.lang.Object[] objArr = this.f359242e;
        boolean z17 = false;
        java.lang.Object[] objArr2 = objArr;
        for (int i17 = 0; i17 < d18; i17++) {
            java.lang.Object obj = objArr[i17];
            if (((java.lang.Boolean) predicate.invoke(obj)).booleanValue()) {
                if (!z17) {
                    objArr2 = java.util.Arrays.copyOf(objArr, objArr.length);
                    kotlin.jvm.internal.o.f(objArr2, "copyOf(this, size)");
                    z17 = true;
                    d17 = i17;
                }
            } else if (z17) {
                objArr2[d17] = obj;
                d17++;
            }
        }
        return d17 == d() ? this : d17 == 0 ? f359241f : new q0.l(kz5.v.s(objArr2, 0, d17));
    }

    @Override // kz5.h, java.util.List
    public int indexOf(java.lang.Object obj) {
        return kz5.z.X(this.f359242e, obj);
    }

    @Override // kz5.h, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        java.lang.Object[] objArr = this.f359242e;
        kotlin.jvm.internal.o.g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i17 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i17 < 0) {
                    return -1;
                }
                length = i17;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i18 = length2 - 1;
                if (kotlin.jvm.internal.o.b(obj, objArr[length2])) {
                    return length2;
                }
                if (i18 < 0) {
                    return -1;
                }
                length2 = i18;
            }
        }
    }

    @Override // kz5.h, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        t0.c.b(i17, d());
        return new q0.d(this.f359242e, i17, d());
    }

    @Override // kz5.h, java.util.List
    public p0.e set(int i17, java.lang.Object obj) {
        t0.c.a(i17, d());
        java.lang.Object[] objArr = this.f359242e;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, size)");
        copyOf[i17] = obj;
        return new q0.l(copyOf);
    }

    @Override // p0.e
    public p0.e v(int i17) {
        t0.c.a(i17, d());
        if (d() == 1) {
            return f359241f;
        }
        int d17 = d() - 1;
        java.lang.Object[] objArr = this.f359242e;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, d17);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
        kz5.v.k(objArr, copyOf, i17, i17 + 1, d());
        return new q0.l(copyOf);
    }

    @Override // p0.e
    public p0.d x() {
        return new q0.h(this, null, this.f359242e, 0);
    }

    @Override // java.util.Collection, java.util.List, p0.e
    public p0.e add(java.lang.Object obj) {
        java.lang.Object[] objArr = this.f359242e;
        if (objArr.length < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length + 1);
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            copyOf[objArr.length] = obj;
            return new q0.l(copyOf);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[32];
        objArr2[0] = obj;
        return new q0.f(objArr, objArr2, objArr.length + 1, 0);
    }
}
