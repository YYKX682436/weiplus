package d10;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f225645d = 0;

    public b(d10.c cVar, d10.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f225645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f225645d;
        this.f225645d = i17 + 1;
        if (i17 == 0) {
            return e10.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
