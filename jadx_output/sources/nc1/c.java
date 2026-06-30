package nc1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336094d = 0;

    public c(nc1.d dVar, nc1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336094d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336094d;
        this.f336094d = i17 + 1;
        if (i17 == 0) {
            return nc1.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
