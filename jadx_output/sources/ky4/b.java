package ky4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f313619d = 0;

    public b(ky4.c cVar, ky4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f313619d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f313619d;
        this.f313619d = i17 + 1;
        if (i17 == 0) {
            return ky4.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
