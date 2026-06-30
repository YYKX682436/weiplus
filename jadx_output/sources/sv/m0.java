package sv;

/* loaded from: classes6.dex */
public class m0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f413192d = 0;

    public m0(sv.n0 n0Var, sv.l0 l0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f413192d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f413192d;
        this.f413192d = i17 + 1;
        if (i17 == 0) {
            return sv.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
