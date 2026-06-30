package ry;

/* loaded from: classes.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f401356d = 0;

    public g(ry.h hVar, ry.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f401356d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f401356d;
        this.f401356d = i17 + 1;
        if (i17 == 0) {
            return ry.e.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
