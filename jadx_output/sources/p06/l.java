package p06;

/* loaded from: classes16.dex */
public final class l implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f350766d;

    public l(java.util.List annotations) {
        kotlin.jvm.internal.o.g(annotations, "annotations");
        this.f350766d = annotations;
    }

    @Override // p06.k
    public boolean I(n16.c cVar) {
        return p06.j.b(this, cVar);
    }

    @Override // p06.k
    public p06.c a(n16.c cVar) {
        return p06.j.a(this, cVar);
    }

    @Override // p06.k
    public boolean isEmpty() {
        return this.f350766d.isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return this.f350766d.iterator();
    }

    public java.lang.String toString() {
        return this.f350766d.toString();
    }
}
