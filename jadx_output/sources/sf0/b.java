package sf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f406943d = 0;

    public b(sf0.c cVar, sf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f406943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f406943d;
        this.f406943d = i17 + 1;
        if (i17 == 0) {
            return sf0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
