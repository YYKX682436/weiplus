package nw;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340731d = 0;

    public b(nw.c cVar, nw.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340731d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340731d;
        this.f340731d = i17 + 1;
        if (i17 == 0) {
            return nw.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
