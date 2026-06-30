package s0;

/* loaded from: classes14.dex */
public final class b extends kz5.o implements p0.g {

    /* renamed from: g, reason: collision with root package name */
    public static final s0.b f401841g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f401842d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f401843e;

    /* renamed from: f, reason: collision with root package name */
    public final r0.d f401844f;

    static {
        t0.b bVar = t0.b.f414261a;
        f401841g = new s0.b(bVar, bVar, r0.d.f367962f);
    }

    public b(java.lang.Object obj, java.lang.Object obj2, r0.d hashMap) {
        kotlin.jvm.internal.o.g(hashMap, "hashMap");
        this.f401842d = obj;
        this.f401843e = obj2;
        this.f401844f = hashMap;
    }

    @Override // kz5.b, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f401844f.containsKey(obj);
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f401844f;
        dVar.getClass();
        return dVar.f367964e;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new s0.c(this.f401842d, this.f401844f);
    }
}
