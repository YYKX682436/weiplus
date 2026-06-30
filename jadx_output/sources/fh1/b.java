package fh1;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f262535d = 0;

    public b(fh1.c cVar, fh1.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f262535d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f262535d;
        this.f262535d = i17 + 1;
        if (i17 == 0) {
            return fh1.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
