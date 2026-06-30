package yy0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f468017d = 0;

    public b(yy0.c cVar, yy0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f468017d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f468017d;
        this.f468017d = i17 + 1;
        if (i17 == 0) {
            return yy0.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
