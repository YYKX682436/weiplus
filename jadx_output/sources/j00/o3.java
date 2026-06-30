package j00;

/* loaded from: classes6.dex */
public class o3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296851d = 0;

    public o3(j00.p3 p3Var, j00.n3 n3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296851d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296851d;
        this.f296851d = i17 + 1;
        if (i17 == 0) {
            return j00.e2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
