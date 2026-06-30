package y61;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459618d = 0;

    public b(y61.c cVar, y61.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459618d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459618d;
        this.f459618d = i17 + 1;
        if (i17 == 0) {
            return m61.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
