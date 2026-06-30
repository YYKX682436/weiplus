package nq5;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f339021d = 0;

    public b(nq5.c cVar, nq5.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f339021d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f339021d;
        this.f339021d = i17 + 1;
        if (i17 == 0) {
            return nq5.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
