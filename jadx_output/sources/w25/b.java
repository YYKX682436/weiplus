package w25;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442649d = 0;

    public b(w25.c cVar, w25.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442649d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442649d;
        this.f442649d = i17 + 1;
        if (i17 == 0) {
            return dn3.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
