package ov;

/* loaded from: classes6.dex */
public class c0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349073d = 0;

    public c0(ov.d0 d0Var, ov.b0 b0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349073d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349073d;
        this.f349073d = i17 + 1;
        if (i17 == 0) {
            return ov.s0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
