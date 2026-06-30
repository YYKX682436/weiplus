package jt;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301573d = 0;

    public b(jt.c cVar, jt.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301573d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301573d;
        this.f301573d = i17 + 1;
        if (i17 == 0) {
            return ht.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
