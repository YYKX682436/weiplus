package x0;

/* loaded from: classes14.dex */
public final class c1 implements java.util.List, zz5.d {

    /* renamed from: d, reason: collision with root package name */
    public final x0.i0 f450869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f450870e;

    /* renamed from: f, reason: collision with root package name */
    public int f450871f;

    /* renamed from: g, reason: collision with root package name */
    public int f450872g;

    public c1(x0.i0 parentList, int i17, int i18) {
        kotlin.jvm.internal.o.g(parentList, "parentList");
        this.f450869d = parentList;
        this.f450870e = i17;
        this.f450871f = parentList.h();
        this.f450872g = i18 - i17;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(java.lang.Object obj) {
        d();
        int i17 = this.f450870e + this.f450872g;
        x0.i0 i0Var = this.f450869d;
        i0Var.add(i17, obj);
        this.f450872g++;
        this.f450871f = i0Var.h();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        return addAll(this.f450872g, elements);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int i17;
        p0.e eVar;
        x0.m i18;
        boolean z17;
        if (this.f450872g > 0) {
            d();
            x0.i0 i0Var = this.f450869d;
            int i19 = this.f450870e;
            int i27 = this.f450872g + i19;
            i0Var.getClass();
            do {
                java.lang.Object obj = x0.j0.f450899a;
                synchronized (obj) {
                    x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) i0Var.f450896d, x0.z.i());
                    i17 = f0Var.f450888d;
                    eVar = f0Var.f450887c;
                }
                kotlin.jvm.internal.o.d(eVar);
                p0.d x17 = eVar.x();
                x17.subList(i19, i27).clear();
                p0.e g17 = ((q0.h) x17).g();
                if (kotlin.jvm.internal.o.b(g17, eVar)) {
                    break;
                }
                synchronized (obj) {
                    x0.f0 f0Var2 = (x0.f0) i0Var.f450896d;
                    synchronized (x0.z.f450963b) {
                        i18 = x0.z.i();
                        x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, i0Var, i18);
                        if (f0Var3.f450888d == i17) {
                            f0Var3.c(g17);
                            z17 = true;
                            f0Var3.f450888d++;
                        } else {
                            z17 = false;
                        }
                    }
                    x0.z.m(i18, i0Var);
                }
            } while (!z17);
            this.f450872g = 0;
            this.f450871f = this.f450869d.h();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        if (this.f450869d.h() != this.f450871f) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        d();
        x0.j0.a(i17, this.f450872g);
        return this.f450869d.get(this.f450870e + i17);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        d();
        int i17 = this.f450872g;
        int i18 = this.f450870e;
        java.util.Iterator it = e06.p.m(i18, i17 + i18).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            if (kotlin.jvm.internal.o.b(obj, this.f450869d.get(b17))) {
                return b17 - i18;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f450872g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        d();
        int i17 = this.f450872g;
        int i18 = this.f450870e;
        for (int i19 = (i17 + i18) - 1; i19 >= i18; i19--) {
            if (kotlin.jvm.internal.o.b(obj, this.f450869d.get(i19))) {
                return i19 - i18;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (true) {
            boolean z17 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z17) {
                    z17 = true;
                }
            }
            return z17;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        int i17;
        p0.e eVar;
        x0.m i18;
        boolean z17;
        kotlin.jvm.internal.o.g(elements, "elements");
        d();
        x0.i0 i0Var = this.f450869d;
        int i19 = this.f450870e;
        int i27 = this.f450872g + i19;
        i0Var.getClass();
        int size = i0Var.size();
        do {
            java.lang.Object obj = x0.j0.f450899a;
            synchronized (obj) {
                x0.f0 f0Var = (x0.f0) x0.z.h((x0.f0) i0Var.f450896d, x0.z.i());
                i17 = f0Var.f450888d;
                eVar = f0Var.f450887c;
            }
            kotlin.jvm.internal.o.d(eVar);
            p0.d x17 = eVar.x();
            x17.subList(i19, i27).retainAll(elements);
            p0.e g17 = ((q0.h) x17).g();
            if (kotlin.jvm.internal.o.b(g17, eVar)) {
                break;
            }
            synchronized (obj) {
                x0.f0 f0Var2 = (x0.f0) i0Var.f450896d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.f0 f0Var3 = (x0.f0) x0.z.u(f0Var2, i0Var, i18);
                    if (f0Var3.f450888d == i17) {
                        f0Var3.c(g17);
                        f0Var3.f450888d++;
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, i0Var);
            }
        } while (!z17);
        int size2 = size - i0Var.size();
        if (size2 > 0) {
            this.f450871f = this.f450869d.h();
            this.f450872g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public java.lang.Object set(int i17, java.lang.Object obj) {
        x0.j0.a(i17, this.f450872g);
        d();
        int i18 = i17 + this.f450870e;
        x0.i0 i0Var = this.f450869d;
        java.lang.Object obj2 = i0Var.set(i18, obj);
        this.f450871f = i0Var.h();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f450872g;
    }

    @Override // java.util.List
    public java.util.List subList(int i17, int i18) {
        if (!((i17 >= 0 && i17 <= i18) && i18 <= this.f450872g)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        d();
        int i19 = this.f450870e;
        return new x0.c1(this.f450869d, i17 + i19, i18 + i19);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.h.a(this);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i17) {
        d();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = i17 - 1;
        return new x0.b1(f0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.o.g(array, "array");
        return kotlin.jvm.internal.h.b(this, array);
    }

    @Override // java.util.List
    public boolean addAll(int i17, java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        d();
        int i18 = i17 + this.f450870e;
        x0.i0 i0Var = this.f450869d;
        boolean addAll = i0Var.addAll(i18, elements);
        if (addAll) {
            this.f450872g += elements.size();
            this.f450871f = i0Var.h();
        }
        return addAll;
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i17) {
        d();
        int i18 = this.f450870e + i17;
        x0.i0 i0Var = this.f450869d;
        java.lang.Object remove = i0Var.remove(i18);
        this.f450872g--;
        this.f450871f = i0Var.h();
        return remove;
    }

    @Override // java.util.List
    public void add(int i17, java.lang.Object obj) {
        d();
        int i18 = this.f450870e + i17;
        x0.i0 i0Var = this.f450869d;
        i0Var.add(i18, obj);
        this.f450872g++;
        this.f450871f = i0Var.h();
    }
}
