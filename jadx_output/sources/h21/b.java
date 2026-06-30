package h21;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278269d = 0;

    public b(h21.c cVar, h21.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278269d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278269d;
        this.f278269d = i17 + 1;
        if (i17 == 0) {
            return h21.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
