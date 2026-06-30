package jd0;

/* loaded from: classes6.dex */
public class p0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f299090d = 0;

    public p0(jd0.q0 q0Var, jd0.o0 o0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f299090d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f299090d;
        this.f299090d = i17 + 1;
        if (i17 == 0) {
            return jd0.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
