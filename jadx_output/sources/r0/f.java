package r0;

/* loaded from: classes14.dex */
public final class f extends kz5.m {

    /* renamed from: d, reason: collision with root package name */
    public r0.d f367968d;

    /* renamed from: e, reason: collision with root package name */
    public t0.d f367969e;

    /* renamed from: f, reason: collision with root package name */
    public r0.u f367970f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f367971g;

    /* renamed from: h, reason: collision with root package name */
    public int f367972h;

    /* renamed from: i, reason: collision with root package name */
    public int f367973i;

    public f(r0.d map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f367968d = map;
        this.f367969e = new t0.d();
        this.f367970f = map.f367963d;
        this.f367973i = map.f367964e;
    }

    public r0.d b() {
        r0.u uVar = this.f367970f;
        r0.d dVar = this.f367968d;
        if (uVar != dVar.f367963d) {
            this.f367969e = new t0.d();
            dVar = new r0.d(this.f367970f, this.f367973i);
        }
        this.f367968d = dVar;
        return dVar;
    }

    public void c(int i17) {
        this.f367973i = i17;
        this.f367972h++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        r0.u uVar = r0.u.f367987e;
        this.f367970f = r0.u.f367987e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.f367970f.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.f367970f.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        this.f367971g = null;
        this.f367970f = this.f367970f.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f367971g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map from) {
        kotlin.jvm.internal.o.g(from, "from");
        r0.d dVar = from instanceof r0.d ? (r0.d) from : null;
        if (dVar == null) {
            r0.f fVar = from instanceof r0.f ? (r0.f) from : null;
            dVar = fVar != null ? fVar.b() : null;
        }
        if (dVar == null) {
            super.putAll(from);
            return;
        }
        t0.a aVar = new t0.a(0, 1, null);
        int i17 = this.f367973i;
        this.f367970f = this.f367970f.m(dVar.f367963d, 0, aVar, this);
        int i18 = (dVar.f367964e + i17) - aVar.f414260a;
        if (i17 != i18) {
            c(i18);
        }
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int i17 = this.f367973i;
        r0.u o17 = this.f367970f.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o17 == null) {
            r0.u uVar = r0.u.f367987e;
            o17 = r0.u.f367987e;
        }
        this.f367970f = o17;
        return i17 != this.f367973i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        this.f367971g = null;
        r0.u n17 = this.f367970f.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n17 == null) {
            r0.u uVar = r0.u.f367987e;
            n17 = r0.u.f367987e;
        }
        this.f367970f = n17;
        return this.f367971g;
    }
}
