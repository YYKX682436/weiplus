package ct;

/* loaded from: classes6.dex */
public class d2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222146d = 0;

    public d2(ct.e2 e2Var, ct.c2 c2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222146d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222146d;
        this.f222146d = i17 + 1;
        if (i17 == 0) {
            return zf4.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
