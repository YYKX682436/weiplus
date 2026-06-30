package vy4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f441494d = 0;

    public b(vy4.c cVar, vy4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f441494d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f441494d;
        this.f441494d = i17 + 1;
        if (i17 == 0) {
            return vy4.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
