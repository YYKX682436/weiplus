package xf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f454160d = 0;

    public b(xf0.c cVar, xf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f454160d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f454160d;
        this.f454160d = i17 + 1;
        if (i17 == 0) {
            return xf0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
