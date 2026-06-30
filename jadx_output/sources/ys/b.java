package ys;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f465114d = 0;

    public b(ys.c cVar, ys.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f465114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f465114d;
        this.f465114d = i17 + 1;
        if (i17 == 0) {
            return il0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
