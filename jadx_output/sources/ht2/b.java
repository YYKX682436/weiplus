package ht2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284811d = 0;

    public b(ht2.c cVar, ht2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284811d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284811d;
        this.f284811d = i17 + 1;
        if (i17 == 0) {
            return ht2.a1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
