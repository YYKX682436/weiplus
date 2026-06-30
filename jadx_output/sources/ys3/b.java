package ys3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f465202d = 0;

    public b(ys3.c cVar, ys3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f465202d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f465202d;
        this.f465202d = i17 + 1;
        if (i17 == 0) {
            return ys3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
