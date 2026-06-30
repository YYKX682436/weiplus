package xv;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f457346d = 0;

    public b(xv.c cVar, xv.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f457346d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f457346d;
        this.f457346d = i17 + 1;
        if (i17 == 0) {
            return wv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
