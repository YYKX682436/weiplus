package he0;

/* loaded from: classes6.dex */
public class v2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f280823d = 0;

    public v2(he0.w2 w2Var, he0.u2 u2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f280823d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f280823d;
        this.f280823d = i17 + 1;
        if (i17 == 0) {
            return he0.t5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
