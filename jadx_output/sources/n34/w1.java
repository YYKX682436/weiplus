package n34;

/* loaded from: classes6.dex */
public class w1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f334763d = 0;

    public w1(n34.x1 x1Var, n34.v1 v1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f334763d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f334763d;
        this.f334763d = i17 + 1;
        if (i17 == 0) {
            return n34.u4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
