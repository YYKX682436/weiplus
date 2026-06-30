package z04;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f469241d = 0;

    public b(z04.c cVar, z04.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f469241d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f469241d;
        this.f469241d = i17 + 1;
        if (i17 == 0) {
            return z04.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
