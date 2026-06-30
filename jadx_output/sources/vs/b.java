package vs;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f439821d = 0;

    public b(vs.c cVar, vs.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f439821d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f439821d;
        this.f439821d = i17 + 1;
        if (i17 == 0) {
            return us.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
