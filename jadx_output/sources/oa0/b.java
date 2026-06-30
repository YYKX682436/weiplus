package oa0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343800d = 0;

    public b(oa0.c cVar, oa0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343800d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343800d;
        this.f343800d = i17 + 1;
        if (i17 == 0) {
            return na0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
