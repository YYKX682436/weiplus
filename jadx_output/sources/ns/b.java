package ns;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339345d = 0;

    public b(ns.c cVar, ns.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339345d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339345d;
        this.f339345d = i17 + 1;
        if (i17 == 0) {
            return ms.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
