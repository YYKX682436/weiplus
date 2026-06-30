package r0;

/* loaded from: classes14.dex */
public final class j extends kz5.n {

    /* renamed from: d, reason: collision with root package name */
    public final r0.f f367980d;

    public j(r0.f builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f367980d = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f367980d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this.f367980d.containsKey(obj);
    }

    @Override // kz5.n
    public int d() {
        r0.f fVar = this.f367980d;
        fVar.getClass();
        return fVar.f367973i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new r0.k(this.f367980d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        r0.f fVar = this.f367980d;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}
