package he0;

/* loaded from: classes6.dex */
public class f2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280698d = 0;

    public f2(he0.g2 g2Var, he0.e2 e2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280698d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280698d;
        this.f280698d = i17 + 1;
        if (i17 == 0) {
            return he0.k5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
