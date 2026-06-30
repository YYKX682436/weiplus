package ic0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290292d = 0;

    public b(ic0.c cVar, ic0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290292d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290292d;
        this.f290292d = i17 + 1;
        if (i17 == 0) {
            return hc0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
