package of0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f344862d = 0;

    public b(of0.c cVar, of0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f344862d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f344862d;
        this.f344862d = i17 + 1;
        if (i17 == 0) {
            return of0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
