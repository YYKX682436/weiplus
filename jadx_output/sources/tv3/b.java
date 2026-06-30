package tv3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422350d = 0;

    public b(tv3.c cVar, tv3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422350d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422350d;
        this.f422350d = i17 + 1;
        if (i17 == 0) {
            return tv3.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
