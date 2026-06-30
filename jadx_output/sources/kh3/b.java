package kh3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308041d = 0;

    public b(kh3.c cVar, kh3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308041d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308041d;
        this.f308041d = i17 + 1;
        if (i17 == 0) {
            return lh3.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
