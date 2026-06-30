package kh0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f307967d = 0;

    public b(kh0.c cVar, kh0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f307967d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f307967d;
        this.f307967d = i17 + 1;
        if (i17 == 0) {
            return jh0.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
