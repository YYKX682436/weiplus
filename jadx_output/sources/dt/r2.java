package dt;

/* loaded from: classes6.dex */
public class r2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f243060d = 0;

    public r2(dt.s2 s2Var, dt.q2 q2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f243060d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f243060d;
        this.f243060d = i17 + 1;
        if (i17 == 0) {
            return dt.m5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
