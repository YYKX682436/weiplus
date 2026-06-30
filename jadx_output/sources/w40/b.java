package w40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442842d = 0;

    public b(w40.c cVar, w40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442842d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442842d;
        this.f442842d = i17 + 1;
        if (i17 == 0) {
            return qs2.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
