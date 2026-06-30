package lw3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321620d = 0;

    public b(lw3.c cVar, lw3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321620d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321620d;
        this.f321620d = i17 + 1;
        if (i17 == 0) {
            return lw3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
