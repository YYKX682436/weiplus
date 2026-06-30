package ls;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f320771d = 0;

    public b(ls.c cVar, ls.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f320771d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f320771d;
        this.f320771d = i17 + 1;
        if (i17 == 0) {
            return ls.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
