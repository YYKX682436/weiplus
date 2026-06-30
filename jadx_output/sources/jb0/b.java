package jb0;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298678d = 0;

    public b(jb0.c cVar, jb0.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298678d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298678d;
        this.f298678d = i17 + 1;
        if (i17 == 0) {
            return jb0.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
