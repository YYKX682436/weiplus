package u50;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f424756d = 0;

    public b(u50.c cVar, u50.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f424756d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f424756d;
        this.f424756d = i17 + 1;
        if (i17 == 0) {
            return s50.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
