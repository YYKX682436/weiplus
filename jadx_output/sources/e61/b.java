package e61;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f249752d = 0;

    public b(e61.c cVar, e61.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f249752d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f249752d;
        this.f249752d = i17 + 1;
        if (i17 == 0) {
            return e61.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
