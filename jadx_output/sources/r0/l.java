package r0;

/* loaded from: classes14.dex */
public final class l extends kz5.k {

    /* renamed from: d, reason: collision with root package name */
    public final r0.f f367981d;

    public l(r0.f builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f367981d = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f367981d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.f367981d.containsValue(obj);
    }

    @Override // kz5.k
    public int d() {
        r0.f fVar = this.f367981d;
        fVar.getClass();
        return fVar.f367973i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new r0.m(this.f367981d);
    }
}
