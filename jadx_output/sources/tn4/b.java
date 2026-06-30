package tn4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f420824d = 0;

    public b(tn4.c cVar, tn4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f420824d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f420824d;
        this.f420824d = i17 + 1;
        if (i17 == 0) {
            return tn4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
