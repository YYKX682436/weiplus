package r0;

/* loaded from: classes14.dex */
public final class p extends kz5.o implements p0.c {

    /* renamed from: d, reason: collision with root package name */
    public final r0.d f367983d;

    public p(r0.d map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f367983d = map;
    }

    @Override // kz5.b, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f367983d.containsKey(obj);
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f367983d;
        dVar.getClass();
        return dVar.f367964e;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new r0.q(this.f367983d.f367963d);
    }
}
