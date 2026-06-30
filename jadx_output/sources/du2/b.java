package du2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f243470d = 0;

    public b(du2.c cVar, du2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f243470d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f243470d;
        this.f243470d = i17 + 1;
        if (i17 == 0) {
            return du2.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
