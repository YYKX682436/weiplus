package o0;

/* loaded from: classes14.dex */
public final class i implements java.util.RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f341850d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f341851e;

    /* renamed from: f, reason: collision with root package name */
    public int f341852f;

    public i(java.lang.Object[] content, int i17) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f341850d = content;
        this.f341852f = i17;
    }

    public final void a(int i17, java.lang.Object obj) {
        g(this.f341852f + 1);
        java.lang.Object[] objArr = this.f341850d;
        int i18 = this.f341852f;
        if (i17 != i18) {
            kz5.v.k(objArr, objArr, i17 + 1, i17, i18);
        }
        objArr[i17] = obj;
        this.f341852f++;
    }

    public final boolean b(java.lang.Object obj) {
        g(this.f341852f + 1);
        java.lang.Object[] objArr = this.f341850d;
        int i17 = this.f341852f;
        objArr[i17] = obj;
        this.f341852f = i17 + 1;
        return true;
    }

    public final boolean c(int i17, java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        int i18 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        g(this.f341852f + elements.size());
        java.lang.Object[] objArr = this.f341850d;
        if (i17 != this.f341852f) {
            kz5.v.k(objArr, objArr, elements.size() + i17, i17, this.f341852f);
        }
        for (java.lang.Object obj : elements) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            objArr[i18 + i17] = obj;
            i18 = i19;
        }
        this.f341852f += elements.size();
        return true;
    }

    public final boolean d(int i17, o0.i elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        if (elements.i()) {
            return false;
        }
        g(this.f341852f + elements.f341852f);
        java.lang.Object[] objArr = this.f341850d;
        int i18 = this.f341852f;
        if (i17 != i18) {
            kz5.v.k(objArr, objArr, elements.f341852f + i17, i17, i18);
        }
        kz5.v.k(elements.f341850d, objArr, i17, 0, elements.f341852f);
        this.f341852f += elements.f341852f;
        return true;
    }

    public final void e() {
        java.lang.Object[] objArr = this.f341850d;
        int i17 = this.f341852f;
        while (true) {
            i17--;
            if (-1 >= i17) {
                this.f341852f = 0;
                return;
            }
            objArr[i17] = null;
        }
    }

    public final boolean f(java.lang.Object obj) {
        int i17 = this.f341852f - 1;
        if (i17 >= 0) {
            for (int i18 = 0; !kotlin.jvm.internal.o.b(this.f341850d[i18], obj); i18++) {
                if (i18 != i17) {
                }
            }
            return true;
        }
        return false;
    }

    public final void g(int i17) {
        java.lang.Object[] objArr = this.f341850d;
        if (objArr.length < i17) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, java.lang.Math.max(i17, objArr.length * 2));
            kotlin.jvm.internal.o.f(copyOf, "copyOf(this, newSize)");
            this.f341850d = copyOf;
        }
    }

    public final int h(java.lang.Object obj) {
        int i17 = this.f341852f;
        if (i17 <= 0) {
            return -1;
        }
        java.lang.Object[] objArr = this.f341850d;
        int i18 = 0;
        while (!kotlin.jvm.internal.o.b(obj, objArr[i18])) {
            i18++;
            if (i18 >= i17) {
                return -1;
            }
        }
        return i18;
    }

    public final boolean i() {
        return this.f341852f == 0;
    }

    public final boolean j() {
        return this.f341852f != 0;
    }

    public final boolean k(java.lang.Object obj) {
        int h17 = h(obj);
        if (h17 < 0) {
            return false;
        }
        m(h17);
        return true;
    }

    public final boolean l(o0.i elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        int i17 = this.f341852f;
        int i18 = elements.f341852f - 1;
        if (i18 >= 0) {
            int i19 = 0;
            while (true) {
                k(elements.f341850d[i19]);
                if (i19 == i18) {
                    break;
                }
                i19++;
            }
        }
        return i17 != this.f341852f;
    }

    public final java.lang.Object m(int i17) {
        java.lang.Object[] objArr = this.f341850d;
        java.lang.Object obj = objArr[i17];
        int i18 = this.f341852f;
        if (i17 != i18 - 1) {
            kz5.v.k(objArr, objArr, i17, i17 + 1, i18);
        }
        int i19 = this.f341852f - 1;
        this.f341852f = i19;
        objArr[i19] = null;
        return obj;
    }
}
