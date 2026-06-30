package vd2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f435653d = 0;

    public b(vd2.c cVar, vd2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f435653d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f435653d;
        this.f435653d = i17 + 1;
        if (i17 == 0) {
            return vd2.v0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
