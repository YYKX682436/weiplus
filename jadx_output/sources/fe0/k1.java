package fe0;

/* loaded from: classes6.dex */
public class k1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261416d = 0;

    public k1(fe0.l1 l1Var, fe0.j1 j1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261416d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261416d;
        this.f261416d = i17 + 1;
        if (i17 == 0) {
            return ee0.g4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
