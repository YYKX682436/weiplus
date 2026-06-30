package si3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f408306d = 0;

    public b(si3.c cVar, si3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f408306d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f408306d;
        this.f408306d = i17 + 1;
        if (i17 == 0) {
            return si3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
