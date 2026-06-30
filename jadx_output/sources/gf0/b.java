package gf0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f271198d = 0;

    public b(gf0.c cVar, gf0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f271198d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f271198d;
        this.f271198d = i17 + 1;
        if (i17 == 0) {
            return gf0.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
