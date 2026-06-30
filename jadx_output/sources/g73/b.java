package g73;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f269255d = 0;

    public b(g73.c cVar, g73.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f269255d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f269255d;
        this.f269255d = i17 + 1;
        if (i17 == 0) {
            return g73.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
