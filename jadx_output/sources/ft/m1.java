package ft;

/* loaded from: classes6.dex */
public class m1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266406d = 0;

    public m1(ft.n1 n1Var, ft.l1 l1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266406d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266406d;
        this.f266406d = i17 + 1;
        if (i17 == 0) {
            return et.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
