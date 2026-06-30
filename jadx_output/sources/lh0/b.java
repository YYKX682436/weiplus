package lh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318641d = 0;

    public b(lh0.c cVar, lh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318641d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318641d;
        this.f318641d = i17 + 1;
        if (i17 == 0) {
            return lh0.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
