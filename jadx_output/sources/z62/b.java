package z62;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470333d = 0;

    public b(z62.c cVar, z62.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470333d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470333d;
        this.f470333d = i17 + 1;
        if (i17 == 0) {
            return z62.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
