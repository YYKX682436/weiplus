package uw1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431633d = 0;

    public b(uw1.c cVar, uw1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431633d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431633d;
        this.f431633d = i17 + 1;
        if (i17 == 0) {
            return uw1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
