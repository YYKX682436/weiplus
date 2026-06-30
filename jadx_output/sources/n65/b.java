package n65;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335224d = 0;

    public b(n65.c cVar, n65.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335224d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335224d;
        this.f335224d = i17 + 1;
        if (i17 == 0) {
            return s41.g.INSTANCE;
        }
        if (i17 == 1) {
            return on.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
