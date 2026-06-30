package lo;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319943d = 0;

    public c(lo.d dVar, lo.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319943d;
        this.f319943d = i17 + 1;
        if (i17 == 0) {
            return qb5.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
