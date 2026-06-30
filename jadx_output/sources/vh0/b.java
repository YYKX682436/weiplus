package vh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436833d = 0;

    public b(vh0.c cVar, vh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436833d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436833d;
        this.f436833d = i17 + 1;
        if (i17 == 0) {
            return vh0.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
