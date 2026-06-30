package j00;

/* loaded from: classes6.dex */
public class k3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296824d = 0;

    public k3(j00.l3 l3Var, j00.j3 j3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296824d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296824d;
        this.f296824d = i17 + 1;
        if (i17 == 0) {
            return j00.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
