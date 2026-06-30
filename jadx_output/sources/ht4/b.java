package ht4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284955d = 0;

    public b(ht4.c cVar, ht4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284955d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284955d;
        this.f284955d = i17 + 1;
        if (i17 == 0) {
            return ht4.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
