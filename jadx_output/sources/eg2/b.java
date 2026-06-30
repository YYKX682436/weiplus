package eg2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f252533d = 0;

    public b(eg2.c cVar, eg2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f252533d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f252533d;
        this.f252533d = i17 + 1;
        if (i17 == 0) {
            return eg2.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
