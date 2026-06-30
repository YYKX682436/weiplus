package u60;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424865d = 0;

    public b(u60.c cVar, u60.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424865d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424865d;
        this.f424865d = i17 + 1;
        if (i17 == 0) {
            return t60.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
