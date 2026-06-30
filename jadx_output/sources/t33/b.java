package t33;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f415402d = 0;

    public b(t33.c cVar, t33.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f415402d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f415402d;
        this.f415402d = i17 + 1;
        if (i17 == 0) {
            return s33.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
