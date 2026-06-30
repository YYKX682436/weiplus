package gw;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f276122d = 0;

    public b(gw.c cVar, gw.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f276122d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f276122d;
        this.f276122d = i17 + 1;
        if (i17 == 0) {
            return hw.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
