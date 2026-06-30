package n55;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335162d = 0;

    public b(n55.c cVar, n55.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335162d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335162d;
        this.f335162d = i17 + 1;
        if (i17 == 0) {
            return wp4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
