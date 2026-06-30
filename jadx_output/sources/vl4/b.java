package vl4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437883d = 0;

    public b(vl4.c cVar, vl4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437883d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437883d;
        this.f437883d = i17 + 1;
        if (i17 == 0) {
            return vl4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
