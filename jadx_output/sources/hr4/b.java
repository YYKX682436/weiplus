package hr4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f284247d = 0;

    public b(hr4.c cVar, hr4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f284247d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f284247d;
        this.f284247d = i17 + 1;
        if (i17 == 0) {
            return hr4.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
