package r0;

/* loaded from: classes14.dex */
public final class h extends r0.a {

    /* renamed from: d, reason: collision with root package name */
    public final r0.f f367978d;

    public h(r0.f builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        this.f367978d = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(element, "element");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f367978d.clear();
    }

    @Override // kz5.n
    public int d() {
        r0.f fVar = this.f367978d;
        fVar.getClass();
        return fVar.f367973i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        return new r0.i(this.f367978d);
    }
}
