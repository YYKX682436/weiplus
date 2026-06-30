package dt;

/* loaded from: classes6.dex */
public class d3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f242956d = 0;

    public d3(dt.e3 e3Var, dt.c3 c3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f242956d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f242956d;
        this.f242956d = i17 + 1;
        if (i17 == 0) {
            return dt.v5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
