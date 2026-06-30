package x0;

/* loaded from: classes14.dex */
public final class d0 extends x0.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(x0.l0 map) {
        super(map);
        kotlin.jvm.internal.o.g(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        x0.m0.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        x0.m0.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f450868d.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f450868d.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        x0.l0 l0Var = this.f450868d;
        return new x0.x0(l0Var, ((p0.c) l0Var.b().f450901c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        java.lang.Object obj2;
        x0.l0 l0Var = this.f450868d;
        java.util.Iterator it = ((x0.a0) l0Var.f450904e).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((java.util.Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        l0Var.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection elements) {
        p0.f fVar;
        int i17;
        boolean z17;
        x0.m i18;
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Set X0 = kz5.n0.X0(elements);
        x0.l0 l0Var = this.f450868d;
        boolean z18 = false;
        do {
            synchronized (x0.m0.f450912a) {
                x0.k0 k0Var = (x0.k0) x0.z.h((x0.k0) l0Var.f450903d, x0.z.i());
                fVar = k0Var.f450901c;
                i17 = k0Var.f450902d;
            }
            kotlin.jvm.internal.o.d(fVar);
            r0.f fVar2 = new r0.f((r0.d) fVar);
            java.lang.Object it = ((x0.a0) l0Var.f450904e).iterator();
            while (true) {
                z17 = true;
                if (!((x0.v0) it).hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) ((x0.u0) it).next();
                if (X0.contains(entry.getValue())) {
                    fVar2.remove(entry.getKey());
                    z18 = true;
                }
            }
            r0.d b17 = fVar2.b();
            if (kotlin.jvm.internal.o.b(b17, fVar)) {
                break;
            }
            synchronized (x0.m0.f450912a) {
                x0.k0 k0Var2 = (x0.k0) l0Var.f450903d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.k0 k0Var3 = (x0.k0) x0.z.u(k0Var2, l0Var, i18);
                    if (k0Var3.f450902d == i17) {
                        k0Var3.c(b17);
                        k0Var3.f450902d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, l0Var);
            }
        } while (!z17);
        return z18;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection elements) {
        p0.f fVar;
        int i17;
        boolean z17;
        x0.m i18;
        kotlin.jvm.internal.o.g(elements, "elements");
        java.util.Set X0 = kz5.n0.X0(elements);
        x0.l0 l0Var = this.f450868d;
        boolean z18 = false;
        do {
            synchronized (x0.m0.f450912a) {
                x0.k0 k0Var = (x0.k0) x0.z.h((x0.k0) l0Var.f450903d, x0.z.i());
                fVar = k0Var.f450901c;
                i17 = k0Var.f450902d;
            }
            kotlin.jvm.internal.o.d(fVar);
            r0.f fVar2 = new r0.f((r0.d) fVar);
            java.lang.Object it = ((x0.a0) l0Var.f450904e).iterator();
            while (true) {
                z17 = true;
                if (!((x0.v0) it).hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) ((x0.u0) it).next();
                if (!X0.contains(entry.getValue())) {
                    fVar2.remove(entry.getKey());
                    z18 = true;
                }
            }
            r0.d b17 = fVar2.b();
            if (kotlin.jvm.internal.o.b(b17, fVar)) {
                break;
            }
            synchronized (x0.m0.f450912a) {
                x0.k0 k0Var2 = (x0.k0) l0Var.f450903d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.k0 k0Var3 = (x0.k0) x0.z.u(k0Var2, l0Var, i18);
                    if (k0Var3.f450902d == i17) {
                        k0Var3.c(b17);
                        k0Var3.f450902d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, l0Var);
            }
        } while (!z17);
        return z18;
    }
}
