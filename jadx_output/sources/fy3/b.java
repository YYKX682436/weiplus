package fy3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f267242d = 0;

    public b(fy3.c cVar, fy3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f267242d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f267242d;
        this.f267242d = i17 + 1;
        if (i17 == 0) {
            return my3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
