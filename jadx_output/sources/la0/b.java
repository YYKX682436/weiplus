package la0;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317462d = 0;

    public b(la0.c cVar, la0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317462d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317462d;
        this.f317462d = i17 + 1;
        if (i17 == 0) {
            return la0.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
