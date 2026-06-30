package et;

/* loaded from: classes6.dex */
public class r1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f256503d = 0;

    public r1(et.s1 s1Var, et.q1 q1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f256503d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f256503d;
        this.f256503d = i17 + 1;
        if (i17 == 0) {
            return et.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
