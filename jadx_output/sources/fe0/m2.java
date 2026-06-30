package fe0;

/* loaded from: classes6.dex */
public class m2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261424d = 0;

    public m2(fe0.n2 n2Var, fe0.l2 l2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261424d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261424d;
        this.f261424d = i17 + 1;
        if (i17 == 0) {
            return ee0.s4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
