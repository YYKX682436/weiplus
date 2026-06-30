package z02;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f469196d = 0;

    public b(z02.c cVar, z02.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f469196d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f469196d;
        this.f469196d = i17 + 1;
        if (i17 == 0) {
            return z02.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
