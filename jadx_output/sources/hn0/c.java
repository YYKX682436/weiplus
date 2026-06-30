package hn0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f282383d = 0;

    public c(hn0.d dVar, hn0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f282383d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f282383d;
        this.f282383d = i17 + 1;
        if (i17 == 0) {
            return vd2.n5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
