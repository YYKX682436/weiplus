package zy2;

/* loaded from: classes6.dex */
public class u1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477584d = 0;

    public u1(zy2.v1 v1Var, zy2.t1 t1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477584d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477584d;
        this.f477584d = i17 + 1;
        if (i17 == 0) {
            return b92.e2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
