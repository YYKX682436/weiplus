package r0;

/* loaded from: classes14.dex */
public final class r extends kz5.b {

    /* renamed from: d, reason: collision with root package name */
    public final r0.d f367984d;

    public r(r0.d map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f367984d = map;
    }

    @Override // kz5.b, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f367984d.containsValue(obj);
    }

    @Override // kz5.b
    public int d() {
        r0.d dVar = this.f367984d;
        dVar.getClass();
        return dVar.f367964e;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new r0.s(this.f367984d.f367963d);
    }
}
