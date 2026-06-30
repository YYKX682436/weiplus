package lp3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f320282d = 0;

    public b(lp3.c cVar, lp3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f320282d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f320282d;
        this.f320282d = i17 + 1;
        if (i17 == 0) {
            return lp3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
