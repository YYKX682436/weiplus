package iy4;

/* loaded from: classes6.dex */
public class c0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f295937d = 0;

    public c0(iy4.d0 d0Var, iy4.b0 b0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f295937d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f295937d;
        this.f295937d = i17 + 1;
        if (i17 == 0) {
            return iy4.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
