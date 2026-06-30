package rn3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f397943d = 0;

    public b(rn3.c cVar, rn3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f397943d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f397943d;
        this.f397943d = i17 + 1;
        if (i17 == 0) {
            return rn3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
