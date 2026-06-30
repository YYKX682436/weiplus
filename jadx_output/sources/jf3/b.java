package jf3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299412d = 0;

    public b(jf3.c cVar, jf3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299412d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299412d;
        this.f299412d = i17 + 1;
        if (i17 == 0) {
            return jf3.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
