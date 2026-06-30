package uw4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f431723d = 0;

    public b(uw4.c cVar, uw4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f431723d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f431723d;
        this.f431723d = i17 + 1;
        if (i17 == 0) {
            return ah0.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
