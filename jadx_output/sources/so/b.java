package so;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f410179d = 0;

    public b(so.c cVar, so.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f410179d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f410179d;
        this.f410179d = i17 + 1;
        if (i17 == 0) {
            return hr0.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
