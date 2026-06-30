package m63;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f324386d = 0;

    public b(m63.c cVar, m63.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f324386d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f324386d;
        this.f324386d = i17 + 1;
        if (i17 == 0) {
            return l63.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
