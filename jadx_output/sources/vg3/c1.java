package vg3;

/* loaded from: classes6.dex */
public class c1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436675d = 0;

    public c1(vg3.d1 d1Var, vg3.b1 b1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436675d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436675d;
        this.f436675d = i17 + 1;
        if (i17 == 0) {
            return sy.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
