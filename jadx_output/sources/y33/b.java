package y33;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f459173d = 0;

    public b(y33.c cVar, y33.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f459173d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f459173d;
        this.f459173d = i17 + 1;
        if (i17 == 0) {
            return i60.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
