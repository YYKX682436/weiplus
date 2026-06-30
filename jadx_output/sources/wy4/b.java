package wy4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450648d = 0;

    public b(wy4.c cVar, wy4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450648d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450648d;
        this.f450648d = i17 + 1;
        if (i17 == 0) {
            return wy4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
