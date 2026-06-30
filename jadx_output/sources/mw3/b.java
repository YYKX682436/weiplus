package mw3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331731d = 0;

    public b(mw3.c cVar, mw3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331731d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331731d;
        this.f331731d = i17 + 1;
        if (i17 == 0) {
            return mw3.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
