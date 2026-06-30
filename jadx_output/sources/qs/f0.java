package qs;

/* loaded from: classes6.dex */
public class f0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f366155d = 0;

    public f0(qs.g0 g0Var, qs.e0 e0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f366155d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f366155d;
        this.f366155d = i17 + 1;
        if (i17 == 0) {
            return qs.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
