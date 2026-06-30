package jv;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302177d = 0;

    public b(jv.c cVar, jv.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302177d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302177d;
        this.f302177d = i17 + 1;
        if (i17 == 0) {
            return iv.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
