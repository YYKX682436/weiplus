package fa0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f260652d = 0;

    public b(fa0.c cVar, fa0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f260652d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f260652d;
        this.f260652d = i17 + 1;
        if (i17 == 0) {
            return fa0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
