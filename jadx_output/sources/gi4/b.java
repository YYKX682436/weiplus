package gi4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f272287d = 0;

    public b(gi4.c cVar, gi4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f272287d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f272287d;
        this.f272287d = i17 + 1;
        if (i17 == 0) {
            return gi4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
