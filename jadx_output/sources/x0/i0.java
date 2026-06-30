package x0;

/* loaded from: classes14.dex */
public final class i0 implements java.util.List, x0.z0, zz5.d {

    /* renamed from: d, reason: collision with root package name */
    public x0.a1 f450896d = new x0.f0(q0.l.f359241f);

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        int i17;
        p0.e eVar;
        boolean z17;
        x0.m i18;
        do {
            java.lang.Object obj2 = x0.j0.f450899a;
            synchronized (obj2) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i17 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.e add = eVar.add(obj);
            z17 = false;
            if (kotlin.jvm.internal.o.b(add, eVar)) {
                return false;
            }
            synchronized (obj2) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i18);
                    if (f0Var3.f450888d == i17) {
                        f0Var3.c(add);
                        f0Var3.f450888d++;
                        z17 = true;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return k(new x0.g0(i17, elements));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        x0.m i17;
        synchronized (x0.j0.f450899a) {
            x0.f0 f0Var = (x0.f0) this.f450896d;
            synchronized (x0.z.f450963b) {
                i17 = x0.z.i();
                x0.f0 f0Var2 = (x0.f0) x0.z.u(f0Var, this, i17);
                f0Var2.c(q0.l.f359241f);
                f0Var2.f450888d++;
            }
            x0.z.m(i17, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return ((q0.c) j().f450887c).contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return ((q0.c) j().f450887c).containsAll(elements);
    }

    @Override // x0.z0
    public x0.a1 d(x0.a1 a1Var, x0.a1 a1Var2, x0.a1 a1Var3) {
        x0.y0.a(this, a1Var, a1Var2, a1Var3);
        return null;
    }

    @Override // x0.z0
    public void e(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        value.f450862b = this.f450896d;
        this.f450896d = (x0.f0) value;
    }

    @Override // x0.z0
    public x0.a1 g() {
        return this.f450896d;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        return j().f450887c.get(i17);
    }

    public final int h() {
        return ((x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i())).f450888d;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        return j().f450887c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return ((kz5.b) j().f450887c).isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return listIterator();
    }

    public final x0.f0 j() {
        return (x0.f0) x0.z.q((x0.f0) this.f450896d, this);
    }

    public final boolean k(yz5.l lVar) {
        int i17;
        p0.e eVar;
        java.lang.Object invoke;
        x0.m i18;
        boolean z17;
        do {
            java.lang.Object obj = x0.j0.f450899a;
            synchronized (obj) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i17 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.d x17 = eVar.x();
            invoke = lVar.invoke(x17);
            p0.e g17 = ((q0.h) x17).g();
            if (kotlin.jvm.internal.o.b(g17, eVar)) {
                break;
            }
            synchronized (obj) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i18);
                    if (f0Var3.f450888d == i17) {
                        f0Var3.c(g17);
                        z17 = true;
                        f0Var3.f450888d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
        return ((java.lang.Boolean) invoke).booleanValue();
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return j().f450887c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new x0.s0(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i17) {
        int i18;
        p0.e eVar;
        x0.m i19;
        boolean z17;
        java.lang.Object obj = get(i17);
        do {
            java.lang.Object obj2 = x0.j0.f450899a;
            synchronized (obj2) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i18 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.e v17 = eVar.v(i17);
            if (kotlin.jvm.internal.o.b(v17, eVar)) {
                break;
            }
            synchronized (obj2) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i19 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i19);
                    if (f0Var3.f450888d == i18) {
                        f0Var3.c(v17);
                        z17 = true;
                        f0Var3.f450888d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i19, this);
            }
        } while (!z17);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        int i17;
        p0.e eVar;
        boolean z17;
        x0.m i18;
        kotlin.jvm.internal.o.g(elements, "elements");
        do {
            java.lang.Object obj = x0.j0.f450899a;
            synchronized (obj) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i17 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.e i19 = ((q0.c) eVar).i(new q0.b(elements));
            z17 = false;
            if (kotlin.jvm.internal.o.b(i19, eVar)) {
                return false;
            }
            synchronized (obj) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i18);
                    if (f0Var3.f450888d == i17) {
                        f0Var3.c(i19);
                        f0Var3.f450888d++;
                        z17 = true;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return k(new x0.h0(elements));
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        int i18;
        p0.e eVar;
        x0.m i19;
        boolean z17;
        java.lang.Object obj2 = get(i17);
        do {
            java.lang.Object obj3 = x0.j0.f450899a;
            synchronized (obj3) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i18 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.e eVar2 = eVar.set(i17, obj);
            if (kotlin.jvm.internal.o.b(eVar2, eVar)) {
                break;
            }
            synchronized (obj3) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i19 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i19);
                    if (f0Var3.f450888d == i18) {
                        f0Var3.c(eVar2);
                        z17 = true;
                        f0Var3.f450888d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i19, this);
            }
        } while (!z17);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return ((kz5.b) j().f450887c).d();
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        if ((i17 >= 0 && i17 <= i18) && i18 <= size()) {
            return new x0.c1(this, i17, i18);
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        int i17;
        p0.e eVar;
        boolean z17;
        x0.m i18;
        kotlin.jvm.internal.o.g(elements, "elements");
        do {
            java.lang.Object obj = x0.j0.f450899a;
            synchronized (obj) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i17 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.e addAll = eVar.addAll(elements);
            z17 = false;
            if (kotlin.jvm.internal.o.b(addAll, eVar)) {
                return false;
            }
            synchronized (obj) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i18);
                    if (f0Var3.f450888d == i17) {
                        f0Var3.c(addAll);
                        f0Var3.f450888d++;
                        z17 = true;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
        return true;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new x0.s0(this, i17);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        int i18;
        p0.e eVar;
        x0.m i19;
        boolean z17;
        do {
            java.lang.Object obj2 = x0.j0.f450899a;
            synchronized (obj2) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i18 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.e add = eVar.add(i17, obj);
            if (kotlin.jvm.internal.o.b(add, eVar)) {
                return;
            }
            synchronized (obj2) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i19 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i19);
                    if (f0Var3.f450888d == i18) {
                        f0Var3.c(add);
                        z17 = true;
                        f0Var3.f450888d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i19, this);
            }
        } while (!z17);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        int i17;
        p0.e eVar;
        boolean z17;
        x0.m i18;
        do {
            java.lang.Object obj2 = x0.j0.f450899a;
            synchronized (obj2) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) this.f450896d, x0.z.i());
                i17 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.e eVar2 = (q0.c) eVar;
            int indexOf = eVar2.indexOf(obj);
            if (indexOf != -1) {
                eVar2 = eVar2.v(indexOf);
            }
            z17 = false;
            if (kotlin.jvm.internal.o.b(eVar2, eVar)) {
                return false;
            }
            synchronized (obj2) {
                x0.f0 f0Var2 = (x0.f0) this.f450896d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, this, i18);
                    if (f0Var3.f450888d == i17) {
                        f0Var3.c(eVar2);
                        f0Var3.f450888d++;
                        z17 = true;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
        return true;
    }
}
