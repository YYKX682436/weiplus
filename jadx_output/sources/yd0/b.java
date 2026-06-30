package yd0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f460976d = 0;

    public b(yd0.c cVar, yd0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f460976d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f460976d;
        this.f460976d = i17 + 1;
        if (i17 == 0) {
            return c34.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
