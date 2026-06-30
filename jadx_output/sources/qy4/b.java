package qy4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f367784d = 0;

    public b(qy4.c cVar, qy4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f367784d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f367784d;
        this.f367784d = i17 + 1;
        if (i17 == 0) {
            return qy4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
