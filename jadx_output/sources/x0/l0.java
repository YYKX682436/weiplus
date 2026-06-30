package x0;

/* loaded from: classes14.dex */
public final class l0 implements java.util.Map, x0.z0, zz5.f {

    /* renamed from: d, reason: collision with root package name */
    public x0.a1 f450903d = new x0.k0(r0.d.f367962f);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f450904e = new x0.a0(this);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f450905f = new x0.b0(this);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Collection f450906g = new x0.d0(this);

    public final x0.k0 b() {
        return (x0.k0) x0.z.q((x0.k0) this.f450903d, this);
    }

    @Override // java.util.Map
    public void clear() {
        x0.m i17;
        x0.k0 k0Var = (x0.k0) x0.z.h((x0.k0) this.f450903d, x0.z.i());
        r0.d dVar = r0.d.f367962f;
        if (dVar != k0Var.f450901c) {
            synchronized (x0.m0.f450912a) {
                x0.k0 k0Var2 = (x0.k0) this.f450903d;
                synchronized (x0.z.f450963b) {
                    i17 = x0.z.i();
                    x0.k0 k0Var3 = (x0.k0) x0.z.u(k0Var2, this, i17);
                    k0Var3.c(dVar);
                    k0Var3.f450902d++;
                }
                x0.z.m(i17, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return b().f450901c.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return b().f450901c.containsValue(obj);
    }

    @Override // x0.z0
    public x0.a1 d(x0.a1 a1Var, x0.a1 a1Var2, x0.a1 a1Var3) {
        x0.y0.a(this, a1Var, a1Var2, a1Var3);
        return null;
    }

    @Override // x0.z0
    public void e(x0.a1 value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f450903d = (x0.k0) value;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return this.f450904e;
    }

    @Override // x0.z0
    public x0.a1 g() {
        return this.f450903d;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return b().f450901c.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().f450901c.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return this.f450905f;
    }

    @Override // java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        p0.f fVar;
        int i17;
        V put;
        x0.m i18;
        boolean z17;
        do {
            java.lang.Object obj3 = x0.m0.f450912a;
            synchronized (obj3) {
                x0.k0 k0Var = (x0.k0) x0.z.h((x0.k0) this.f450903d, x0.z.i());
                fVar = k0Var.f450901c;
                i17 = k0Var.f450902d;
            }
            kotlin.jvm.internal.o.d(fVar);
            r0.f fVar2 = new r0.f((r0.d) fVar);
            put = fVar2.put(obj, obj2);
            r0.d b17 = fVar2.b();
            if (kotlin.jvm.internal.o.b(b17, fVar)) {
                break;
            }
            synchronized (obj3) {
                x0.k0 k0Var2 = (x0.k0) this.f450903d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.k0 k0Var3 = (x0.k0) x0.z.u(k0Var2, this, i18);
                    if (k0Var3.f450902d == i17) {
                        k0Var3.c(b17);
                        z17 = true;
                        k0Var3.f450902d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
        return put;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map from) {
        p0.f fVar;
        int i17;
        x0.m i18;
        boolean z17;
        kotlin.jvm.internal.o.g(from, "from");
        do {
            java.lang.Object obj = x0.m0.f450912a;
            synchronized (obj) {
                x0.k0 k0Var = (x0.k0) x0.z.h((x0.k0) this.f450903d, x0.z.i());
                fVar = k0Var.f450901c;
                i17 = k0Var.f450902d;
            }
            kotlin.jvm.internal.o.d(fVar);
            r0.f fVar2 = new r0.f((r0.d) fVar);
            fVar2.putAll(from);
            r0.d b17 = fVar2.b();
            if (kotlin.jvm.internal.o.b(b17, fVar)) {
                return;
            }
            synchronized (obj) {
                x0.k0 k0Var2 = (x0.k0) this.f450903d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.k0 k0Var3 = (x0.k0) x0.z.u(k0Var2, this, i18);
                    if (k0Var3.f450902d == i17) {
                        k0Var3.c(b17);
                        z17 = true;
                        k0Var3.f450902d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        p0.f fVar;
        int i17;
        V remove;
        x0.m i18;
        boolean z17;
        do {
            java.lang.Object obj2 = x0.m0.f450912a;
            synchronized (obj2) {
                x0.k0 k0Var = (x0.k0) x0.z.h((x0.k0) this.f450903d, x0.z.i());
                fVar = k0Var.f450901c;
                i17 = k0Var.f450902d;
            }
            kotlin.jvm.internal.o.d(fVar);
            r0.f fVar2 = new r0.f((r0.d) fVar);
            remove = fVar2.remove(obj);
            r0.d b17 = fVar2.b();
            if (kotlin.jvm.internal.o.b(b17, fVar)) {
                break;
            }
            synchronized (obj2) {
                x0.k0 k0Var2 = (x0.k0) this.f450903d;
                synchronized (x0.z.f450963b) {
                    i18 = x0.z.i();
                    x0.k0 k0Var3 = (x0.k0) x0.z.u(k0Var2, this, i18);
                    if (k0Var3.f450902d == i17) {
                        k0Var3.c(b17);
                        z17 = true;
                        k0Var3.f450902d++;
                    } else {
                        z17 = false;
                    }
                }
                x0.z.m(i18, this);
            }
        } while (!z17);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().f450901c.size();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return this.f450906g;
    }
}
