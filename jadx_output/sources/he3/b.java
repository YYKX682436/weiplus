package he3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280899d = 0;

    public b(he3.c cVar, he3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280899d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280899d;
        this.f280899d = i17 + 1;
        if (i17 == 0) {
            return he3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
