package lc5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318008d = 0;

    public b(lc5.c cVar, lc5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318008d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318008d;
        this.f318008d = i17 + 1;
        if (i17 == 0) {
            return lc5.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
