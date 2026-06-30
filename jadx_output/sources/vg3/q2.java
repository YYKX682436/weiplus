package vg3;

/* loaded from: classes.dex */
public class q2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436748d = 0;

    public q2(vg3.r2 r2Var, vg3.p2 p2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436748d < 2;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436748d;
        this.f436748d = i17 + 1;
        if (i17 == 0) {
            return nr3.f.INSTANCE;
        }
        if (i17 == 1) {
            return gc0.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 2");
    }
}
