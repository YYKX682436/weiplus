package ym1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f463131d = 0;

    public b(ym1.c cVar, ym1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f463131d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f463131d;
        this.f463131d = i17 + 1;
        if (i17 == 0) {
            return ym1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
