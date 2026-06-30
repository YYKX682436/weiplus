package iy4;

/* loaded from: classes.dex */
public class k0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f295973d = 0;

    public k0(iy4.l0 l0Var, iy4.j0 j0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f295973d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f295973d;
        this.f295973d = i17 + 1;
        if (i17 == 0) {
            return iy4.d1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
