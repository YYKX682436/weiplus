package e90;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f250332d = 0;

    public b(e90.c cVar, e90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f250332d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f250332d;
        this.f250332d = i17 + 1;
        if (i17 == 0) {
            return bf5.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
