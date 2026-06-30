package pp0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f357365d = 0;

    public b(pp0.c cVar, pp0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f357365d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f357365d;
        this.f357365d = i17 + 1;
        if (i17 == 0) {
            return yy0.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
