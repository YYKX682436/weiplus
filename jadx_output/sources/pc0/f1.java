package pc0;

/* loaded from: classes6.dex */
public class f1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353253d = 0;

    public f1(pc0.g1 g1Var, pc0.e1 e1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353253d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353253d;
        this.f353253d = i17 + 1;
        if (i17 == 0) {
            return pc0.l2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
