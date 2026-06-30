package rh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f395579d = 0;

    public b(rh0.c cVar, rh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f395579d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f395579d;
        this.f395579d = i17 + 1;
        if (i17 == 0) {
            return qh0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
