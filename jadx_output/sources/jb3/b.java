package jb3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298752d = 0;

    public b(jb3.c cVar, jb3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298752d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298752d;
        this.f298752d = i17 + 1;
        if (i17 == 0) {
            return jb3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
