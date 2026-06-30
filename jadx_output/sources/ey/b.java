package ey;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f257268d = 0;

    public b(ey.c cVar, ey.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f257268d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f257268d;
        this.f257268d = i17 + 1;
        if (i17 == 0) {
            return ey.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
