package zy2;

/* loaded from: classes6.dex */
public class m1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477460d = 0;

    public m1(zy2.n1 n1Var, zy2.l1 l1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477460d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477460d;
        this.f477460d = i17 + 1;
        if (i17 == 0) {
            return b92.x1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
