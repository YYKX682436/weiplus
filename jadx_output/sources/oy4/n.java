package oy4;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350073d = 0;

    public n(oy4.o oVar, oy4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350073d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350073d;
        this.f350073d = i17 + 1;
        if (i17 == 0) {
            return oy4.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
