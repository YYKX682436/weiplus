package xs;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f456240d = 0;

    public b(xs.c cVar, xs.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f456240d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f456240d;
        this.f456240d = i17 + 1;
        if (i17 == 0) {
            return a80.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
