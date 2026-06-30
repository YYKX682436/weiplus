package pa3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f352978d = 0;

    public b(pa3.c cVar, pa3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f352978d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f352978d;
        this.f352978d = i17 + 1;
        if (i17 == 0) {
            return pa3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
