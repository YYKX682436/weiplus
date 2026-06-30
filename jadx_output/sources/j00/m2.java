package j00;

/* loaded from: classes6.dex */
public class m2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296834d = 0;

    public m2(j00.n2 n2Var, j00.l2 l2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296834d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296834d;
        this.f296834d = i17 + 1;
        if (i17 == 0) {
            return j00.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
