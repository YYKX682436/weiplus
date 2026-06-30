package cq;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f221167d = 0;

    public b(cq.c cVar, cq.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221167d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f221167d;
        this.f221167d = i17 + 1;
        if (i17 == 0) {
            return cq.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
